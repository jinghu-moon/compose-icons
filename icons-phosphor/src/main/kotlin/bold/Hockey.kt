package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorBoldIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 148.000 L 132.750 148.000 L 41.140 40.230 C 36.801 35.374 29.381 34.865 24.419 39.083 C 19.458 43.301 18.766 50.706 22.860 55.770 L 118.020 167.770 L 118.080 167.840 L 156.460 213.000 C 160.269 217.453 165.840 220.012 171.700 220.000 L 224.000 220.000 C 235.046 220.000 244.000 211.046 244.000 200.000 L 244.000 168.000 C 244.000 156.954 235.046 148.000 224.000 148.000 ZM 153.150 172.000 L 180.000 172.000 L 180.000 196.000 L 173.550 196.000 ZM 220.000 196.000 L 204.000 196.000 L 204.000 172.000 L 220.000 172.000 ZM 153.660 112.230 L 214.860 40.230 C 219.199 35.374 226.619 34.865 231.581 39.083 C 236.542 43.301 237.234 50.706 233.140 55.770 L 171.940 127.770 C 169.200 131.159 164.839 132.796 160.546 132.047 C 156.253 131.298 152.704 128.280 151.273 124.164 C 149.843 120.048 150.757 115.480 153.660 112.230 ZM 109.520 182.680 C 104.471 178.391 96.902 179.004 92.610 184.050 L 82.450 196.000 L 76.000 196.000 L 76.000 171.930 C 82.340 171.242 87.034 165.716 86.688 159.349 C 86.342 152.982 81.077 147.997 74.700 148.000 L 32.000 148.000 C 20.954 148.000 12.000 156.954 12.000 168.000 L 12.000 200.000 C 12.000 211.046 20.954 220.000 32.000 220.000 L 84.300 220.000 C 90.160 220.012 95.731 217.453 99.540 213.000 L 110.890 199.640 C 112.965 197.213 113.988 194.058 113.731 190.875 C 113.474 187.692 111.958 184.743 109.520 182.680 ZM 36.000 172.000 L 52.000 172.000 L 52.000 196.000 L 36.000 196.000 Z"),
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
        return _hockey!!
    }

private var _hockey: ImageVector? = null
