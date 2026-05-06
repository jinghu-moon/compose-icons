package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dumpling: ImageVector
    get() {
        if (_dumpling != null) return _dumpling!!
        _dumpling = tablerFilledIcon(
            name = "Dumpling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.003 2.04c.915-.143 1.85 .08 2.602 .62l.09 .07 .149-.11c.891-.612 2.012-.782 3.044-.462l.207 .072c.894 .339 1.612 1.025 1.99 1.903l.014 .031 .045-.004c.958-.076 1.905 .241 2.624 .879l.153 .144 .358 .358c1.976 1.977-.32 6.748-4.655 11.083C12.288 20.959 7.518 23.256 5.541 21.279l-.382-.382-.135-.145c-.617-.703-.93-1.622-.87-2.556l.01-.1-.162-.072C3.122 17.601 2.456 16.832 2.164 15.9l-.055-.192c-.258-1.014-.053-2.089 .56-2.937l.062-.079-.07-.092c-.499-.696-.728-1.549-.644-2.401l.025-.2C2.205 8.95 2.832 8.03 3.749 7.494l.046-.026L3.79 7.328C3.788 6.464 4.103 5.63 4.675 4.983l.15-.16 .159-.149c.647-.572 1.482-.886 2.346-.884l.14 .004 .026-.046C7.997 2.892 8.834 2.286 9.804 2.078Z"),
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
        return _dumpling!!
    }

private var _dumpling: ImageVector? = null
