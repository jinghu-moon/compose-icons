package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorFillIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 48h-216c-4.418 0-8 3.582-8 8v152c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h112c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM212 120c.008 6.781-1.91 13.426-5.53 19.16L156.84 89.53c11.093-6.973 25.098-7.369 36.567-1.034C204.876 94.831 211.997 106.898 212 120ZM116 120c.008 6.781-1.91 13.426-5.53 19.16L60.84 89.53C71.933 82.557 85.938 82.161 97.407 88.496 108.876 94.831 115.997 106.898 116 120ZM80 156C66.898 155.997 54.831 148.876 48.496 137.407c-6.335-11.469-5.939-25.474 1.034-36.567l49.63 49.63C93.426 154.09 86.781 156.008 80 156ZM140 120c-.008-6.781 1.91-13.426 5.53-19.16l49.63 49.63c-11.093 6.973-25.098 7.369-36.567 1.034C147.124 145.169 140.003 133.102 140 120Z"),
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
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
