package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Mosque: ImageVector
    get() {
        if (_mosque != null) return _mosque!!
        _mosque = phosphorFillIcon(
            name = "Mosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c-2.726-.001-5.432 .466-8 1.38v-1.38C216 86.22 184.93 65.54 162.24 50.44 148.16 41.06 136 33 136 24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 9-12.16 17.06-26.24 26.44C71.07 65.54 40 86.22 40 128v1.38c-7.344-2.597-15.492-1.467-21.853 3.029C11.785 136.906 8.002 144.21 8 152v56c0 4.418 3.582 8 8 8h56c4.418 0 8-3.582 8-8v-32c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v32c0 4.418 3.582 8 8 8h16c4.418 0 8-3.582 8-8v-32c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v32c0 4.418 3.582 8 8 8h56c4.418 0 8-3.582 8-8v-56c0-13.255-10.745-24-24-24ZM40 200h-16v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM232 200h-16v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _mosque!!
    }

private var _mosque: ImageVector? = null
