package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Crop: ImageVector
    get() {
        if (_crop != null) return _crop!!
        _crop = phosphorThinIcon(
            name = "Crop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.000 192.000 C 236.000 194.209 234.209 196.000 232.000 196.000 L 196.000 196.000 L 196.000 232.000 C 196.000 234.209 194.209 236.000 192.000 236.000 C 189.791 236.000 188.000 234.209 188.000 232.000 L 188.000 196.000 L 64.000 196.000 C 61.791 196.000 60.000 194.209 60.000 192.000 L 60.000 68.000 L 24.000 68.000 C 21.791 68.000 20.000 66.209 20.000 64.000 C 20.000 61.791 21.791 60.000 24.000 60.000 L 60.000 60.000 L 60.000 24.000 C 60.000 21.791 61.791 20.000 64.000 20.000 C 66.209 20.000 68.000 21.791 68.000 24.000 L 68.000 188.000 L 232.000 188.000 C 234.209 188.000 236.000 189.791 236.000 192.000 ZM 96.000 68.000 L 188.000 68.000 L 188.000 160.000 C 188.000 162.209 189.791 164.000 192.000 164.000 C 194.209 164.000 196.000 162.209 196.000 160.000 L 196.000 64.000 C 196.000 61.791 194.209 60.000 192.000 60.000 L 96.000 60.000 C 93.791 60.000 92.000 61.791 92.000 64.000 C 92.000 66.209 93.791 68.000 96.000 68.000 Z"),
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
        return _crop!!
    }

private var _crop: ImageVector? = null
