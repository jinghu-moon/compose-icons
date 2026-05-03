package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Apple: ImageVector
    get() {
        if (_apple != null) return _apple!!
        _apple = tablerOutlineIcon(
            name = "Apple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 11.319 C 4.000 14.421 4.444 16.638 6.222 19.297 C 7.573 21.094 9.378 21.544 11.302 20.285 C 11.728 20.017 12.272 20.017 12.699 20.285 C 14.622 21.545 16.427 21.094 17.778 19.297 C 19.556 16.637 20.000 14.421 20.000 11.320 C 20.000 8.659 18.010 6.000 15.556 6.000 C 14.289 6.000 13.146 6.693 12.336 7.440 C 12.145 7.613 11.855 7.613 11.664 7.440 C 10.855 6.694 9.711 6.000 8.444 6.000 C 5.990 6.000 4.000 8.660 4.000 11.319"),
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
                pathData = parseSvgPathData("M 7.000 12.000 C 7.000 10.530 7.454 9.660 8.500 9.000"),
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
                pathData = parseSvgPathData("M 12.000 7.000 C 12.000 5.800 12.867 3.000 15.000 3.000"),
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
        return _apple!!
    }

private var _apple: ImageVector? = null
