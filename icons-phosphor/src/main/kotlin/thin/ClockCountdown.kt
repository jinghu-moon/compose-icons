package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorThinIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 136.330 C 223.458 189.215 178.437 229.368 125.378 227.852 C 72.320 226.337 29.663 183.680 28.148 130.622 C 26.632 77.563 66.785 32.542 119.670 28.000 C 121.879 27.818 123.818 29.461 124.000 31.670 C 124.182 33.879 122.539 35.818 120.330 36.000 C 71.668 40.176 34.721 81.601 36.115 130.421 C 37.508 179.242 76.758 218.492 125.579 219.885 C 174.399 221.279 215.824 184.332 220.000 135.670 C 220.182 133.461 222.121 131.818 224.330 132.000 C 226.539 132.182 228.182 134.121 228.000 136.330 ZM 128.000 132.000 L 184.000 132.000 C 186.209 132.000 188.000 130.209 188.000 128.000 C 188.000 125.791 186.209 124.000 184.000 124.000 L 132.000 124.000 L 132.000 72.000 C 132.000 69.791 130.209 68.000 128.000 68.000 C 125.791 68.000 124.000 69.791 124.000 72.000 L 124.000 128.000 C 124.000 130.209 125.791 132.000 128.000 132.000 ZM 160.000 44.000 C 164.418 44.000 168.000 40.418 168.000 36.000 C 168.000 31.582 164.418 28.000 160.000 28.000 C 155.582 28.000 152.000 31.582 152.000 36.000 C 152.000 40.418 155.582 44.000 160.000 44.000 ZM 196.000 68.000 C 200.418 68.000 204.000 64.418 204.000 60.000 C 204.000 55.582 200.418 52.000 196.000 52.000 C 191.582 52.000 188.000 55.582 188.000 60.000 C 188.000 64.418 191.582 68.000 196.000 68.000 ZM 220.000 104.000 C 224.418 104.000 228.000 100.418 228.000 96.000 C 228.000 91.582 224.418 88.000 220.000 88.000 C 215.582 88.000 212.000 91.582 212.000 96.000 C 212.000 100.418 215.582 104.000 220.000 104.000 Z"),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
