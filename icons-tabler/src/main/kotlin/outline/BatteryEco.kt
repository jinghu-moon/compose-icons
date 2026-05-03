package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryEco: ImageVector
    get() {
        if (_batteryEco != null) return _batteryEco!!
        _batteryEco = tablerOutlineIcon(
            name = "BatteryEco",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 9.000 C 4.000 7.895 4.895 7.000 6.000 7.000 L 17.000 7.000 C 18.105 7.000 19.000 7.895 19.000 9.000 L 19.000 9.500 C 19.000 9.776 19.224 10.000 19.500 10.000 C 19.776 10.000 20.000 10.224 20.000 10.500 L 20.000 13.500 C 20.000 13.776 19.776 14.000 19.500 14.000 C 19.224 14.000 19.000 14.224 19.000 14.500 L 19.000 15.000 C 19.000 16.105 18.105 17.000 17.000 17.000 L 11.500 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 16.143 C 3.000 13.303 5.090 11.000 7.667 11.000 L 10.000 11.000 L 10.000 11.857 C 10.000 14.697 7.910 17.000 5.333 17.000 L 3.000 17.000 L 3.000 16.143"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 20.000 L 3.000 17.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _batteryEco!!
    }

private var _batteryEco: ImageVector? = null
