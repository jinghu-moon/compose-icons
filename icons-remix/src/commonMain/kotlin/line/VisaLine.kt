package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VisaLine: ImageVector
    get() {
        if (_visaLine != null) return _visaLine!!
        _visaLine = remixIcon(
            name = "VisaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.222 15.768 L 21.997 14.643 L 19.483 14.643 L 19.084 15.760 L 17.068 15.764 C 18.363 12.651 19.325 10.345 19.952 8.847 C 20.116 8.455 20.407 8.255 20.836 8.258 C 21.164 8.261 21.699 8.261 22.442 8.259 L 24.000 15.765 L 22.222 15.768 ZM 20.049 13.102 L 21.669 13.102 L 21.064 10.282 L 20.049 13.102 ZM 7.061 8.257 L 9.087 8.259 L 5.955 15.768 L 3.904 15.767 C 3.210 13.090 2.701 11.104 2.376 9.811 C 2.276 9.415 2.078 9.138 1.697 9.007 C 1.357 8.890 0.792 8.710 0.000 8.466 L 0.000 8.259 C 1.480 8.259 2.559 8.259 3.237 8.259 C 3.797 8.260 4.124 8.530 4.229 9.086 C 4.335 9.644 4.601 11.062 5.029 13.340 L 7.061 8.257 ZM 11.870 8.259 L 10.269 15.768 L 8.341 15.765 C 8.379 15.582 8.912 13.080 9.940 8.257 L 11.870 8.259 ZM 15.781 8.120 C 16.358 8.120 17.085 8.299 17.503 8.466 L 17.165 10.022 C 16.787 9.870 16.166 9.665 15.642 9.673 C 14.881 9.685 14.412 10.004 14.412 10.311 C 14.412 10.808 15.228 11.059 16.068 11.603 C 17.027 12.224 17.153 12.780 17.141 13.386 C 17.128 14.641 16.068 15.880 13.832 15.880 C 12.811 15.865 12.444 15.779 11.612 15.484 L 11.964 13.859 C 12.811 14.214 13.170 14.327 13.894 14.327 C 14.557 14.327 15.126 14.059 15.131 13.592 C 15.135 13.260 14.932 13.095 14.187 12.685 C 13.443 12.274 12.399 11.706 12.413 10.563 C 12.430 9.101 13.815 8.120 15.781 8.120 Z"),
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
        return _visaLine!!
    }

private var _visaLine: ImageVector? = null
