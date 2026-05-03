package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WomenFill: ImageVector
    get() {
        if (_womenFill != null) return _womenFill!!
        _womenFill = remixIcon(
            name = "WomenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 15.934 C 7.331 15.445 4.500 12.303 4.500 8.500 C 4.500 4.358 7.858 1.000 12.000 1.000 C 16.142 1.000 19.500 4.358 19.500 8.500 C 19.500 12.303 16.669 15.445 13.000 15.934 L 13.000 18.000 L 18.000 18.000 L 18.000 20.000 L 13.000 20.000 L 13.000 24.000 L 11.000 24.000 L 11.000 20.000 L 6.000 20.000 L 6.000 18.000 L 11.000 18.000 L 11.000 15.934 Z"),
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
        return _womenFill!!
    }

private var _womenFill: ImageVector? = null
