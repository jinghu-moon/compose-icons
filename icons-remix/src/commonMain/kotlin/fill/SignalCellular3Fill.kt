package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SignalCellular3Fill: ImageVector
    get() {
        if (_signalCellular3Fill != null) return _signalCellular3Fill!!
        _signalCellular3Fill = remixIcon(
            name = "SignalCellular3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 13.000 L 8.000 13.000 L 8.000 21.000 L 2.000 21.000 L 2.000 13.000 ZM 16.000 3.000 L 22.000 3.000 L 22.000 21.000 L 16.000 21.000 L 16.000 3.000 ZM 9.000 8.000 L 15.000 8.000 L 15.000 21.000 L 9.000 21.000 L 9.000 8.000 Z"),
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
        return _signalCellular3Fill!!
    }

private var _signalCellular3Fill: ImageVector? = null
