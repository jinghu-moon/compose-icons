package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SteamLine: ImageVector
    get() {
        if (_steamLine != null) return _steamLine!!
        _steamLine = remixIcon(
            name = "SteamLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.001 4.000 C 19.763 4.000 22.001 6.239 22.001 9.000 C 22.001 11.761 19.763 14.000 17.001 14.000 C 16.697 14.000 16.399 13.973 16.109 13.921 L 13.458 15.909 C 13.486 16.102 13.501 16.299 13.501 16.500 C 13.501 18.709 11.710 20.500 9.501 20.500 C 7.292 20.500 5.501 18.709 5.501 16.500 C 5.501 16.323 5.513 16.148 5.535 15.976 L 1.709 14.430 L 2.458 12.576 L 6.285 14.121 C 7.014 13.137 8.183 12.500 9.501 12.500 C 9.664 12.500 9.824 12.510 9.982 12.529 L 12.023 9.468 C 12.008 9.314 12.001 9.158 12.001 9.000 C 12.001 6.239 14.240 4.000 17.001 4.000 ZM 9.501 14.500 C 9.037 14.500 8.609 14.658 8.270 14.924 L 9.876 15.573 C 10.388 15.780 10.635 16.362 10.428 16.875 C 10.221 17.387 9.639 17.634 9.126 17.427 L 7.520 16.779 C 7.656 17.751 8.491 18.500 9.501 18.500 C 10.606 18.500 11.501 17.605 11.501 16.500 C 11.501 15.395 10.606 14.500 9.501 14.500 ZM 12.865 11.810 L 11.882 13.285 C 12.166 13.496 12.421 13.744 12.641 14.021 L 14.001 13.000 C 13.560 12.669 13.175 12.267 12.865 11.810 ZM 17.001 6.000 C 15.344 6.000 14.001 7.343 14.001 9.000 C 14.001 10.657 15.344 12.000 17.001 12.000 C 18.658 12.000 20.001 10.657 20.001 9.000 C 20.001 7.343 18.658 6.000 17.001 6.000 ZM 17.001 7.000 C 18.106 7.000 19.001 7.895 19.001 9.000 C 19.001 10.105 18.106 11.000 17.001 11.000 C 15.896 11.000 15.001 10.105 15.001 9.000 C 15.001 7.895 15.896 7.000 17.001 7.000 Z"),
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
        return _steamLine!!
    }

private var _steamLine: ImageVector? = null
