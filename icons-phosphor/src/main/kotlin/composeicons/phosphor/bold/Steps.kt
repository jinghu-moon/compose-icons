package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Steps: ImageVector
    get() {
        if (_steps != null) return _steps!!
        _steps = phosphorBoldIcon(
            name = "Steps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 56c0 6.627-5.373 12-12 12h-44v36c0 6.627-5.373 12-12 12h-44v36c0 6.627-5.373 12-12 12h-44v36c0 6.627-5.373 12-12 12h-56C9.373 212 4 206.627 4 200c0-6.627 5.373-12 12-12h44v-36c0-6.627 5.373-12 12-12h44v-36c0-6.627 5.373-12 12-12h44v-36c0-6.627 5.373-12 12-12h56c6.627 0 12 5.373 12 12Z"),
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
        return _steps!!
    }

private var _steps: ImageVector? = null
