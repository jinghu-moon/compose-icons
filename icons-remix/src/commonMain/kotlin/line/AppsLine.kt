package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AppsLine: ImageVector
    get() {
        if (_appsLine != null) return _appsLine!!
        _appsLine = remixIcon(
            name = "AppsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.750 2.500 C 9.097 2.500 11.000 4.403 11.000 6.750 L 11.000 11.000 L 6.750 11.000 C 4.403 11.000 2.500 9.097 2.500 6.750 C 2.500 4.403 4.403 2.500 6.750 2.500 ZM 9.000 9.000 L 9.000 6.750 C 9.000 5.507 7.993 4.500 6.750 4.500 C 5.507 4.500 4.500 5.507 4.500 6.750 C 4.500 7.993 5.507 9.000 6.750 9.000 L 9.000 9.000 ZM 6.750 13.000 L 11.000 13.000 L 11.000 17.250 C 11.000 19.597 9.097 21.500 6.750 21.500 C 4.403 21.500 2.500 19.597 2.500 17.250 C 2.500 14.903 4.403 13.000 6.750 13.000 ZM 6.750 15.000 C 5.507 15.000 4.500 16.007 4.500 17.250 C 4.500 18.493 5.507 19.500 6.750 19.500 C 7.993 19.500 9.000 18.493 9.000 17.250 L 9.000 15.000 L 6.750 15.000 ZM 17.250 2.500 C 19.597 2.500 21.500 4.403 21.500 6.750 C 21.500 9.097 19.597 11.000 17.250 11.000 L 13.000 11.000 L 13.000 6.750 C 13.000 4.403 14.903 2.500 17.250 2.500 ZM 17.250 9.000 C 18.493 9.000 19.500 7.993 19.500 6.750 C 19.500 5.507 18.493 4.500 17.250 4.500 C 16.007 4.500 15.000 5.507 15.000 6.750 L 15.000 9.000 L 17.250 9.000 ZM 13.000 13.000 L 17.250 13.000 C 19.597 13.000 21.500 14.903 21.500 17.250 C 21.500 19.597 19.597 21.500 17.250 21.500 C 14.903 21.500 13.000 19.597 13.000 17.250 L 13.000 13.000 ZM 15.000 15.000 L 15.000 17.250 C 15.000 18.493 16.007 19.500 17.250 19.500 C 18.493 19.500 19.500 18.493 19.500 17.250 C 19.500 16.007 18.493 15.000 17.250 15.000 L 15.000 15.000 Z"),
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
        return _appsLine!!
    }

private var _appsLine: ImageVector? = null
