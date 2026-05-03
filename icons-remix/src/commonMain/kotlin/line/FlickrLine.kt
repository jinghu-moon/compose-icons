package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlickrLine: ImageVector
    get() {
        if (_flickrLine != null) return _flickrLine!!
        _flickrLine = remixIcon(
            name = "FlickrLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 17.000 C 8.761 17.000 11.000 14.762 11.000 12.000 C 11.000 9.239 8.761 7.000 6.000 7.000 C 3.238 7.000 1.000 9.239 1.000 12.000 C 1.000 14.762 3.238 17.000 6.000 17.000 ZM 9.000 12.000 C 9.000 13.657 7.657 15.000 6.000 15.000 C 4.343 15.000 3.000 13.657 3.000 12.000 C 3.000 10.343 4.343 9.000 6.000 9.000 C 7.657 9.000 9.000 10.343 9.000 12.000 ZM 18.000 17.000 C 20.761 17.000 23.000 14.762 23.000 12.000 C 23.000 9.239 20.761 7.000 18.000 7.000 C 15.238 7.000 13.000 9.239 13.000 12.000 C 13.000 14.762 15.238 17.000 18.000 17.000 ZM 21.000 12.000 C 21.000 13.657 19.657 15.000 18.000 15.000 C 16.343 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 16.343 9.000 18.000 9.000 C 19.657 9.000 21.000 10.343 21.000 12.000 Z"),
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
        return _flickrLine!!
    }

private var _flickrLine: ImageVector? = null
