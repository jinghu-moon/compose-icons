package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorBoldIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 188.000 84.000 C 185.302 83.995 182.614 84.331 180.000 85.000 L 180.000 60.000 C 180.009 49.505 174.871 39.672 166.250 33.686 C 157.629 27.701 146.620 26.323 136.790 30.000 C 130.278 16.579 115.356 9.437 100.818 12.785 C 86.281 16.133 75.986 29.082 76.000 44.000 L 76.000 45.000 C 66.414 42.525 56.223 44.626 48.398 50.691 C 40.573 56.755 35.995 66.100 36.000 76.000 L 36.000 152.000 C 36.000 202.810 77.190 244.000 128.000 244.000 C 178.810 244.000 220.000 202.810 220.000 152.000 L 220.000 116.000 C 220.000 98.327 205.673 84.000 188.000 84.000 ZM 196.000 152.000 C 196.000 189.555 165.555 220.000 128.000 220.000 C 90.445 220.000 60.000 189.555 60.000 152.000 L 60.000 76.000 C 60.000 71.582 63.582 68.000 68.000 68.000 C 72.418 68.000 76.000 71.582 76.000 76.000 L 76.000 116.000 C 76.000 122.627 81.373 128.000 88.000 128.000 C 94.627 128.000 100.000 122.627 100.000 116.000 L 100.000 44.000 C 100.000 39.582 103.582 36.000 108.000 36.000 C 112.418 36.000 116.000 39.582 116.000 44.000 L 116.000 108.000 C 116.000 114.627 121.373 120.000 128.000 120.000 C 134.627 120.000 140.000 114.627 140.000 108.000 L 140.000 60.000 C 140.000 55.582 143.582 52.000 148.000 52.000 C 152.418 52.000 156.000 55.582 156.000 60.000 L 156.000 125.400 C 132.572 130.990 116.031 151.914 116.000 176.000 C 116.000 182.627 121.373 188.000 128.000 188.000 C 134.627 188.000 140.000 182.627 140.000 176.000 C 140.000 160.536 152.536 148.000 168.000 148.000 C 174.627 148.000 180.000 142.627 180.000 136.000 L 180.000 116.000 C 180.000 111.582 183.582 108.000 188.000 108.000 C 192.418 108.000 196.000 111.582 196.000 116.000 Z"),
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
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
