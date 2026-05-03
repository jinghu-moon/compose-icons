package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorBoldIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 156.000 56.000 L 156.000 176.000 C 156.000 182.627 150.627 188.000 144.000 188.000 C 137.373 188.000 132.000 182.627 132.000 176.000 L 132.000 128.000 L 52.000 128.000 L 52.000 176.000 C 52.000 182.627 46.627 188.000 40.000 188.000 C 33.373 188.000 28.000 182.627 28.000 176.000 L 28.000 56.000 C 28.000 49.373 33.373 44.000 40.000 44.000 C 46.627 44.000 52.000 49.373 52.000 56.000 L 52.000 104.000 L 132.000 104.000 L 132.000 56.000 C 132.000 49.373 137.373 44.000 144.000 44.000 C 150.627 44.000 156.000 49.373 156.000 56.000 ZM 256.000 184.000 C 256.000 190.627 250.627 196.000 244.000 196.000 L 244.000 208.000 C 244.000 214.627 238.627 220.000 232.000 220.000 C 225.373 220.000 220.000 214.627 220.000 208.000 L 220.000 196.000 L 180.000 196.000 C 175.502 195.994 171.386 193.473 169.336 189.470 C 167.286 185.467 167.646 180.653 170.270 177.000 L 222.270 105.000 C 225.314 100.783 230.729 99.006 235.679 100.601 C 240.630 102.196 243.990 106.799 244.000 112.000 L 244.000 172.000 C 250.627 172.000 256.000 177.373 256.000 184.000 ZM 220.000 149.110 L 203.470 172.000 L 220.000 172.000 Z"),
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
        return _textHFour!!
    }

private var _textHFour: ImageVector? = null
