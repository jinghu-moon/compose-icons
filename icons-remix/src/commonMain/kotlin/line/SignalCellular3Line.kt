package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalCellular3Line: ImageVector
    get() {
        if (_signalCellular3Line != null) return _signalCellular3Line!!
        _signalCellular3Line = remixIcon(
            name = "SignalCellular3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 13.000 L 8.000 13.000 L 8.000 21.000 L 2.000 21.000 L 2.000 13.000 ZM 16.000 3.000 L 22.000 3.000 L 22.000 21.000 L 16.000 21.000 L 16.000 3.000 ZM 9.000 8.000 L 15.000 8.000 L 15.000 21.000 L 9.000 21.000 L 9.000 8.000 ZM 4.000 15.000 L 4.000 19.000 L 6.000 19.000 L 6.000 15.000 L 4.000 15.000 ZM 11.000 10.000 L 11.000 19.000 L 13.000 19.000 L 13.000 10.000 L 11.000 10.000 ZM 18.000 5.000 L 18.000 19.000 L 20.000 19.000 L 20.000 5.000 L 18.000 5.000 Z"),
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
        return _signalCellular3Line!!
    }

private var _signalCellular3Line: ImageVector? = null
