package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) return _sunHorizon!!
        _sunHorizon = phosphorFillIcon(
            name = "SunHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 160.000 C 248.000 164.418 244.418 168.000 240.000 168.000 L 16.000 168.000 C 11.582 168.000 8.000 164.418 8.000 160.000 C 8.000 155.582 11.582 152.000 16.000 152.000 L 56.450 152.000 C 56.155 149.343 56.005 146.673 56.000 144.000 C 56.000 104.235 88.235 72.000 128.000 72.000 C 167.764 72.000 200.000 104.235 200.000 144.000 C 199.995 146.673 199.845 149.343 199.550 152.000 L 240.000 152.000 C 244.418 152.000 248.000 155.582 248.000 160.000 ZM 208.000 192.000 L 48.000 192.000 C 43.582 192.000 40.000 195.582 40.000 200.000 C 40.000 204.418 43.582 208.000 48.000 208.000 L 208.000 208.000 C 212.418 208.000 216.000 204.418 216.000 200.000 C 216.000 195.582 212.418 192.000 208.000 192.000 ZM 80.840 59.580 C 82.817 63.534 87.626 65.137 91.580 63.160 C 95.534 61.183 97.137 56.374 95.160 52.420 L 87.160 36.420 C 85.183 32.466 80.374 30.863 76.420 32.840 C 72.466 34.817 70.863 39.626 72.840 43.580 ZM 20.420 103.160 L 36.420 111.160 C 40.372 113.137 45.178 111.537 47.155 107.585 C 49.132 103.633 47.532 98.827 43.580 96.850 L 27.580 88.850 C 23.628 86.873 18.822 88.473 16.845 92.425 C 14.868 96.377 16.468 101.183 20.420 103.160 ZM 216.000 112.000 C 217.239 112.000 218.461 111.713 219.570 111.160 L 235.570 103.160 C 239.522 101.183 241.122 96.377 239.145 92.425 C 237.168 88.473 232.362 86.873 228.410 88.850 L 212.410 96.850 C 209.096 98.513 207.359 102.236 208.214 105.845 C 209.069 109.453 212.292 112.001 216.000 112.000 ZM 164.420 63.160 C 166.319 64.111 168.518 64.268 170.532 63.596 C 172.547 62.925 174.212 61.480 175.160 59.580 L 183.160 43.580 C 185.137 39.626 183.534 34.817 179.580 32.840 C 175.626 30.863 170.817 32.466 168.840 36.420 L 160.840 52.420 C 159.889 54.319 159.732 56.518 160.404 58.532 C 161.075 60.547 162.520 62.212 164.420 63.160 Z"),
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
        return _sunHorizon!!
    }

private var _sunHorizon: ImageVector? = null
