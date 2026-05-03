package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lighter: ImageVector
    get() {
        if (_lighter != null) return _lighter!!
        _lighter = tablerOutlineIcon(
            name = "Lighter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 3.000 L 10.000 19.000 C 10.000 20.105 10.895 21.000 12.000 21.000 L 17.000 21.000 C 18.105 21.000 19.000 20.105 19.000 19.000 L 19.000 12.000 L 7.000 12.000 C 5.895 12.000 5.000 11.105 5.000 10.000 L 5.000 5.000 C 5.000 3.895 5.895 3.000 7.000 3.000 L 10.000 3.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 4.000 L 17.465 5.638 C 18.193 6.421 18.177 7.637 17.429 8.400 C 16.680 9.164 15.464 9.204 14.667 8.491 C 13.871 7.779 13.775 6.566 14.450 5.737 L 16.000 4.000"),
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
        return _lighter!!
    }

private var _lighter: ImageVector? = null
