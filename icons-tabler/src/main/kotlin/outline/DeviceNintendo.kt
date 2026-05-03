package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceNintendo: ImageVector
    get() {
        if (_deviceNintendo != null) return _deviceNintendo!!
        _deviceNintendo = tablerOutlineIcon(
            name = "DeviceNintendo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 20.000 L 10.000 4.000 L 7.000 4.000 C 4.791 4.000 3.000 5.791 3.000 8.000 L 3.000 16.000 C 3.000 18.209 4.791 20.000 7.000 20.000 L 10.000 20.000"),
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
        pathData = parseSvgPathData("M 14.000 20.000 L 14.000 4.000 L 17.000 4.000 C 19.209 4.000 21.000 5.791 21.000 8.000 L 21.000 16.000 C 21.000 18.209 19.209 20.000 17.000 20.000 L 14.000 20.000"),
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
        pathData = parseSvgPathData("M 16.500 15.500 C 16.500 16.052 16.948 16.500 17.500 16.500 C 18.052 16.500 18.500 16.052 18.500 15.500 C 18.500 14.948 18.052 14.500 17.500 14.500 C 16.948 14.500 16.500 14.948 16.500 15.500"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 5.500 8.500 C 5.500 9.052 5.948 9.500 6.500 9.500 C 7.052 9.500 7.500 9.052 7.500 8.500 C 7.500 7.948 7.052 7.500 6.500 7.500 C 5.948 7.500 5.500 7.948 5.500 8.500"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _deviceNintendo!!
    }

private var _deviceNintendo: ImageVector? = null
