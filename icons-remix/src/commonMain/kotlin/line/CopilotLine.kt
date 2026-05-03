package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CopilotLine: ImageVector
    get() {
        if (_copilotLine != null) return _copilotLine!!
        _copilotLine = remixIcon(
            name = "CopilotLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.401 7.800 C 5.401 5.712 6.578 4.800 8.572 4.800 C 9.768 4.800 10.700 5.064 10.700 6.400 C 10.700 8.214 10.126 10.150 8.001 10.150 C 6.772 10.150 6.203 9.974 5.911 9.726 C 5.664 9.515 5.401 9.057 5.401 7.800 ZM 8.572 2.800 C 5.497 2.800 3.401 4.626 3.401 7.800 C 3.401 8.799 3.538 9.689 3.930 10.405 L 3.748 10.769 C 3.251 11.054 2.741 11.433 2.323 11.876 C 1.262 13.002 1.350 14.265 1.350 15.700 C 1.350 17.967 3.862 19.320 5.665 20.073 C 7.798 20.963 10.342 21.500 12.000 21.500 C 13.659 21.500 16.202 20.963 18.336 20.073 C 20.139 19.320 22.650 17.967 22.650 15.700 C 22.650 14.265 22.739 13.002 21.678 11.876 C 21.260 11.433 20.750 11.054 20.253 10.769 L 20.071 10.405 C 20.463 9.689 20.601 8.799 20.601 7.800 C 20.601 4.626 18.504 2.800 15.429 2.800 C 14.188 2.800 12.811 3.059 12.000 4.083 C 11.190 3.059 9.813 2.800 8.572 2.800 ZM 8.001 12.150 C 9.693 12.150 11.225 11.335 12.000 9.816 C 12.776 11.335 14.308 12.150 16.000 12.150 C 16.896 12.150 17.770 12.076 18.518 11.770 C 19.029 12.366 19.688 12.681 20.223 13.248 C 20.862 13.926 20.650 14.833 20.650 15.700 C 20.650 16.972 18.485 17.844 17.565 18.227 C 15.623 19.037 13.342 19.500 12.000 19.500 C 10.659 19.500 8.377 19.037 6.435 18.227 C 5.516 17.844 3.350 16.972 3.350 15.700 C 3.350 14.833 3.139 13.926 3.778 13.248 C 4.339 12.654 5.119 12.498 5.483 11.770 C 6.231 12.076 7.106 12.150 8.001 12.150 ZM 13.301 6.400 C 13.301 5.064 14.233 4.800 15.429 4.800 C 17.423 4.800 18.601 5.712 18.601 7.800 C 18.601 9.057 18.337 9.515 18.090 9.726 C 17.798 9.974 17.229 10.150 16.000 10.150 C 13.875 10.150 13.301 8.214 13.301 6.400 ZM 8.663 14.484 C 8.663 13.931 9.111 13.483 9.664 13.483 C 10.217 13.483 10.665 13.931 10.665 14.484 L 10.665 16.481 C 10.665 17.034 10.217 17.482 9.664 17.482 C 9.111 17.482 8.663 17.034 8.663 16.481 L 8.663 14.484 ZM 15.338 14.484 C 15.338 13.931 14.889 13.483 14.337 13.483 C 13.783 13.483 13.335 13.931 13.335 14.484 L 13.335 16.481 C 13.335 17.034 13.783 17.482 14.337 17.482 C 14.889 17.482 15.338 17.034 15.338 16.481 L 15.338 14.484 Z"),
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
        return _copilotLine!!
    }

private var _copilotLine: ImageVector? = null
