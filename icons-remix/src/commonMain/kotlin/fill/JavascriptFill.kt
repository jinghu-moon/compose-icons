package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.JavascriptFill: ImageVector
    get() {
        if (_javascriptFill != null) return _javascriptFill!!
        _javascriptFill = remixIcon(
            name = "JavascriptFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 3.000 C 4.343 3.000 3.000 4.343 3.000 6.000 L 3.000 18.000 C 3.000 19.657 4.343 21.000 6.000 21.000 L 18.000 21.000 C 19.657 21.000 21.000 19.657 21.000 18.000 L 21.000 6.000 C 21.000 4.343 19.657 3.000 18.000 3.000 L 6.000 3.000 ZM 13.334 16.055 C 14.053 16.634 14.772 16.920 15.490 16.913 C 15.930 16.913 16.268 16.832 16.502 16.671 C 16.730 16.517 16.843 16.297 16.843 16.011 C 16.843 15.718 16.730 15.468 16.502 15.263 C 16.268 15.058 15.824 14.852 15.171 14.647 C 14.387 14.420 13.782 14.126 13.356 13.767 C 12.938 13.408 12.726 12.905 12.718 12.260 C 12.718 11.651 12.982 11.142 13.510 10.731 C 14.024 10.320 14.680 10.115 15.479 10.115 C 16.594 10.115 17.489 10.386 18.163 10.929 L 17.393 12.128 C 17.122 11.915 16.810 11.761 16.458 11.666 C 16.106 11.556 15.791 11.501 15.512 11.501 C 15.131 11.501 14.827 11.571 14.599 11.710 C 14.372 11.849 14.258 12.033 14.258 12.260 C 14.258 12.509 14.398 12.722 14.676 12.898 C 14.955 13.067 15.432 13.254 16.106 13.459 C 16.920 13.701 17.500 14.024 17.844 14.427 C 18.189 14.830 18.361 15.344 18.361 15.967 C 18.361 16.605 18.116 17.155 17.624 17.617 C 17.140 18.072 16.436 18.310 15.512 18.332 C 14.302 18.332 13.290 17.969 12.476 17.243 L 13.334 16.055 ZM 7.804 16.693 C 8.039 16.840 8.321 16.913 8.651 16.913 C 8.996 16.913 9.282 16.814 9.509 16.616 C 9.736 16.411 9.850 16.055 9.850 15.549 L 9.850 10.247 L 11.335 10.247 L 11.335 15.835 C 11.313 16.700 11.064 17.324 10.587 17.705 C 10.316 17.932 10.019 18.094 9.696 18.189 C 9.373 18.284 9.062 18.332 8.761 18.332 C 8.211 18.332 7.723 18.237 7.298 18.046 C 6.843 17.841 6.462 17.478 6.154 16.957 L 7.188 16.110 C 7.379 16.367 7.584 16.561 7.804 16.693 Z"),
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
        return _javascriptFill!!
    }

private var _javascriptFill: ImageVector? = null
