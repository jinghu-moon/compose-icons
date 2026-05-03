package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryVerticalEco: ImageVector
    get() {
        if (_batteryVerticalEco != null) return _batteryVerticalEco!!
        _batteryVerticalEco = tablerOutlineIcon(
            name = "BatteryVerticalEco",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 18.000 L 7.000 7.000 C 7.000 5.895 7.895 5.000 9.000 5.000 L 9.500 5.000 C 9.776 5.000 10.000 4.776 10.000 4.500 C 10.000 4.224 10.224 4.000 10.500 4.000 L 13.500 4.000 C 13.776 4.000 14.000 4.224 14.000 4.500 C 14.000 4.776 14.224 5.000 14.500 5.000 L 15.000 5.000 C 16.105 5.000 17.000 5.895 17.000 7.000 L 17.000 8.000M 9.000 20.000 C 7.895 20.000 7.000 19.105 7.000 18.000"),
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
        pathData = parseSvgPathData("M 13.000 17.143 C 13.000 14.303 15.090 12.000 17.667 12.000 L 20.000 12.000 L 20.000 12.857 C 20.000 15.697 17.910 18.000 15.333 18.000 L 13.000 18.000 L 13.000 17.143"),
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
        pathData = parseSvgPathData("M 13.000 21.000 L 13.000 18.000"),
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
        return _batteryVerticalEco!!
    }

private var _batteryVerticalEco: ImageVector? = null
