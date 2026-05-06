package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Battery: ImageVector
    get() {
        if (_battery != null) return _battery!!
        _battery = tablerOutlineIcon(
            name = "Battery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 7h11c1.105 0 2 .895 2 2v.5c0 .276 .224 .5 .5 .5 .276 0 .5 .224 .5 .5v3c0 .276-.224 .5-.5 .5-.276 0-.5 .224-.5 .5v.5c0 1.105-.895 2-2 2h-11C4.895 17 4 16.105 4 15v-6C4 7.895 4.895 7 6 7"),
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
        return _battery!!
    }

private var _battery: ImageVector? = null
