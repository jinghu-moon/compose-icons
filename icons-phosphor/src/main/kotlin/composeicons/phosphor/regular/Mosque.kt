package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Mosque: ImageVector
    get() {
        if (_mosque != null) return _mosque!!
        _mosque = phosphorRegularIcon(
            name = "Mosque",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c-2.726-.001-5.432 .466-8 1.38v-1.38C216 86.22 184.93 65.54 162.24 50.44 148.16 41.06 136 33 136 24c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 9-12.16 17.06-26.24 26.44C71.07 65.54 40 86.22 40 128v1.38c-7.344-2.597-15.492-1.467-21.853 3.029C11.785 136.906 8.002 144.21 8 152v56c0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32c0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8v-32c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v32c0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8v-56c0-13.255-10.745-24-24-24ZM102.63 63.76c9.67-6.44 19-12.68 25.37-20 6.34 7.35 15.7 13.59 25.37 20 20 13.32 42.48 28.29 46.11 56.24h-143C60.15 92.05 82.6 77.08 102.63 63.76ZM24 152c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v48h-16ZM160 152c-13.255 0-24 10.745-24 24v24h-16v-24c0-13.255-10.745-24-24-24-13.255 0-24 10.745-24 24v24h-16v-64h144v64h-16v-24c0-13.255-10.745-24-24-24ZM232 200h-16v-48c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
