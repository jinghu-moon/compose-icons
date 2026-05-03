package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ChatSettingsFill: ImageVector
    get() {
        if (_chatSettingsFill != null) return _chatSettingsFill!!
        _chatSettingsFill = remixIcon(
            name = "ChatSettingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 6.455 19.000 ZM 8.145 12.071 L 7.170 12.634 L 8.170 14.366 L 9.146 13.802 C 9.647 14.313 10.285 14.690 11.000 14.874 L 11.000 16.000 L 13.000 16.000 L 13.000 14.874 C 13.715 14.690 14.352 14.313 14.854 13.802 L 15.830 14.366 L 16.830 12.634 L 15.855 12.071 C 15.950 11.730 16.000 11.371 16.000 11.000 C 16.000 10.629 15.950 10.270 15.855 9.929 L 16.830 9.366 L 15.830 7.634 L 14.854 8.197 C 14.352 7.687 13.715 7.310 13.000 7.126 L 13.000 6.000 L 11.000 6.000 L 11.000 7.126 C 10.285 7.310 9.647 7.687 9.146 8.197 L 8.170 7.634 L 7.170 9.366 L 8.145 9.929 C 8.050 10.270 8.000 10.629 8.000 11.000 C 8.000 11.371 8.050 11.730 8.145 12.071 ZM 12.000 13.000 C 10.895 13.000 10.000 12.105 10.000 11.000 C 10.000 9.895 10.895 9.000 12.000 9.000 C 13.105 9.000 14.000 9.895 14.000 11.000 C 14.000 12.105 13.105 13.000 12.000 13.000 Z"),
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
        return _chatSettingsFill!!
    }

private var _chatSettingsFill: ImageVector? = null
