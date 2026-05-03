package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceTabletOff: ImageVector
    get() {
        if (_deviceTabletOff != null) return _deviceTabletOff!!
        _deviceTabletOff = tablerOutlineIcon(
            name = "DeviceTabletOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 3.000 L 18.000 3.000 C 18.552 3.000 19.000 3.448 19.000 4.000 L 19.000 15.000M 19.000 19.000 L 19.000 20.000 C 19.000 20.552 18.552 21.000 18.000 21.000 L 6.000 21.000 C 5.448 21.000 5.000 20.552 5.000 20.000 L 5.000 5.000"),
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
        pathData = parseSvgPathData("M 11.000 17.000 C 11.000 17.552 11.448 18.000 12.000 18.000 C 12.552 18.000 13.000 17.552 13.000 17.000 C 13.000 16.448 12.552 16.000 12.000 16.000 C 11.448 16.000 11.000 16.448 11.000 17.000"),
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
        pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _deviceTabletOff!!
    }

private var _deviceTabletOff: ImageVector? = null
