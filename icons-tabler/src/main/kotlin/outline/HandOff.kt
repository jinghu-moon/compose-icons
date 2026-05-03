package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandOff: ImageVector
    get() {
        if (_handOff != null) return _handOff!!
        _handOff = tablerOutlineIcon(
            name = "HandOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
    addPath(
        pathData = parseSvgPathData("M 8.000 13.500 L 8.000 8.000M 8.440 4.438 C 8.869 4.009 9.514 3.881 10.075 4.114 C 10.635 4.346 11.000 4.893 11.000 5.500 L 11.000 7.000M 11.000 11.008 L 11.000 12.000M 11.000 5.500 L 11.000 3.500 C 11.000 2.672 11.672 2.000 12.500 2.000 C 13.328 2.000 14.000 2.672 14.000 3.500 L 14.000 10.000M 14.000 5.500 C 14.000 4.672 14.672 4.000 15.500 4.000 C 16.328 4.000 17.000 4.672 17.000 5.500 L 17.000 12.000M 17.000 7.500 C 17.000 6.672 17.672 6.000 18.500 6.000 C 19.328 6.000 20.000 6.672 20.000 7.500 L 20.000 16.000 C 20.000 19.314 17.314 22.000 14.000 22.000 L 12.000 22.000 C 9.886 21.708 8.044 20.603 7.000 19.000 L 4.300 13.750 C 3.748 12.991 3.916 11.927 4.675 11.375 C 5.434 10.823 6.498 10.991 7.050 11.750 L 7.950 13.500"),
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
        return _handOff!!
    }

private var _handOff: ImageVector? = null
