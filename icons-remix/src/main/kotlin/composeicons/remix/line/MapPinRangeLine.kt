package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MapPinRangeLine: ImageVector
    get() {
        if (_mapPinRangeLine != null) return _mapPinRangeLine!!
        _mapPinRangeLine = remixIcon(
            name = "MapPinRangeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 17.938C7.054 17.446 4 14.08 4 10 4 5.582 7.582 2 12 2c4.418 0 8 3.582 8 8 0 4.08-3.054 7.446-7 7.938v2.073c3.946 .092 7 .723 7 1.488C20 22.328 16.418 23 12 23 7.582 23 4 22.328 4 21.5c0-.765 3.054-1.396 7-1.488v-2.073ZM12 16c3.314 0 6-2.686 6-6C18 6.686 15.314 4 12 4 8.686 4 6 6.686 6 10c0 3.314 2.686 6 6 6ZM12 12c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _mapPinRangeLine!!
    }

private var _mapPinRangeLine: ImageVector? = null
