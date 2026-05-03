package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorThinIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.110 148.630 L 172.230 52.630 L 172.170 52.540 C 162.682 37.268 145.979 27.981 128.000 27.981 C 110.021 27.981 93.318 37.268 83.830 52.540 L 83.770 52.630 L 27.890 148.630 C 17.963 164.667 17.497 184.822 26.674 201.300 C 35.850 217.778 53.229 227.995 72.090 228.000 L 183.910 228.000 C 202.771 227.995 220.150 217.778 229.326 201.300 C 238.503 184.822 238.037 164.667 228.110 148.630 ZM 164.000 220.000 L 92.000 220.000 L 92.000 168.000 C 92.000 165.791 93.791 164.000 96.000 164.000 L 160.000 164.000 C 162.209 164.000 164.000 165.791 164.000 168.000 ZM 222.360 197.390 C 214.688 211.435 199.914 220.123 183.910 220.000 L 172.000 220.000 L 172.000 168.000 C 172.000 161.373 166.627 156.000 160.000 156.000 L 96.000 156.000 C 89.373 156.000 84.000 161.373 84.000 168.000 L 84.000 220.000 L 72.090 220.000 C 56.123 219.994 41.413 211.339 33.653 197.384 C 25.893 183.430 26.301 166.367 34.720 152.800 C 34.730 152.764 34.747 152.730 34.770 152.700 L 90.650 56.750 C 98.683 43.850 112.804 36.009 128.000 36.009 C 143.196 36.009 157.317 43.850 165.350 56.750 L 221.230 152.700 C 221.253 152.730 221.270 152.764 221.280 152.800 C 229.825 166.331 230.236 183.465 222.350 197.390 Z"),
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
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
