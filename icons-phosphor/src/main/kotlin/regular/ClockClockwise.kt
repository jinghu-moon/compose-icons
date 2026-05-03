package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ClockClockwise: ImageVector
    get() {
        if (_clockClockwise != null) return _clockClockwise!!
        _clockClockwise = phosphorRegularIcon(
            name = "ClockClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 136.000 80.000 L 136.000 123.470 L 172.120 145.140 C 175.909 147.415 177.135 152.331 174.860 156.120 C 172.585 159.909 167.669 161.135 163.880 158.860 L 123.880 134.860 C 121.472 133.413 119.999 130.809 120.000 128.000 L 120.000 80.000 C 120.000 75.582 123.582 72.000 128.000 72.000 C 132.418 72.000 136.000 75.582 136.000 80.000 ZM 224.000 56.000 C 219.582 56.000 216.000 59.582 216.000 64.000 L 216.000 82.000 C 209.650 74.640 203.170 67.550 195.880 60.170 C 158.647 22.933 98.368 22.639 60.773 59.511 C 23.179 96.383 22.304 156.657 58.811 194.605 C 95.319 232.553 155.581 234.010 193.880 197.870 C 197.094 194.832 197.238 189.764 194.200 186.550 C 191.162 183.336 186.094 183.192 182.880 186.230 C 150.956 216.316 100.758 215.082 70.351 183.464 C 39.944 151.846 40.670 101.638 71.978 70.912 C 103.287 40.187 153.499 40.404 184.540 71.400 C 192.680 79.640 199.810 87.580 207.000 96.000 L 184.000 96.000 C 179.582 96.000 176.000 99.582 176.000 104.000 C 176.000 108.418 179.582 112.000 184.000 112.000 L 224.000 112.000 C 228.418 112.000 232.000 108.418 232.000 104.000 L 232.000 64.000 C 232.000 59.582 228.418 56.000 224.000 56.000 Z"),
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
        return _clockClockwise!!
    }

private var _clockClockwise: ImageVector? = null
