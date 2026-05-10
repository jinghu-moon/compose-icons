package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BrainFill: ImageVector
    get() {
        if (_brainFill != null) return _brainFill!!
        _brainFill = remixIcon(
            name = "BrainFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2.535C10.412 2.195 9.729 2 9 2 6.791 2 5 3.791 5 6v1.774C4.149 8.116 3.451 8.648 2.941 9.349 2.292 10.241 2 11.335 2 12.5c0 1.561 .795 2.936 2 3.742v1.258C4 19.985 6.015 22 8.5 22c.925 0 1.785-.279 2.5-.758v-3.742c0-1.333-.33-2.185-.86-2.759C9.597 14.153 8.716 13.717 7.336 13.486l.329-1.973c1.302 .217 2.441 .624 3.336 1.313v-10.292ZM13 2.535v10.292c.894-.69 2.034-1.097 3.336-1.313l.329 1.973c-1.381 .23-2.262 .666-2.805 1.254-.53 .574-.86 1.426-.86 2.759v3.742c.715 .479 1.575 .758 2.5 .758C17.985 22 20 19.985 20 17.5v-1.258c1.205-.806 2-2.181 2-3.742 0-1.165-.292-2.259-.941-3.151C20.549 8.648 19.851 8.116 19 7.774v-1.774C19 3.791 17.209 2 15 2c-.729 0-1.412 .195-2 .535Z"),
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
        return _brainFill!!
    }

private var _brainFill: ImageVector? = null
