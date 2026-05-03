package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NavigationSouth: ImageVector
    get() {
        if (_navigationSouth != null) return _navigationSouth!!
        _navigationSouth = tablerOutlineIcon(
            name = "NavigationSouth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 8.250 C 10.000 8.664 10.336 9.000 10.750 9.000 L 13.000 9.000 C 13.552 9.000 14.000 8.552 14.000 8.000 L 14.000 7.000 C 14.000 6.448 13.552 6.000 13.000 6.000 L 11.000 6.000 C 10.448 6.000 10.000 5.552 10.000 5.000 L 10.000 4.000 C 10.000 3.448 10.448 3.000 11.000 3.000 L 13.250 3.000 C 13.664 3.000 14.000 3.336 14.000 3.750"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 16.000 21.000 L 12.000 13.000 L 8.000 21.000 L 12.000 19.000 L 16.000 21.000"),
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
        return _navigationSouth!!
    }

private var _navigationSouth: ImageVector? = null
