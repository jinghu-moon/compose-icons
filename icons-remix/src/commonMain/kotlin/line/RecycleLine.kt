package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RecycleLine: ImageVector
    get() {
        if (_recycleLine != null) return _recycleLine!!
        _recycleLine = remixIcon(
            name = "RecycleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.560 12.097 L 21.092 14.750 C 22.059 16.424 21.485 18.565 19.811 19.531 C 19.279 19.838 18.675 20.000 18.061 20.000 L 15.998 20.000 L 15.999 22.500 L 10.999 19.000 L 15.999 15.500 L 15.998 18.000 L 18.061 18.000 C 18.324 18.000 18.583 17.931 18.811 17.799 C 19.528 17.385 19.774 16.468 19.360 15.750 L 17.829 13.097 L 19.560 12.097 ZM 7.303 9.134 L 7.834 15.214 L 5.668 13.964 L 4.638 15.750 C 4.506 15.978 4.437 16.237 4.437 16.500 C 4.437 17.329 5.108 18.000 5.937 18.000 L 8.999 18.000 L 8.999 20.000 L 5.937 20.000 C 4.004 20.000 2.437 18.433 2.437 16.500 C 2.437 15.886 2.598 15.282 2.905 14.750 L 3.936 12.964 L 1.771 11.714 L 7.303 9.134 ZM 13.749 2.969 C 14.281 3.276 14.723 3.718 15.030 4.250 L 16.060 6.036 L 18.226 4.786 L 17.695 10.866 L 12.164 8.286 L 14.328 7.036 L 13.298 5.250 C 13.166 5.022 12.977 4.833 12.749 4.701 C 12.031 4.287 11.114 4.533 10.700 5.250 L 9.168 7.903 L 7.436 6.903 L 8.968 4.250 C 9.934 2.576 12.075 2.003 13.749 2.969 Z"),
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
        return _recycleLine!!
    }

private var _recycleLine: ImageVector? = null
