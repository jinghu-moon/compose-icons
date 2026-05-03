package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ChatSettingsLine: ImageVector
    get() {
        if (_chatSettingsLine != null) return _chatSettingsLine!!
        _chatSettingsLine = remixIcon(
            name = "ChatSettingsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 12.000 L 20.000 12.000 L 20.000 5.000 L 4.000 5.000 L 4.000 18.385 L 5.763 17.000 L 12.000 17.000 L 12.000 19.000 L 6.455 19.000 L 2.000 22.500 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 12.000 ZM 14.145 19.071 C 14.050 18.730 14.000 18.371 14.000 18.000 C 14.000 17.629 14.050 17.270 14.145 16.929 L 13.170 16.366 L 14.170 14.634 L 15.146 15.198 C 15.648 14.687 16.285 14.310 17.000 14.126 L 17.000 13.000 L 19.000 13.000 L 19.000 14.126 C 19.715 14.310 20.353 14.687 20.854 15.198 L 21.830 14.634 L 22.830 16.366 L 21.855 16.929 C 21.949 17.270 22.000 17.629 22.000 18.000 C 22.000 18.371 21.949 18.730 21.855 19.071 L 22.830 19.634 L 21.830 21.366 L 20.854 20.802 C 20.353 21.313 19.715 21.690 19.000 21.874 L 19.000 23.000 L 17.000 23.000 L 17.000 21.874 C 16.285 21.690 15.648 21.313 15.146 20.802 L 14.170 21.366 L 13.170 19.634 L 14.145 19.071 ZM 18.000 20.000 C 19.105 20.000 20.000 19.105 20.000 18.000 C 20.000 16.895 19.105 16.000 18.000 16.000 C 16.895 16.000 16.000 16.895 16.000 18.000 C 16.000 19.105 16.895 20.000 18.000 20.000 Z"),
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
        return _chatSettingsLine!!
    }

private var _chatSettingsLine: ImageVector? = null
