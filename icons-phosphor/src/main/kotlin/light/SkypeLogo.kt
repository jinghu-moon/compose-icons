package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkypeLogo: ImageVector
    get() {
        if (_skypeLogo != null) return _skypeLogo!!
        _skypeLogo = phosphorLightIcon(
            name = "SkypeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 166.000 152.000 C 166.000 168.540 148.950 182.000 128.000 182.000 C 107.050 182.000 90.000 168.540 90.000 152.000 C 90.000 148.686 92.686 146.000 96.000 146.000 C 99.314 146.000 102.000 148.686 102.000 152.000 C 102.000 161.760 113.910 170.000 128.000 170.000 C 142.090 170.000 154.000 161.760 154.000 152.000 C 154.000 140.790 143.300 136.900 125.670 131.820 C 109.780 127.240 91.780 122.050 91.780 104.000 C 91.780 86.900 107.350 74.000 128.000 74.000 C 143.000 74.000 155.740 80.880 161.340 92.000 C 162.837 94.957 161.652 98.568 158.695 100.065 C 155.738 101.562 152.127 100.377 150.630 97.420 C 147.080 90.360 138.410 86.000 128.000 86.000 C 114.190 86.000 103.780 93.740 103.780 104.000 C 103.780 112.410 113.300 115.760 128.990 120.290 C 145.480 125.000 166.000 131.000 166.000 152.000 ZM 230.000 176.000 C 229.967 205.810 205.810 229.967 176.000 230.000 C 165.018 230.036 154.291 226.688 145.280 220.410 C 114.797 226.086 83.475 216.375 61.550 194.450 C 39.625 172.525 29.914 141.203 35.590 110.720 C 29.312 101.709 25.964 90.982 26.000 80.000 C 26.033 50.190 50.190 26.033 80.000 26.000 C 90.982 25.964 101.709 29.312 110.720 35.590 C 141.203 29.914 172.525 39.625 194.450 61.550 C 216.375 83.475 226.086 114.797 220.410 145.280 C 226.688 154.291 230.036 165.018 230.000 176.000 ZM 218.000 176.000 C 218.033 166.714 214.957 157.684 209.260 150.350 C 208.182 148.950 207.776 147.147 208.150 145.420 C 214.039 118.156 205.680 89.767 185.957 70.043 C 166.233 50.320 137.844 41.961 110.580 47.850 C 108.853 48.224 107.050 47.818 105.650 46.740 C 98.316 41.043 89.286 37.967 80.000 38.000 C 56.804 38.000 38.000 56.804 38.000 80.000 C 37.967 89.286 41.043 98.316 46.740 105.650 C 47.818 107.050 48.224 108.853 47.850 110.580 C 41.961 137.844 50.320 166.233 70.043 185.957 C 89.767 205.680 118.156 214.039 145.420 208.150 C 147.147 207.769 148.953 208.176 150.350 209.260 C 157.684 214.957 166.714 218.033 176.000 218.000 C 199.196 218.000 218.000 199.196 218.000 176.000 Z"),
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
        return _skypeLogo!!
    }

private var _skypeLogo: ImageVector? = null
