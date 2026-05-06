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
                pathData = parseSvgPathData("M18.001 20.003v-5.002h2v7.002h-16v-7.002h2v5.002h12ZM7.501 18v-2h9v2h-9ZM7.578 13.62l.347-1.97 8.863 1.563-.347 1.97L7.578 13.62ZM9.212 8.116 10.212 6.384l7.794 4.5-1 1.732L9.212 8.116ZM12.629 3.503 14.161 2.218l5.785 6.894-1.532 1.286L12.629 3.503Z"),
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
