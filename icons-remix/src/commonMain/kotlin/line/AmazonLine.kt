package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AmazonLine: ImageVector
    get() {
        if (_amazonLine != null) return _amazonLine!!
        _amazonLine = remixIcon(
            name = "AmazonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.626 14.620 C 14.519 16.239 12.898 17.004 11.001 17.004 C 8.697 17.004 6.724 15.231 7.008 12.880 C 7.322 10.272 9.347 9.150 12.716 8.737 C 13.317 8.664 13.566 8.643 14.863 8.547 C 14.912 8.543 14.958 8.540 15.001 8.537 C 15.001 8.465 15.001 8.394 15.001 8.322 C 15.001 6.526 13.933 5.300 12.501 5.300 C 11.064 5.300 10.060 6.047 9.446 7.826 L 7.555 7.174 C 8.443 4.604 10.193 3.300 12.501 3.300 C 15.103 3.300 17.001 5.478 17.001 8.322 C 17.001 10.971 17.164 13.078 17.484 13.879 C 17.840 14.771 17.970 14.996 18.368 15.492 L 16.808 16.743 C 16.284 16.091 16.055 15.694 15.626 14.621 L 15.626 14.620 ZM 21.257 20.545 C 20.986 20.745 20.516 20.626 20.729 20.105 C 20.993 19.457 21.275 18.697 20.991 18.353 C 20.781 18.098 20.524 17.971 19.964 17.971 C 19.504 17.971 19.273 18.031 18.969 18.051 C 18.765 18.065 18.675 17.754 18.878 17.611 C 19.139 17.426 19.422 17.281 19.748 17.183 C 20.898 16.839 22.253 17.028 22.417 17.266 C 22.783 17.796 22.219 19.835 21.257 20.545 ZM 20.075 19.461 C 19.814 19.716 19.530 19.950 19.246 20.156 C 17.124 21.772 14.375 22.617 11.988 22.617 C 8.145 22.617 4.708 20.823 2.100 17.821 C 1.876 17.591 2.061 17.256 2.323 17.437 C 5.132 19.514 8.611 20.770 12.211 20.770 C 14.477 20.770 16.920 20.233 19.246 19.077 C 19.409 19.001 19.591 18.896 19.750 18.823 C 20.117 18.613 20.440 19.129 20.075 19.461 ZM 15.011 10.541 C 13.752 10.635 13.515 10.654 12.959 10.722 C 10.406 11.035 9.162 11.725 8.993 13.120 C 8.868 14.163 9.803 15.004 11.001 15.004 C 13.040 15.004 14.518 13.776 15.023 10.541 C 15.019 10.541 15.015 10.541 15.011 10.541 Z"),
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
        return _amazonLine!!
    }

private var _amazonLine: ImageVector? = null
