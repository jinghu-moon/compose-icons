package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsInLineHorizontal: ImageVector
    get() {
        if (_arrowsInLineHorizontal != null) return _arrowsInLineHorizontal!!
        _arrowsInLineHorizontal = phosphorBoldIcon(
            name = "ArrowsInLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M140 40v176c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-176c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM64.49 87.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L59 116h-43C9.373 116 4 121.373 4 128c0 6.627 5.373 12 12 12h43L47.51 151.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l32-32c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5ZM240 116h-43l11.52-11.51c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-32 32c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l32 32c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L197 140h43c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _arrowsInLineHorizontal!!
    }

private var _arrowsInLineHorizontal: ImageVector? = null
