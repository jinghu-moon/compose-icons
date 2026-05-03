package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.JavascriptLine: ImageVector
    get() {
        if (_javascriptLine != null) return _javascriptLine!!
        _javascriptLine = remixIcon(
            name = "JavascriptLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.334 16.055 L 12.476 17.243 C 13.290 17.969 14.302 18.332 15.512 18.332 C 16.436 18.310 17.140 18.072 17.624 17.617 C 18.116 17.155 18.361 16.605 18.361 15.967 C 18.361 15.344 18.189 14.830 17.844 14.427 C 17.500 14.024 16.920 13.701 16.106 13.459 C 15.432 13.254 14.955 13.067 14.676 12.898 C 14.398 12.722 14.258 12.509 14.258 12.260 C 14.258 12.033 14.372 11.849 14.599 11.710 C 14.827 11.571 15.131 11.501 15.512 11.501 C 15.791 11.501 16.106 11.556 16.458 11.666 C 16.810 11.761 17.122 11.915 17.393 12.128 L 18.163 10.929 C 17.489 10.386 16.594 10.115 15.479 10.115 C 14.680 10.115 14.024 10.320 13.510 10.731 C 12.982 11.142 12.718 11.651 12.718 12.260 C 12.726 12.905 12.938 13.408 13.356 13.767 C 13.782 14.126 14.387 14.420 15.171 14.647 C 15.824 14.852 16.268 15.058 16.502 15.263 C 16.730 15.468 16.843 15.718 16.843 16.011 C 16.843 16.297 16.730 16.517 16.502 16.671 C 16.268 16.832 15.930 16.913 15.490 16.913 C 14.772 16.920 14.053 16.634 13.334 16.055 ZM 7.804 16.693 C 7.584 16.561 7.379 16.367 7.188 16.110 L 6.154 16.957 C 6.462 17.478 6.843 17.841 7.298 18.046 C 7.723 18.237 8.211 18.332 8.761 18.332 C 9.062 18.332 9.373 18.284 9.696 18.189 C 10.019 18.094 10.316 17.932 10.587 17.705 C 11.064 17.324 11.313 16.700 11.335 15.835 L 11.335 10.247 L 9.850 10.247 L 9.850 15.549 C 9.850 16.055 9.736 16.411 9.509 16.616 C 9.282 16.814 8.996 16.913 8.651 16.913 C 8.321 16.913 8.039 16.840 7.804 16.693 ZM 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 L 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000 L 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 6.000 ZM 6.000 5.000 C 5.448 5.000 5.000 5.448 5.000 6.000 L 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 L 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 L 19.000 6.000 C 19.000 5.448 18.552 5.000 18.000 5.000 L 6.000 5.000 Z"),
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
        return _javascriptLine!!
    }

private var _javascriptLine: ImageVector? = null
