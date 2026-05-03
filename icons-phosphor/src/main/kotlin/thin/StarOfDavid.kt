package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) return _starOfDavid!!
        _starOfDavid = phosphorThinIcon(
            name = "StarOfDavid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 196.610 128.000 L 227.470 74.000 C 228.185 72.761 228.184 71.235 227.469 69.997 C 226.753 68.759 225.430 67.998 224.000 68.000 L 162.330 68.000 L 131.470 14.000 C 130.757 12.757 129.433 11.990 128.000 11.990 C 126.567 11.990 125.243 12.757 124.530 14.000 L 93.660 68.000 L 32.000 68.000 C 30.570 67.998 29.247 68.759 28.531 69.997 C 27.816 71.235 27.815 72.761 28.530 74.000 L 59.380 128.000 L 28.530 182.000 C 27.815 183.239 27.816 184.765 28.531 186.003 C 29.247 187.241 30.570 188.002 32.000 188.000 L 93.660 188.000 L 124.530 242.000 C 125.243 243.243 126.567 244.010 128.000 244.010 C 129.433 244.010 130.757 243.243 131.470 242.000 L 162.330 188.000 L 224.000 188.000 C 225.430 188.002 226.753 187.241 227.469 186.003 C 228.184 184.765 228.185 183.239 227.470 182.000 ZM 217.110 76.000 L 192.000 119.940 L 166.900 76.000 ZM 187.390 128.000 L 157.690 180.000 L 98.300 180.000 L 68.590 128.000 L 98.300 76.000 L 157.690 76.000 ZM 128.000 24.060 L 153.120 68.060 L 102.870 68.060 ZM 38.890 76.000 L 89.080 76.000 L 64.000 119.940 ZM 38.890 179.920 L 64.000 136.060 L 89.080 180.000 ZM 128.000 231.920 L 102.870 187.920 L 153.120 187.920 ZM 166.900 180.000 L 192.000 136.060 L 217.110 180.000 Z"),
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
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
