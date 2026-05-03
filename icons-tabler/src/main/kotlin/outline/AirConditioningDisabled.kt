package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AirConditioningDisabled: ImageVector
    get() {
        if (_airConditioningDisabled != null) return _airConditioningDisabled!!
        _airConditioningDisabled = tablerOutlineIcon(
            name = "AirConditioningDisabled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 10.000 C 3.000 8.895 3.895 8.000 5.000 8.000 L 19.000 8.000 C 20.105 8.000 21.000 8.895 21.000 10.000 L 21.000 14.000 C 21.000 15.105 20.105 16.000 19.000 16.000 L 5.000 16.000 C 3.895 16.000 3.000 15.105 3.000 14.000 L 3.000 10.000"),
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
                pathData = parseSvgPathData("M 7.000 16.000 L 7.000 13.000 C 7.000 12.448 7.448 12.000 8.000 12.000 L 16.000 12.000 C 16.552 12.000 17.000 12.448 17.000 13.000 L 17.000 16.000"),
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
        return _airConditioningDisabled!!
    }

private var _airConditioningDisabled: ImageVector? = null
