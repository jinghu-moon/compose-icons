package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Message2Fill: ImageVector
    get() {
        if (_message2Fill != null) return _message2Fill!!
        _message2Fill = remixIcon(
            name = "Message2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 6.455 19.000 ZM 7.000 10.000 L 7.000 12.000 L 9.000 12.000 L 9.000 10.000 L 7.000 10.000 ZM 11.000 10.000 L 11.000 12.000 L 13.000 12.000 L 13.000 10.000 L 11.000 10.000 ZM 15.000 10.000 L 15.000 12.000 L 17.000 12.000 L 17.000 10.000 L 15.000 10.000 Z"),
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
        return _message2Fill!!
    }

private var _message2Fill: ImageVector? = null
