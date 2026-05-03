package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorBoldIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 112.000 L 236.000 208.000 C 236.000 214.627 230.627 220.000 224.000 220.000 C 217.373 220.000 212.000 214.627 212.000 208.000 L 212.000 134.420 L 206.660 138.000 C 201.137 141.678 193.678 140.183 190.000 134.660 C 186.322 129.137 187.817 121.678 193.340 118.000 L 217.340 102.000 C 221.025 99.542 225.764 99.313 229.668 101.405 C 233.572 103.498 236.007 107.570 236.000 112.000 ZM 144.000 44.000 C 137.373 44.000 132.000 49.373 132.000 56.000 L 132.000 104.000 L 52.000 104.000 L 52.000 56.000 C 52.000 49.373 46.627 44.000 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 176.000 C 28.000 182.627 33.373 188.000 40.000 188.000 C 46.627 188.000 52.000 182.627 52.000 176.000 L 52.000 128.000 L 132.000 128.000 L 132.000 176.000 C 132.000 182.627 137.373 188.000 144.000 188.000 C 150.627 188.000 156.000 182.627 156.000 176.000 L 156.000 56.000 C 156.000 49.373 150.627 44.000 144.000 44.000 Z"),
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
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
