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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 17C8.761 17 11 14.762 11 12 11 9.239 8.761 7 6 7 3.238 7 1 9.239 1 12c0 2.762 2.238 5 5 5ZM9 12c0 1.657-1.343 3-3 3C4.343 15 3 13.657 3 12 3 10.343 4.343 9 6 9c1.657 0 3 1.343 3 3ZM18 17c2.761 0 5-2.238 5-5C23 9.239 20.761 7 18 7c-2.762 0-5 2.239-5 5 0 2.762 2.238 5 5 5ZM21 12c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z"),
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
        return _flickrLine!!
    }

private var _flickrLine: ImageVector? = null
