package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = phosphorBoldIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.57 193.73 202.38 35.93c-1.085-5.211-4.203-9.774-8.662-12.679-4.459-2.905-9.893-3.913-15.098-2.801L131.81 30.51c-4.304 .933-8.174 3.273-11 6.65C117.127 31.449 110.796 27.999 104 28h-48C44.954 28 36 36.954 36 48v160c0 11.046 8.954 20 20 20h48c11.046 0 20-8.954 20-20v-117.75l25.62 121.82c1.925 9.26 10.072 15.906 19.53 15.93 1.422-.001 2.84-.152 4.23-.45l46.81-10.06c10.779-2.356 17.644-12.961 15.38-23.76ZM148.19 88.65l39-8.38 2.53 12-39 8.38ZM155.65 124.15l39-8.38 9.16 43.58-39 8.38ZM179.71 44.76l2.53 12-39 8.38-2.53-12ZM60 88h40v80h-40ZM100 52v12h-40v-12ZM60 204v-12h40v12ZM172.29 203.24l-2.53-12 39-8.38 2.53 12Z"),
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
