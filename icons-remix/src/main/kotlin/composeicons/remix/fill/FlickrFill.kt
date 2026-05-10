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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 12c0 2.762-2.239 5-5 5C3.238 17 1 14.762 1 12 1 9.239 3.238 7 6 7 8.761 7 11 9.239 11 12ZM23 12c0 2.762-2.239 5-5 5-2.762 0-5-2.238-5-5C13 9.239 15.238 7 18 7c2.761 0 5 2.239 5 5Z"),
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
        return _flickrFill!!
    }

private var _flickrFill: ImageVector? = null
