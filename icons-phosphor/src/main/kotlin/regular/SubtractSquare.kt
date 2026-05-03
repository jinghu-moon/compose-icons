package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SubtractSquare: ImageVector
    get() {
        if (_subtractSquare != null) return _subtractSquare!!
        _subtractSquare = phosphorRegularIcon(
            name = "SubtractSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 160.000 L 224.000 96.000 C 224.000 91.582 220.418 88.000 216.000 88.000 L 168.000 88.000 L 168.000 40.000 C 168.000 35.582 164.418 32.000 160.000 32.000 L 40.000 32.000 C 35.582 32.000 32.000 35.582 32.000 40.000 L 32.000 160.000 C 32.000 164.418 35.582 168.000 40.000 168.000 L 88.000 168.000 L 88.000 216.000 C 88.000 220.418 91.582 224.000 96.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 L 224.000 160.000 ZM 163.310 208.000 L 123.310 168.000 L 156.690 168.000 L 196.690 208.000 ZM 168.000 156.690 L 168.000 123.310 L 208.000 163.310 L 208.000 196.690 ZM 208.000 140.690 L 171.310 104.000 L 208.000 104.000 ZM 48.000 48.000 L 152.000 48.000 L 152.000 104.000 L 152.000 104.000 L 152.000 152.000 L 48.000 152.000 ZM 104.000 171.310 L 140.690 208.000 L 104.000 208.000 Z"),
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
        return _subtractSquare!!
    }

private var _subtractSquare: ImageVector? = null
