package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) return _cloudSnow!!
        _cloudSnow = tablerOutlineIcon(
            name = "CloudSnow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 18.000 C 4.402 18.000 2.295 15.985 2.295 13.500 C 2.295 11.015 4.402 9.000 7.000 9.000 C 7.614 6.266 10.574 4.498 13.611 5.050 C 16.649 5.602 18.614 8.266 18.000 11.000 L 19.000 11.000 C 20.933 11.000 22.500 12.567 22.500 14.500 C 22.500 16.433 20.933 18.000 19.000 18.000"),
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
        pathData = parseSvgPathData("M 11.000 15.000 L 11.000 15.010M 11.000 18.010 L 11.000 18.020M 11.000 21.020 L 11.000 21.030M 15.000 17.030 L 15.000 17.040M 15.000 20.040 L 15.000 20.050"),
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
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
