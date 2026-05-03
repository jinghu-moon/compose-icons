package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MapPinUserFill: ImageVector
    get() {
        if (_mapPinUserFill != null) return _mapPinUserFill!!
        _mapPinUserFill = remixIcon(
            name = "MapPinUserFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.084 15.812 C 19.683 13.069 19.638 8.738 16.950 6.050 C 14.216 3.317 9.784 3.317 7.050 6.050 C 4.362 8.738 4.317 13.069 6.916 15.812 C 7.978 14.123 9.858 13.000 12.000 13.000 C 14.142 13.000 16.022 14.123 17.084 15.812 ZM 12.000 23.728 L 5.636 17.364 C 2.121 13.849 2.121 8.151 5.636 4.636 C 9.151 1.121 14.849 1.121 18.364 4.636 C 21.879 8.151 21.879 13.849 18.364 17.364 L 12.000 23.728 ZM 12.000 12.000 C 10.343 12.000 9.000 10.657 9.000 9.000 C 9.000 7.343 10.343 6.000 12.000 6.000 C 13.657 6.000 15.000 7.343 15.000 9.000 C 15.000 10.657 13.657 12.000 12.000 12.000 Z"),
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
        return _mapPinUserFill!!
    }

private var _mapPinUserFill: ImageVector? = null
