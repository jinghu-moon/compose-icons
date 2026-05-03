package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TyphoonLine: ImageVector
    get() {
        if (_typhoonLine != null) return _typhoonLine!!
        _typhoonLine = remixIcon(
            name = "TyphoonLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.654 1.700 L 14.872 4.233 C 16.147 4.623 17.345 5.281 18.361 6.206 C 21.874 9.406 21.874 14.594 18.361 17.794 C 15.770 20.154 11.764 21.656 6.346 22.300 L 9.128 19.767 C 7.853 19.377 6.655 18.719 5.639 17.794 C 2.126 14.594 2.105 9.425 5.639 6.206 C 8.230 3.846 12.236 2.344 17.654 1.700 ZM 12.000 6.000 C 8.134 6.000 5.000 8.686 5.000 12.000 C 5.000 15.314 8.134 18.000 12.000 18.000 C 15.866 18.000 19.000 15.314 19.000 12.000 C 19.000 8.686 15.866 6.000 12.000 6.000 ZM 12.000 8.300 C 14.209 8.300 16.000 9.957 16.000 12.000 C 16.000 14.043 14.209 15.700 12.000 15.700 C 9.791 15.700 8.000 14.043 8.000 12.000 C 8.000 9.957 9.791 8.300 12.000 8.300 ZM 12.000 10.300 C 10.862 10.300 10.000 11.097 10.000 12.000 C 10.000 12.903 10.862 13.700 12.000 13.700 C 13.138 13.700 14.000 12.903 14.000 12.000 C 14.000 11.097 13.138 10.300 12.000 10.300 Z"),
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
        return _typhoonLine!!
    }

private var _typhoonLine: ImageVector? = null
