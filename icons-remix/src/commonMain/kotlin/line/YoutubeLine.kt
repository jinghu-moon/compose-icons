package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.YoutubeLine: ImageVector
    get() {
        if (_youtubeLine != null) return _youtubeLine!!
        _youtubeLine = remixIcon(
            name = "YoutubeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.607 6.995 C 19.531 6.697 19.315 6.472 19.068 6.403 C 18.630 6.281 16.501 6.000 12.001 6.000 C 7.501 6.000 5.373 6.281 4.932 6.403 C 4.688 6.471 4.472 6.696 4.395 6.995 C 4.286 7.419 4.001 9.196 4.001 12.000 C 4.001 14.804 4.286 16.581 4.395 17.006 C 4.471 17.303 4.687 17.528 4.933 17.597 C 5.373 17.719 7.501 18.000 12.001 18.000 C 16.501 18.000 18.630 17.719 19.070 17.597 C 19.314 17.529 19.530 17.304 19.607 17.005 C 19.716 16.581 20.001 14.800 20.001 12.000 C 20.001 9.200 19.716 7.419 19.607 6.995 ZM 21.544 6.498 C 22.001 8.280 22.001 12.000 22.001 12.000 C 22.001 12.000 22.001 15.720 21.544 17.502 C 21.290 18.487 20.547 19.262 19.606 19.524 C 17.897 20.000 12.001 20.000 12.001 20.000 C 12.001 20.000 6.108 20.000 4.396 19.524 C 3.451 19.258 2.709 18.484 2.458 17.502 C 2.001 15.720 2.001 12.000 2.001 12.000 C 2.001 12.000 2.001 8.280 2.458 6.498 C 2.712 5.513 3.455 4.738 4.396 4.476 C 6.108 4.000 12.001 4.000 12.001 4.000 C 12.001 4.000 17.897 4.000 19.606 4.476 C 20.551 4.742 21.293 5.516 21.544 6.498 ZM 10.001 15.500 L 10.001 8.500 L 16.001 12.000 L 10.001 15.500 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _youtubeLine!!
    }

private var _youtubeLine: ImageVector? = null
