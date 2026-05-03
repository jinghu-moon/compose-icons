package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsClockwise: ImageVector
    get() {
        if (_arrowsClockwise != null) return _arrowsClockwise!!
        _arrowsClockwise = phosphorDuotoneIcon(
            name = "ArrowsClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 128.000 C 216.000 176.601 176.601 216.000 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 48.000 L 224.000 96.000 C 224.000 100.418 220.418 104.000 216.000 104.000 L 168.000 104.000 C 163.582 104.000 160.000 100.418 160.000 96.000 C 160.000 91.582 163.582 88.000 168.000 88.000 L 196.690 88.000 L 182.060 73.370 C 167.192 58.434 147.005 50.008 125.930 49.940 L 125.480 49.940 C 104.582 49.891 84.504 58.071 69.590 72.710 C 66.412 75.676 61.448 75.562 58.409 72.454 C 55.371 69.345 55.371 64.379 58.410 61.270 C 96.027 24.504 156.226 24.857 193.410 62.060 L 208.000 76.690 L 208.000 48.000 C 208.000 43.582 211.582 40.000 216.000 40.000 C 220.418 40.000 224.000 43.582 224.000 48.000 ZM 186.410 183.290 C 155.065 213.908 104.923 213.613 73.940 182.630 L 59.310 168.000 L 88.000 168.000 C 92.418 168.000 96.000 164.418 96.000 160.000 C 96.000 155.582 92.418 152.000 88.000 152.000 L 40.000 152.000 C 35.582 152.000 32.000 155.582 32.000 160.000 L 32.000 208.000 C 32.000 212.418 35.582 216.000 40.000 216.000 C 44.418 216.000 48.000 212.418 48.000 208.000 L 48.000 179.310 L 62.630 193.940 C 80.472 211.872 104.704 221.986 130.000 222.060 L 130.530 222.060 C 155.611 222.125 179.707 212.306 197.600 194.730 C 200.639 191.621 200.639 186.655 197.601 183.546 C 194.562 180.438 189.598 180.324 186.420 183.290 Z"),
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
        return _arrowsClockwise!!
    }

private var _arrowsClockwise: ImageVector? = null
