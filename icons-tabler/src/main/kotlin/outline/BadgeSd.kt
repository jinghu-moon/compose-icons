package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgeSd: ImageVector
    get() {
        if (_badgeSd != null) return _badgeSd!!
        _badgeSd = tablerOutlineIcon(
            name = "BadgeSd",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 7.000 C 3.000 5.895 3.895 5.000 5.000 5.000 L 19.000 5.000 C 20.105 5.000 21.000 5.895 21.000 7.000 L 21.000 17.000 C 21.000 18.105 20.105 19.000 19.000 19.000 L 5.000 19.000 C 3.895 19.000 3.000 18.105 3.000 17.000 L 3.000 7.000"),
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
                pathData = parseSvgPathData("M 14.000 9.000 L 14.000 15.000 L 15.000 15.000 C 16.105 15.000 17.000 14.105 17.000 13.000 L 17.000 11.000 C 17.000 9.895 16.105 9.000 15.000 9.000 L 14.000 9.000"),
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
                pathData = parseSvgPathData("M 7.000 14.250 C 7.000 14.664 7.336 15.000 7.750 15.000 L 9.000 15.000 C 9.552 15.000 10.000 14.552 10.000 14.000 L 10.000 13.000 C 10.000 12.448 9.552 12.000 9.000 12.000 L 8.000 12.000 C 7.448 12.000 7.000 11.552 7.000 11.000 L 7.000 10.000 C 7.000 9.448 7.448 9.000 8.000 9.000 L 9.250 9.000 C 9.664 9.000 10.000 9.336 10.000 9.750"),
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
        return _badgeSd!!
    }

private var _badgeSd: ImageVector? = null
