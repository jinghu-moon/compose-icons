package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Volume4: ImageVector
    get() {
        if (_volume4 != null) return _volume4!!
        _volume4 = tablerOutlineIcon(
            name = "Volume4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.5 15h-2c-.552 0-1-.448-1-1v-4c0-.552 .448-1 1-1h2L13 4.5c.181-.351 .59-.518 .964-.393 .374 .125 .602 .504 .536 .893v14c.066 .389-.161 .768-.536 .893-.374 .125-.784-.042-.964-.393L9.5 15"),
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
        return _volume4!!
    }

private var _volume4: ImageVector? = null
