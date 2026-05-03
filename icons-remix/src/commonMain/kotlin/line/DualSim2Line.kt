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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 2.000 L 19.707 6.707 C 19.895 6.895 20.000 7.149 20.000 7.414 L 20.000 21.000 C 20.000 21.552 19.552 22.000 19.000 22.000 L 5.000 22.000 C 4.448 22.000 4.000 21.552 4.000 21.000 L 4.000 3.000 C 4.000 2.448 4.448 2.000 5.000 2.000 L 15.000 2.000 ZM 14.171 4.000 L 6.000 4.000 L 6.000 20.000 L 18.000 20.000 L 18.000 7.829 L 14.171 4.000 ZM 12.000 7.500 C 13.657 7.500 15.000 8.843 15.000 10.500 C 15.000 11.384 14.618 12.179 14.009 12.728 L 14.001 12.720 L 14.007 12.729 L 12.595 14.000 L 15.000 14.000 L 15.000 16.000 L 9.000 16.000 L 8.999 14.547 L 12.669 11.243 C 12.872 11.060 13.000 10.795 13.000 10.500 C 13.000 9.948 12.552 9.500 12.000 9.500 C 11.448 9.500 11.000 9.948 11.000 10.500 L 9.000 10.500 C 9.000 8.843 10.343 7.500 12.000 7.500 Z"),
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
        return _dualSim2Line!!
    }

private var _dualSim2Line: ImageVector? = null
