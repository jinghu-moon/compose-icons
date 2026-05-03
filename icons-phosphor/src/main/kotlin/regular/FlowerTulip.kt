package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorRegularIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 48.000 C 195.825 47.989 183.781 50.520 172.640 55.430 C 157.540 30.060 132.720 17.430 131.580 16.840 C 129.327 15.712 126.673 15.712 124.420 16.840 C 123.280 17.420 98.420 30.060 83.360 55.430 C 72.219 50.520 60.175 47.989 48.000 48.000 C 43.582 48.000 40.000 51.582 40.000 56.000 L 40.000 96.000 C 40.055 141.479 74.714 179.444 120.000 183.630 L 120.000 219.060 L 83.580 200.840 C 79.626 198.863 74.817 200.466 72.840 204.420 C 70.863 208.374 72.466 213.183 76.420 215.160 L 124.420 239.160 C 126.673 240.288 129.327 240.288 131.580 239.160 L 179.580 215.160 C 183.534 213.183 185.137 208.374 183.160 204.420 C 181.183 200.466 176.374 198.863 172.420 200.840 L 136.000 219.060 L 136.000 183.630 C 181.286 179.444 215.945 141.479 216.000 96.000 L 216.000 56.000 C 216.000 51.582 212.418 48.000 208.000 48.000 ZM 120.000 167.560 C 83.578 163.442 56.042 132.654 56.000 96.000 L 56.000 64.440 C 92.422 68.558 119.958 99.346 120.000 136.000 ZM 128.000 99.360 C 121.270 84.739 110.676 72.232 97.360 63.190 C 106.930 47.400 121.360 37.290 128.000 33.190 C 134.650 37.270 149.080 47.380 158.640 63.190 C 145.326 72.235 134.733 84.740 128.000 99.360 ZM 200.000 96.000 C 199.958 132.654 172.422 163.442 136.000 167.560 L 136.000 136.000 C 136.042 99.346 163.578 68.558 200.000 64.440 Z"),
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
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
