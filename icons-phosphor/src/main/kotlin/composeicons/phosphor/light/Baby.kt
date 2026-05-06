package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorLightIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 138c-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM164 118c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10ZM152.8 162.92c-15.188 9.434-34.412 9.434-49.6 0-2.806-1.767-6.513-.926-8.28 1.88-1.767 2.806-.926 6.513 1.88 8.28 19.098 11.899 43.302 11.899 62.4 0 2.806-1.767 3.647-5.474 1.88-8.28-1.767-2.806-5.474-3.647-8.28-1.88ZM230 128c0 56.333-45.667 102-102 102C71.667 230 26 184.333 26 128 26 71.667 71.667 26 128 26c56.306 .066 101.934 45.694 102 102ZM218 128C217.941 79.459 179.443 39.688 130.93 38.05 118.3 55.23 118 71.85 118 72c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10 0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6 0 12.15-9.85 22-22 22C115.85 94 106 84.15 106 72c0-.75 .15-15.82 10.14-33.22C68.396 45.127 34.112 87.936 38.349 135.913c4.237 47.977 45.494 84.114 93.611 81.995C180.077 215.789 217.997 176.164 218 128Z"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
