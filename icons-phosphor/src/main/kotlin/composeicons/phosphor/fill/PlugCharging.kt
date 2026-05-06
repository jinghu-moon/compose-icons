package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PlugCharging: ImageVector
    get() {
        if (_plugCharging != null) return _plugCharging!!
        _plugCharging = phosphorFillIcon(
            name = "PlugCharging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 56h-48v-40c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v40h-64v-40C96 11.582 92.418 8 88 8c-3.21 0-8 2.27-8 8.54v39.46h-47.45C26.28 56 24 60.78 24 64c0 4.418 3.582 8 8 8h16v88c0 22.091 17.909 40 40 40h32v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-40h32c22.091 0 40-17.909 40-40v-88h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM151.49 130.81l-12 32c-1.552 4.142-6.168 6.242-10.31 4.69-4.142-1.552-6.242-6.168-4.69-10.31L132.49 136h-20.49c-2.624-0-5.081-1.287-6.576-3.444-1.494-2.157-1.836-4.909-.914-7.366l12-32c1.552-4.142 6.168-6.242 10.31-4.69 4.142 1.552 6.242 6.168 4.69 10.31L123.51 120h20.49c2.624 0 5.081 1.287 6.576 3.444 1.494 2.157 1.836 4.909 .914 7.366Z"),
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
        return _plugCharging!!
    }

private var _plugCharging: ImageVector? = null
