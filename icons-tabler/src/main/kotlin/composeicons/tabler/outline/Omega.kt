package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Omega: ImageVector
    get() {
        if (_omega != null) return _omega!!
        _omega = tablerOutlineIcon(
            name = "Omega",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 19h5v-1C5.834 16.584 4.088 13.148 4.812 9.756 5.536 6.364 8.532 3.94 12 3.94c3.468 0 6.464 2.424 7.188 5.816C19.912 13.148 18.166 16.584 15 18v1h5"),
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
        return _omega!!
    }

private var _omega: ImageVector? = null
