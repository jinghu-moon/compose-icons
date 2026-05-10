package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DevToLogo: ImageVector
    get() {
        if (_devToLogo != null) return _devToLogo!!
        _devToLogo = phosphorFillIcon(
            name = "DevToLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 120v16c0 8.837-7.163 16-16 16v-48c8.837 0 16 7.163 16 16ZM248 72v112c0 8.837-7.163 16-16 16h-208C15.163 200 8 192.837 8 184v-112C8 63.163 15.163 56 24 56h208c8.837 0 16 7.163 16 16ZM96 120C96 102.327 81.673 88 64 88h-8c-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8h8c17.673 0 32-14.327 32-32ZM128 120v-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24c-4.418 0-8 3.582-8 8v64c0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-16h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM210.17 88.3c-4.253-1.198-8.672 1.277-9.87 5.53L190 130.45 179.7 93.83c-1.213-4.235-5.621-6.693-9.861-5.498-4.24 1.195-6.716 5.593-5.539 9.838l18 64c.972 3.448 4.118 5.83 7.7 5.83 3.582 0 6.728-2.382 7.7-5.83l18-64c1.198-4.253-1.277-8.672-5.53-9.87Z"),
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
        return _devToLogo!!
    }

private var _devToLogo: ImageVector? = null
