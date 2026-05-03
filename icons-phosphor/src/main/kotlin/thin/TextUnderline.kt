package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) return _textUnderline!!
        _textUnderline = phosphorThinIcon(
            name = "TextUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.000 224.000 C 196.000 226.209 194.209 228.000 192.000 228.000 L 64.000 228.000 C 61.791 228.000 60.000 226.209 60.000 224.000 C 60.000 221.791 61.791 220.000 64.000 220.000 L 192.000 220.000 C 194.209 220.000 196.000 221.791 196.000 224.000 ZM 128.000 196.000 C 161.121 195.961 187.961 169.121 188.000 136.000 L 188.000 56.000 C 188.000 53.791 186.209 52.000 184.000 52.000 C 181.791 52.000 180.000 53.791 180.000 56.000 L 180.000 136.000 C 180.000 164.719 156.719 188.000 128.000 188.000 C 99.281 188.000 76.000 164.719 76.000 136.000 L 76.000 56.000 C 76.000 53.791 74.209 52.000 72.000 52.000 C 69.791 52.000 68.000 53.791 68.000 56.000 L 68.000 136.000 C 68.039 169.121 94.879 195.961 128.000 196.000 Z"),
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
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
