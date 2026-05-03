package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WechatChannelsFill: ImageVector
    get() {
        if (_wechatChannelsFill != null) return _wechatChannelsFill!!
        _wechatChannelsFill = remixIcon(
            name = "WechatChannelsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.194 3.181 C 20.355 2.711 21.349 3.162 21.866 4.458 C 23.259 7.944 19.999 21.133 17.441 21.133 C 16.613 21.133 15.784 20.445 14.817 19.207 C 14.382 18.649 13.927 17.984 13.460 17.233 C 13.086 16.633 12.718 16.001 12.365 15.363 L 12.000 14.690 L 11.983 14.722 C 11.526 15.577 11.038 16.433 10.540 17.233 C 10.073 17.984 9.618 18.649 9.182 19.207 C 8.216 20.445 7.387 21.133 6.559 21.133 C 4.001 21.133 0.740 7.944 2.133 4.458 C 2.651 3.162 3.644 2.711 4.806 3.181 C 5.648 3.522 6.578 4.337 7.617 5.557 C 8.235 6.283 8.882 7.143 9.547 8.110 C 10.284 9.181 11.006 10.325 11.684 11.470 L 12.000 12.009 L 12.316 11.470 C 12.858 10.554 13.428 9.639 14.012 8.761 L 14.452 8.110 C 15.118 7.143 15.765 6.283 16.383 5.557 C 17.422 4.337 18.351 3.522 19.194 3.181 ZM 4.324 4.353 C 3.834 4.154 3.581 4.269 3.319 4.924 C 2.862 6.068 3.054 8.951 3.732 12.187 L 3.890 12.911 L 4.064 13.644 C 4.920 17.105 6.151 19.868 6.559 19.868 C 6.838 19.868 7.448 19.362 8.174 18.432 C 8.579 17.914 9.009 17.284 9.455 16.569 C 9.816 15.988 10.173 15.375 10.517 14.753 L 10.932 13.986 L 11.280 13.315 L 10.916 12.677 L 10.584 12.111 C 9.920 10.989 9.213 9.868 8.494 8.824 C 7.851 7.890 7.229 7.063 6.642 6.373 C 5.726 5.297 4.926 4.596 4.324 4.353 ZM 20.680 4.924 C 20.419 4.269 20.166 4.154 19.676 4.353 C 19.073 4.596 18.274 5.297 17.358 6.373 C 16.770 7.063 16.149 7.890 15.506 8.824 C 14.931 9.659 14.363 10.544 13.819 11.438 L 13.245 12.400 L 12.718 13.315 L 12.899 13.665 L 13.144 14.130 C 13.589 14.962 14.063 15.794 14.545 16.569 C 14.991 17.284 15.421 17.914 15.826 18.432 C 16.552 19.362 17.161 19.868 17.441 19.868 C 17.849 19.868 19.080 17.105 19.935 13.644 L 20.109 12.911 C 20.914 9.388 21.171 6.153 20.680 4.924 Z"),
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
        return _wechatChannelsFill!!
    }

private var _wechatChannelsFill: ImageVector? = null
