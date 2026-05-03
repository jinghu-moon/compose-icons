package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimeDuration90: ImageVector
    get() {
        if (_timeDuration90 != null) return _timeDuration90!!
        _timeDuration90 = tablerOutlineIcon(
            name = "TimeDuration90",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 14.250 C 8.000 14.664 8.336 15.000 8.750 15.000 L 10.250 15.000 C 10.664 15.000 11.000 14.664 11.000 14.250 L 11.000 9.750 C 11.000 9.336 10.664 9.000 10.250 9.000 L 8.750 9.000 C 8.336 9.000 8.000 9.336 8.000 9.750 L 8.000 11.250 C 8.000 11.664 8.336 12.000 8.750 12.000 L 11.000 12.000"),
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
        pathData = parseSvgPathData("M 14.000 10.500 L 14.000 13.500 C 14.000 14.328 14.672 15.000 15.500 15.000 C 16.328 15.000 17.000 14.328 17.000 13.500 L 17.000 10.500 C 17.000 9.672 16.328 9.000 15.500 9.000 C 14.672 9.000 14.000 9.672 14.000 10.500"),
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
        pathData = parseSvgPathData("M 3.000 12.000 C 3.000 16.971 7.029 21.000 12.000 21.000 C 16.971 21.000 21.000 16.971 21.000 12.000 C 21.000 7.029 16.971 3.000 12.000 3.000 C 7.029 3.000 3.000 7.029 3.000 12.000"),
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
        return _timeDuration90!!
    }

private var _timeDuration90: ImageVector? = null
