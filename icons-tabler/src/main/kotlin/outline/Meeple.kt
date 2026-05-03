package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Meeple: ImageVector
    get() {
        if (_meeple != null) return _meeple!!
        _meeple = tablerOutlineIcon(
            name = "Meeple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 20.000 L 4.000 20.000 C 3.448 20.000 3.000 19.552 3.000 19.000 C 3.000 17.000 6.378 14.093 7.000 13.000 C 6.000 13.000 3.000 12.500 3.000 11.000 C 3.000 9.000 7.000 7.500 9.000 7.000 C 9.000 5.500 9.500 3.000 12.000 3.000 C 14.500 3.000 15.000 5.500 15.000 7.000 C 17.000 7.500 21.000 9.000 21.000 11.000 C 21.000 12.500 18.000 13.000 17.000 13.000 C 17.622 14.093 21.000 17.000 21.000 19.000 C 21.000 19.552 20.552 20.000 20.000 20.000 L 15.000 20.000 C 14.000 20.000 13.000 16.000 12.000 16.000 C 11.000 16.000 10.000 20.000 9.000 20.000"),
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
        return _meeple!!
    }

private var _meeple: ImageVector? = null
