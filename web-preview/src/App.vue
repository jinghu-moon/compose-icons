<script setup lang="ts">
import { computed, onMounted, ref } from 'vue'
import type { PreviewDataset, PreviewEntry } from './types'
import { buildSvgPath } from './svg-path'

type SourceEntry = PreviewEntry & { source: string }

const datasets = ref<PreviewDataset[]>([])
const activeSources = ref<string[]>(['tabler', 'lucide'])
const query = ref('')
const styleFilter = ref<'all' | 'outline' | 'filled'>('all')
const selectedEntries = ref<SourceEntry[]>([])
const scrollTopBySource = ref<Record<string, number>>({})

const rowHeight = 116
const viewportHeight = 660

onMounted(async () => {
  const tabler = (await fetch('/data/tabler.json').then((response) => response.json())) as PreviewDataset
  const lucide = (await fetch('/data/lucide.json').then((response) => response.json())) as PreviewDataset
  datasets.value = [tabler, lucide]
})

const selectedDatasets = computed(() =>
  activeSources.value
    .map((source) => datasets.value.find((dataset) => dataset.source === source))
    .filter((dataset): dataset is PreviewDataset => dataset !== undefined),
)

const datasetPanels = computed(() =>
  selectedDatasets.value.map((dataset, index) => ({
    dataset,
    label: `图标库 ${index + 1}`,
  })),
)

const filteredEntriesBySource = computed<Record<string, SourceEntry[]>>(() => {
  const normalized = query.value.trim().toLowerCase()
  return Object.fromEntries(
    selectedDatasets.value.map((dataset) => [
      dataset.source,
      dataset.entries
        .map((entry) => ({ ...entry, source: dataset.source }))
        .filter((entry) => {
          const styleMatched = styleFilter.value === 'all' || entry.style === styleFilter.value
          if (!styleMatched) return false
          if (!normalized) return true
          return (
            entry.name.toLowerCase().includes(normalized) ||
            entry.kotlinPath.toLowerCase().includes(normalized) ||
            entry.upstreamId.toLowerCase().includes(normalized) ||
            entry.aliases.some((alias) => alias.toLowerCase().includes(normalized)) ||
            entry.tags.some((tag) => tag.toLowerCase().includes(normalized))
          )
        }),
    ]),
  )
})

const totalFilteredEntries = computed(() =>
  Object.values(filteredEntriesBySource.value).reduce((total, entries) => total + entries.length, 0),
)

function onSourceScroll(source: string, event: Event) {
  scrollTopBySource.value = {
    ...scrollTopBySource.value,
    [source]: (event.target as HTMLElement).scrollTop,
  }
}

function startIndexFor(source: string) {
  return Math.floor((scrollTopBySource.value[source] ?? 0) / rowHeight)
}

function endIndexFor(source: string) {
  const entries = filteredEntriesBySource.value[source] ?? []
  return Math.min(entries.length, startIndexFor(source) + Math.ceil(viewportHeight / rowHeight) + 8)
}

function visibleEntriesFor(source: string) {
  const entries = filteredEntriesBySource.value[source] ?? []
  return entries.slice(startIndexFor(source), endIndexFor(source))
}

function topPaddingFor(source: string) {
  return startIndexFor(source) * rowHeight
}

function totalHeightFor(source: string) {
  return (filteredEntriesBySource.value[source] ?? []).length * rowHeight
}

function toggleSource(source: string) {
  activeSources.value = activeSources.value.includes(source)
    ? activeSources.value.filter((item) => item !== source)
    : [...activeSources.value, source]
}

function toggleCompare(entry: SourceEntry) {
  const existed = selectedEntries.value.find((item) => item.kotlinPath === entry.kotlinPath)
  if (existed) {
    selectedEntries.value = selectedEntries.value.filter((item) => item.kotlinPath !== entry.kotlinPath)
    return
  }
  selectedEntries.value = [entry]
}

function isSelected(entry: SourceEntry) {
  return selectedEntries.value.some((item) => item.kotlinPath === entry.kotlinPath)
}

function clearCompare() {
  selectedEntries.value = []
}
</script>

<template>
  <main class="layout-shell">
    <section class="search-band">
      <div class="search-band__title">搜索框</div>
      <div class="search-band__controls">
        <input
          v-model="query"
          class="search-input"
          placeholder="输入名称、alias、tag、kotlinPath"
        />

        <div class="control-group">
          <span class="control-label">风格</span>
          <div class="chip-row">
            <button class="chip" :class="{ active: styleFilter === 'all' }" @click="styleFilter = 'all'">All</button>
            <button class="chip" :class="{ active: styleFilter === 'outline' }" @click="styleFilter = 'outline'">Outline</button>
            <button class="chip" :class="{ active: styleFilter === 'filled' }" @click="styleFilter = 'filled'">Filled</button>
          </div>
        </div>

        <div class="control-group">
          <span class="control-label">图标库</span>
          <div class="chip-row">
            <button class="chip" :class="{ active: activeSources.includes('tabler') }" @click="toggleSource('tabler')">Tabler</button>
            <button class="chip" :class="{ active: activeSources.includes('lucide') }" @click="toggleSource('lucide')">Lucide</button>
          </div>
        </div>

        <div class="search-band__summary">
          <strong>{{ totalFilteredEntries }}</strong>
          <span>搜索结果</span>
        </div>
      </div>
    </section>

    <section class="library-grid" :class="{ single: datasetPanels.length <= 1 }">
      <section
        v-for="panel in datasetPanels"
        :key="panel.dataset.source"
        class="library-panel"
        :class="`library-panel--${panel.dataset.source}`"
      >
        <header class="library-panel__header">
          <div>
            <h2>{{ panel.label }}</h2>
            <p>{{ panel.dataset.source }}</p>
          </div>
          <span>{{ filteredEntriesBySource[panel.dataset.source]?.length ?? 0 }}</span>
        </header>

        <div class="virtual-list" @scroll="onSourceScroll(panel.dataset.source, $event)">
          <div :style="{ height: `${totalHeightFor(panel.dataset.source)}px` }">
            <div :style="{ transform: `translateY(${topPaddingFor(panel.dataset.source)}px)` }">
                <button
                  v-for="entry in visibleEntriesFor(panel.dataset.source)"
                  :key="entry.kotlinPath"
                  class="entry-row"
                  :class="{ selected: isSelected(entry) }"
                  @click="toggleCompare(entry)"
                >
                  <div class="icon-slot">
                    <div class="svg-markup" v-html="entry.svgMarkup"></div>
                  </div>
                  <div class="entry-copy">
                    <strong>{{ entry.name }}</strong>
                  <span>{{ entry.upstreamId }}</span>
                  <small>{{ entry.kotlinPath }}</small>
                </div>
              </button>
            </div>
          </div>
        </div>
      </section>
    </section>

    <section v-if="selectedEntries.length > 0" class="compare-drawer">
      <header class="compare-drawer__header">
        <div>
          <h3>对比视图</h3>
          <p>SVG 与 KT 路径渲染对比，同时仅预览 1 个图标</p>
        </div>
        <button class="close-button" @click="clearCompare">关闭</button>
      </header>

      <div class="compare-stack">
        <article v-for="entry in selectedEntries" :key="entry.kotlinPath" class="compare-card">
          <div class="compare-head">
            <div>
              <strong>{{ entry.name }}</strong>
              <span>{{ entry.source }} / {{ entry.style }}</span>
            </div>
            <code>{{ entry.kotlinPath }}</code>
          </div>

          <div class="render-grid">
            <section>
              <h4>SVG 原始预览</h4>
              <div class="render-box">
                <div class="svg-markup svg-markup--large" v-html="entry.svgMarkup"></div>
              </div>
            </section>

            <section>
              <h4>KT 数据渲染</h4>
              <div class="render-box">
                <svg class="compare-svg" :viewBox="`${entry.viewBox.minX} ${entry.viewBox.minY} ${entry.viewBox.width} ${entry.viewBox.height}`">
                  <template v-for="(path, index) in entry.paths" :key="index">
                    <path
                      :d="buildSvgPath([path])"
                      :fill="path.fill === 'currentColor' ? '#a84a2d' : path.fill || 'none'"
                      :stroke="path.stroke === 'currentColor' ? '#a84a2d' : path.stroke || 'none'"
                      :stroke-width="path.strokeWidth ?? 0"
                      :stroke-linecap="path.strokeLineCap ?? undefined"
                      :stroke-linejoin="path.strokeLineJoin ?? undefined"
                      :fill-rule="path.fillRule ?? undefined"
                    />
                  </template>
                </svg>
              </div>
            </section>
          </div>
        </article>
      </div>
    </section>
  </main>
</template>
