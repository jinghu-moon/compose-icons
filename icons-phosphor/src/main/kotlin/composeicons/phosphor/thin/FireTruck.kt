package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FireTruck: ImageVector
    get() {
        if (_fireTruck != null) return _fireTruck!!
        _fireTruck = phosphorThinIcon(
            name = "FireTruck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.71 118.51l-14-35C235.879 78.971 231.474 75.999 226.58 76h-38.58v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v102.71c-8.465 4.026-14.36 12.014-15.71 21.29h-56.58C105.713 174.233 93.911 164.019 80 164.019c-13.911 0-25.713 10.213-27.71 23.981h-20.29c-2.209 0-4-1.791-4-4v-48c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v48c0 6.627 5.373 12 12 12h20.29c1.997 13.767 13.799 23.981 27.71 23.981 13.911 0 25.713-10.213 27.71-23.981h56.58c1.997 13.767 13.799 23.981 27.71 23.981 13.911 0 25.713-10.213 27.71-23.981h20.29c6.627 0 12-5.373 12-12v-64c-.001-.511-.099-1.016-.29-1.49ZM226.58 84c1.637-.003 3.11 .991 3.72 2.51L242.09 116h-54.09v-32ZM80 212C68.954 212 60 203.046 60 192c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM192 212c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM240 188h-20.29C217.499 172.697 203.303 162.082 188 164.29v-40.29h56v60c0 2.209-1.791 4-4 4ZM24 100c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h128c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-32h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-128c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v32ZM124 100h-32v-32h32ZM52 68h32v32h-32Z"),
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
        return _fireTruck!!
    }

private var _fireTruck: ImageVector? = null
