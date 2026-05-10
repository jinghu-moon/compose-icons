package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RewindStartFill: ImageVector
    get() {
        if (_rewindStartFill != null) return _rewindStartFill!!
        _rewindStartFill = remixIcon(
            name = "RewindStartFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 4C1.448 4 1 4.448 1 5v14c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-5.667l9.223 6.148c.082 .055 .179 .084 .277 .084 .276 0 .5-.224 .5-.5v-5.732l9.223 6.148c.082 .055 .179 .084 .277 .084 .276 0 .5-.224 .5-.5v-14.131c0-.099-.029-.195-.084-.277-.153-.23-.464-.292-.693-.139L13 10.667v-5.732c0-.099-.029-.195-.084-.277-.153-.23-.464-.292-.693-.139L3 10.667v-5.667C3 4.448 2.552 4 2 4Z"),
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
        return _rewindStartFill!!
    }

private var _rewindStartFill: ImageVector? = null
