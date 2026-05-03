package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) return _thumbDown!!
        _thumbDown = tablerOutlineIcon(
            name = "ThumbDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 13.000 L 7.000 5.000 C 7.000 4.448 6.552 4.000 6.000 4.000 L 4.000 4.000 C 3.448 4.000 3.000 4.448 3.000 5.000 L 3.000 12.000 C 3.000 12.552 3.448 13.000 4.000 13.000 L 7.000 13.000 C 9.209 13.000 11.000 14.791 11.000 17.000 L 11.000 18.000 C 11.000 19.105 11.895 20.000 13.000 20.000 C 14.105 20.000 15.000 19.105 15.000 18.000 L 15.000 13.000 L 18.000 13.000 C 19.105 13.000 20.000 12.105 20.000 11.000 L 19.000 6.000 C 18.705 4.740 17.889 3.924 17.000 4.000 L 10.000 4.000 C 8.343 4.000 7.000 5.343 7.000 7.000"),
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
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
