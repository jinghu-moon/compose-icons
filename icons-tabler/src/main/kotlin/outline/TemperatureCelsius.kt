package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TemperatureCelsius: ImageVector
    get() {
        if (_temperatureCelsius != null) return _temperatureCelsius!!
        _temperatureCelsius = tablerOutlineIcon(
            name = "TemperatureCelsius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 8.000 C 4.000 9.105 4.895 10.000 6.000 10.000 C 7.105 10.000 8.000 9.105 8.000 8.000 C 8.000 6.895 7.105 6.000 6.000 6.000 C 4.895 6.000 4.000 6.895 4.000 8.000"),
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
        pathData = parseSvgPathData("M 20.000 9.000 C 20.000 7.343 18.657 6.000 17.000 6.000 L 16.000 6.000 C 14.343 6.000 13.000 7.343 13.000 9.000 L 13.000 15.000 C 13.000 16.657 14.343 18.000 16.000 18.000 L 17.000 18.000 C 18.657 18.000 20.000 16.657 20.000 15.000"),
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
        return _temperatureCelsius!!
    }

private var _temperatureCelsius: ImageVector? = null
