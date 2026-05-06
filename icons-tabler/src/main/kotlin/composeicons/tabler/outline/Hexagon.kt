package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hexagon: ImageVector
    get() {
        if (_hexagon != null) return _hexagon!!
        _hexagon = tablerOutlineIcon(
            name = "Hexagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.875 6.27c.7 .398 1.13 1.143 1.125 1.948v7.284c0 .809-.443 1.555-1.158 1.948l-6.75 4.27c-.68 .373-1.504 .373-2.184 0L4.158 17.45C3.445 17.061 3.002 16.314 3 15.502v-7.285C3 7.408 3.443 6.663 4.158 6.27L10.908 2.29c.7-.386 1.55-.386 2.25 0l6.75 3.98h-.033"),
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
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
