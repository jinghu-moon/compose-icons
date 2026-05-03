package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hand: ImageVector
    get() {
        if (_hand != null) return _hand!!
        _hand = phosphorDuotoneIcon(
            name = "Hand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 76.000 L 208.000 152.000 C 208.000 196.183 172.183 232.000 128.000 232.000 C 83.820 232.000 67.250 210.720 34.680 142.000 C 29.246 132.443 32.545 120.292 42.066 114.795 C 51.587 109.297 63.760 112.516 69.320 122.000 L 88.000 152.000 L 88.000 60.000 C 88.000 48.954 96.954 40.000 108.000 40.000 C 119.046 40.000 128.000 48.954 128.000 60.000 L 128.000 44.000 C 128.000 32.954 136.954 24.000 148.000 24.000 C 159.046 24.000 168.000 32.954 168.000 44.000 L 168.000 76.000 C 168.000 64.954 176.954 56.000 188.000 56.000 C 199.046 56.000 208.000 64.954 208.000 76.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 188.000 48.000 C 183.848 47.994 179.747 48.920 176.000 50.710 L 176.000 44.000 C 176.005 30.212 165.973 18.473 152.353 16.330 C 138.733 14.186 125.580 22.277 121.350 35.400 C 112.676 30.695 102.165 30.904 93.684 35.949 C 85.203 40.994 80.004 50.132 80.000 60.000 L 80.000 124.000 L 76.180 117.870 C 68.456 104.540 51.414 99.954 38.043 107.608 C 24.673 115.262 19.997 132.279 27.580 145.690 C 43.580 179.460 56.510 203.410 71.300 218.380 C 86.240 233.540 103.200 240.000 128.000 240.000 C 176.578 239.945 215.945 200.578 216.000 152.000 L 216.000 76.000 C 216.000 60.536 203.464 48.000 188.000 48.000 ZM 200.000 152.000 C 199.956 191.746 167.746 223.956 128.000 224.000 C 107.620 224.000 94.490 219.120 82.670 207.150 C 69.440 193.740 57.260 171.000 41.900 138.580 C 41.810 138.382 41.710 138.188 41.600 138.000 C 38.286 132.259 40.254 124.919 45.995 121.605 C 51.736 118.291 59.076 120.259 62.390 126.000 C 62.431 126.080 62.478 126.157 62.530 126.230 L 81.200 156.230 C 83.085 159.271 86.759 160.691 90.198 159.708 C 93.638 158.725 96.007 155.577 96.000 152.000 L 96.000 60.000 C 96.000 53.373 101.373 48.000 108.000 48.000 C 114.627 48.000 120.000 53.373 120.000 60.000 L 120.000 120.000 C 120.000 124.418 123.582 128.000 128.000 128.000 C 132.418 128.000 136.000 124.418 136.000 120.000 L 136.000 44.000 C 136.000 37.373 141.373 32.000 148.000 32.000 C 154.627 32.000 160.000 37.373 160.000 44.000 L 160.000 120.000 C 160.000 124.418 163.582 128.000 168.000 128.000 C 172.418 128.000 176.000 124.418 176.000 120.000 L 176.000 76.000 C 176.000 69.373 181.373 64.000 188.000 64.000 C 194.627 64.000 200.000 69.373 200.000 76.000 Z"),
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
        return _hand!!
    }

private var _hand: ImageVector? = null
