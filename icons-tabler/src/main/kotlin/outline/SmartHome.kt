package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SmartHome: ImageVector
    get() {
        if (_smartHome != null) return _smartHome!!
        _smartHome = tablerOutlineIcon(
            name = "SmartHome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 8.710 L 13.667 4.562 C 12.704 3.813 11.356 3.813 10.393 4.562 L 5.059 8.710 C 4.409 9.215 4.030 9.992 4.030 10.815 L 4.030 18.015 C 4.030 19.120 4.925 20.015 6.030 20.015 L 18.030 20.015 C 19.135 20.015 20.030 19.120 20.030 18.015 L 20.030 10.815 C 20.030 9.992 19.650 9.215 19.000 8.710"),
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
        pathData = parseSvgPathData("M 16.000 15.000 C 13.790 16.333 10.208 16.333 8.000 15.000"),
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
        return _smartHome!!
    }

private var _smartHome: ImageVector? = null
