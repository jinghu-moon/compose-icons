package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = remixIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 20.899l4.95-4.95c2.734-2.734 2.734-7.166 0-9.899C14.216 3.317 9.784 3.317 7.05 6.05c-2.734 2.734-2.734 7.166 0 9.899L12 20.899ZM12 23.728 5.636 17.364C2.121 13.849 2.121 8.151 5.636 4.636c3.515-3.515 9.213-3.515 12.728 0 3.515 3.515 3.515 9.213 0 12.728L12 23.728ZM12 13c1.105 0 2-.895 2-2C14 9.895 13.105 9 12 9c-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM12 15C9.791 15 8 13.209 8 11 8 8.791 9.791 7 12 7c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4Z"),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
