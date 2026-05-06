package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RepeatOnce: ImageVector
    get() {
        if (_repeatOnce != null) return _repeatOnce!!
        _repeatOnce = phosphorBoldIcon(
            name = "RepeatOnce",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 128C20.044 86.045 54.045 52.044 96 52h99l-3.52-3.51c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l24 24c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-24 24c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L195 76h-99C67.295 76.033 44.033 99.295 44 128c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM224 116c-6.627 0-12 5.373-12 12-.033 28.705-23.295 51.967-52 52h-99l3.52-3.51c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-24 24c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l24 24c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L61 204h99c41.955-.044 75.956-34.045 76-76 0-6.627-5.373-12-12-12ZM136 164c6.627 0 12-5.373 12-12v-48c.001-4.158-2.15-8.021-5.687-10.209-3.536-2.188-7.953-2.389-11.673-.531l-16 8c-5.49 2.926-7.834 9.563-5.398 15.288 2.436 5.725 8.843 8.639 14.758 6.712v28.74c0 6.627 5.373 12 12 12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _repeatOnce!!
    }

private var _repeatOnce: ImageVector? = null
