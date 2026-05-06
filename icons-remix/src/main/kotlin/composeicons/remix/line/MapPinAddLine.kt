package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MapPinAddLine: ImageVector
    get() {
        if (_mapPinAddLine != null) return _mapPinAddLine!!
        _mapPinAddLine = remixIcon(
            name = "MapPinAddLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 20.899l4.95-4.95c2.734-2.734 2.734-7.166 0-9.899C14.216 3.317 9.784 3.317 7.05 6.05c-2.734 2.734-2.734 7.166 0 9.899L12 20.899ZM12 23.728 5.636 17.364C2.121 13.849 2.121 8.151 5.636 4.636c3.515-3.515 9.213-3.515 12.728 0 3.515 3.515 3.515 9.213 0 12.728L12 23.728ZM11 10v-3h2v3h3v2h-3v3h-2v-3h-3v-2h3Z"),
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
        return _mapPinAddLine!!
    }

private var _mapPinAddLine: ImageVector? = null
