package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ListSettingsFill: ImageVector
    get() {
        if (_listSettingsFill != null) return _listSettingsFill!!
        _listSettingsFill = remixIcon(
            name = "ListSettingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 18.000 L 9.000 18.000 L 9.000 20.000 L 2.000 20.000 L 2.000 18.000 ZM 2.000 11.000 L 11.000 11.000 L 11.000 13.000 L 2.000 13.000 L 2.000 11.000 ZM 2.000 4.000 L 22.000 4.000 L 22.000 6.000 L 2.000 6.000 L 2.000 4.000 ZM 20.674 13.025 L 21.830 12.634 L 22.830 14.366 L 21.914 15.171 C 21.970 15.439 22.000 15.716 22.000 16.000 C 22.000 16.284 21.970 16.561 21.914 16.829 L 22.830 17.634 L 21.830 19.366 L 20.674 18.975 C 20.264 19.344 19.776 19.629 19.239 19.804 L 19.000 21.000 L 17.000 21.000 L 16.761 19.804 C 16.224 19.629 15.736 19.344 15.326 18.975 L 14.170 19.366 L 13.170 17.634 L 14.086 16.829 C 14.030 16.561 14.000 16.284 14.000 16.000 C 14.000 15.716 14.030 15.439 14.086 15.171 L 13.170 14.366 L 14.170 12.634 L 15.326 13.025 C 15.736 12.656 16.224 12.370 16.761 12.196 L 17.000 11.000 L 19.000 11.000 L 19.239 12.196 C 19.776 12.370 20.264 12.656 20.674 13.025 ZM 18.000 17.000 C 18.552 17.000 19.000 16.552 19.000 16.000 C 19.000 15.448 18.552 15.000 18.000 15.000 C 17.448 15.000 17.000 15.448 17.000 16.000 C 17.000 16.552 17.448 17.000 18.000 17.000 Z"),
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
        return _listSettingsFill!!
    }

private var _listSettingsFill: ImageVector? = null
