package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PerplexityFill: ImageVector
    get() {
        if (_perplexityFill != null) return _perplexityFill!!
        _perplexityFill = remixIcon(
            name = "PerplexityFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.735 2.000 L 11.430 7.247 L 11.430 7.246 L 11.430 2.012 L 12.538 2.012 L 12.538 7.271 L 18.259 2.000 L 18.259 7.983 L 20.608 7.983 L 20.608 16.612 L 18.266 16.612 L 18.266 21.939 L 12.538 16.907 L 12.538 21.997 L 11.430 21.997 L 11.430 16.990 L 5.741 22.000 L 5.741 16.612 L 3.393 16.612 L 3.393 7.983 L 5.735 7.983 L 5.735 2.000 ZM 10.594 9.078 L 4.501 9.078 L 4.501 15.517 L 5.740 15.517 L 5.740 13.486 L 10.594 9.078 ZM 6.850 13.972 L 6.850 19.556 L 11.430 15.523 L 11.430 9.811 L 6.850 13.972 ZM 12.570 15.469 L 17.158 19.499 L 17.158 16.612 L 17.152 16.612 L 17.152 13.966 L 12.570 9.806 L 12.570 15.469 ZM 18.266 15.517 L 19.499 15.517 L 19.499 9.078 L 13.452 9.078 L 18.266 13.440 L 18.266 15.517 ZM 17.150 7.983 L 17.150 4.519 L 13.391 7.983 L 17.150 7.983 ZM 10.603 7.983 L 6.843 4.519 L 6.843 7.983 L 10.603 7.983 Z"),
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
        return _perplexityFill!!
    }

private var _perplexityFill: ImageVector? = null
