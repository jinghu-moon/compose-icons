package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = tablerOutlineIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 3.000 L 16.000 12.000 L 21.000 12.000 L 14.109 19.086 C 12.429 20.770 9.963 21.401 7.680 20.732 C 5.397 20.063 3.662 18.201 3.157 15.876 C 2.651 13.552 3.455 11.137 5.254 9.580 L 13.000 3.000 L 12.000 8.000 L 21.000 3.000"),
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
        pathData = parseSvgPathData("M 7.000 14.500 C 7.000 15.881 8.119 17.000 9.500 17.000 C 10.881 17.000 12.000 15.881 12.000 14.500 C 12.000 13.119 10.881 12.000 9.500 12.000 C 8.119 12.000 7.000 13.119 7.000 14.500"),
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
        return _meteor!!
    }

private var _meteor: ImageVector? = null
