package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.XboxFill: ImageVector
    get() {
        if (_xboxFill != null) return _xboxFill!!
        _xboxFill = remixIcon(
            name = "XboxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.419 19.528 C 7.177 21.067 9.482 22.000 12.001 22.000 C 14.523 22.000 16.825 21.067 18.586 19.528 C 20.150 17.934 14.989 12.270 12.001 10.013 C 9.016 12.270 3.852 17.934 5.419 19.528 ZM 14.719 7.523 C 16.803 9.990 20.956 16.117 19.783 18.282 C 21.169 16.567 22.001 14.384 22.001 12.003 C 22.001 9.220 20.864 6.702 19.026 4.890 C 19.026 4.890 19.003 4.872 18.958 4.855 C 18.905 4.837 18.831 4.818 18.723 4.818 C 18.230 4.818 17.069 5.179 14.719 7.523 ZM 5.046 4.855 C 4.998 4.872 4.978 4.889 4.974 4.890 C 3.138 6.702 2.001 9.220 2.001 12.003 C 2.001 14.382 2.833 16.564 4.218 18.281 C 3.051 16.110 7.201 9.988 9.285 7.523 C 6.935 5.178 5.772 4.818 5.280 4.818 C 5.171 4.818 5.094 4.836 5.046 4.857 L 5.046 4.855 ZM 12.001 4.959 C 12.001 4.959 9.547 3.523 7.630 3.455 C 6.878 3.428 6.418 3.701 6.363 3.737 C 8.150 2.538 10.050 2.000 11.988 2.000 L 12.001 2.000 C 13.946 2.000 15.839 2.538 17.639 3.737 C 17.583 3.699 17.127 3.428 16.373 3.455 C 14.456 3.523 12.001 4.954 12.001 4.954 L 12.001 4.959 Z"),
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
        return _xboxFill!!
    }

private var _xboxFill: ImageVector? = null
