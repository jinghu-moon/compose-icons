package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = tablerOutlineIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 15.000 C 5.000 18.000 7.000 19.000 10.000 19.000 C 13.000 19.000 17.000 16.000 17.000 12.000 C 17.000 8.000 14.000 5.000 11.000 5.000 C 8.000 5.000 6.000 6.500 6.000 9.000 C 6.000 11.500 8.000 14.000 12.000 14.000 C 16.000 14.000 20.408 11.547 22.000 9.000"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
