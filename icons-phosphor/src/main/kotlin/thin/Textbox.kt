package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorThinIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 112.000 44.000 C 109.791 44.000 108.000 45.791 108.000 48.000 L 108.000 68.000 L 24.000 68.000 C 17.373 68.000 12.000 73.373 12.000 80.000 L 12.000 176.000 C 12.000 182.627 17.373 188.000 24.000 188.000 L 108.000 188.000 L 108.000 208.000 C 108.000 210.209 109.791 212.000 112.000 212.000 C 114.209 212.000 116.000 210.209 116.000 208.000 L 116.000 48.000 C 116.000 45.791 114.209 44.000 112.000 44.000 ZM 24.000 180.000 C 21.791 180.000 20.000 178.209 20.000 176.000 L 20.000 80.000 C 20.000 77.791 21.791 76.000 24.000 76.000 L 108.000 76.000 L 108.000 180.000 ZM 244.000 80.000 L 244.000 176.000 C 244.000 182.627 238.627 188.000 232.000 188.000 L 144.000 188.000 C 141.791 188.000 140.000 186.209 140.000 184.000 C 140.000 181.791 141.791 180.000 144.000 180.000 L 232.000 180.000 C 234.209 180.000 236.000 178.209 236.000 176.000 L 236.000 80.000 C 236.000 77.791 234.209 76.000 232.000 76.000 L 144.000 76.000 C 141.791 76.000 140.000 74.209 140.000 72.000 C 140.000 69.791 141.791 68.000 144.000 68.000 L 232.000 68.000 C 238.627 68.000 244.000 73.373 244.000 80.000 ZM 84.000 112.000 C 84.000 114.209 82.209 116.000 80.000 116.000 L 68.000 116.000 L 68.000 144.000 C 68.000 146.209 66.209 148.000 64.000 148.000 C 61.791 148.000 60.000 146.209 60.000 144.000 L 60.000 116.000 L 48.000 116.000 C 45.791 116.000 44.000 114.209 44.000 112.000 C 44.000 109.791 45.791 108.000 48.000 108.000 L 80.000 108.000 C 82.209 108.000 84.000 109.791 84.000 112.000 Z"),
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
        return _textbox!!
    }

private var _textbox: ImageVector? = null
