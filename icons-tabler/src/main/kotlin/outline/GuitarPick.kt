package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GuitarPick: ImageVector
    get() {
        if (_guitarPick != null) return _guitarPick!!
        _guitarPick = tablerOutlineIcon(
            name = "GuitarPick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 18.500 C 18.000 16.000 20.000 12.000 20.000 8.000 C 20.000 5.054 17.916 3.843 15.796 3.346 C 14.932 3.116 13.666 3.000 12.000 3.000 C 10.333 3.000 9.068 3.115 8.204 3.346 C 6.084 3.843 4.000 5.054 4.000 8.000 C 4.000 11.312 6.000 16.000 8.000 18.500 C 8.297 18.870 8.618 19.231 8.963 19.581 L 9.317 19.928 C 10.821 21.353 13.177 21.353 14.681 19.928 C 15.153 19.483 15.594 19.006 16.000 18.500"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _guitarPick!!
    }

private var _guitarPick: ImageVector? = null
