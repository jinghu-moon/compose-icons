package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WebcamFill: ImageVector
    get() {
        if (_webcamFill != null) return _webcamFill!!
        _webcamFill = remixIcon(
            name = "WebcamFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 21v-1.071C7.608 19.444 5 16.527 5 13v-5C5 4.134 8.134 1 12 1c3.866 0 7 3.134 7 7v5c0 3.527-2.608 6.444-6 6.929v1.071h4v2h-10v-2h4ZM12 9C11.448 9 11 8.552 11 8c0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 .552-.448 1-1 1ZM12 11c1.657 0 3-1.343 3-3C15 6.343 13.657 5 12 5 10.343 5 9 6.343 9 8c0 1.657 1.343 3 3 3Z"),
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
        return _webcamFill!!
    }

private var _webcamFill: ImageVector? = null
