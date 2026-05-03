package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletOff: ImageVector
    get() {
        if (_dropletOff != null) return _dropletOff!!
        _dropletOff = tablerOutlineIcon(
            name = "DropletOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.963 14.938 C 19.113 13.523 18.797 12.097 18.064 10.878 L 13.174 3.618 C 12.754 2.992 11.887 2.814 11.238 3.220 C 11.075 3.322 10.935 3.457 10.828 3.617 L 9.546 5.517M 7.921 7.932 L 5.935 10.878 C 4.240 13.715 4.900 17.318 7.502 19.423 C 10.104 21.528 13.897 21.528 16.498 19.423 C 17.029 18.995 17.493 18.490 17.874 17.924"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _dropletOff!!
    }

private var _dropletOff: ImageVector? = null
