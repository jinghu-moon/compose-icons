package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ghost2: ImageVector
    get() {
        if (_ghost2 != null) return _ghost2!!
        _ghost2 = tablerFilledIcon(
            name = "Ghost2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1.999l.041 .002 .208 .003c4.223 .132 7.615 3.524 7.747 7.747l.003 .248 .177 .006c1.518 .089 2.73 1.301 2.819 2.819L23 13c0 1.657-1.343 3-3 3l-.001 1.696 1.833 2.75c.193 .29 .221 .66 .074 .976-.147 .316-.448 .533-.794 .572L21 22h-10C7.555 22.002 4.673 19.51 4.099 16.176l-.028-.178L4 15.999C2.411 15.999 1.098 14.761 1.005 13.175L1 13C1 11.343 2.343 10 4 10l.004-.25C4.139 5.431 7.679 2 12 2ZM12 12c-1.105 0-2 .895-2 2 0 .552 .448 1 1 1h2c.552 0 1-.448 1-1 0-1.105-.895-2-2-2ZM10.01 8l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052C10.976 8.413 10.539 8.001 10.01 8ZM14.01 8l-.127 .007c-.525 .062-.911 .523-.88 1.052 .031 .528 .468 .941 .997 .941l.127-.007c.525-.062 .911-.523 .88-1.052C14.976 8.413 14.539 8.001 14.01 8Z"),
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
        return _ghost2!!
    }

private var _ghost2: ImageVector? = null
