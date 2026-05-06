package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DualSim1Line: ImageVector
    get() {
        if (_dualSim1Line != null) return _dualSim1Line!!
        _dualSim1Line = remixIcon(
            name = "DualSim1Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2l4.707 4.707c.188 .188 .293 .442 .293 .707v13.586c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-18C4 2.448 4.448 2 5 2h10ZM14.171 4h-8.171v16h12v-12.171L14.171 4ZM13 16h-2v-6h-1v-2h3v8Z"),
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
        return _dualSim1Line!!
    }

private var _dualSim1Line: ImageVector? = null
