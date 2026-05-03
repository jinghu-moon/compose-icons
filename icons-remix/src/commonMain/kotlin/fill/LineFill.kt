package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.LineFill: ImageVector
    get() {
        if (_lineFill != null) return _lineFill!!
        _lineFill = remixIcon(
            name = "LineFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.663 10.840 C 18.663 11.128 18.429 11.365 18.139 11.365 L 16.676 11.365 L 16.676 12.303 L 18.139 12.303 C 18.429 12.303 18.663 12.539 18.663 12.828 C 18.663 13.115 18.429 13.352 18.139 13.352 L 16.150 13.352 C 15.863 13.352 15.628 13.115 15.628 12.828 L 15.628 8.852 C 15.628 8.565 15.863 8.327 16.153 8.327 L 18.141 8.327 C 18.429 8.327 18.663 8.565 18.663 8.852 C 18.663 9.143 18.429 9.377 18.139 9.377 L 16.676 9.377 L 16.676 10.314 L 18.139 10.314 C 18.429 10.314 18.663 10.552 18.663 10.840 ZM 14.566 13.325 C 14.513 13.342 14.455 13.350 14.400 13.350 C 14.224 13.350 14.074 13.275 13.975 13.142 L 11.939 10.378 L 11.939 12.828 C 11.939 13.115 11.707 13.352 11.413 13.352 C 11.125 13.352 10.892 13.115 10.892 12.828 L 10.892 8.852 C 10.892 8.627 11.036 8.427 11.250 8.356 C 11.300 8.337 11.363 8.329 11.412 8.329 C 11.574 8.329 11.724 8.415 11.824 8.540 L 13.876 11.315 L 13.876 8.852 C 13.876 8.565 14.111 8.327 14.401 8.327 C 14.689 8.327 14.926 8.565 14.926 8.852 L 14.926 12.828 C 14.926 13.053 14.781 13.253 14.566 13.325 ZM 9.616 13.352 C 9.328 13.352 9.093 13.115 9.093 12.828 L 9.093 8.852 C 9.093 8.565 9.328 8.327 9.618 8.327 C 9.907 8.327 10.142 8.565 10.142 8.852 L 10.142 12.828 C 10.142 13.115 9.907 13.352 9.616 13.352 ZM 8.087 13.352 L 6.098 13.352 C 5.811 13.352 5.573 13.115 5.573 12.828 L 5.573 8.852 C 5.573 8.565 5.811 8.327 6.098 8.327 C 6.388 8.327 6.623 8.565 6.623 8.852 L 6.623 12.303 L 8.087 12.303 C 8.377 12.303 8.611 12.539 8.611 12.828 C 8.611 13.115 8.376 13.352 8.087 13.352 ZM 12.001 2.572 C 6.488 2.572 2.001 6.215 2.001 10.690 C 2.001 14.700 5.559 18.059 10.363 18.697 C 10.689 18.765 11.133 18.912 11.245 19.189 C 11.345 19.440 11.311 19.827 11.277 20.089 L 11.140 20.939 C 11.103 21.190 10.940 21.927 12.014 21.476 C 13.090 21.027 17.778 18.078 19.878 15.664 C 21.314 14.090 22.001 12.477 22.001 10.690 C 22.001 6.215 17.514 2.572 12.001 2.572 Z"),
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
        return _lineFill!!
    }

private var _lineFill: ImageVector? = null
