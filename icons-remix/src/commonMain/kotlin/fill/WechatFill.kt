package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WechatFill: ImageVector
    get() {
        if (_wechatFill != null) return _wechatFill!!
        _wechatFill = remixIcon(
            name = "WechatFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.575 13.711 C 19.074 13.711 19.473 13.287 19.473 12.813 C 19.473 12.314 19.074 11.915 18.575 11.915 C 18.076 11.915 17.677 12.314 17.677 12.813 C 17.677 13.312 18.076 13.711 18.575 13.711 ZM 14.150 13.711 C 14.649 13.711 15.048 13.287 15.048 12.813 C 15.048 12.314 14.649 11.915 14.150 11.915 C 13.651 11.915 13.252 12.314 13.252 12.813 C 13.252 13.312 13.651 13.711 14.150 13.711 ZM 20.717 18.752 C 20.594 18.825 20.521 18.948 20.545 19.120 C 20.545 19.169 20.545 19.219 20.570 19.268 C 20.668 19.685 20.864 20.349 20.864 20.374 C 20.864 20.447 20.889 20.496 20.889 20.546 C 20.889 20.669 20.791 20.767 20.668 20.767 C 20.619 20.767 20.594 20.742 20.545 20.718 L 19.096 19.882 C 18.998 19.833 18.875 19.784 18.752 19.784 C 18.679 19.784 18.605 19.784 18.556 19.808 C 17.868 20.005 17.156 20.103 16.395 20.103 C 12.735 20.103 9.788 17.646 9.788 14.598 C 9.788 11.551 12.735 9.093 16.395 9.093 C 20.054 9.093 23.001 11.551 23.001 14.598 C 23.001 16.245 22.117 17.744 20.717 18.752 ZM 16.674 8.098 C 16.581 8.095 16.488 8.093 16.395 8.093 C 12.220 8.093 8.788 10.954 8.788 14.598 C 8.788 15.152 8.867 15.687 9.016 16.198 L 8.927 16.198 C 8.041 16.198 7.155 16.050 6.343 15.830 C 6.269 15.805 6.195 15.805 6.121 15.805 C 5.973 15.805 5.826 15.854 5.702 15.928 L 3.955 16.933 C 3.906 16.958 3.856 16.983 3.807 16.983 C 3.659 16.983 3.536 16.860 3.536 16.713 C 3.536 16.639 3.561 16.590 3.586 16.516 C 3.610 16.492 3.832 15.682 3.955 15.192 C 3.955 15.143 3.979 15.069 3.979 15.020 C 3.979 14.824 3.881 14.677 3.758 14.578 C 2.059 13.377 1.001 11.586 1.001 9.599 C 1.001 5.944 4.570 3.000 8.952 3.000 C 12.716 3.000 15.880 5.169 16.674 8.098 ZM 11.520 8.516 C 12.093 8.516 12.546 8.039 12.546 7.490 C 12.546 6.917 12.093 6.464 11.520 6.464 C 10.947 6.464 10.494 6.917 10.494 7.490 C 10.494 8.063 10.947 8.516 11.520 8.516 ZM 6.260 8.516 C 6.833 8.516 7.287 8.039 7.287 7.490 C 7.287 6.917 6.833 6.464 6.260 6.464 C 5.688 6.464 5.234 6.917 5.234 7.490 C 5.234 8.063 5.688 8.516 6.260 8.516 Z"),
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
        return _wechatFill!!
    }

private var _wechatFill: ImageVector? = null
