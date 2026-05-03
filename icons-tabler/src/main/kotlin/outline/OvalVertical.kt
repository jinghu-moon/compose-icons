package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.OvalVertical: ImageVector
    get() {
        if (_ovalVertical != null) return _ovalVertical!!
        _ovalVertical = tablerOutlineIcon(
            name = "OvalVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 12.000 C 3.000 8.686 7.030 6.000 12.000 6.000 C 16.970 6.000 21.000 8.686 21.000 12.000 C 21.000 15.314 16.970 18.000 12.000 18.000 C 7.030 18.000 3.000 15.314 3.000 12.000"),
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
        return _ovalVertical!!
    }

private var _ovalVertical: ImageVector? = null
