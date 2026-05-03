package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Boot: ImageVector
    get() {
        if (_boot != null) return _boot!!
        _boot = phosphorBoldIcon(
            name = "Boot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 104.000 L 164.000 104.000 L 164.000 56.000 C 164.000 44.954 155.046 36.000 144.000 36.000 L 32.000 36.000 C 28.048 36.001 24.351 37.947 22.113 41.204 C 19.875 44.461 19.384 48.611 20.800 52.300 C 31.680 80.690 29.100 130.660 20.470 160.680 C 20.159 161.759 20.001 162.877 20.000 164.000 L 20.000 200.000 C 20.000 211.046 28.954 220.000 40.000 220.000 L 66.110 220.000 C 69.233 220.003 72.314 219.281 75.110 217.890 L 86.830 212.000 L 101.170 212.000 L 112.940 217.890 C 115.736 219.281 118.817 220.003 121.940 220.000 L 150.160 220.000 C 153.266 219.996 156.329 219.273 159.110 217.890 L 170.830 212.000 L 185.170 212.000 L 196.940 217.890 C 199.721 219.273 202.784 219.996 205.890 220.000 L 232.000 220.000 C 243.046 220.000 252.000 211.046 252.000 200.000 L 252.000 164.000 C 251.961 130.879 225.121 104.039 192.000 104.000 ZM 48.000 60.000 L 140.000 60.000 L 140.000 104.000 L 116.000 104.000 C 109.373 104.000 104.000 109.373 104.000 116.000 C 104.000 122.627 109.373 128.000 116.000 128.000 L 192.000 128.000 C 207.249 128.021 220.837 137.630 225.940 152.000 L 47.210 152.000 C 52.750 124.080 54.230 88.410 48.000 60.000 ZM 228.000 196.000 L 206.830 196.000 L 195.060 190.110 C 192.279 188.727 189.216 188.004 186.110 188.000 L 169.890 188.000 C 166.784 188.004 163.721 188.727 160.940 190.110 L 149.170 196.000 L 122.830 196.000 L 111.060 190.110 C 108.264 188.719 105.183 187.997 102.060 188.000 L 85.890 188.000 C 82.767 187.997 79.686 188.719 76.890 190.110 L 65.170 196.000 L 44.000 196.000 L 44.000 176.000 L 228.000 176.000 Z"),
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
        return _boot!!
    }

private var _boot: ImageVector? = null
