package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorThinIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 20.76 0 42.52-6.23 58.21-16.66 1.842-1.223 2.343-3.708 1.12-5.55-1.223-1.842-3.708-2.343-5.55-1.12C167.35 214.27 147.24 220 128 220 77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92 0 31.32-15 36-24 36-9 0-24-4.68-24-36v-40c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v14.75C152.689 86.626 132.041 79.982 113.45 86.486 94.859 92.989 82.854 111.055 84.061 130.714c1.207 19.659 15.331 36.121 34.578 40.301 19.247 4.181 38.928-4.938 48.181-22.325C171.46 163.58 181.66 172 196 172c20 0 32-16.45 32-44C227.939 72.797 183.203 28.061 128 28ZM128 164C108.118 164 92 147.882 92 128c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _at!!
    }

private var _at: ImageVector? = null
