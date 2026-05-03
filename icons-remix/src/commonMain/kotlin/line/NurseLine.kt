package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NurseLine: ImageVector
    get() {
        if (_nurseLine != null) return _nurseLine!!
        _nurseLine = remixIcon(
            name = "NurseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 15.000 C 16.080 15.000 19.447 18.054 19.939 22.000 L 4.062 22.000 C 4.555 18.054 7.921 15.000 12.001 15.000 ZM 10.188 17.279 C 8.754 17.734 7.546 18.713 6.802 20.000 L 12.001 20.000 L 10.188 17.279 ZM 13.814 17.280 L 12.001 20.000 L 17.199 20.000 C 16.455 18.713 15.248 17.734 13.814 17.280 ZM 18.001 2.000 L 18.001 8.000 C 18.001 11.314 15.314 14.000 12.001 14.000 C 8.687 14.000 6.001 11.314 6.001 8.000 L 6.001 2.000 L 18.001 2.000 ZM 8.001 8.000 C 8.001 10.209 9.791 12.000 12.001 12.000 C 14.210 12.000 16.001 10.209 16.001 8.000 L 8.001 8.000 ZM 16.001 4.000 L 8.001 4.000 L 8.000 6.000 L 16.000 6.000 L 16.001 4.000 Z"),
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
        return _nurseLine!!
    }

private var _nurseLine: ImageVector? = null
