package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tool: ImageVector
    get() {
        if (_tool != null) return _tool!!
        _tool = tablerOutlineIcon(
            name = "Tool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 10h3v-3L6.5 3.5c2.294-1.096 5.03-.626 6.828 1.172 1.798 1.798 2.267 4.534 1.172 6.828l6 6c.828 .828 .828 2.172 0 3-.828 .828-2.172 .828-3 0l-6-6C9.206 15.596 6.47 15.126 4.672 13.328 2.874 11.53 2.404 8.794 3.5 6.5L7 10"),
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
        return _tool!!
    }

private var _tool: ImageVector? = null
