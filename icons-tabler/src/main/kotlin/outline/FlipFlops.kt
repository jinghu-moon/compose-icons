package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlipFlops: ImageVector
    get() {
        if (_flipFlops != null) return _flipFlops!!
        _flipFlops = tablerOutlineIcon(
            name = "FlipFlops",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 4.000 C 20.210 4.000 22.000 5.682 22.000 7.758 C 22.000 7.836 22.000 7.914 21.992 7.992 L 21.392 17.006 C 21.282 18.689 19.796 20.006 18.000 20.006 C 16.204 20.006 14.720 18.695 14.608 17.006 L 14.008 7.992 C 13.870 5.921 15.546 4.137 17.751 4.007 C 17.834 4.002 17.918 4.000 18.001 4.000 L 18.000 4.000"),
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
        pathData = parseSvgPathData("M 14.500 14.000 C 15.500 10.667 16.667 9.000 18.000 9.000 C 19.333 9.000 20.500 10.667 21.500 14.000"),
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
        pathData = parseSvgPathData("M 18.000 16.000 L 18.000 17.000"),
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
        pathData = parseSvgPathData("M 6.000 4.000 C 8.210 4.000 10.000 5.682 10.000 7.758 C 10.000 7.836 10.000 7.914 9.992 7.992 L 9.392 17.006 C 9.282 18.689 7.796 20.006 6.000 20.006 C 4.204 20.006 2.720 18.695 2.608 17.006 L 2.008 7.992 C 1.870 5.921 3.546 4.137 5.750 4.007 C 5.834 4.007 5.917 4.000 6.000 4.000"),
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
        pathData = parseSvgPathData("M 2.500 14.000 C 3.500 10.667 4.667 9.000 6.000 9.000 C 7.333 9.000 8.500 10.667 9.500 14.000"),
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
        pathData = parseSvgPathData("M 6.000 16.000 L 6.000 17.000"),
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
        return _flipFlops!!
    }

private var _flipFlops: ImageVector? = null
