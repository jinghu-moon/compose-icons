package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SolarRoof: ImageVector
    get() {
        if (_solarRoof != null) return _solarRoof!!
        _solarRoof = phosphorThinIcon(
            name = "SolarRoof",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.58 126.21l-40-80C202.902 44.855 201.516 43.999 200 44h-144c-1.516-.001-2.902 .855-3.58 2.21l-40 80c-.277 .556-.421 1.169-.42 1.79v56c0 6.627 5.373 12 12 12h208c6.627 0 12-5.373 12-12v-56c.001-.621-.143-1.234-.42-1.79ZM98.47 124l-16-32h39.06l16 32ZM101.53 52l16 32h-39.06l-16-32ZM149.53 52l16 32h-39.06l-16-32ZM146.47 124l-16-32h39.06l16 32ZM194.47 124l-16-32h39.06l16 32ZM213.53 84h-39.06l-16-32h39.06ZM20 184v-55.06L56 56.94l36 72v59.06h-68c-2.209 0-4-1.791-4-4ZM232 188h-132v-56h136v52c0 2.209-1.791 4-4 4Z"),
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
        return _solarRoof!!
    }

private var _solarRoof: ImageVector? = null
