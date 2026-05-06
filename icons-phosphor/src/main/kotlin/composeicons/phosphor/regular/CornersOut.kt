package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorRegularIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v40c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-32h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8ZM88 200h-32v-32c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM208 160c-4.418 0-8 3.582-8 8v32h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40c4.418 0 8-3.582 8-8v-40c0-4.418-3.582-8-8-8ZM88 40h-40c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
