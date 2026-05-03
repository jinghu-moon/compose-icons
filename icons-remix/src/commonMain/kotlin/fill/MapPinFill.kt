package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MapPinFill: ImageVector
    get() {
        if (_mapPinFill != null) return _mapPinFill!!
        _mapPinFill = remixIcon(
            name = "MapPinFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.364 17.364 L 12.000 23.728 L 5.636 17.364 C 2.121 13.849 2.121 8.151 5.636 4.636 C 9.151 1.121 14.849 1.121 18.364 4.636 C 21.879 8.151 21.879 13.849 18.364 17.364 ZM 12.000 15.000 C 14.209 15.000 16.000 13.209 16.000 11.000 C 16.000 8.791 14.209 7.000 12.000 7.000 C 9.791 7.000 8.000 8.791 8.000 11.000 C 8.000 13.209 9.791 15.000 12.000 15.000 ZM 12.000 13.000 C 10.895 13.000 10.000 12.105 10.000 11.000 C 10.000 9.895 10.895 9.000 12.000 9.000 C 13.105 9.000 14.000 9.895 14.000 11.000 C 14.000 12.105 13.105 13.000 12.000 13.000 Z"),
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
        return _mapPinFill!!
    }

private var _mapPinFill: ImageVector? = null
