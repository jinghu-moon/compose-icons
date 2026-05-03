package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryVerticalExclamation: ImageVector
    get() {
        if (_batteryVerticalExclamation != null) return _batteryVerticalExclamation!!
        _batteryVerticalExclamation = tablerOutlineIcon(
            name = "BatteryVerticalExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 12.000 L 17.000 7.000 C 17.000 5.895 16.105 5.000 15.000 5.000 L 14.500 5.000 C 14.224 5.000 14.000 4.776 14.000 4.500 C 14.000 4.224 13.776 4.000 13.500 4.000 L 10.500 4.000 C 10.224 4.000 10.000 4.224 10.000 4.500 C 10.000 4.776 9.776 5.000 9.500 5.000 L 9.000 5.000 C 7.895 5.000 7.000 5.895 7.000 7.000 L 7.000 18.000 C 7.000 19.105 7.895 20.000 9.000 20.000 L 15.000 20.000"),
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
                pathData = parseSvgPathData("M 19.000 16.000 L 19.000 19.000"),
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
                pathData = parseSvgPathData("M 19.000 22.000 L 19.000 22.010"),
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
        return _batteryVerticalExclamation!!
    }

private var _batteryVerticalExclamation: ImageVector? = null
