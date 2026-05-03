package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorLightIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 205.670 173.420 L 169.890 173.420 L 159.410 159.000 L 172.700 120.280 L 189.700 114.770 L 217.640 136.200 C 216.446 149.338 212.358 162.049 205.670 173.420 ZM 86.110 173.420 L 50.330 173.420 C 43.649 162.047 39.568 149.336 38.380 136.200 L 66.320 114.770 L 83.320 120.280 L 96.590 159.000 ZM 51.000 81.420 L 58.240 105.830 L 38.240 121.170 C 39.299 107.099 43.672 93.478 51.000 81.420 ZM 107.560 154.000 L 95.150 117.860 L 128.000 95.280 L 160.850 117.860 L 148.440 154.000 ZM 197.750 105.830 L 205.000 81.420 C 212.325 93.479 216.694 107.100 217.750 121.170 ZM 196.090 69.210 L 186.000 103.350 L 169.000 108.880 L 134.000 84.880 L 134.000 67.160 L 164.900 45.920 C 176.866 51.323 187.510 59.271 196.090 69.210 ZM 150.920 41.000 L 128.000 56.720 L 105.080 41.000 C 120.105 37.053 135.895 37.053 150.920 41.000 ZM 91.110 45.910 L 122.000 67.160 L 122.000 84.840 L 87.000 108.840 L 70.000 103.310 L 59.910 69.210 C 68.494 59.269 79.141 51.318 91.110 45.910 ZM 58.750 185.420 L 84.930 185.420 L 94.120 211.420 C 80.372 205.792 68.224 196.862 58.750 185.420 ZM 108.430 215.850 L 95.880 180.390 L 106.340 166.000 L 149.660 166.000 L 160.120 180.390 L 147.570 215.850 C 134.681 218.717 121.319 218.717 108.430 215.850 ZM 161.880 211.370 L 171.070 185.370 L 197.250 185.370 C 187.776 196.812 175.628 205.742 161.880 211.370 Z"),
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
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
