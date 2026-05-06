package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BatteryVertical: ImageVector
    get() {
        if (_batteryVertical != null) return _batteryVertical!!
        _batteryVertical = tablerOutlineIcon(
            name = "BatteryVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 18v-11C7 5.895 7.895 5 9 5h.5C9.776 5 10 4.776 10 4.5 10 4.224 10.224 4 10.5 4h3c.276 0 .5 .224 .5 .5 0 .276 .224 .5 .5 .5h.5c1.105 0 2 .895 2 2v11c0 1.105-.895 2-2 2h-6C7.895 20 7 19.105 7 18"),
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
        return _batteryVertical!!
    }

private var _batteryVertical: ImageVector? = null
