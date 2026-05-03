package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SkullFill: ImageVector
    get() {
        if (_skullFill != null) return _skullFill!!
        _skullFill = remixIcon(
            name = "SkullFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 18.000 L 18.000 21.000 C 18.000 21.552 17.552 22.000 17.000 22.000 L 7.000 22.000 C 6.448 22.000 6.000 21.552 6.000 21.000 L 6.000 18.000 L 3.000 18.000 C 2.448 18.000 2.000 17.552 2.000 17.000 L 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 L 22.000 17.000 C 22.000 17.552 21.552 18.000 21.000 18.000 L 18.000 18.000 ZM 7.500 14.000 C 8.328 14.000 9.000 13.328 9.000 12.500 C 9.000 11.672 8.328 11.000 7.500 11.000 C 6.672 11.000 6.000 11.672 6.000 12.500 C 6.000 13.328 6.672 14.000 7.500 14.000 ZM 16.500 14.000 C 17.328 14.000 18.000 13.328 18.000 12.500 C 18.000 11.672 17.328 11.000 16.500 11.000 C 15.672 11.000 15.000 11.672 15.000 12.500 C 15.000 13.328 15.672 14.000 16.500 14.000 Z"),
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
        return _skullFill!!
    }

private var _skullFill: ImageVector? = null
