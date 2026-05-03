package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GuideLine: ImageVector
    get() {
        if (_guideLine != null) return _guideLine!!
        _guideLine = remixIcon(
            name = "GuideLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 8.000 L 13.000 16.000 C 13.000 17.657 11.657 19.000 10.000 19.000 L 7.829 19.000 C 7.417 20.165 6.306 21.000 5.000 21.000 C 3.343 21.000 2.000 19.657 2.000 18.000 C 2.000 16.343 3.343 15.000 5.000 15.000 C 6.306 15.000 7.417 15.835 7.829 17.000 L 10.000 17.000 C 10.552 17.000 11.000 16.552 11.000 16.000 L 11.000 8.000 C 11.000 6.343 12.343 5.000 14.000 5.000 L 17.000 5.000 L 17.000 2.000 L 22.000 6.000 L 17.000 10.000 L 17.000 7.000 L 14.000 7.000 C 13.448 7.000 13.000 7.448 13.000 8.000 ZM 5.000 19.000 C 5.552 19.000 6.000 18.552 6.000 18.000 C 6.000 17.448 5.552 17.000 5.000 17.000 C 4.448 17.000 4.000 17.448 4.000 18.000 C 4.000 18.552 4.448 19.000 5.000 19.000 Z"),
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
        return _guideLine!!
    }

private var _guideLine: ImageVector? = null
