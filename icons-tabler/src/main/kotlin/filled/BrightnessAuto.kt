package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrightnessAuto: ImageVector
    get() {
        if (_brightnessAuto != null) return _brightnessAuto!!
        _brightnessAuto = tablerFilledIcon(
            name = "BrightnessAuto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.707 2.793 L 14.915 5.000 L 18.000 5.000 C 18.507 5.000 18.934 5.380 18.993 5.883 L 19.000 6.000 L 19.000 9.085 L 21.207 11.293 C 21.563 11.649 21.599 12.215 21.290 12.613 L 21.207 12.707 L 19.000 14.914 L 19.000 18.000 C 19.000 18.507 18.620 18.934 18.117 18.993 L 18.000 19.000 L 14.914 19.000 L 12.707 21.207 C 12.351 21.563 11.785 21.599 11.387 21.290 L 11.293 21.207 L 9.085 19.000 L 6.000 19.000 C 5.493 19.000 5.066 18.620 5.007 18.117 L 5.000 18.000 L 5.000 14.915 L 2.793 12.707 C 2.437 12.351 2.401 11.785 2.710 11.387 L 2.793 11.293 L 5.000 9.084 L 5.000 6.000 C 5.000 5.493 5.380 5.066 5.883 5.007 L 6.000 5.000 L 9.084 5.000 L 11.293 2.793 C 11.684 2.403 12.316 2.403 12.707 2.793M 12.000 8.000 C 10.343 8.000 9.000 9.343 9.000 11.000 L 9.000 14.500 C 9.000 15.052 9.448 15.500 10.000 15.500 C 10.552 15.500 11.000 15.052 11.000 14.500 L 11.000 14.000 L 13.000 14.000 L 13.000 14.500 C 13.000 15.007 13.380 15.434 13.883 15.493 L 14.000 15.500 C 14.552 15.500 15.000 15.052 15.000 14.500 L 15.000 11.000 C 15.000 9.343 13.657 8.000 12.000 8.000M 12.000 10.000 C 12.552 10.000 13.000 10.448 13.000 11.000 L 13.000 12.000 L 11.000 12.000 L 11.000 11.000 C 11.000 10.493 11.380 10.066 11.883 10.007 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _brightnessAuto!!
    }

private var _brightnessAuto: ImageVector? = null
