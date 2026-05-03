package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Capsule: ImageVector
    get() {
        if (_capsule != null) return _capsule!!
        _capsule = tablerOutlineIcon(
            name = "Capsule",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 9.000 C 6.000 5.686 8.686 3.000 12.000 3.000 C 15.314 3.000 18.000 5.686 18.000 9.000 L 18.000 15.000 C 18.000 18.314 15.314 21.000 12.000 21.000 C 8.686 21.000 6.000 18.314 6.000 15.000 L 6.000 9.000"),
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
        return _capsule!!
    }

private var _capsule: ImageVector? = null
