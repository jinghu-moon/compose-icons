package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Message3Fill: ImageVector
    get() {
        if (_message3Fill != null) return _message3Fill!!
        _message3Fill = remixIcon(
            name = "Message3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 8.994 C 2.000 5.683 4.677 3.000 8.001 3.000 L 15.999 3.000 C 19.313 3.000 22.000 5.695 22.000 8.994 L 22.000 21.000 L 8.001 21.000 C 4.687 21.000 2.000 18.305 2.000 15.006 L 2.000 8.994 ZM 14.000 11.000 L 14.000 13.000 L 16.000 13.000 L 16.000 11.000 L 14.000 11.000 ZM 8.000 11.000 L 8.000 13.000 L 10.000 13.000 L 10.000 11.000 L 8.000 11.000 Z"),
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
        return _message3Fill!!
    }

private var _message3Fill: ImageVector? = null
