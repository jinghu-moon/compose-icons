package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Olympics: ImageVector
    get() {
        if (_olympics != null) return _olympics!!
        _olympics = tablerOutlineIcon(
            name = "Olympics",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 9.000 C 3.000 10.657 4.343 12.000 6.000 12.000 C 7.657 12.000 9.000 10.657 9.000 9.000 C 9.000 7.343 7.657 6.000 6.000 6.000 C 4.343 6.000 3.000 7.343 3.000 9.000"),
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
                pathData = parseSvgPathData("M 15.000 9.000 C 15.000 10.657 16.343 12.000 18.000 12.000 C 19.657 12.000 21.000 10.657 21.000 9.000 C 21.000 7.343 19.657 6.000 18.000 6.000 C 16.343 6.000 15.000 7.343 15.000 9.000"),
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
                pathData = parseSvgPathData("M 9.000 9.000 C 9.000 10.657 10.343 12.000 12.000 12.000 C 13.657 12.000 15.000 10.657 15.000 9.000 C 15.000 7.343 13.657 6.000 12.000 6.000 C 10.343 6.000 9.000 7.343 9.000 9.000"),
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
                pathData = parseSvgPathData("M 6.000 15.000 C 6.000 16.657 7.343 18.000 9.000 18.000 C 10.657 18.000 12.000 16.657 12.000 15.000 C 12.000 13.343 10.657 12.000 9.000 12.000 C 7.343 12.000 6.000 13.343 6.000 15.000"),
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
                pathData = parseSvgPathData("M 12.000 15.000 C 12.000 16.657 13.343 18.000 15.000 18.000 C 16.657 18.000 18.000 16.657 18.000 15.000 C 18.000 13.343 16.657 12.000 15.000 12.000 C 13.343 12.000 12.000 13.343 12.000 15.000"),
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
        return _olympics!!
    }

private var _olympics: ImageVector? = null
