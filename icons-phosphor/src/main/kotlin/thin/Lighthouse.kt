package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorThinIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 84.000 C 205.791 84.000 204.000 85.791 204.000 88.000 L 204.000 108.000 L 185.230 108.000 L 180.000 55.600 C 179.898 54.595 179.419 53.666 178.660 53.000 L 135.780 14.870 L 135.680 14.780 C 131.231 11.074 124.769 11.074 120.320 14.780 L 120.220 14.870 L 77.340 53.000 C 76.581 53.666 76.102 54.595 76.000 55.600 L 70.770 108.000 L 52.000 108.000 L 52.000 88.000 C 52.000 85.791 50.209 84.000 48.000 84.000 C 45.791 84.000 44.000 85.791 44.000 88.000 L 44.000 112.000 C 44.000 114.209 45.791 116.000 48.000 116.000 L 70.000 116.000 L 60.080 214.860 C 59.759 218.221 60.869 221.562 63.138 224.063 C 65.406 226.563 68.624 227.993 72.000 228.000 L 184.000 228.000 C 187.384 227.999 190.610 226.569 192.883 224.063 C 195.157 221.557 196.267 218.208 195.940 214.840 L 186.000 116.000 L 208.000 116.000 C 210.209 116.000 212.000 114.209 212.000 112.000 L 212.000 88.000 C 212.000 85.791 210.209 84.000 208.000 84.000 ZM 125.480 20.890 C 126.941 19.720 129.019 19.720 130.480 20.890 L 165.480 52.000 L 90.480 52.000 ZM 83.620 60.000 L 172.380 60.000 L 177.190 108.000 L 132.000 108.000 L 132.000 88.000 C 132.000 85.791 130.209 84.000 128.000 84.000 C 125.791 84.000 124.000 85.791 124.000 88.000 L 124.000 108.000 L 78.810 108.000 ZM 187.000 218.690 C 186.237 219.541 185.143 220.019 184.000 220.000 L 72.000 220.000 C 70.874 220.005 69.798 219.534 69.036 218.704 C 68.275 217.874 67.899 216.762 68.000 215.640 L 72.390 172.000 L 183.610 172.000 L 188.000 215.620 C 188.122 216.739 187.758 217.857 187.000 218.690 ZM 182.810 164.000 L 73.190 164.000 L 78.000 116.000 L 178.000 116.000 Z"),
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
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
