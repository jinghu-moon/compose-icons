package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MovieFill: ImageVector
    get() {
        if (_movieFill != null) return _movieFill!!
        _movieFill = remixIcon(
            name = "MovieFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 ZM 10.622 8.415 C 10.556 8.371 10.479 8.347 10.400 8.347 C 10.179 8.347 10.000 8.526 10.000 8.747 L 10.000 15.253 C 10.000 15.332 10.023 15.409 10.067 15.474 C 10.190 15.658 10.438 15.708 10.622 15.585 L 15.501 12.333 C 15.545 12.304 15.582 12.266 15.612 12.222 C 15.734 12.038 15.685 11.790 15.501 11.667 L 10.622 8.415 Z"),
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
        return _movieFill!!
    }

private var _movieFill: ImageVector? = null
