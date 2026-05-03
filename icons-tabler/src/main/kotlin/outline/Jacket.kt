package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Jacket: ImageVector
    get() {
        if (_jacket != null) return _jacket!!
        _jacket = tablerOutlineIcon(
            name = "Jacket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 3.000 L 12.000 8.000 L 8.000 3.000"),
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
                pathData = parseSvgPathData("M 12.000 19.000 C 12.000 20.105 11.105 21.000 10.000 21.000 L 6.000 21.000 C 4.895 21.000 4.000 20.105 4.000 19.000 L 4.000 10.828 C 4.000 10.298 4.211 9.789 4.586 9.414 L 5.414 8.586 C 5.789 8.211 6.000 7.702 6.000 7.172 L 6.000 5.000 C 6.000 3.895 6.895 3.000 8.000 3.000 L 16.000 3.000 C 17.105 3.000 18.000 3.895 18.000 5.000 L 18.000 7.172 C 18.000 7.702 18.211 8.211 18.586 8.586 L 19.414 9.414 C 19.789 9.789 20.000 10.298 20.000 10.828 L 20.000 19.000 C 20.000 20.105 19.105 21.000 18.000 21.000 L 14.000 21.000 C 12.895 21.000 12.000 20.105 12.000 19.000"),
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
                pathData = parseSvgPathData("M 20.000 13.000 L 17.000 13.000 C 16.448 13.000 16.000 13.448 16.000 14.000 L 16.000 16.000 C 16.000 16.552 16.448 17.000 17.000 17.000 L 20.000 17.000"),
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
                pathData = parseSvgPathData("M 4.000 17.000 L 7.000 17.000 C 7.552 17.000 8.000 16.552 8.000 16.000 L 8.000 14.000 C 8.000 13.448 7.552 13.000 7.000 13.000 L 4.000 13.000"),
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
                pathData = parseSvgPathData("M 12.000 19.000 L 12.000 8.000"),
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
        return _jacket!!
    }

private var _jacket: ImageVector? = null
