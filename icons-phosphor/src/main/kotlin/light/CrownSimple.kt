package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorLightIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 75.400 C 224.371 72.656 217.601 74.025 213.480 78.740 L 177.740 117.260 L 140.710 34.130 C 138.415 29.162 133.435 25.987 127.963 26.002 C 122.490 26.017 117.528 29.220 115.260 34.200 L 78.260 117.260 L 42.480 78.740 C 38.323 74.054 31.558 72.701 25.918 75.425 C 20.277 78.150 17.133 84.291 18.220 90.460 C 18.220 90.540 18.220 90.620 18.270 90.700 L 41.000 194.570 C 42.234 201.177 47.989 205.975 54.710 206.000 L 201.290 206.000 C 208.030 205.999 213.813 201.196 215.050 194.570 L 237.730 90.700 C 237.730 90.620 237.730 90.540 237.780 90.460 C 238.905 84.256 235.711 78.072 230.000 75.400 ZM 226.000 88.290 L 203.310 192.110 C 203.288 192.189 203.272 192.269 203.260 192.350 C 203.088 193.316 202.241 194.015 201.260 194.000 L 54.710 194.000 C 53.729 194.015 52.882 193.316 52.710 192.350 C 52.698 192.269 52.682 192.189 52.660 192.110 L 30.000 88.290 C 29.822 87.422 30.295 86.553 31.120 86.230 C 31.917 85.781 32.922 85.986 33.480 86.710 L 33.600 86.840 L 75.600 132.080 C 76.971 133.558 78.993 134.249 80.981 133.918 C 82.970 133.588 84.660 132.282 85.480 130.440 L 126.180 39.160 C 126.491 38.437 127.213 37.977 128.000 38.000 C 128.760 37.968 129.463 38.399 129.780 39.090 L 170.520 130.440 C 171.340 132.282 173.030 133.588 175.019 133.918 C 177.007 134.249 179.029 133.558 180.400 132.080 L 222.400 86.840 L 222.520 86.710 C 223.078 85.986 224.083 85.781 224.880 86.230 C 225.705 86.553 226.178 87.422 226.000 88.290 Z"),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
