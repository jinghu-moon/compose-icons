package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CommandOff: ImageVector
    get() {
        if (_commandOff != null) return _commandOff!!
        _commandOff = tablerOutlineIcon(
            name = "CommandOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 9.000 L 9.000 17.000 C 9.000 18.105 8.105 19.000 7.000 19.000 C 5.895 19.000 5.000 18.105 5.000 17.000 C 5.000 15.895 5.895 15.000 7.000 15.000 L 15.000 15.000M 18.411 18.417 C 17.838 18.987 16.979 19.157 16.233 18.847 C 15.487 18.537 15.000 17.808 15.000 17.000 L 15.000 15.000M 15.000 11.000 L 15.000 7.000 C 15.000 5.895 15.895 5.000 17.000 5.000 C 18.105 5.000 19.000 5.895 19.000 7.000 C 19.000 8.105 18.105 9.000 17.000 9.000 L 13.000 9.000M 9.000 9.000 L 7.000 9.000 C 6.192 9.000 5.463 8.513 5.153 7.767 C 4.843 7.021 5.013 6.162 5.583 5.589"),
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
        return _commandOff!!
    }

private var _commandOff: ImageVector? = null
