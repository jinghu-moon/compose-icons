package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WaterPercentFill: ImageVector
    get() {
        if (_waterPercentFill != null) return _waterPercentFill!!
        _waterPercentFill = remixIcon(
            name = "WaterPercentFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 0.269 L 5.636 6.633 C 2.121 10.148 2.121 15.846 5.636 19.361 C 9.151 22.876 14.849 22.876 18.364 19.361 C 21.879 15.846 21.879 10.148 18.364 6.633 L 12.000 0.269 ZM 16.243 10.171 L 9.172 17.243 L 7.757 15.828 L 14.828 8.757 L 16.243 10.171 ZM 8.111 9.111 C 8.697 8.525 9.646 8.525 10.232 9.111 C 10.818 9.697 10.818 10.646 10.232 11.232 C 9.646 11.818 8.697 11.818 8.111 11.232 C 7.525 10.646 7.525 9.697 8.111 9.111 ZM 15.889 16.889 C 15.303 17.475 14.354 17.475 13.768 16.889 C 13.182 16.303 13.182 15.353 13.768 14.768 C 14.354 14.182 15.303 14.182 15.889 14.768 C 16.475 15.353 16.475 16.303 15.889 16.889 Z"),
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
        return _waterPercentFill!!
    }

private var _waterPercentFill: ImageVector? = null
