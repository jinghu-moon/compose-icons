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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 9C5.895 9 5 8.105 5 7 5 5.895 5.895 5 7 5c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2C5.895 19 5 18.105 5 17c0-1.105 .895-2 2-2h10c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-10c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2h-10"),
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
        return _command!!
    }

private var _command: ImageVector? = null
