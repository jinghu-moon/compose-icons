package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SunHorizon: ImageVector
    get() {
        if (_sunHorizon != null) return _sunHorizon!!
        _sunHorizon = phosphorRegularIcon(
            name = "SunHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 152.000 L 199.550 152.000 C 199.845 149.343 199.995 146.673 200.000 144.000 C 200.000 104.235 167.764 72.000 128.000 72.000 C 88.235 72.000 56.000 104.235 56.000 144.000 C 56.005 146.673 56.155 149.343 56.450 152.000 L 16.000 152.000 C 11.582 152.000 8.000 155.582 8.000 160.000 C 8.000 164.418 11.582 168.000 16.000 168.000 L 240.000 168.000 C 244.418 168.000 248.000 164.418 248.000 160.000 C 248.000 155.582 244.418 152.000 240.000 152.000 ZM 72.000 144.000 C 71.960 123.008 83.663 103.757 102.317 94.130 C 120.971 84.503 143.442 86.116 160.529 98.310 C 177.616 110.504 186.449 131.229 183.410 152.000 L 72.590 152.000 C 72.203 149.351 72.006 146.677 72.000 144.000 ZM 216.000 200.000 C 216.000 204.418 212.418 208.000 208.000 208.000 L 48.000 208.000 C 43.582 208.000 40.000 204.418 40.000 200.000 C 40.000 195.582 43.582 192.000 48.000 192.000 L 208.000 192.000 C 212.418 192.000 216.000 195.582 216.000 200.000 ZM 72.840 43.580 C 70.863 39.626 72.466 34.817 76.420 32.840 C 80.374 30.863 85.183 32.466 87.160 36.420 L 95.160 52.420 C 97.137 56.374 95.534 61.183 91.580 63.160 C 87.626 65.137 82.817 63.534 80.840 59.580 ZM 16.840 92.420 C 17.790 90.522 19.456 89.079 21.470 88.410 C 23.485 87.740 25.683 87.898 27.580 88.850 L 43.580 96.850 C 47.532 98.827 49.132 103.633 47.155 107.585 C 45.178 111.537 40.372 113.137 36.420 111.160 L 20.420 103.160 C 18.520 102.212 17.075 100.547 16.404 98.532 C 15.732 96.518 15.889 94.319 16.840 92.420 ZM 208.840 107.580 C 206.867 103.628 208.469 98.825 212.420 96.850 L 228.420 88.850 C 232.372 86.873 237.178 88.473 239.155 92.425 C 241.132 96.377 239.532 101.183 235.580 103.160 L 219.580 111.160 C 217.681 112.111 215.482 112.268 213.468 111.596 C 211.453 110.925 209.788 109.480 208.840 107.580 ZM 160.840 52.420 L 168.840 36.420 C 170.817 32.466 175.626 30.863 179.580 32.840 C 183.534 34.817 185.137 39.626 183.160 43.580 L 175.160 59.580 C 173.183 63.534 168.374 65.137 164.420 63.160 C 160.466 61.183 158.863 56.374 160.840 52.420 Z"),
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
