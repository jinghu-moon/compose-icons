package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalCellularOffLine: ImageVector
    get() {
        if (_signalCellularOffLine != null) return _signalCellularOffLine!!
        _signalCellularOffLine = remixIcon(
            name = "SignalCellularOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.207 20.793 L 20.793 22.207 L 19.586 21.000 L 16.000 21.000 L 16.000 17.414 L 15.000 16.414 L 15.000 21.000 L 9.000 21.000 L 9.000 10.414 L 1.793 3.207 L 3.207 1.793 L 22.207 20.793 ZM 8.000 21.000 L 2.000 21.000 L 2.000 13.000 L 8.000 13.000 L 8.000 21.000 ZM 4.000 19.000 L 6.000 19.000 L 6.000 15.000 L 4.000 15.000 L 4.000 19.000 ZM 11.000 19.000 L 13.000 19.000 L 13.000 14.414 L 11.000 12.414 L 11.000 19.000 ZM 22.000 17.758 L 20.000 15.758 L 20.000 5.000 L 18.000 5.000 L 18.000 13.758 L 16.000 11.758 L 16.000 3.000 L 22.000 3.000 L 22.000 17.758 ZM 15.000 10.758 L 12.242 8.000 L 15.000 8.000 L 15.000 10.758 Z"),
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
        return _signalCellularOffLine!!
    }

private var _signalCellularOffLine: ImageVector? = null
