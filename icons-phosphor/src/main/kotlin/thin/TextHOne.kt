package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHOne: ImageVector
    get() {
        if (_textHOne != null) return _textHOne!!
        _textHOne = phosphorThinIcon(
            name = "TextHOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 112.000 L 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 C 221.791 212.000 220.000 210.209 220.000 208.000 L 220.000 119.470 L 202.220 131.330 C 200.381 132.556 197.896 132.059 196.670 130.220 C 195.444 128.381 195.941 125.896 197.780 124.670 L 221.780 108.670 C 223.008 107.851 224.587 107.774 225.888 108.471 C 227.189 109.168 228.001 110.524 228.000 112.000 ZM 144.000 52.000 C 141.791 52.000 140.000 53.791 140.000 56.000 L 140.000 112.000 L 44.000 112.000 L 44.000 56.000 C 44.000 53.791 42.209 52.000 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 L 36.000 176.000 C 36.000 178.209 37.791 180.000 40.000 180.000 C 42.209 180.000 44.000 178.209 44.000 176.000 L 44.000 120.000 L 140.000 120.000 L 140.000 176.000 C 140.000 178.209 141.791 180.000 144.000 180.000 C 146.209 180.000 148.000 178.209 148.000 176.000 L 148.000 56.000 C 148.000 53.791 146.209 52.000 144.000 52.000 Z"),
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
