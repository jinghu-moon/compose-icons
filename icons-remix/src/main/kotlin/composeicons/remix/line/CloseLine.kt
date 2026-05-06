package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CloseLine: ImageVector
    get() {
        if (_closeLine != null) return _closeLine!!
        _closeLine = remixIcon(
            name = "CloseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 10.587 16.949 5.637l1.414 1.414-4.95 4.95 4.95 4.95-1.414 1.414L12 13.415 7.05 18.365 5.636 16.95l4.95-4.95L5.636 7.051 7.05 5.637l4.95 4.95Z"),
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
        return _closeLine!!
    }

private var _closeLine: ImageVector? = null
