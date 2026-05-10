package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ForwardEndFill: ImageVector
    get() {
        if (_forwardEndFill != null) return _forwardEndFill!!
        _forwardEndFill = remixIcon(
            name = "ForwardEndFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 4c-.552 0-1 .448-1 1v5.667L11.777 4.518c-.082-.055-.179-.084-.277-.084-.276 0-.5 .224-.5 .5v5.732L1.777 4.518C1.695 4.463 1.599 4.434 1.5 4.434 1.224 4.434 1 4.658 1 4.934v14.132c0 .099 .029 .195 .084 .277 .153 .23 .464 .292 .693 .139L11 13.333v5.732c0 .099 .029 .195 .084 .277 .153 .23 .464 .292 .693 .139L21 13.333v5.667c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-14C23 4.448 22.552 4 22 4Z"),
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
        return _forwardEndFill!!
    }

private var _forwardEndFill: ImageVector? = null
