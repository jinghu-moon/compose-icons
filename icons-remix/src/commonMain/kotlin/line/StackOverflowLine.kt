package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StackOverflowLine: ImageVector
    get() {
        if (_stackOverflowLine != null) return _stackOverflowLine!!
        _stackOverflowLine = remixIcon(
            name = "StackOverflowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.001 20.003 L 18.001 15.000 L 20.001 15.000 L 20.001 22.003 L 4.001 22.003 L 4.001 15.000 L 6.001 15.000 L 6.001 20.003 L 18.001 20.003 ZM 7.501 18.000 L 7.501 16.000 L 16.501 16.000 L 16.501 18.000 L 7.501 18.000 ZM 7.578 13.620 L 7.925 11.650 L 16.789 13.213 L 16.441 15.182 L 7.578 13.620 ZM 9.212 8.116 L 10.212 6.384 L 18.006 10.884 L 17.006 12.616 L 9.212 8.116 ZM 12.629 3.503 L 14.161 2.218 L 19.946 9.112 L 18.414 10.398 L 12.629 3.503 Z"),
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
        return _stackOverflowLine!!
    }

private var _stackOverflowLine: ImageVector? = null
