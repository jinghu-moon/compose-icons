package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PerplexityLine: ImageVector
    get() {
        if (_perplexityLine != null) return _perplexityLine!!
        _perplexityLine = remixIcon(
            name = "PerplexityLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.173 3.260 L 5.500 1.740 L 5.500 4.000 L 5.500 7.500 L 4.000 7.500 L 3.000 7.500 L 3.000 8.500 L 3.000 16.000 L 3.000 17.000 L 4.000 17.000 L 5.500 17.000 L 5.500 20.000 L 5.500 22.261 L 7.173 20.740 L 11.000 17.261 L 11.000 22.000 L 13.000 22.000 L 13.000 17.261 L 16.827 20.740 L 18.500 22.261 L 18.500 20.000 L 18.500 17.000 L 20.000 17.000 L 21.000 17.000 L 21.000 16.000 L 21.000 8.500 L 21.000 7.500 L 20.000 7.500 L 18.500 7.500 L 18.500 4.000 L 18.500 1.740 L 16.827 3.260 L 13.000 6.740 L 13.000 2.000 L 11.000 2.000 L 11.000 6.740 L 7.173 3.260 ZM 16.500 7.500 L 15.137 7.500 L 16.500 6.261 L 16.500 7.500 ZM 8.863 7.500 L 7.500 7.500 L 7.500 6.261 L 8.863 7.500 ZM 9.963 9.500 L 5.827 13.260 L 5.500 13.558 L 5.500 14.000 L 5.500 15.000 L 5.000 15.000 L 5.000 9.500 L 9.963 9.500 ZM 14.037 9.500 L 19.000 9.500 L 19.000 15.000 L 18.500 15.000 L 18.500 14.000 L 18.500 13.558 L 18.173 13.260 L 14.037 9.500 ZM 7.500 14.442 L 11.000 11.261 L 11.000 14.558 L 7.500 17.740 L 7.500 14.442 ZM 13.000 11.261 L 16.500 14.442 L 16.500 17.740 L 13.000 14.558 L 13.000 11.261 Z"),
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
        return _perplexityLine!!
    }

private var _perplexityLine: ImageVector? = null
