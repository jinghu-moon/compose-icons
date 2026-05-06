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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 18.5C18 16 20 12 20 8 20 5.054 17.916 3.843 15.796 3.346 14.932 3.116 13.666 3 12 3 10.333 3 9.068 3.115 8.204 3.346 6.084 3.843 4 5.054 4 8c0 3.312 2 8 4 10.5 .297 .37 .618 .731 .963 1.081l.354 .347c1.504 1.425 3.86 1.425 5.364 0 .472-.445 .913-.922 1.319-1.428"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _guitarPick!!
    }

private var _guitarPick: ImageVector? = null
