package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorThinIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 188h-56c-2.209 0-4 1.791-4 4v12c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32v-12c0-2.209-1.791-4-4-4ZM204 204c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24v-8h48ZM104 164h-56c-2.209 0-4 1.791-4 4v12c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32v-12c0-2.209-1.791-4-4-4ZM100 180c0 13.255-10.745 24-24 24C62.745 204 52 193.255 52 180v-8h48ZM76 20C66.18 20 55.93 29.75 47.88 46.75c-13.39 28.27-18 70.05-.23 91.78 .76 .931 1.898 1.471 3.1 1.47h50.51c1.202 .001 2.34-.539 3.1-1.47 17.79-21.73 13.16-63.51-.23-91.78C96.08 29.75 85.83 20 76 20ZM99.3 132h-46.59C38.91 113 42.92 75.92 55.11 50.18 61.59 36.5 69.59 28 76 28c6.41 0 14.42 8.5 20.9 22.18C109.09 75.92 113.1 113 99.3 132ZM154.74 164h50.51c1.202 .001 2.34-.539 3.1-1.47 17.79-21.73 13.16-63.51-.23-91.78C200.07 53.75 189.82 44 180 44c-9.82 0-20.08 9.75-28.13 26.75-13.39 28.27-18 70.05-.23 91.78 .76 .931 1.898 1.471 3.1 1.47ZM159.1 74.18C165.58 60.5 173.58 52 180 52c6.42 0 14.41 8.5 20.89 22.18C213.08 99.92 217.09 137 203.29 156h-46.59c-13.8-19-9.79-56.08 2.4-81.82Z"),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
