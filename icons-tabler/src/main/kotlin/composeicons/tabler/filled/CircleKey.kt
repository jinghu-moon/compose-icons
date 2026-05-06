package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleKey: ImageVector
    get() {
        if (_circleKey != null) return _circleKey!!
        _circleKey = tablerFilledIcon(
            name = "CircleKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM14 7C12.478 7 11.198 8.139 11.02 9.65l-.015 .174L11 10l.005 .176c.019 .319 .087 .624 .197 .908l.09 .209L7.792 14.793l-.082 .094c-.28 .361-.28 .865 0 1.226l.083 .094 1.5 1.5 .094 .083c.361 .28 .865 .28 1.226 0l.094-.083 .083-.094c.28-.361 .28-.865 0-1.226l-.083-.094-.792-.793 .585-.585 .793 .792 .094 .083c.398 .309 .964 .273 1.32-.083 .356-.356 .392-.922 .083-1.32l-.083-.094-.792-.793 .792-.792c1.112 .53 2.436 .326 3.337-.514 .901-.84 1.197-2.146 .746-3.293C16.339 7.755 15.232 7.001 14 7ZM14 9c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1"),
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
        return _circleKey!!
    }

private var _circleKey: ImageVector? = null
