package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number20Small: ImageVector
    get() {
        if (_number20Small != null) return _number20Small!!
        _number20Small = tablerOutlineIcon(
            name = "Number20Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 10.000 L 14.000 14.000 C 14.000 15.105 14.895 16.000 16.000 16.000 C 17.105 16.000 18.000 15.105 18.000 14.000 L 18.000 10.000 C 18.000 8.895 17.105 8.000 16.000 8.000 C 14.895 8.000 14.000 8.895 14.000 10.000"),
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
                pathData = parseSvgPathData("M 6.000 8.000 L 9.000 8.000 C 9.552 8.000 10.000 8.448 10.000 9.000 L 10.000 11.000 C 10.000 11.552 9.552 12.000 9.000 12.000 L 7.000 12.000 C 6.448 12.000 6.000 12.448 6.000 13.000 L 6.000 15.000 C 6.000 15.552 6.448 16.000 7.000 16.000 L 10.000 16.000"),
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
        return _number20Small!!
    }

private var _number20Small: ImageVector? = null
