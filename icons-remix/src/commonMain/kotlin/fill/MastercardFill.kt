package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MastercardFill: ImageVector
    get() {
        if (_mastercardFill != null) return _mastercardFill!!
        _mastercardFill = remixIcon(
            name = "MastercardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 6.654 C 13.582 7.899 14.597 9.830 14.597 11.998 C 14.597 14.166 13.582 16.097 12.001 17.341 C 10.420 16.097 9.405 14.166 9.405 11.998 C 9.405 9.830 10.420 7.899 12.001 6.654 ZM 11.132 6.072 C 9.460 7.502 8.401 9.627 8.401 12.000 C 8.401 14.371 9.459 16.495 11.128 17.926 C 10.144 18.479 9.008 18.795 7.799 18.795 C 4.044 18.795 1.001 15.752 1.001 11.998 C 1.001 8.243 4.044 5.200 7.799 5.200 C 9.010 5.200 10.147 5.517 11.132 6.072 ZM 12.873 17.926 C 14.543 16.495 15.601 14.371 15.601 12.000 C 15.601 9.627 14.542 7.502 12.870 6.072 C 13.855 5.517 14.992 5.200 16.203 5.200 C 19.958 5.200 23.001 8.243 23.001 11.998 C 23.001 15.752 19.958 18.795 16.203 18.795 C 14.993 18.795 13.858 18.479 12.873 17.926 Z"),
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
        return _mastercardFill!!
    }

private var _mastercardFill: ImageVector? = null
