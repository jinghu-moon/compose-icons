package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTripadvisor: ImageVector
    get() {
        if (_brandTripadvisor != null) return _brandTripadvisor!!
        _brandTripadvisor = tablerOutlineIcon(
            name = "BrandTripadvisor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 13.500 C 5.000 14.328 5.672 15.000 6.500 15.000 C 7.328 15.000 8.000 14.328 8.000 13.500 C 8.000 12.672 7.328 12.000 6.500 12.000 C 5.672 12.000 5.000 12.672 5.000 13.500"),
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
                pathData = parseSvgPathData("M 16.000 13.500 C 16.000 14.328 16.672 15.000 17.500 15.000 C 18.328 15.000 19.000 14.328 19.000 13.500 C 19.000 12.672 18.328 12.000 17.500 12.000 C 16.672 12.000 16.000 12.672 16.000 13.500"),
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
                pathData = parseSvgPathData("M 17.500 9.000 C 15.398 9.000 13.576 10.456 13.112 12.506 C 12.647 14.557 13.665 16.655 15.562 17.561 C 17.459 18.467 19.730 17.938 21.033 16.288 C 22.335 14.638 22.322 12.306 21.000 10.671 L 22.000 9.000 L 17.500 9.000"),
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
                pathData = parseSvgPathData("M 6.500 9.000 C 8.602 9.000 10.424 10.456 10.888 12.506 C 11.353 14.557 10.335 16.655 8.438 17.561 C 6.541 18.467 4.270 17.938 2.967 16.288 C 1.665 14.638 1.678 12.306 3.000 10.671 L 2.000 9.000 L 6.500 9.000"),
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
                pathData = parseSvgPathData("M 10.500 15.500 L 12.000 17.500 L 13.500 15.500"),
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
                pathData = parseSvgPathData("M 9.000 6.750 C 11.000 6.083 13.000 6.083 15.000 6.750"),
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
        return _brandTripadvisor!!
    }

private var _brandTripadvisor: ImageVector? = null
