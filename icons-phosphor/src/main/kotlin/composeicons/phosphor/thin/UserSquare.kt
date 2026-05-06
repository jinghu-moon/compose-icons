package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorThinIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM63 212c8.772-28.544 35.139-48.025 65-48.025 29.861 0 56.228 19.481 65 48.025ZM212 208c0 2.209-1.791 4-4 4h-6.66c-7.036-25.743-27.058-45.91-52.75-53.13 17.865-9.46 26.986-29.875 22.112-49.493C165.829 89.759 148.215 75.985 128 75.985c-20.215 0-37.829 13.774-42.702 33.392-4.874 19.618 4.247 40.033 22.112 49.493C81.718 166.09 61.696 186.257 54.66 212h-6.66c-2.209 0-4-1.791-4-4v-160c0-2.209 1.791-4 4-4h160c2.209 0 4 1.791 4 4ZM128 156C108.118 156 92 139.882 92 120c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
