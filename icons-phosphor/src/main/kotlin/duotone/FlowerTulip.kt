package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorDuotoneIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 169.230 66.000 L 169.230 66.000 C 143.780 80.100 127.992 106.905 128.000 136.000 C 128.008 106.905 112.220 80.100 86.770 66.000 L 86.770 66.000 C 100.000 38.000 128.000 24.000 128.000 24.000 C 128.000 24.000 156.000 38.000 169.230 66.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 208.000 48.000 C 195.825 47.989 183.781 50.520 172.640 55.430 C 157.540 30.060 132.720 17.430 131.580 16.840 C 129.327 15.712 126.673 15.712 124.420 16.840 C 123.280 17.420 98.420 30.060 83.360 55.430 C 72.219 50.520 60.175 47.989 48.000 48.000 C 43.582 48.000 40.000 51.582 40.000 56.000 L 40.000 96.000 C 40.055 141.479 74.714 179.444 120.000 183.630 L 120.000 219.060 L 83.580 200.840 C 79.626 198.863 74.817 200.466 72.840 204.420 C 70.863 208.374 72.466 213.183 76.420 215.160 L 124.420 239.160 C 126.673 240.288 129.327 240.288 131.580 239.160 L 179.580 215.160 C 183.534 213.183 185.137 208.374 183.160 204.420 C 181.183 200.466 176.374 198.863 172.420 200.840 L 136.000 219.060 L 136.000 183.630 C 181.286 179.444 215.945 141.479 216.000 96.000 L 216.000 56.000 C 216.000 51.582 212.418 48.000 208.000 48.000 ZM 128.000 33.210 C 134.650 37.290 149.080 47.400 158.640 63.210 C 145.329 72.249 134.736 84.748 128.000 99.360 C 121.270 84.739 110.676 72.232 97.360 63.190 C 106.930 47.400 121.350 37.290 128.000 33.210 ZM 56.000 96.000 L 56.000 64.440 C 92.422 68.558 119.958 99.346 120.000 136.000 L 120.000 167.560 C 83.578 163.442 56.042 132.654 56.000 96.000 ZM 200.000 96.000 C 199.958 132.654 172.422 163.442 136.000 167.560 L 136.000 136.000 C 136.042 99.346 163.578 68.558 200.000 64.440 Z"),
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
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
