package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.KakaoTalkFill: ImageVector
    get() {
        if (_kakaoTalkFill != null) return _kakaoTalkFill!!
        _kakaoTalkFill = remixIcon(
            name = "KakaoTalkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.001 3.000 C 17.800 3.000 22.501 6.664 22.501 11.185 C 22.501 15.705 17.800 19.369 12.001 19.369 C 11.413 19.369 10.836 19.331 10.274 19.259 L 5.866 22.142 C 5.365 22.407 5.188 22.378 5.394 21.729 L 6.286 18.051 C 3.406 16.592 1.501 14.062 1.501 11.185 C 1.501 6.664 6.202 3.000 12.001 3.000 ZM 17.908 11.059 L 19.378 9.636 C 19.566 9.455 19.570 9.156 19.389 8.969 C 19.208 8.782 18.909 8.777 18.722 8.958 L 16.794 10.824 L 16.794 9.282 C 16.794 9.022 16.583 8.810 16.322 8.810 C 16.061 8.810 15.850 9.022 15.850 9.282 L 15.850 11.839 C 15.832 11.912 15.833 11.988 15.850 12.061 L 15.850 13.500 C 15.850 13.761 16.061 13.972 16.322 13.972 C 16.583 13.972 16.794 13.761 16.794 13.500 L 16.794 12.137 L 17.221 11.724 L 18.649 13.757 C 18.741 13.887 18.887 13.957 19.036 13.957 C 19.129 13.957 19.224 13.929 19.307 13.871 C 19.520 13.722 19.571 13.427 19.421 13.214 L 17.908 11.059 ZM 14.950 12.984 L 13.490 12.984 L 13.490 9.297 C 13.490 9.036 13.279 8.825 13.018 8.825 C 12.758 8.825 12.547 9.036 12.547 9.297 L 12.547 13.456 C 12.547 13.716 12.758 13.928 13.018 13.928 L 14.950 13.928 C 15.211 13.928 15.422 13.716 15.422 13.456 C 15.422 13.195 15.211 12.984 14.950 12.984 ZM 9.093 11.892 L 9.789 10.185 L 10.427 11.892 L 9.093 11.892 ZM 11.616 12.380 C 11.616 12.375 11.618 12.370 11.618 12.365 C 11.618 12.241 11.569 12.129 11.491 12.045 L 10.445 9.244 C 10.347 8.964 10.101 8.778 9.818 8.770 C 9.539 8.763 9.281 8.937 9.165 9.217 L 7.503 13.292 C 7.405 13.534 7.521 13.809 7.762 13.908 C 8.004 14.006 8.279 13.890 8.377 13.649 L 8.709 12.836 L 10.779 12.836 L 11.077 13.636 C 11.148 13.825 11.328 13.943 11.519 13.943 C 11.574 13.943 11.630 13.933 11.684 13.913 C 11.928 13.822 12.052 13.550 11.961 13.305 L 11.616 12.380 ZM 8.294 9.302 C 8.294 9.041 8.083 8.830 7.823 8.830 L 4.578 8.830 C 4.318 8.830 4.106 9.041 4.106 9.302 C 4.106 9.562 4.318 9.774 4.578 9.774 L 5.738 9.774 L 5.738 13.510 C 5.738 13.771 5.950 13.982 6.210 13.982 C 6.471 13.982 6.682 13.771 6.682 13.510 L 6.682 9.774 L 7.823 9.774 C 8.083 9.774 8.294 9.562 8.294 9.302 Z"),
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
        return _kakaoTalkFill!!
    }

private var _kakaoTalkFill: ImageVector? = null
