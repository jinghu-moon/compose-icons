package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = phosphorThinIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 36h-48C49.373 36 44 41.373 44 48v160c0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM52 76h56v104h-56ZM56 44h48c2.209 0 4 1.791 4 4v20h-56v-20c0-2.209 1.791-4 4-4ZM104 212h-48c-2.209 0-4-1.791-4-4v-20h56v20c0 2.209-1.791 4-4 4ZM227.74 195.38 194.55 37.57c-.649-3.127-2.517-5.867-5.192-7.613-2.675-1.746-5.935-2.353-9.058-1.687L133.49 38.32c-6.476 1.432-10.592 7.809-9.23 14.3l33.19 157.81c.649 3.127 2.517 5.867 5.192 7.613 2.675 1.746 5.935 2.353 9.058 1.687l46.81-10.06h0c6.478-1.422 10.598-7.801 9.23-14.29ZM144.53 110.11 199.16 98.38l15 71.07-54.63 11.74ZM137.89 78.55 192.53 66.81l5 23.74-54.64 11.73ZM135.18 46.15 182 36.09c.276-.06 .558-.09 .84-.09 .76 .002 1.503 .225 2.14 .64 .912 .586 1.547 1.517 1.76 2.58L190.88 59 136.24 70.72 132.09 51c-.484-2.192 .899-4.362 3.09-4.85ZM216.83 201.85 170 211.91c-1.033 .22-2.112 .022-3-.55-.912-.586-1.547-1.517-1.76-2.58L161.12 189l54.64-11.73L219.91 197c.484 2.189-.893 4.358-3.08 4.85Z"),
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
