package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = phosphorThinIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 221.760 69.660 L 133.760 21.480 C 130.171 19.516 125.829 19.516 122.240 21.480 L 34.240 69.660 C 30.395 71.764 28.003 75.797 28.000 80.180 L 28.000 175.820 C 28.003 180.203 30.395 184.236 34.240 186.340 L 122.240 234.520 C 125.827 236.493 130.173 236.493 133.760 234.520 L 221.760 186.340 C 225.605 184.236 227.997 180.203 228.000 175.820 L 228.000 80.180 C 227.997 75.797 225.605 71.764 221.760 69.660 ZM 126.080 28.500 C 127.273 27.834 128.727 27.834 129.920 28.500 L 216.670 76.000 L 178.500 96.890 C 178.319 96.740 178.125 96.606 177.920 96.490 L 89.920 48.310 ZM 128.000 124.500 L 39.330 76.000 L 81.560 52.870 L 170.230 101.410 ZM 38.080 179.300 C 36.800 178.600 36.003 177.259 36.000 175.800 L 36.000 83.290 L 124.000 131.450 L 124.000 226.360 ZM 217.920 179.300 L 217.920 179.300 L 132.000 226.300 L 132.000 131.450 L 172.000 109.560 L 172.000 152.000 C 172.000 154.209 173.791 156.000 176.000 156.000 C 178.209 156.000 180.000 154.209 180.000 152.000 L 180.000 105.180 L 220.000 83.290 L 220.000 175.820 C 219.997 177.279 219.200 178.620 217.920 179.320 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _package!!
    }

private var _package: ImageVector? = null
