package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrightnessAuto: ImageVector
    get() {
        if (_brightnessAuto != null) return _brightnessAuto!!
        _brightnessAuto = tablerOutlineIcon(
            name = "BrightnessAuto",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 6.000 L 9.500 6.000 L 12.000 3.500 L 14.500 6.000 L 18.000 6.000 L 18.000 9.500 L 20.500 12.000 L 18.000 14.500 L 18.000 18.000 L 14.500 18.000 L 12.000 20.500 L 9.500 18.000 L 6.000 18.000 L 6.000 14.500 L 3.500 12.000 L 6.000 9.500 L 6.000 6.000"),
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
        pathData = parseSvgPathData("M 10.000 14.500 L 10.000 11.000 C 10.000 9.895 10.895 9.000 12.000 9.000 C 13.105 9.000 14.000 9.895 14.000 11.000 L 14.000 14.500"),
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
        pathData = parseSvgPathData("M 10.000 13.000 L 14.000 13.000"),
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
        return _brightnessAuto!!
    }

private var _brightnessAuto: ImageVector? = null
