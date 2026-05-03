package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = tablerOutlineIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 4.000 L 9.000 4.000 L 11.000 9.000 L 8.500 10.500 C 9.571 12.672 11.328 14.429 13.500 15.500 L 15.000 13.000 L 20.000 15.000 L 20.000 19.000 C 20.000 20.105 19.105 21.000 18.000 21.000 C 9.928 20.509 3.491 14.072 3.000 6.000 C 3.000 4.895 3.895 4.000 5.000 4.000"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
