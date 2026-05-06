package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DualSim2Line: ImageVector
    get() {
        if (_dualSim2Line != null) return _dualSim2Line!!
        _dualSim2Line = remixIcon(
            name = "DualSim2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2l4.707 4.707c.188 .188 .293 .442 .293 .707v13.586c0 .552-.448 1-1 1h-14C4.448 22 4 21.552 4 21v-18C4 2.448 4.448 2 5 2h10ZM14.171 4h-8.171v16h12v-12.171L14.171 4ZM12 7.5c1.657 0 3 1.343 3 3 0 .884-.382 1.679-.991 2.228l-.008-.008 .006 .009L12.595 14h2.405v2h-6L8.999 14.547l3.67-3.304c.203-.183 .331-.448 .331-.743 0-.552-.448-1-1-1-.552 0-1 .448-1 1h-2c0-1.657 1.343-3 3-3Z"),
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
        return _dualSim2Line!!
    }

private var _dualSim2Line: ImageVector? = null
