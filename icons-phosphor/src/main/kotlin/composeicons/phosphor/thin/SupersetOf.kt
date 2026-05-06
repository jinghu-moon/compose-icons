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
                pathData = parseSvgPathData("M212 200c0 2.209-1.791 4-4 4h-152c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h152c2.209 0 4 1.791 4 4ZM152 156h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h96c33.137 0 60-26.863 60-60C212 70.863 185.137 44 152 44h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h96c28.719 0 52 23.281 52 52 0 28.719-23.281 52-52 52Z"),
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
