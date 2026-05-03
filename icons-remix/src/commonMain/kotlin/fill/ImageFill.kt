package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ImageFill: ImageVector
    get() {
        if (_imageFill != null) return _imageFill!!
        _imageFill = remixIcon(
            name = "ImageFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 5.000 L 4.000 5.000 L 4.000 19.000 L 13.292 9.706 C 13.683 9.316 14.316 9.316 14.707 9.706 L 20.000 15.010 L 20.000 5.000 ZM 2.000 3.993 C 2.000 3.445 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.445 22.000 3.993 L 22.000 20.007 C 22.000 20.555 21.545 21.000 21.008 21.000 L 2.992 21.000 C 2.444 21.000 2.000 20.555 2.000 20.007 L 2.000 3.993 ZM 8.000 11.000 C 6.895 11.000 6.000 10.105 6.000 9.000 C 6.000 7.895 6.895 7.000 8.000 7.000 C 9.105 7.000 10.000 7.895 10.000 9.000 C 10.000 10.105 9.105 11.000 8.000 11.000 Z"),
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
        return _imageFill!!
    }

private var _imageFill: ImageVector? = null
