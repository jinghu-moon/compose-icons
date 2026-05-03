package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TaobaoFill: ImageVector
    get() {
        if (_taobaoFill != null) return _taobaoFill!!
        _taobaoFill = remixIcon(
            name = "TaobaoFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.576 8.277 L 2.383 10.119 L 4.584 11.490 C 4.584 11.490 6.048 12.244 5.346 13.659 C 4.697 14.997 1.500 17.928 1.500 17.928 L 4.362 19.726 C 6.346 15.401 6.213 15.977 6.709 14.421 C 7.221 12.840 7.334 11.627 6.467 10.744 C 5.354 9.619 5.229 9.514 3.576 8.277 ZM 5.141 7.583 C 6.181 7.583 7.023 6.825 7.023 5.890 C 7.023 4.947 6.181 4.189 5.141 4.189 C 4.092 4.189 3.254 4.951 3.254 5.890 C 3.258 6.821 4.092 7.583 5.141 7.583 ZM 22.146 7.793 C 22.146 7.793 21.521 2.923 10.938 5.938 C 11.394 5.144 11.607 4.632 11.607 4.632 L 8.966 3.882 C 8.966 3.882 7.898 7.390 5.995 9.023 C 5.995 9.023 7.842 10.095 7.822 10.063 C 8.350 9.531 8.825 8.990 9.229 8.466 C 9.652 8.277 10.059 8.103 10.454 7.942 C 9.962 8.829 9.176 10.160 8.386 10.998 L 9.499 11.982 C 9.499 11.982 10.261 11.244 11.087 10.361 L 12.031 10.361 L 12.031 11.998 L 8.346 11.998 L 8.346 13.304 L 12.031 13.304 L 12.031 16.437 L 11.889 16.433 C 11.482 16.413 10.853 16.344 10.603 15.949 C 10.305 15.465 10.527 14.590 10.539 14.046 L 7.995 14.046 L 7.902 14.098 C 7.902 14.098 6.967 18.303 10.591 18.211 C 13.978 18.303 15.921 17.255 16.856 16.533 L 17.227 17.928 L 19.316 17.045 L 17.900 13.562 L 16.207 14.098 L 16.522 15.288 C 16.094 15.618 15.590 15.860 15.054 16.042 L 15.054 13.304 L 18.646 13.304 L 18.646 11.994 L 15.054 11.994 L 15.054 10.357 L 18.658 10.357 L 18.658 9.051 L 12.248 9.051 C 12.712 8.482 13.071 7.962 13.167 7.636 L 12.047 7.329 C 16.844 5.596 19.517 5.894 19.497 8.732 L 19.497 16.207 C 19.497 16.207 19.779 18.771 16.860 18.590 L 15.280 18.247 L 14.913 19.759 C 14.913 19.759 21.730 21.726 22.287 16.445 C 22.839 11.163 22.146 7.793 22.146 7.793 Z"),
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
        return _taobaoFill!!
    }

private var _taobaoFill: ImageVector? = null
