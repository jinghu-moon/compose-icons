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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 21.000 L 11.000 19.929 C 7.608 19.444 5.000 16.527 5.000 13.000 L 5.000 8.000 C 5.000 4.134 8.134 1.000 12.000 1.000 C 15.866 1.000 19.000 4.134 19.000 8.000 L 19.000 13.000 C 19.000 16.527 16.392 19.444 13.000 19.929 L 13.000 21.000 L 17.000 21.000 L 17.000 23.000 L 7.000 23.000 L 7.000 21.000 L 11.000 21.000 ZM 12.000 9.000 C 11.448 9.000 11.000 8.552 11.000 8.000 C 11.000 7.448 11.448 7.000 12.000 7.000 C 12.552 7.000 13.000 7.448 13.000 8.000 C 13.000 8.552 12.552 9.000 12.000 9.000 ZM 12.000 11.000 C 13.657 11.000 15.000 9.657 15.000 8.000 C 15.000 6.343 13.657 5.000 12.000 5.000 C 10.343 5.000 9.000 6.343 9.000 8.000 C 9.000 9.657 10.343 11.000 12.000 11.000 Z"),
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
        return _webcamFill!!
    }

private var _webcamFill: ImageVector? = null
