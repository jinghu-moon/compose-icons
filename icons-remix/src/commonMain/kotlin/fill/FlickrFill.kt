package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FlickrFill: ImageVector
    get() {
        if (_flickrFill != null) return _flickrFill!!
        _flickrFill = remixIcon(
            name = "FlickrFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 12.000 C 11.000 14.762 8.761 17.000 6.000 17.000 C 3.238 17.000 1.000 14.762 1.000 12.000 C 1.000 9.239 3.238 7.000 6.000 7.000 C 8.761 7.000 11.000 9.239 11.000 12.000 ZM 23.000 12.000 C 23.000 14.762 20.761 17.000 18.000 17.000 C 15.238 17.000 13.000 14.762 13.000 12.000 C 13.000 9.239 15.238 7.000 18.000 7.000 C 20.761 7.000 23.000 9.239 23.000 12.000 Z"),
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
        return _flickrFill!!
    }

private var _flickrFill: ImageVector? = null
