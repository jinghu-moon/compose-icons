package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorLightIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 194.000 L 230.000 194.000 L 230.000 124.320 L 235.120 131.490 C 237.053 134.185 240.805 134.803 243.500 132.870 C 246.195 130.937 246.813 127.185 244.880 124.490 L 204.880 68.490 C 204.475 67.927 203.978 67.437 203.410 67.040 L 135.770 20.350 C 131.035 17.194 124.861 17.217 120.150 20.410 L 52.590 67.060 C 52.022 67.457 51.525 67.947 51.120 68.510 L 11.120 124.510 C 9.187 127.205 9.805 130.957 12.500 132.890 C 15.195 134.823 18.947 134.205 20.880 131.510 L 26.000 124.320 L 26.000 194.000 L 16.000 194.000 C 12.686 194.000 10.000 196.686 10.000 200.000 C 10.000 203.314 12.686 206.000 16.000 206.000 L 240.000 206.000 C 243.314 206.000 246.000 203.314 246.000 200.000 C 246.000 196.686 243.314 194.000 240.000 194.000 ZM 38.000 107.520 L 60.270 76.340 L 126.890 30.340 C 127.532 29.908 128.365 29.884 129.030 30.280 L 195.730 76.340 L 218.000 107.520 L 218.000 194.000 L 190.000 194.000 L 190.000 120.000 C 190.000 116.686 187.314 114.000 184.000 114.000 L 72.000 114.000 C 68.686 114.000 66.000 116.686 66.000 120.000 L 66.000 194.000 L 38.000 194.000 ZM 128.000 152.630 L 90.720 126.000 L 165.280 126.000 ZM 178.000 131.630 L 178.000 188.310 L 138.320 160.000 ZM 117.680 160.000 L 78.000 188.340 L 78.000 131.660 ZM 128.000 167.370 L 165.280 194.000 L 90.720 194.000 ZM 106.000 88.000 C 106.000 84.686 108.686 82.000 112.000 82.000 L 144.000 82.000 C 147.314 82.000 150.000 84.686 150.000 88.000 C 150.000 91.314 147.314 94.000 144.000 94.000 L 112.000 94.000 C 108.686 94.000 106.000 91.314 106.000 88.000 Z"),
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
        return _barn!!
    }

private var _barn: ImageVector? = null
