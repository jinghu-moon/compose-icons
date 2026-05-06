package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = phosphorThinIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251 109.4 205.47 56.3C203.189 53.573 199.815 51.998 196.26 52h-164.26C25.373 52 20 57.373 20 64v112c0 6.627 5.373 12 12 12h20.29c1.997 13.767 13.799 23.981 27.71 23.981 13.911 0 25.713-10.213 27.71-23.981h56.58c1.997 13.767 13.799 23.981 27.71 23.981 13.911 0 25.713-10.213 27.71-23.981h20.29c6.627 0 12-5.373 12-12v-64c-.011-.958-.366-1.881-1-2.6ZM199.36 61.47 239.3 108h-67.3v-48h24.26c1.202-.001 2.34 .539 3.1 1.47ZM100 108v-48h64v48ZM32 60h60v48h-64v-44c0-2.209 1.791-4 4-4ZM80 204C68.954 204 60 195.046 60 184c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM192 204c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM240 180h-20.29C217.713 166.233 205.911 156.019 192 156.019c-13.911 0-25.713 10.213-27.71 23.981h-56.58C105.713 166.233 93.911 156.019 80 156.019c-13.911 0-25.713 10.213-27.71 23.981h-20.29c-2.209 0-4-1.791-4-4v-60h216v60c0 2.209-1.791 4-4 4Z"),
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
        return _van!!
    }

private var _van: ImageVector? = null
