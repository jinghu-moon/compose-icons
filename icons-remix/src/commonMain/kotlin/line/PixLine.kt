package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PixLine: ImageVector
    get() {
        if (_pixLine != null) return _pixLine!!
        _pixLine = remixIcon(
            name = "PixLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.473 1.745 L 22.251 9.523 C 23.618 10.890 23.618 13.106 22.251 14.473 L 14.473 22.251 C 13.106 23.618 10.890 23.618 9.523 22.251 L 1.745 14.473 C 0.378 13.106 0.378 10.890 1.745 9.523 L 9.523 1.745 C 10.890 0.378 13.106 0.378 14.473 1.745 ZM 11.998 14.827 L 9.523 17.302 C 9.143 17.681 8.698 17.955 8.224 18.124 L 10.937 20.837 C 11.523 21.423 12.473 21.423 13.059 20.837 L 15.772 18.124 C 15.297 17.955 14.852 17.681 14.473 17.302 L 11.998 14.827 ZM 5.988 8.108 L 3.159 10.938 C 2.573 11.523 2.573 12.473 3.159 13.059 L 5.988 15.887 C 6.573 16.473 7.523 16.473 8.109 15.887 L 10.584 13.412 C 11.365 12.631 12.631 12.631 13.412 13.412 L 15.887 15.887 C 16.473 16.473 17.422 16.473 18.008 15.887 L 20.837 13.059 C 21.423 12.473 21.423 11.523 20.837 10.938 L 18.008 8.109 C 17.423 7.524 16.472 7.524 15.887 8.109 L 13.412 10.584 C 12.631 11.365 11.365 11.365 10.584 10.584 L 8.109 8.109 C 7.523 7.524 6.574 7.523 5.988 8.108 ZM 10.937 3.159 L 8.224 5.872 C 8.698 6.041 9.143 6.315 9.523 6.695 L 11.998 9.170 L 14.473 6.695 C 14.852 6.315 15.297 6.041 15.772 5.872 L 13.059 3.159 C 12.473 2.574 11.523 2.574 10.937 3.159 Z"),
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
        return _pixLine!!
    }

private var _pixLine: ImageVector? = null
