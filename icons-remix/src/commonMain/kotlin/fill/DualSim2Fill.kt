package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DualSim2Fill: ImageVector
    get() {
        if (_dualSim2Fill != null) return _dualSim2Fill!!
        _dualSim2Fill = remixIcon(
            name = "DualSim2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 2.000 L 19.707 6.707 C 19.895 6.895 20.000 7.149 20.000 7.414 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 3.000 C 4.000 2.448 4.448 2.000 5.000 2.000 L 15.000 2.000 ZM 12.000 7.500 C 10.402 7.500 9.096 8.749 9.005 10.324 L 9.000 10.500 L 11.000 10.500 C 11.000 9.948 11.448 9.500 12.000 9.500 C 12.552 9.500 13.000 9.948 13.000 10.500 C 13.000 10.753 12.906 10.984 12.751 11.160 L 12.669 11.243 L 8.999 14.547 L 9.000 16.000 L 15.000 16.000 L 15.000 14.000 L 12.595 14.000 L 14.007 12.729 L 14.001 12.720 L 14.009 12.728 C 14.618 12.179 15.000 11.384 15.000 10.500 C 15.000 8.843 13.657 7.500 12.000 7.500 Z"),
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
        return _dualSim2Fill!!
    }

private var _dualSim2Fill: ImageVector? = null
