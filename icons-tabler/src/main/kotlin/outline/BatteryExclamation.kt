package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryExclamation: ImageVector
    get() {
        if (_batteryExclamation != null) return _batteryExclamation!!
        _batteryExclamation = tablerOutlineIcon(
            name = "BatteryExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 17.000 L 17.000 17.000 C 18.105 17.000 19.000 16.105 19.000 15.000 L 19.000 14.500 C 19.000 14.224 19.224 14.000 19.500 14.000 C 19.776 14.000 20.000 13.776 20.000 13.500 L 20.000 10.500 C 20.000 10.224 19.776 10.000 19.500 10.000 C 19.224 10.000 19.000 9.776 19.000 9.500 L 19.000 9.000 C 19.000 7.895 18.105 7.000 17.000 7.000 L 6.000 7.000 C 4.895 7.000 4.000 7.895 4.000 9.000 L 4.000 12.000"),
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
        pathData = parseSvgPathData("M 5.000 16.000 L 5.000 19.000"),
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
        pathData = parseSvgPathData("M 5.000 22.000 L 5.000 22.010"),
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
        return _batteryExclamation!!
    }

private var _batteryExclamation: ImageVector? = null
