package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sparkles: ImageVector
    get() {
        if (_sparkles != null) return _sparkles!!
        _sparkles = tablerOutlineIcon(
            name = "Sparkles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 18c1.105 0 2 .895 2 2 0-1.105 .895-2 2-2-1.105 0-2-.895-2-2 0 1.105-.895 2-2 2M16 6c1.105 0 2 .895 2 2 0-1.105 .895-2 2-2C18.895 6 18 5.105 18 4c0 1.105-.895 2-2 2M9 18c0-3.314 2.686-6 6-6C11.686 12 9 9.314 9 6 9 9.314 6.314 12 3 12c3.314 0 6 2.686 6 6"),
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
        return _sparkles!!
    }

private var _sparkles: ImageVector? = null
