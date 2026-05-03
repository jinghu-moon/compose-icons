package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FundsFill: ImageVector
    get() {
        if (_fundsFill != null) return _fundsFill!!
        _fundsFill = remixIcon(
            name = "FundsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.901 17.864 L 7.812 13.953 L 10.641 16.781 L 15.212 12.210 L 17.005 14.003 L 17.005 9.003 L 12.005 9.003 L 13.798 10.796 L 10.641 13.953 L 7.812 11.124 L 2.867 16.070 C 2.313 14.827 2.005 13.451 2.005 12.003 C 2.005 6.480 6.482 2.003 12.005 2.003 C 17.528 2.003 22.005 6.480 22.005 12.003 C 22.005 17.526 17.528 22.003 12.005 22.003 C 8.671 22.003 5.718 20.372 3.901 17.864 Z"),
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
        return _fundsFill!!
    }

private var _fundsFill: ImageVector? = null
