package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SoundcloudLine: ImageVector
    get() {
        if (_soundcloudLine != null) return _soundcloudLine!!
        _soundcloudLine = remixIcon(
            name = "SoundcloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 10.000 C 4.552 10.000 5.000 10.448 5.000 11.000 L 5.000 18.000 C 5.000 18.552 4.552 19.000 4.000 19.000 C 3.448 19.000 3.000 18.552 3.000 18.000 L 3.000 11.000 C 3.000 10.448 3.448 10.000 4.000 10.000 ZM 7.000 11.000 C 7.552 11.000 8.000 11.448 8.000 12.000 L 8.000 18.000 C 8.000 18.552 7.552 19.000 7.000 19.000 C 6.448 19.000 6.000 18.552 6.000 18.000 L 6.000 12.000 C 6.000 11.448 6.448 11.000 7.000 11.000 ZM 10.000 7.000 C 10.552 7.000 11.000 7.448 11.000 8.000 L 11.000 18.000 C 11.000 18.552 10.552 19.000 10.000 19.000 C 9.448 19.000 9.000 18.552 9.000 18.000 L 9.000 8.000 C 9.000 7.448 9.448 7.000 10.000 7.000 ZM 15.000 6.000 C 18.238 6.000 20.878 8.566 20.996 11.775 L 20.999 12.035 C 22.696 12.278 24.000 13.736 24.000 15.500 C 24.000 17.369 22.536 18.895 20.692 18.995 L 20.500 19.000 L 16.999 19.000 C 16.447 19.000 15.999 18.552 15.999 18.000 C 15.999 17.487 16.385 17.065 16.882 17.007 L 16.999 17.000 L 20.446 17.001 L 20.584 16.998 C 21.375 16.955 22.000 16.298 22.000 15.500 C 22.000 14.798 21.514 14.199 20.851 14.041 L 20.716 14.015 L 18.947 13.763 L 18.999 11.976 L 18.995 11.800 C 18.894 9.750 17.250 8.106 15.200 8.005 L 15.000 8.000 C 14.732 8.000 14.469 8.026 14.212 8.077 L 13.999 8.126 L 13.999 18.000 C 13.999 18.513 13.613 18.935 13.116 18.993 L 13.000 19.000 C 12.448 19.000 12.000 18.552 12.000 18.000 L 11.999 6.803 C 12.882 6.292 13.907 6.000 15.000 6.000 ZM 1.000 12.000 C 1.552 12.000 2.000 12.448 2.000 13.000 L 2.000 17.000 C 2.000 17.552 1.552 18.000 1.000 18.000 C 0.448 18.000 0.000 17.552 0.000 17.000 L 0.000 13.000 C 0.000 12.448 0.448 12.000 1.000 12.000 Z"),
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
        return _soundcloudLine!!
    }

private var _soundcloudLine: ImageVector? = null
