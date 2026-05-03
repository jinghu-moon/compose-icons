package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = tablerOutlineIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 9.000 C 5.895 9.000 5.000 8.105 5.000 7.000 C 5.000 5.895 5.895 5.000 7.000 5.000 C 8.105 5.000 9.000 5.895 9.000 7.000 L 9.000 17.000 C 9.000 18.105 8.105 19.000 7.000 19.000 C 5.895 19.000 5.000 18.105 5.000 17.000 C 5.000 15.895 5.895 15.000 7.000 15.000 L 17.000 15.000 C 18.105 15.000 19.000 15.895 19.000 17.000 C 19.000 18.105 18.105 19.000 17.000 19.000 C 15.895 19.000 15.000 18.105 15.000 17.000 L 15.000 7.000 C 15.000 5.895 15.895 5.000 17.000 5.000 C 18.105 5.000 19.000 5.895 19.000 7.000 C 19.000 8.105 18.105 9.000 17.000 9.000 L 7.000 9.000"),
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
        return _command!!
    }

private var _command: ImageVector? = null
