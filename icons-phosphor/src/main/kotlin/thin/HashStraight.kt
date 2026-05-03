package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorThinIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 156.000 L 164.000 156.000 L 164.000 100.000 L 216.000 100.000 C 218.209 100.000 220.000 98.209 220.000 96.000 C 220.000 93.791 218.209 92.000 216.000 92.000 L 164.000 92.000 L 164.000 40.000 C 164.000 37.791 162.209 36.000 160.000 36.000 C 157.791 36.000 156.000 37.791 156.000 40.000 L 156.000 92.000 L 100.000 92.000 L 100.000 40.000 C 100.000 37.791 98.209 36.000 96.000 36.000 C 93.791 36.000 92.000 37.791 92.000 40.000 L 92.000 92.000 L 40.000 92.000 C 37.791 92.000 36.000 93.791 36.000 96.000 C 36.000 98.209 37.791 100.000 40.000 100.000 L 92.000 100.000 L 92.000 156.000 L 40.000 156.000 C 37.791 156.000 36.000 157.791 36.000 160.000 C 36.000 162.209 37.791 164.000 40.000 164.000 L 92.000 164.000 L 92.000 216.000 C 92.000 218.209 93.791 220.000 96.000 220.000 C 98.209 220.000 100.000 218.209 100.000 216.000 L 100.000 164.000 L 156.000 164.000 L 156.000 216.000 C 156.000 218.209 157.791 220.000 160.000 220.000 C 162.209 220.000 164.000 218.209 164.000 216.000 L 164.000 164.000 L 216.000 164.000 C 218.209 164.000 220.000 162.209 220.000 160.000 C 220.000 157.791 218.209 156.000 216.000 156.000 ZM 100.000 156.000 L 100.000 100.000 L 156.000 100.000 L 156.000 156.000 Z"),
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
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
