package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ListSettingsLine: ImageVector
    get() {
        if (_listSettingsLine != null) return _listSettingsLine!!
        _listSettingsLine = remixIcon(
            name = "ListSettingsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 18.000 L 9.000 18.000 L 9.000 20.000 L 2.000 20.000 L 2.000 18.000 ZM 2.000 11.000 L 11.000 11.000 L 11.000 13.000 L 2.000 13.000 L 2.000 11.000 ZM 2.000 4.000 L 22.000 4.000 L 22.000 6.000 L 2.000 6.000 L 2.000 4.000 ZM 20.674 13.025 L 21.830 12.634 L 22.830 14.366 L 21.914 15.171 C 21.970 15.439 22.000 15.716 22.000 16.000 C 22.000 16.284 21.970 16.561 21.914 16.829 L 22.830 17.634 L 21.830 19.366 L 20.674 18.975 C 20.264 19.344 19.776 19.629 19.239 19.804 L 19.000 21.000 L 17.000 21.000 L 16.761 19.804 C 16.224 19.629 15.736 19.344 15.326 18.975 L 14.170 19.366 L 13.170 17.634 L 14.086 16.829 C 14.030 16.561 14.000 16.284 14.000 16.000 C 14.000 15.716 14.030 15.439 14.086 15.171 L 13.170 14.366 L 14.170 12.634 L 15.326 13.025 C 15.736 12.656 16.224 12.370 16.761 12.196 L 17.000 11.000 L 19.000 11.000 L 19.239 12.196 C 19.776 12.370 20.264 12.656 20.674 13.025 ZM 18.000 18.000 C 19.105 18.000 20.000 17.105 20.000 16.000 C 20.000 14.895 19.105 14.000 18.000 14.000 C 16.895 14.000 16.000 14.895 16.000 16.000 C 16.000 17.105 16.895 18.000 18.000 18.000 Z"),
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
        return _listSettingsLine!!
    }

private var _listSettingsLine: ImageVector? = null
