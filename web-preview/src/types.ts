export interface ExplorerViewBox {
  minX: number
  minY: number
  width: number
  height: number
}

export interface ExplorerPathNode {
  fill: string | null
  stroke: string | null
  strokeWidth: number | null
  strokeLineCap: string | null
  strokeLineJoin: string | null
  fillRule: string | null
  fillAlpha: number
  strokeAlpha: number
  d: string
}

export interface ExplorerEntry {
  name: string
  style: string
  kotlinPath: string
  viewBox: ExplorerViewBox
  paths: ExplorerPathNode[]
  tags: string[]
  category: string | null
  clipPath?: string
}

export interface PreviewDataset {
  source: string
  upstreamVersion: string
  total: number
  succeeded: number
  explorerEntries: ExplorerEntry[]
}
