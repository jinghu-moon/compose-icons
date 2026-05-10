package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GradienterFill: ImageVector
    get() {
        if (_gradienterFill != null) return _gradienterFill!!
        _gradienterFill = remixIcon(
            name = "GradienterFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM8.126 11h-4.064C4.021 11.328 4 11.661 4 12c0 .339 .021 .672 .062 1h4.064C8.044 12.68 8 12.345 8 12c0-.345 .044-.68 .126-1ZM15.874 11c.082 .32 .126 .655 .126 1 0 .345-.044 .68-.126 1h4.064c.041-.328 .062-.661 .062-1 0-.339-.021-.672-.062-1h-4.064ZM12 14c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _gradienterFill!!
    }

private var _gradienterFill: ImageVector? = null
