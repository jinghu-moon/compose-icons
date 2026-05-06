package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorThinIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 76h-72c-13.484 .006-25.835 7.548-32 19.54C121.835 83.548 109.484 76.006 96 76h-72c-2.209 0-4 1.791-4 4v120c0 2.209 1.791 4 4 4h72c15.464 0 28 12.536 28 28 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-15.464 12.536-28 28-28h72c2.209 0 4-1.791 4-4v-120c0-2.209-1.791-4-4-4ZM96 196h-68v-112h68c15.464 0 28 12.536 28 28v97.4C117.177 200.924 106.881 195.997 96 196ZM228 196h-68c-10.882 0-21.178 4.931-28 13.41v-97.41c0-15.464 12.536-28 28-28h68ZM92.8 45.6C101.11 34.521 114.151 28 128 28c13.849 0 26.89 6.521 35.2 17.6 1.325 1.767 .967 4.275-.8 5.6-1.767 1.325-4.275 .967-5.6-.8C150.001 41.335 139.331 36 128 36c-11.331 0-22.001 5.335-28.8 14.4-1.325 1.767-3.833 2.125-5.6 .8-1.767-1.325-2.125-3.833-.8-5.6Z"),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
