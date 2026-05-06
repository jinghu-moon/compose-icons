package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneTilt: ImageVector
    get() {
        if (_planeTilt != null) return _planeTilt!!
        _planeTilt = tablerOutlineIcon(
            name = "PlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.5 6.5l3-2.9c.801-.801 2.099-.801 2.9 0 .801 .801 .801 2.099 0 2.9l-2.9 3L20 17l-2.5 2.55L14 13l-3 3v3L9 21 7.5 16.5 3 15 5 13h3l3-3L4.5 6.5 7 4l7.5 2.5"),
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
        return _planeTilt!!
    }

private var _planeTilt: ImageVector? = null
