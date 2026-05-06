package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorThinIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 236c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM84 196c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM20 196c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM52 164c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM252 40c0 2.209-1.791 4-4 4h-30.34L187.73 73.93 165.86 202c-.743 4.427-3.895 8.069-8.17 9.44-1.194 .377-2.438 .565-3.69 .56-3.175-.008-6.217-1.274-8.46-3.52L47.54 110.48c-3.187-3.17-4.336-7.856-2.975-12.141C45.926 94.055 49.568 90.89 54 90.14L182 68.27 213.1 37.17c.768-.767 1.815-1.19 2.9-1.17h32c2.209 0 4 1.791 4 4ZM179.11 76.89 55.37 98c-1.484 .239-2.708 1.289-3.17 2.72-.462 1.43-.083 2.999 .98 4.06l98 98c1.059 1.063 2.624 1.444 4.053 .986 1.429-.457 2.482-1.676 2.727-3.156Z"),
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
        return _shower!!
    }

private var _shower: ImageVector? = null
