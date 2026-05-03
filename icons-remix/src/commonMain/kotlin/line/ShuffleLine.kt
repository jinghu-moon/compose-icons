package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShuffleLine: ImageVector
    get() {
        if (_shuffleLine != null) return _shuffleLine!!
        _shuffleLine = remixIcon(
            name = "ShuffleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 17.883 L 18.000 16.000 L 23.000 19.000 L 18.000 22.000 L 18.000 19.910 C 14.922 19.470 12.251 17.458 11.003 14.545 L 11.000 14.539 L 10.997 14.545 C 9.579 17.854 6.325 20.000 2.725 20.000 L 2.000 20.000 L 2.000 18.000 L 2.725 18.000 C 5.525 18.000 8.056 16.331 9.159 13.757 L 9.912 12.000 L 9.159 10.243 C 8.056 7.669 5.525 6.000 2.725 6.000 L 2.000 6.000 L 2.000 4.000 L 2.725 4.000 C 6.325 4.000 9.579 6.146 10.997 9.455 L 11.000 9.461 L 11.003 9.455 C 12.251 6.542 14.922 4.530 18.000 4.091 L 18.000 2.000 L 23.000 5.000 L 18.000 8.000 L 18.000 6.117 C 15.727 6.538 13.774 8.067 12.841 10.243 L 12.088 12.000 L 12.841 13.757 C 13.774 15.933 15.727 17.462 18.000 17.883 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _shuffleLine!!
    }

private var _shuffleLine: ImageVector? = null
