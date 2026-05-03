package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = tablerFilledIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 2.000 C 10.000 1.120 11.056 0.669 11.692 1.278 C 13.650 3.154 14.788 7.273 13.442 10.398 L 13.362 10.572 L 13.374 10.575 C 13.999 10.708 14.577 10.145 15.677 8.402 L 15.817 8.178 C 15.981 7.913 16.260 7.740 16.570 7.710 C 16.880 7.680 17.187 7.797 17.399 8.025 C 18.733 9.460 20.000 12.402 20.000 14.295 C 20.000 18.560 16.409 22.000 12.000 22.000 C 7.591 22.000 4.000 18.560 4.000 14.294 C 4.000 12.042 5.022 9.578 6.632 7.993 L 7.237 7.404 C 7.478 7.168 7.671 6.974 7.855 6.780 C 9.285 5.268 10.000 3.856 10.000 2.000"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
