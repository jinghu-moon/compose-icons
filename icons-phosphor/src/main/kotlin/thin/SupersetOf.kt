package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SupersetOf: ImageVector
    get() {
        if (_supersetOf != null) return _supersetOf!!
        _supersetOf = phosphorThinIcon(
            name = "SupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 200.000 C 212.000 202.209 210.209 204.000 208.000 204.000 L 56.000 204.000 C 53.791 204.000 52.000 202.209 52.000 200.000 C 52.000 197.791 53.791 196.000 56.000 196.000 L 208.000 196.000 C 210.209 196.000 212.000 197.791 212.000 200.000 ZM 152.000 156.000 L 56.000 156.000 C 53.791 156.000 52.000 157.791 52.000 160.000 C 52.000 162.209 53.791 164.000 56.000 164.000 L 152.000 164.000 C 185.137 164.000 212.000 137.137 212.000 104.000 C 212.000 70.863 185.137 44.000 152.000 44.000 L 56.000 44.000 C 53.791 44.000 52.000 45.791 52.000 48.000 C 52.000 50.209 53.791 52.000 56.000 52.000 L 152.000 52.000 C 180.719 52.000 204.000 75.281 204.000 104.000 C 204.000 132.719 180.719 156.000 152.000 156.000 Z"),
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
        return _supersetOf!!
    }

private var _supersetOf: ImageVector? = null
