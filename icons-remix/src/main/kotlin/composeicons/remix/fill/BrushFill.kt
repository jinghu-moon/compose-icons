package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BrushFill: ImageVector
    get() {
        if (_brushFill != null) return _brushFill!!
        _brushFill = remixIcon(
            name = "BrushFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.289 6.213 18.228 2.371c.398-.31 .964-.274 1.321 .082l2.994 2.994c.357 .357 .392 .923 .082 1.321l-3.841 4.938c.293 1.188 .299 2.465-.04 3.731-.898 3.352-3.93 5.561-7.243 5.561C8 20.999 3.5 19.497 1 17.997c3.98-3 3.047-4.81 3.5-6.5C5.558 7.547 9.342 5.239 13.289 6.213ZM16.701 8.092c.066 .063 .13 .128 .194 .194l1.134 1.135L20.505 6.238 18.759 4.492 15.577 6.967l1.125 1.125Z"),
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
        return _brushFill!!
    }

private var _brushFill: ImageVector? = null
