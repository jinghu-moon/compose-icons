package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WebhookLine: ImageVector
    get() {
        if (_webhookLine != null) return _webhookLine!!
        _webhookLine = remixIcon(
            name = "WebhookLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.869 14.139 C 8.656 14.491 8.550 14.778 8.720 15.225 C 9.191 16.461 8.527 17.664 7.281 17.990 C 6.106 18.299 4.960 17.526 4.727 16.268 C 4.520 15.154 5.385 14.062 6.613 13.888 C 6.680 13.878 6.747 13.874 6.834 13.869 C 6.880 13.866 6.933 13.863 6.994 13.858 L 8.862 10.726 C 7.687 9.557 6.988 8.192 7.142 6.499 C 7.252 5.303 7.722 4.269 8.582 3.422 C 10.229 1.799 12.741 1.537 14.680 2.782 C 16.542 3.978 17.395 6.309 16.668 8.303 L 14.961 7.840 C 15.189 6.731 15.021 5.735 14.273 4.882 C 13.779 4.319 13.145 4.024 12.424 3.915 C 10.978 3.697 9.559 4.625 9.138 6.044 C 8.660 7.654 9.384 8.969 11.360 9.960 C 10.531 11.354 9.709 12.752 8.869 14.139 ZM 13.784 8.273 C 14.382 9.328 14.989 10.399 15.590 11.459 C 18.631 10.519 20.924 12.202 21.746 14.004 C 22.740 16.181 22.060 18.759 20.109 20.102 C 18.107 21.481 15.574 21.245 13.800 19.474 L 15.192 18.309 C 16.944 19.444 18.477 19.391 19.615 18.047 C 20.586 16.900 20.564 15.191 19.566 14.068 C 18.414 12.773 16.870 12.733 15.004 13.977 C 14.231 12.604 13.443 11.241 12.694 9.858 C 12.441 9.392 12.162 9.122 11.592 9.023 C 10.641 8.858 10.027 8.042 9.990 7.126 C 9.954 6.221 10.487 5.403 11.321 5.085 C 12.146 4.769 13.115 5.024 13.670 5.726 C 14.124 6.299 14.268 6.944 14.029 7.652 C 13.984 7.785 13.930 7.916 13.871 8.059 C 13.843 8.127 13.814 8.198 13.784 8.273 ZM 11.552 16.895 L 15.213 16.895 C 15.264 16.963 15.311 17.030 15.358 17.096 C 15.455 17.233 15.547 17.363 15.655 17.479 C 16.430 18.308 17.740 18.349 18.568 17.580 C 19.427 16.782 19.466 15.443 18.654 14.610 C 17.860 13.795 16.503 13.718 15.766 14.580 C 15.318 15.104 14.859 15.166 14.264 15.157 C 12.741 15.133 11.218 15.149 9.695 15.149 C 9.794 17.291 8.984 18.625 7.378 18.942 C 5.806 19.253 4.358 18.450 3.848 16.986 C 3.268 15.323 3.985 13.993 6.054 12.937 C 5.898 12.373 5.741 11.802 5.585 11.236 C 3.330 11.728 1.637 13.916 1.812 16.378 C 1.967 18.551 3.720 20.482 5.864 20.827 C 7.028 21.015 8.122 20.820 9.137 20.244 C 10.443 19.503 11.201 18.338 11.552 16.895 Z"),
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
        return _webhookLine!!
    }

private var _webhookLine: ImageVector? = null
