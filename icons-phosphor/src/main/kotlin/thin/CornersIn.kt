package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorThinIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 96.000 L 156.000 48.000 C 156.000 45.791 157.791 44.000 160.000 44.000 C 162.209 44.000 164.000 45.791 164.000 48.000 L 164.000 92.000 L 208.000 92.000 C 210.209 92.000 212.000 93.791 212.000 96.000 C 212.000 98.209 210.209 100.000 208.000 100.000 L 160.000 100.000 C 157.791 100.000 156.000 98.209 156.000 96.000 ZM 96.000 156.000 L 48.000 156.000 C 45.791 156.000 44.000 157.791 44.000 160.000 C 44.000 162.209 45.791 164.000 48.000 164.000 L 92.000 164.000 L 92.000 208.000 C 92.000 210.209 93.791 212.000 96.000 212.000 C 98.209 212.000 100.000 210.209 100.000 208.000 L 100.000 160.000 C 100.000 157.791 98.209 156.000 96.000 156.000 ZM 208.000 156.000 L 160.000 156.000 C 157.791 156.000 156.000 157.791 156.000 160.000 L 156.000 208.000 C 156.000 210.209 157.791 212.000 160.000 212.000 C 162.209 212.000 164.000 210.209 164.000 208.000 L 164.000 164.000 L 208.000 164.000 C 210.209 164.000 212.000 162.209 212.000 160.000 C 212.000 157.791 210.209 156.000 208.000 156.000 ZM 96.000 44.000 C 93.791 44.000 92.000 45.791 92.000 48.000 L 92.000 92.000 L 48.000 92.000 C 45.791 92.000 44.000 93.791 44.000 96.000 C 44.000 98.209 45.791 100.000 48.000 100.000 L 96.000 100.000 C 98.209 100.000 100.000 98.209 100.000 96.000 L 100.000 48.000 C 100.000 45.791 98.209 44.000 96.000 44.000 Z"),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
