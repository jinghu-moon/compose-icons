package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = phosphorLightIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 34h-48C48.268 34 42 40.268 42 48v160c0 7.732 6.268 14 14 14h48c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM54 78h52v100h-52ZM56 46h48c1.105 0 2 .895 2 2v18h-52v-18c0-1.105 .895-2 2-2ZM104 210h-48c-1.105 0-2-.895-2-2v-18h52v18c0 1.105-.895 2-2 2ZM229.7 195 196.51 37.16c-.757-3.65-2.937-6.847-6.059-8.883-3.122-2.037-6.926-2.744-10.571-1.967L133.07 36.37C125.531 38.027 120.728 45.442 122.3 53l33.19 157.81c.763 3.663 2.959 6.868 6.1 8.9 2.25 1.472 4.881 2.258 7.57 2.26 1.009 .005 2.015-.102 3-.32l46.81-10.05c7.509-1.676 12.285-9.065 10.73-16.6ZM146.89 111.68l50.73-10.9 14.12 67.16L161 178.81ZM140.26 80.12 191 69.19 195.15 89 144.42 99.9ZM135.6 48.12 182.4 38.07c.14-.014 .28-.014 .42 0 .374 0 .739 .112 1.05 .32 .464 .296 .786 .769 .89 1.31l3.75 17.82L137.79 68.34 134.05 50.56c-.243-1.106 .447-2.202 1.55-2.46ZM216.41 199.92 169.6 210c-.506 .112-1.037 .015-1.47-.27-.464-.296-.786-.769-.89-1.31l-3.75-17.82 50.72-10.9L218 197.43c.119 .539 .018 1.102-.281 1.566-.299 .464-.77 .789-1.309 .904Z"),
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
        return _books!!
    }

private var _books: ImageVector? = null
