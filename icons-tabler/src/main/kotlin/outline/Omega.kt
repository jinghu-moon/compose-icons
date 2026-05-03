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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 19.000 L 9.000 19.000 L 9.000 18.000 C 5.834 16.584 4.088 13.148 4.812 9.756 C 5.536 6.364 8.532 3.940 12.000 3.940 C 15.468 3.940 18.464 6.364 19.188 9.756 C 19.912 13.148 18.166 16.584 15.000 18.000 L 15.000 19.000 L 20.000 19.000"),
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
        return _omega!!
    }

private var _omega: ImageVector? = null
