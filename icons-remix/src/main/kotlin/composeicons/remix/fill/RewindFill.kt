package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RewindFill: ImageVector
    get() {
        if (_rewindFill != null) return _rewindFill!!
        _rewindFill = remixIcon(
            name = "RewindFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 10.667 21.223 4.518c.23-.153 .54-.091 .693 .139 .055 .082 .084 .179 .084 .277v14.131c0 .276-.224 .5-.5 .5-.099 0-.195-.029-.277-.084L12 13.333v5.732c0 .276-.224 .5-.5 .5-.099 0-.195-.029-.277-.084L.624 12.416C.394 12.263 .332 11.952 .485 11.723c.037-.055 .084-.102 .139-.139L11.223 4.518c.23-.153 .54-.091 .693 .139 .055 .082 .084 .179 .084 .277v5.732Z"),
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
        return _rewindFill!!
    }

private var _rewindFill: ImageVector? = null
