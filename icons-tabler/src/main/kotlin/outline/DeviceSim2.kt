package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceSim2: ImageVector
    get() {
        if (_deviceSim2 != null) return _deviceSim2!!
        _deviceSim2 = tablerOutlineIcon(
            name = "DeviceSim2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 3.000 L 14.500 3.000 L 19.000 7.500 L 19.000 20.000 C 19.000 20.552 18.552 21.000 18.000 21.000 L 6.000 21.000 C 5.448 21.000 5.000 20.552 5.000 20.000 L 5.000 4.000 C 5.000 3.448 5.448 3.000 6.000 3.000"),
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
        pathData = parseSvgPathData("M 10.000 9.000 L 13.000 9.000 C 13.552 9.000 14.000 9.448 14.000 10.000 L 14.000 12.000 C 14.000 12.552 13.552 13.000 13.000 13.000 L 11.000 13.000 C 10.448 13.000 10.000 13.448 10.000 14.000 L 10.000 16.000 C 10.000 16.552 10.448 17.000 11.000 17.000 L 14.000 17.000"),
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
        return _deviceSim2!!
    }

private var _deviceSim2: ImageVector? = null
