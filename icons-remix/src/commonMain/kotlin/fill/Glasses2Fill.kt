package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Glasses2Fill: ImageVector
    get() {
        if (_glasses2Fill != null) return _glasses2Fill!!
        _glasses2Fill = remixIcon(
            name = "Glasses2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.031 10.976 C 3.070 9.495 3.158 8.309 3.356 7.321 C 3.687 5.663 4.310 4.662 5.555 3.832 L 4.446 2.168 C 2.691 3.338 1.813 4.837 1.394 6.929 C 1.000 8.901 1.000 11.484 1.000 14.880 L 1.000 14.880 L 1.000 14.999 C 1.000 15.000 1.000 15.000 1.000 15.000 C 1.000 17.761 3.239 20.000 6.000 20.000 C 8.761 20.000 11.000 17.761 11.000 15.000 C 11.000 14.726 10.978 14.457 10.935 14.194 C 11.266 14.069 11.624 14.000 12.000 14.000 C 12.376 14.000 12.734 14.069 13.065 14.194 C 13.022 14.457 13.000 14.726 13.000 15.000 C 13.000 17.761 15.239 20.000 18.000 20.000 C 20.761 20.000 23.000 17.761 23.000 15.000 L 23.000 14.880 C 23.000 11.484 23.000 8.901 22.606 6.929 C 22.187 4.837 21.310 3.338 19.555 2.168 L 18.446 3.832 C 19.691 4.662 20.313 5.663 20.645 7.321 C 20.842 8.309 20.930 9.495 20.969 10.976 C 20.139 10.363 19.112 10.000 18.000 10.000 C 16.222 10.000 14.662 10.928 13.776 12.325 C 13.223 12.115 12.625 12.000 12.000 12.000 C 11.375 12.000 10.777 12.115 10.224 12.325 C 9.338 10.928 7.778 10.000 6.000 10.000 C 4.888 10.000 3.861 10.363 3.031 10.976 Z"),
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
        return _glasses2Fill!!
    }

private var _glasses2Fill: ImageVector? = null
