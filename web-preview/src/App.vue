<script setup lang="ts">
import { computed, onMounted, ref, watch } from 'vue'
import type { PreviewDataset, ExplorerEntry } from './types'

const datasets = ref<(PreviewDataset & { id: string })[]>([])
const activeSource = ref<string>('')
const query = ref('')
const styleFilter = ref<string>('all')
const selectedEntry = ref<ExplorerEntry | null>(null)
const cardSize = ref(160)
const isReviewMode = ref(false)

const fixedIconNames = [
  'Accessibility',
  'PanelLeft', 'PanelRight', 'PanelTop', 'PanelBottom',
  'BorderLeft', 'BorderRight', 'BorderTop', 'BorderBottom', 'BorderAll'
]

// 虚拟滚动状态
const containerRef = ref<HTMLElement | null>(null)
const scrollTop = ref(0)
const itemsPerRow = ref(6)
const itemHeight = ref(200)
const viewportHeight = ref(800)

// 主题管理
const isDark = ref(localStorage.getItem('theme') === 'dark' || 
                 (!localStorage.getItem('theme') && window.matchMedia('(prefers-color-scheme: dark)').matches))

function toggleTheme() {
  isDark.value = !isDark.value
  localStorage.setItem('theme', isDark.value ? 'dark' : 'light')
  updateThemeAttribute()
}

function updateThemeAttribute() {
  document.documentElement.setAttribute('data-theme', isDark.value ? 'dark' : 'light')
}

onMounted(async () => {
  updateThemeAttribute()
  
  try {
    const registryResponse = await fetch('/data/libraries.json')
    if (!registryResponse.ok) throw new Error('Failed to load library registry')
    const sources = await registryResponse.json()
    
    // 并行加载，加载完一个显示一个，提高响应速度
    sources.forEach(async (s) => {
      try {
        const response = await fetch(`/data/${s.file}`)
        if (!response.ok) throw new Error(`HTTP ${response.status}`)
        
        const text = await response.json()
        datasets.value.push({ ...text, id: s.id })
        
        if (!activeSource.value) {
          activeSource.value = s.id
        }
      } catch (e) {
        console.error(`Error loading ${s.id}:`, e)
      }
    })
  } catch (e) {
    console.error('Registry loading error:', e)
  }
  
  updateGridConfig()
  window.addEventListener('resize', updateGridConfig)
})

// 监听数据变化以重新计算布局
watch(datasets, () => {
  setTimeout(updateGridConfig, 100)
}, { deep: true })

function updateGridConfig() {
  if (containerRef.value) {
    const width = containerRef.value.clientWidth
    const padding = 64 // 左右 padding 之和
    const gap = 24     // 左右间距
    
    // 动态列数
    itemsPerRow.value = Math.floor((width - padding) / 160) || 1
    
    // 计算格子的精确宽度
    const availableWidth = width - padding - (itemsPerRow.value - 1) * gap
    cardSize.value = availableWidth / itemsPerRow.value
    
    // 行高 = 卡片高度 + 垂直间距 (32)
    itemHeight.value = cardSize.value + 32
    
    viewportHeight.value = containerRef.value.clientHeight
  }
}

const sortedDatasets = computed(() => {
  const order = ['tabler', 'lucide', 'phosphor']
  return [...datasets.value].sort((a, b) => 
    order.indexOf(a.id) - order.indexOf(b.id)
  )
})

const currentDataset = computed(() => 
  datasets.value.find(d => d.id === activeSource.value)
)

const availableStyles = computed(() => {
  if (!currentDataset.value) return []
  const styles = new Set(currentDataset.value.explorerEntries.map(e => e.style))
  return ['all', ...Array.from(styles)]
})

const filteredEntries = computed(() => {
  if (isReviewMode.value) {
    // Review 模式：从所有库中聚合那 10 个特定图标
    const allEntries: ExplorerEntry[] = []
    datasets.value.forEach(ds => {
      const fixed = ds.explorerEntries.filter(e => fixedIconNames.includes(e.name))
      allEntries.push(...fixed.map(e => ({ ...e, libraryId: ds.id })))
    })
    return allEntries
  }

  if (!currentDataset.value) return []
  const q = query.value.toLowerCase().trim()
  return currentDataset.value.explorerEntries.map(e => ({ ...e, libraryId: activeSource.value })).filter(e => {
    const styleMatch = styleFilter.value === 'all' || e.style === styleFilter.value
    if (!styleMatch) return false
    if (!q) return true
    return e.name.toLowerCase().includes(q) || 
           e.tags.some(t => t.toLowerCase().includes(q)) ||
           e.category?.toLowerCase().includes(q)
  })
})

const visibleRows = computed(() => {
  const startRow = Math.floor(scrollTop.value / itemHeight.value)
  const endRow = startRow + Math.ceil(viewportHeight.value / itemHeight.value) + 1
  
  const rows = []
  for (let i = startRow; i <= endRow; i++) {
    const startIndex = i * itemsPerRow.value
    const rowItems = filteredEntries.value.slice(startIndex, startIndex + itemsPerRow.value)
    if (rowItems.length > 0) {
      rows.push({ index: i, items: rowItems })
    }
  }
  return rows
})

const totalHeight = computed(() => 
  Math.ceil(filteredEntries.value.length / itemsPerRow.value) * itemHeight.value
)

function handleScroll(e: Event) {
  scrollTop.value = (e.target as HTMLElement).scrollTop
}

function copyCode(entry: ExplorerEntry) {
  const code = `Icon(
    imageVector = ${entry.kotlinPath},
    contentDescription = "${entry.name}",
    modifier = Modifier.size(24.dp)
)`
  navigator.clipboard.writeText(code)
  // Simple visual feedback could be added here
}

function selectIcon(entry: ExplorerEntry) {
  selectedEntry.value = entry
}

// 针对 Duotone 风格的特殊处理
function getPathStyle(path: any, entry: ExplorerEntry) {
  // 模拟 Compose 的渲染逻辑
  let fill = path.fill || 'none'
  let stroke = path.stroke || 'none'

  if (fill === 'currentColor') fill = 'var(--text-primary)'
  if (stroke === 'currentColor') stroke = 'var(--text-primary)'

  return {
    fill,
    stroke,
    'stroke-width': path.strokeWidth,
    'stroke-linecap': path.strokeLineCap,
    'stroke-linejoin': path.strokeLineJoin,
    opacity: path.alpha || 1
  }
}

// Check if all paths share the same style attributes
function getCommonStyle(paths: any[], entry: ExplorerEntry) {
  if (paths.length < 2) return null
  const first = getPathStyle(paths[0], entry)
  const allSame = paths.every(p => {
    const s = getPathStyle(p, entry)
    return s.fill === first.fill && s.stroke === first.stroke &&
           s['stroke-width'] === first['stroke-width'] &&
           s['stroke-linecap'] === first['stroke-linecap'] &&
           s['stroke-linejoin'] === first['stroke-linejoin'] &&
           s.opacity === first.opacity
  })
  return allSame ? first : null
}

// Per-path style: empty when common style covers everything
function getPathDiffStyle(path: any, entry: ExplorerEntry, common: Record<string, any> | null) {
  if (!common) return getPathStyle(path, entry)
  return {}
}
</script>

<template>
  <div class="app-container">
    <!-- Sidebar -->
    <aside class="sidebar">
      <div class="logo">
        <div class="logo-icon"></div>
        <span>Compose Icons</span>
      </div>

      <nav class="filter-section">
        <span class="filter-label">Quick Review</span>
        <div class="source-list">
          <button 
            class="source-item"
            :class="{ active: isReviewMode }"
            @click="isReviewMode = !isReviewMode"
          >
            <svg width="14" height="14" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" style="margin-right: 8px"><path d="M12 22s8-4 8-10V5l-8-3-8 3v7c0 6 8 10 8 10z"/></svg>
            Fixed Icons Review
          </button>
        </div>
      </nav>

      <nav class="filter-section" v-show="!isReviewMode">
        <span class="filter-label">Library</span>
        <div class="source-list">
          <button 
            v-for="ds in sortedDatasets" 
            :key="ds.id"
            class="source-item"
            :class="{ active: activeSource === ds.id }"
            @click="activeSource = ds.id; styleFilter = 'all'"
          >
            {{ ds.source }}
            <small style="margin-left: auto; opacity: 0.5">v{{ ds.upstreamVersion }}</small>
          </button>
          
          <div v-if="datasets.length < 3" class="source-item" style="opacity: 0.5; cursor: default">
             Loading libraries... ({{ datasets.length }}/3)
          </div>
        </div>
      </nav>

      <nav class="filter-section" v-if="availableStyles.length > 2">
        <span class="filter-label">Style</span>
        <div class="source-list">
          <button 
            v-for="style in availableStyles" 
            :key="style"
            class="source-item"
            :class="{ active: styleFilter === style }"
            @click="styleFilter = style"
          >
            {{ style }}
          </button>
        </div>
      </nav>
      
      <div style="margin-top: auto">
        <button class="theme-toggle" @click="toggleTheme">
          <svg v-if="isDark" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"><path d="M12 3v1m0 16v1m9-9h-1M4 12H3m15.364-6.364l-.707.707M6.343 17.657l-.707.707m0-11.314l.707.707m11.314 11.314l.707.707M12 8a4 4 0 110 8 4 4 0 010-8z"/></svg>
          <svg v-else width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2"><path d="M21 12.79A9 9 0 1111.21 3 7 7 0 0021 12.79z"/></svg>
          {{ isDark ? 'Light Mode' : 'Dark Mode' }}
        </button>
        <a href="https://github.com/jinghu-moon/compose-icons" target="_blank" class="source-item" style="margin-top: 8px">
          GitHub Repository
        </a>
      </div>
    </aside>

    <!-- Main Content -->
    <main class="main-content">
      <header class="header-bar">
        <div class="search-container">
          <svg class="search-icon" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2">
            <circle cx="11" cy="11" r="8"></circle><line x1="21" y1="21" x2="16.65" y2="16.65"></line>
          </svg>
          <input 
            v-model="query" 
            class="search-input" 
            placeholder="Search icons by name, tags..." 
          />
        </div>
        <div class="stats">
          Showing <strong>{{ filteredEntries.length }}</strong> icons
        </div>
      </header>

      <div class="icon-grid-container" ref="containerRef" @scroll="handleScroll">
        <div :style="{ height: `${totalHeight}px`, position: 'relative' }">
          <div 
            v-for="row in visibleRows" 
            :key="row.index"
            class="icon-grid"
            :style="{ 
              position: 'absolute', 
              top: `${row.index * itemHeight}px`, 
              left: 0, 
              right: 0,
              height: `${cardSize}px`,
              display: 'grid',
              gap: '24px',
              gridTemplateColumns: `repeat(${itemsPerRow}, 1fr)`
            }"
          >
            <div 
              v-for="entry in row.items" 
              :key="entry.kotlinPath" 
              class="icon-card"
              :style="{ height: `${cardSize}px` }"
              @click="selectIcon(entry)"
            >
              <div class="icon-preview">
                <svg :viewBox="`${entry.viewBox.minX} ${entry.viewBox.minY} ${entry.viewBox.width} ${entry.viewBox.height}`" width="32" height="32"
                  v-bind="getCommonStyle(entry.paths, entry)">
                  <path
                    v-for="(path, idx) in entry.paths"
                    :key="idx"
                    :d="path.d"
                    v-bind="getPathDiffStyle(path, entry, getCommonStyle(entry.paths, entry))"
                  />
                </svg>
              </div>
              <span class="icon-name">{{ entry.name }}</span>
              <span class="icon-style-tag">{{ entry.style }}</span>
            </div>
          </div>
        </div>
      </div>

      <!-- Details Overlay -->
      <transition>
        <div v-if="selectedEntry" class="details-overlay">
          <div class="details-header">
            <div>
              <h2 style="font-size: 24px">{{ selectedEntry.name }}</h2>
              <p style="color: var(--text-secondary)">{{ (selectedEntry as any).libraryId }} / {{ selectedEntry.style }}</p>
            </div>
            <button class="close-btn" @click="selectedEntry = null">✕</button>
          </div>

          <div class="comparison-grid">
            <div class="preview-box">
              <span class="preview-label">SVG Source</span>
              <div class="preview-canvas">
                <svg :viewBox="`${selectedEntry.viewBox.minX} ${selectedEntry.viewBox.minY} ${selectedEntry.viewBox.width} ${selectedEntry.viewBox.height}`" width="64" height="64"
                  v-bind="getCommonStyle(selectedEntry.paths, selectedEntry)">
                  <path
                    v-for="(path, idx) in selectedEntry.paths"
                    :key="idx"
                    :d="path.d"
                    v-bind="getPathDiffStyle(path, selectedEntry, getCommonStyle(selectedEntry.paths, selectedEntry))"
                  />
                </svg>
              </div>
            </div>
            <div class="preview-box highlight">
              <span class="preview-label">Compose Render (KT)</span>
              <div class="preview-canvas">
                <!-- 这里使用相同的数据，但模拟 Compose 的渲染逻辑（例如显式处理 fillRule 等） -->
                <svg :viewBox="`${selectedEntry.viewBox.minX} ${selectedEntry.viewBox.minY} ${selectedEntry.viewBox.width} ${selectedEntry.viewBox.height}`" width="64" height="64"
                  v-bind="getCommonStyle(selectedEntry.paths, selectedEntry)">
                  <path
                    v-for="(path, idx) in selectedEntry.paths"
                    :key="idx"
                    :d="path.d"
                    fill="currentColor"
                    :fill-rule="path.fillRule?.toLowerCase() === 'evenodd' ? 'evenodd' : 'nonzero'"
                    v-bind="getPathDiffStyle(path, selectedEntry, getCommonStyle(selectedEntry.paths, selectedEntry))"
                  />
                </svg>
              </div>
            </div>
          </div>

          <div class="info-group">
            <span class="filter-label">Usage (Jetpack Compose)</span>
            <div class="code-block" @click="copyCode(selectedEntry)">
              <pre><code>Icon(
  imageVector = {{ selectedEntry.name }},
  contentDescription = null
)</code></pre>
            </div>
          </div>

          <div class="info-group">
            <span class="filter-label">Full Path</span>
            <div class="code-block" style="font-size: 11px">
              {{ selectedEntry.kotlinPath }}
            </div>
          </div>

          <div class="info-group" v-if="selectedEntry.tags.length">
            <span class="filter-label">Tags</span>
            <div style="display: flex; gap: 8px; flex-wrap: wrap">
              <span v-for="tag in selectedEntry.tags" :key="tag" class="icon-style-tag">
                {{ tag }}
              </span>
            </div>
          </div>
        </div>
      </transition>
    </main>
  </div>
</template>

<style>
@import './styles.css';
</style>
