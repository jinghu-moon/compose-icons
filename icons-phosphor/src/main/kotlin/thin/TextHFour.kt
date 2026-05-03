package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHFour: ImageVector
    get() {
        if (_textHFour != null) return _textHFour!!
        _textHFour = phosphorThinIcon(
            name = "TextHFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 148.000 56.000 L 148.000 176.000 C 148.000 178.209 146.209 180.000 144.000 180.000 C 141.791 180.000 140.000 178.209 140.000 176.000 L 140.000 120.000 L 44.000 120.000 L 44.000 176.000 C 44.000 178.209 42.209 180.000 40.000 180.000 C 37.791 180.000 36.000 178.209 36.000 176.000 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 C 42.209 52.000 44.000 53.791 44.000 56.000 L 44.000 112.000 L 140.000 112.000 L 140.000 56.000 C 140.000 53.791 141.791 52.000 144.000 52.000 C 146.209 52.000 148.000 53.791 148.000 56.000 ZM 252.000 184.000 C 252.000 186.209 250.209 188.000 248.000 188.000 L 236.000 188.000 L 236.000 208.000 C 236.000 210.209 234.209 212.000 232.000 212.000 C 229.791 212.000 228.000 210.209 228.000 208.000 L 228.000 188.000 L 176.000 188.000 C 174.470 188.002 173.073 187.132 172.401 185.758 C 171.729 184.383 171.899 182.746 172.840 181.540 L 228.840 109.540 C 229.889 108.188 231.682 107.654 233.300 108.209 C 234.918 108.765 236.003 110.289 236.000 112.000 L 236.000 180.000 L 248.000 180.000 C 250.209 180.000 252.000 181.791 252.000 184.000 ZM 228.000 123.660 L 184.180 180.000 L 228.000 180.000 Z"),
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
