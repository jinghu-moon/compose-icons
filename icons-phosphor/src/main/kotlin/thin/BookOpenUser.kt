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
                pathData = parseSvgPathData("M 232.000 76.000 L 160.000 76.000 C 146.516 76.006 134.165 83.548 128.000 95.540 C 121.835 83.548 109.484 76.006 96.000 76.000 L 24.000 76.000 C 21.791 76.000 20.000 77.791 20.000 80.000 L 20.000 200.000 C 20.000 202.209 21.791 204.000 24.000 204.000 L 96.000 204.000 C 111.464 204.000 124.000 216.536 124.000 232.000 C 124.000 234.209 125.791 236.000 128.000 236.000 C 130.209 236.000 132.000 234.209 132.000 232.000 C 132.000 216.536 144.536 204.000 160.000 204.000 L 232.000 204.000 C 234.209 204.000 236.000 202.209 236.000 200.000 L 236.000 80.000 C 236.000 77.791 234.209 76.000 232.000 76.000 ZM 96.000 196.000 L 28.000 196.000 L 28.000 84.000 L 96.000 84.000 C 111.464 84.000 124.000 96.536 124.000 112.000 L 124.000 209.400 C 117.177 200.924 106.881 195.997 96.000 196.000 ZM 228.000 196.000 L 160.000 196.000 C 149.118 196.000 138.822 200.931 132.000 209.410 L 132.000 112.000 C 132.000 96.536 144.536 84.000 160.000 84.000 L 228.000 84.000 ZM 92.800 45.600 C 101.110 34.521 114.151 28.000 128.000 28.000 C 141.849 28.000 154.890 34.521 163.200 45.600 C 164.525 47.367 164.167 49.875 162.400 51.200 C 160.633 52.525 158.125 52.167 156.800 50.400 C 150.001 41.335 139.331 36.000 128.000 36.000 C 116.669 36.000 105.999 41.335 99.200 50.400 C 97.875 52.167 95.367 52.525 93.600 51.200 C 91.833 49.875 91.475 47.367 92.800 45.600 Z"),
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
