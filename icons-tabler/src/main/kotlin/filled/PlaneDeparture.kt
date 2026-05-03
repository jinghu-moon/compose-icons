package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) return _planeDeparture!!
        _planeDeparture = tablerFilledIcon(
            name = "PlaneDeparture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.674 3.827 L 14.941 9.142 L 19.191 8.003 C 20.230 7.708 21.347 7.994 22.116 8.753 C 22.885 9.511 23.188 10.624 22.908 11.667 C 22.627 12.710 21.808 13.522 20.763 13.793 L 6.273 17.676 C 5.907 17.773 5.518 17.656 5.267 17.373 L 0.817 12.353 C 0.587 12.094 0.508 11.734 0.608 11.402 C 0.708 11.070 0.972 10.814 1.307 10.724 L 4.203 9.948 C 4.459 9.879 4.732 9.915 4.962 10.048 L 7.053 11.255 L 8.270 10.929 L 5.208 5.822 C 5.047 5.553 5.021 5.224 5.139 4.933 C 5.257 4.642 5.504 4.423 5.807 4.342 L 8.705 3.565 C 9.052 3.472 9.422 3.572 9.675 3.827"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 22.000 21.000 C 22.000 21.552 21.552 22.000 21.000 22.000 L 3.000 22.000 C 2.448 22.000 2.000 21.552 2.000 21.000 C 2.000 20.448 2.448 20.000 3.000 20.000 L 21.000 20.000 C 21.552 20.000 22.000 20.448 22.000 21.000"),
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
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
