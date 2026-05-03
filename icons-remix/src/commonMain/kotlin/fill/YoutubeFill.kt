package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.YoutubeFill: ImageVector
    get() {
        if (_youtubeFill != null) return _youtubeFill!!
        _youtubeFill = remixIcon(
            name = "YoutubeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.244 4.000 C 12.778 4.003 14.114 4.016 15.534 4.073 L 16.038 4.095 C 17.467 4.162 18.895 4.278 19.604 4.476 C 20.549 4.741 21.291 5.516 21.542 6.497 C 21.942 8.056 21.992 11.099 21.998 11.836 L 21.999 11.988 L 21.999 11.999 C 21.999 11.999 21.999 12.003 21.999 12.010 L 21.998 12.163 C 21.992 12.899 21.942 15.942 21.542 17.501 C 21.288 18.486 20.545 19.261 19.604 19.523 C 18.895 19.720 17.467 19.836 16.038 19.904 L 15.534 19.926 C 14.114 19.982 12.778 19.995 12.244 19.998 L 12.009 19.999 L 11.999 19.999 C 11.999 19.999 11.996 19.999 11.989 19.999 L 11.755 19.998 C 10.624 19.992 5.898 19.941 4.395 19.523 C 3.450 19.257 2.707 18.483 2.456 17.501 C 2.056 15.942 2.006 12.899 2.000 12.163 L 2.000 11.836 C 2.006 11.099 2.056 8.056 2.456 6.497 C 2.710 5.512 3.453 4.737 4.395 4.476 C 5.898 4.057 10.624 4.006 11.755 4.000 L 12.244 4.000 ZM 9.999 8.499 L 9.999 15.499 L 15.999 11.999 L 9.999 8.499 Z"),
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
        return _youtubeFill!!
    }

private var _youtubeFill: ImageVector? = null
