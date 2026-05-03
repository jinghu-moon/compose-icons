package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorBoldIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 199.880 171.420 L 175.880 171.420 L 166.100 158.000 L 177.400 125.060 L 193.150 120.000 L 211.750 134.260 C 210.786 147.411 206.718 160.146 199.880 171.420 ZM 44.250 134.210 L 62.850 120.000 L 78.600 125.110 L 89.900 158.000 L 80.150 171.420 L 56.150 171.420 C 49.294 160.133 45.215 147.380 44.250 134.210 ZM 111.850 148.000 L 102.310 120.230 L 128.000 102.560 L 153.690 120.230 L 144.150 148.000 ZM 192.510 74.270 L 185.730 97.120 L 169.920 102.260 L 140.000 81.690 L 140.000 65.460 L 161.220 50.870 C 173.339 56.111 184.057 64.126 192.510 74.270 ZM 94.780 50.870 L 116.000 65.460 L 116.000 81.690 L 86.080 102.260 L 70.270 97.120 L 63.490 74.270 C 71.943 64.126 82.661 56.111 94.780 50.870 ZM 108.360 209.660 L 99.740 185.290 L 109.390 172.000 L 146.610 172.000 L 156.260 185.290 L 147.640 209.660 C 134.733 212.780 121.267 212.780 108.360 209.660 Z"),
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
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
