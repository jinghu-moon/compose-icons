package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagPennant: ImageVector
    get() {
        if (_flagPennant != null) return _flagPennant!!
        _flagPennant = phosphorThinIcon(
            name = "FlagPennant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.31 100.22 57.31 36.22c-1.223-.424-2.575-.23-3.63 .521C52.626 37.491 52 38.706 52 40v176c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-45.16L241.31 107.78c1.611-.558 2.692-2.075 2.692-3.78 0-1.705-1.081-3.222-2.692-3.78ZM60 162.37v-116.74L227.82 104Z"),
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
        return _flagPennant!!
    }

private var _flagPennant: ImageVector? = null
