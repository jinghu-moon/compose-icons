package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AppsFill: ImageVector
    get() {
        if (_appsFill != null) return _appsFill!!
        _appsFill = remixIcon(
            name = "AppsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.750 2.500 C 9.097 2.500 11.000 4.403 11.000 6.750 L 11.000 11.000 L 6.750 11.000 C 4.403 11.000 2.500 9.097 2.500 6.750 C 2.500 4.403 4.403 2.500 6.750 2.500 ZM 6.750 13.000 L 11.000 13.000 L 11.000 17.250 C 11.000 19.597 9.097 21.500 6.750 21.500 C 4.403 21.500 2.500 19.597 2.500 17.250 C 2.500 14.903 4.403 13.000 6.750 13.000 ZM 17.250 2.500 C 19.597 2.500 21.500 4.403 21.500 6.750 C 21.500 9.097 19.597 11.000 17.250 11.000 L 13.000 11.000 L 13.000 6.750 C 13.000 4.403 14.903 2.500 17.250 2.500 ZM 13.000 13.000 L 17.250 13.000 C 19.597 13.000 21.500 14.903 21.500 17.250 C 21.500 19.597 19.597 21.500 17.250 21.500 C 14.903 21.500 13.000 19.597 13.000 17.250 L 13.000 13.000 Z"),
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
        return _appsFill!!
    }

private var _appsFill: ImageVector? = null
