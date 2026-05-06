package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorBoldIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 116h-4.72C221.683 70.315 185.685 34.317 140 28.72v-4.72c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4.72C70.315 34.317 34.317 70.315 28.72 116h-4.72c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h4.72c5.597 45.685 41.595 81.683 87.28 87.28v4.72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4.72c45.685-5.597 81.683-41.595 87.28-87.28h4.72c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM140 203v-3c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v3C83.624 197.758 58.242 172.376 53 140h3c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-3C58.242 83.624 83.624 58.242 116 53v3c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-3c32.376 5.242 57.758 30.624 63 63h-3c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h3c-5.242 32.376-30.624 57.758-63 63ZM128 84c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C171.972 103.711 152.289 84.028 128 84ZM128 148c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
