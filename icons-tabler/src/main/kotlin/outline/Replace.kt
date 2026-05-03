package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Replace: ImageVector
    get() {
        if (_replace != null) return _replace!!
        _replace = tablerOutlineIcon(
            name = "Replace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 8.000 3.000 C 8.552 3.000 9.000 3.448 9.000 4.000 L 9.000 8.000 C 9.000 8.552 8.552 9.000 8.000 9.000 L 4.000 9.000 C 3.448 9.000 3.000 8.552 3.000 8.000 L 3.000 4.000"),
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
                pathData = parseSvgPathData("M 15.000 16.000 C 15.000 15.448 15.448 15.000 16.000 15.000 L 20.000 15.000 C 20.552 15.000 21.000 15.448 21.000 16.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 16.000 21.000 C 15.448 21.000 15.000 20.552 15.000 20.000 L 15.000 16.000"),
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
                pathData = parseSvgPathData("M 21.000 11.000 L 21.000 8.000 C 21.000 6.895 20.105 6.000 19.000 6.000 L 13.000 6.000 L 16.000 9.000M 16.000 3.000 L 13.000 6.000"),
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
                pathData = parseSvgPathData("M 3.000 13.000 L 3.000 16.000 C 3.000 17.105 3.895 18.000 5.000 18.000 L 11.000 18.000 L 8.000 15.000M 8.000 21.000 L 11.000 18.000"),
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
        return _replace!!
    }

private var _replace: ImageVector? = null
