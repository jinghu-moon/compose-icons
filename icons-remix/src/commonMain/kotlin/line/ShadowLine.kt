package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShadowLine: ImageVector
    get() {
        if (_shadowLine != null) return _shadowLine!!
        _shadowLine = remixIcon(
            name = "ShadowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 2.000 C 2.448 2.000 2.000 2.448 2.000 3.000 L 2.000 17.000 C 2.000 17.552 2.448 18.000 3.000 18.000 L 6.000 18.000 L 6.000 21.000 C 6.000 21.552 6.448 22.000 7.000 22.000 L 21.000 22.000 C 21.552 22.000 22.000 21.552 22.000 21.000 L 22.000 7.000 C 22.000 6.448 21.552 6.000 21.000 6.000 L 18.000 6.000 L 18.000 3.000 C 18.000 2.448 17.552 2.000 17.000 2.000 L 3.000 2.000 ZM 18.000 11.561 L 20.000 13.561 L 20.000 16.439 L 18.000 14.439 L 18.000 11.561 ZM 18.000 9.439 L 18.000 8.000 L 20.000 8.000 L 20.000 11.439 L 18.000 9.439 ZM 18.000 17.000 L 18.000 16.561 L 20.000 18.561 L 20.000 20.000 L 18.561 20.000 L 16.561 18.000 L 17.000 18.000 C 17.552 18.000 18.000 17.552 18.000 17.000 ZM 14.439 18.000 L 16.439 20.000 L 13.561 20.000 L 11.561 18.000 L 14.439 18.000 ZM 9.439 18.000 L 11.439 20.000 L 8.000 20.000 L 8.000 18.000 L 9.439 18.000 ZM 4.000 16.000 L 4.000 4.000 L 16.000 4.000 L 16.000 16.000 L 4.000 16.000 Z"),
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
        return _shadowLine!!
    }

private var _shadowLine: ImageVector? = null
