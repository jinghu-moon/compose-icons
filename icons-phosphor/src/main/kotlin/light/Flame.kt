package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorLightIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.340 52.860 C 160.035 39.880 146.181 28.461 131.090 18.860 C 129.188 17.718 126.812 17.718 124.910 18.860 C 109.819 28.461 95.965 39.880 83.660 52.860 C 56.400 81.480 42.000 113.000 42.000 144.000 C 42.000 191.496 80.504 230.000 128.000 230.000 C 175.496 230.000 214.000 191.496 214.000 144.000 C 214.000 113.000 199.600 81.480 172.340 52.860 ZM 94.000 184.000 C 94.000 154.200 119.110 133.590 128.000 127.220 C 136.910 133.570 162.000 154.090 162.000 184.000 C 161.999 202.105 147.830 217.043 129.750 218.000 C 129.160 218.000 128.590 218.000 128.000 218.000 C 127.410 218.000 126.840 218.000 126.250 218.000 C 108.170 217.043 94.001 202.105 94.000 184.000 ZM 168.420 205.940 C 172.091 199.211 174.010 191.666 174.000 184.000 C 174.000 141.100 132.840 115.910 131.090 114.860 C 129.188 113.718 126.812 113.718 124.910 114.860 C 123.160 115.910 82.000 141.100 82.000 184.000 C 81.990 191.666 83.909 199.211 87.580 205.940 C 66.645 192.289 54.015 168.993 54.000 144.000 C 54.000 84.170 113.620 40.740 128.000 31.140 C 142.390 40.740 202.000 84.140 202.000 144.000 C 201.985 168.993 189.355 192.289 168.420 205.940 Z"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
