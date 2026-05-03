package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WomenLine: ImageVector
    get() {
        if (_womenLine != null) return _womenLine!!
        _womenLine = remixIcon(
            name = "WomenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 15.934 C 7.331 15.445 4.500 12.303 4.500 8.500 C 4.500 4.358 7.858 1.000 12.000 1.000 C 16.142 1.000 19.500 4.358 19.500 8.500 C 19.500 12.303 16.669 15.445 13.000 15.934 L 13.000 18.000 L 18.000 18.000 L 18.000 20.000 L 13.000 20.000 L 13.000 24.000 L 11.000 24.000 L 11.000 20.000 L 6.000 20.000 L 6.000 18.000 L 11.000 18.000 L 11.000 15.934 ZM 12.000 14.000 C 15.038 14.000 17.500 11.538 17.500 8.500 C 17.500 5.462 15.038 3.000 12.000 3.000 C 8.962 3.000 6.500 5.462 6.500 8.500 C 6.500 11.538 8.962 14.000 12.000 14.000 Z"),
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
        return _womenLine!!
    }

private var _womenLine: ImageVector? = null
