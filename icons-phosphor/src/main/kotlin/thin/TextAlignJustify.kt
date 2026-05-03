package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextAlignJustify: ImageVector
    get() {
        if (_textAlignJustify != null) return _textAlignJustify!!
        _textAlignJustify = phosphorThinIcon(
            name = "TextAlignJustify",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 36.000 64.000 C 36.000 61.791 37.791 60.000 40.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 61.791 220.000 64.000 C 220.000 66.209 218.209 68.000 216.000 68.000 L 40.000 68.000 C 37.791 68.000 36.000 66.209 36.000 64.000 ZM 216.000 100.000 L 40.000 100.000 C 37.791 100.000 36.000 101.791 36.000 104.000 C 36.000 106.209 37.791 108.000 40.000 108.000 L 216.000 108.000 C 218.209 108.000 220.000 106.209 220.000 104.000 C 220.000 101.791 218.209 100.000 216.000 100.000 ZM 216.000 140.000 L 40.000 140.000 C 37.791 140.000 36.000 141.791 36.000 144.000 C 36.000 146.209 37.791 148.000 40.000 148.000 L 216.000 148.000 C 218.209 148.000 220.000 146.209 220.000 144.000 C 220.000 141.791 218.209 140.000 216.000 140.000 ZM 216.000 180.000 L 40.000 180.000 C 37.791 180.000 36.000 181.791 36.000 184.000 C 36.000 186.209 37.791 188.000 40.000 188.000 L 216.000 188.000 C 218.209 188.000 220.000 186.209 220.000 184.000 C 220.000 181.791 218.209 180.000 216.000 180.000 Z"),
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
        return _textAlignJustify!!
    }

private var _textAlignJustify: ImageVector? = null
