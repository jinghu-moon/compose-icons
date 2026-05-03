package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsCounterClockwise: ImageVector
    get() {
        if (_arrowsCounterClockwise != null) return _arrowsCounterClockwise!!
        _arrowsCounterClockwise = phosphorDuotoneIcon(
            name = "ArrowsCounterClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 128.000 C 216.000 176.601 176.601 216.000 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 88.000 104.000 L 40.000 104.000 C 35.582 104.000 32.000 100.418 32.000 96.000 L 32.000 48.000 C 32.000 43.582 35.582 40.000 40.000 40.000 C 44.418 40.000 48.000 43.582 48.000 48.000 L 48.000 76.690 L 62.630 62.060 C 80.472 44.128 104.704 34.014 130.000 33.940 L 130.530 33.940 C 155.611 33.875 179.707 43.694 197.600 61.270 C 200.639 64.379 200.639 69.345 197.601 72.454 C 194.562 75.562 189.598 75.676 186.420 72.710 C 171.506 58.071 151.428 49.891 130.530 49.940 L 130.080 49.940 C 109.002 50.005 88.811 58.432 73.940 73.370 L 59.310 88.000 L 88.000 88.000 C 92.418 88.000 96.000 91.582 96.000 96.000 C 96.000 100.418 92.418 104.000 88.000 104.000 ZM 216.000 152.000 L 168.000 152.000 C 163.582 152.000 160.000 155.582 160.000 160.000 C 160.000 164.418 163.582 168.000 168.000 168.000 L 196.690 168.000 L 182.060 182.630 C 167.192 197.566 147.005 205.992 125.930 206.060 L 125.480 206.060 C 104.582 206.109 84.504 197.929 69.590 183.290 C 67.562 181.215 64.569 180.401 61.769 181.163 C 58.969 181.925 56.801 184.143 56.104 186.960 C 55.406 189.776 56.289 192.750 58.410 194.730 C 76.303 212.306 100.399 222.125 125.480 222.060 L 126.000 222.060 C 151.293 221.984 175.520 211.869 193.360 193.940 L 208.000 179.310 L 208.000 208.000 C 208.000 212.418 211.582 216.000 216.000 216.000 C 220.418 216.000 224.000 212.418 224.000 208.000 L 224.000 160.000 C 224.000 155.582 220.418 152.000 216.000 152.000 Z"),
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
        return _arrowsCounterClockwise!!
    }

private var _arrowsCounterClockwise: ImageVector? = null
