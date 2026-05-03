package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.StackOverflowLogo: ImageVector
    get() {
        if (_stackOverflowLogo != null) return _stackOverflowLogo!!
        _stackOverflowLogo = phosphorFillIcon(
            name = "StackOverflowLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 134.860 46.860 C 136.361 45.358 138.397 44.514 140.520 44.514 C 142.643 44.514 144.679 45.358 146.180 46.860 L 191.430 92.120 C 194.418 95.265 194.355 100.219 191.287 103.287 C 188.219 106.355 183.265 106.418 180.120 103.430 L 134.860 58.180 C 133.358 56.679 132.514 54.643 132.514 52.520 C 132.514 50.397 133.358 48.361 134.860 46.860 ZM 100.180 98.770 C 101.871 94.689 106.549 92.751 110.630 94.440 L 169.760 118.930 C 173.298 120.383 175.312 124.138 174.567 127.889 C 173.822 131.641 170.525 134.340 166.700 134.330 C 165.649 134.329 164.609 134.118 163.640 133.710 L 104.510 109.220 C 100.429 107.529 98.491 102.851 100.180 98.770 ZM 96.000 152.000 L 160.000 152.000 C 164.418 152.000 168.000 155.582 168.000 160.000 C 168.000 164.418 164.418 168.000 160.000 168.000 L 96.000 168.000 C 91.582 168.000 88.000 164.418 88.000 160.000 C 88.000 155.582 91.582 152.000 96.000 152.000 ZM 200.000 192.000 C 200.000 196.418 196.418 200.000 192.000 200.000 L 64.000 200.000 C 59.582 200.000 56.000 196.418 56.000 192.000 L 56.000 144.000 C 56.000 139.582 59.582 136.000 64.000 136.000 C 68.418 136.000 72.000 139.582 72.000 144.000 L 72.000 184.000 L 184.000 184.000 L 184.000 144.000 C 184.000 139.582 187.582 136.000 192.000 136.000 C 196.418 136.000 200.000 139.582 200.000 144.000 Z"),
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
        return _stackOverflowLogo!!
    }

private var _stackOverflowLogo: ImageVector? = null
