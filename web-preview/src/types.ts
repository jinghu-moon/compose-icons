export type PreviewPathCommand = {
  command: string
  arguments: number[]
}

export type PreviewPath = {
  fill: string | null
  stroke: string | null
  strokeWidth: number | null
  strokeLineCap: string | null
  strokeLineJoin: string | null
  fillRule: string | null
  commands: PreviewPathCommand[]
}

export type PreviewEntry = {
  name: string
  style: string
  kotlinPath: string
  ktFilePath: string
  svgFilePath: string
  svgMarkup: string
  upstreamId: string
  category: string | null
  aliases: string[]
  tags: string[]
  viewBox: {
    minX: number
    minY: number
    width: number
    height: number
  }
  paths: PreviewPath[]
}

export type PreviewDataset = {
  source: string
  count: number
  entries: PreviewEntry[]
}
