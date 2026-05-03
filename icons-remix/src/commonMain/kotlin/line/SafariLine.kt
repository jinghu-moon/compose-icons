package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SafariLine: ImageVector
    get() {
        if (_safariLine != null) return _safariLine!!
        _safariLine = remixIcon(
            name = "SafariLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.813 6.503 L 13.415 13.414 L 6.504 17.812 C 7.709 18.953 9.269 19.722 11.001 19.938 L 11.001 18.000 L 13.001 18.000 L 13.001 19.938 C 14.462 19.756 15.800 19.180 16.907 18.320 L 15.536 16.950 L 16.951 15.535 L 18.321 16.906 C 19.181 15.799 19.757 14.461 19.939 13.000 L 18.001 13.000 L 18.001 11.000 L 19.939 11.000 C 19.723 9.268 18.954 7.708 17.813 6.503 ZM 17.498 6.188 C 16.293 5.047 14.733 4.278 13.001 4.062 L 13.001 6.000 L 11.001 6.000 L 11.001 4.062 C 9.540 4.244 8.202 4.820 7.095 5.680 L 8.465 7.050 L 7.051 8.464 L 5.681 7.094 C 4.821 8.201 4.245 9.539 4.063 11.000 L 6.001 11.000 L 6.001 13.000 L 4.063 13.000 C 4.279 14.732 5.048 16.292 6.189 17.497 L 10.587 10.586 L 17.498 6.188 ZM 12.001 22.000 C 6.478 22.000 2.001 17.523 2.001 12.000 C 2.001 6.477 6.478 2.000 12.001 2.000 C 17.524 2.000 22.001 6.477 22.001 12.000 C 22.001 17.523 17.524 22.000 12.001 22.000 Z"),
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
        return _safariLine!!
    }

private var _safariLine: ImageVector? = null
