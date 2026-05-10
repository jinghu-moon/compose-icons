package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorFillIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM64 72h128c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM64 120h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-72c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM104 184h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM207.59 130.53c-.671 2.013-2.114 3.677-4.012 4.626-1.898 .949-4.095 1.105-6.108 .434L184 131.1v44.9c.003 10.455-6.762 19.709-16.725 22.878-9.963 3.169-20.831-.476-26.869-9.011-6.037-8.535-5.855-19.997 .452-28.336 6.306-8.339 17.285-11.636 27.142-8.151v-33.38c-0-2.572 1.236-4.987 3.322-6.49 2.086-1.504 4.768-1.913 7.208-1.1l24 8c2.013 .671 3.677 2.114 4.626 4.012 .949 1.898 1.105 4.095 .434 6.108Z"),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
