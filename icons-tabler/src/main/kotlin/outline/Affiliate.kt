package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Affiliate: ImageVector
    get() {
        if (_affiliate != null) return _affiliate!!
        _affiliate = tablerOutlineIcon(
            name = "Affiliate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.931 6.936 L 7.206 11.185M 12.813 16.794 L 17.064 18.069"),
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
                pathData = parseSvgPathData("M 11.683 12.317 L 17.442 6.558"),
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
                pathData = parseSvgPathData("M 4.000 5.500 C 4.000 6.328 4.672 7.000 5.500 7.000 C 6.328 7.000 7.000 6.328 7.000 5.500 C 7.000 4.672 6.328 4.000 5.500 4.000 C 4.672 4.000 4.000 4.672 4.000 5.500"),
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
                pathData = parseSvgPathData("M 17.000 5.500 C 17.000 6.328 17.672 7.000 18.500 7.000 C 19.328 7.000 20.000 6.328 20.000 5.500 C 20.000 4.672 19.328 4.000 18.500 4.000 C 17.672 4.000 17.000 4.672 17.000 5.500"),
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
                pathData = parseSvgPathData("M 17.000 18.500 C 17.000 19.328 17.672 20.000 18.500 20.000 C 19.328 20.000 20.000 19.328 20.000 18.500 C 20.000 17.672 19.328 17.000 18.500 17.000 C 17.672 17.000 17.000 17.672 17.000 18.500"),
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
                pathData = parseSvgPathData("M 4.000 15.500 C 4.000 17.985 6.015 20.000 8.500 20.000 C 10.985 20.000 13.000 17.985 13.000 15.500 C 13.000 13.015 10.985 11.000 8.500 11.000 C 6.015 11.000 4.000 13.015 4.000 15.500"),
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
        return _affiliate!!
    }

private var _affiliate: ImageVector? = null
