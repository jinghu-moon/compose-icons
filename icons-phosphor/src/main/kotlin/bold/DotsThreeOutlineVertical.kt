package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DotsThreeOutlineVertical: ImageVector
    get() {
        if (_dotsThreeOutlineVertical != null) return _dotsThreeOutlineVertical!!
        _dotsThreeOutlineVertical = phosphorBoldIcon(
            name = "DotsThreeOutlineVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 96.000 C 110.327 96.000 96.000 110.327 96.000 128.000 C 96.000 145.673 110.327 160.000 128.000 160.000 C 145.673 160.000 160.000 145.673 160.000 128.000 C 160.000 110.327 145.673 96.000 128.000 96.000 ZM 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 123.582 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 ZM 128.000 80.000 C 145.673 80.000 160.000 65.673 160.000 48.000 C 160.000 30.327 145.673 16.000 128.000 16.000 C 110.327 16.000 96.000 30.327 96.000 48.000 C 96.000 65.673 110.327 80.000 128.000 80.000 ZM 128.000 40.000 C 132.418 40.000 136.000 43.582 136.000 48.000 C 136.000 52.418 132.418 56.000 128.000 56.000 C 123.582 56.000 120.000 52.418 120.000 48.000 C 120.000 43.582 123.582 40.000 128.000 40.000 ZM 128.000 176.000 C 110.327 176.000 96.000 190.327 96.000 208.000 C 96.000 225.673 110.327 240.000 128.000 240.000 C 145.673 240.000 160.000 225.673 160.000 208.000 C 160.000 190.327 145.673 176.000 128.000 176.000 ZM 128.000 216.000 C 123.582 216.000 120.000 212.418 120.000 208.000 C 120.000 203.582 123.582 200.000 128.000 200.000 C 132.418 200.000 136.000 203.582 136.000 208.000 C 136.000 212.418 132.418 216.000 128.000 216.000 Z"),
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
        return _dotsThreeOutlineVertical!!
    }

private var _dotsThreeOutlineVertical: ImageVector? = null
