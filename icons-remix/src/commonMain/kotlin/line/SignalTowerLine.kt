package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SignalTowerLine: ImageVector
    get() {
        if (_signalTowerLine != null) return _signalTowerLine!!
        _signalTowerLine = remixIcon(
            name = "SignalTowerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.116 20.087 L 7.131 18.348 C 5.227 16.886 4.000 14.586 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 14.586 18.773 16.886 16.869 18.348 L 17.884 20.087 C 20.379 18.268 22.000 15.324 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 15.324 3.621 18.268 6.116 20.087 ZM 8.150 16.602 C 6.836 15.501 6.000 13.848 6.000 12.000 C 6.000 8.686 8.686 6.000 12.000 6.000 C 15.314 6.000 18.000 8.686 18.000 12.000 C 18.000 13.848 17.164 15.501 15.850 16.602 L 14.820 14.837 C 15.549 14.112 16.000 13.109 16.000 12.000 C 16.000 9.791 14.209 8.000 12.000 8.000 C 9.791 8.000 8.000 9.791 8.000 12.000 C 8.000 13.109 8.451 14.112 9.180 14.837 L 8.150 16.602 ZM 11.000 13.000 L 13.000 13.000 L 13.000 22.000 L 11.000 22.000 L 11.000 13.000 Z"),
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
        return _signalTowerLine!!
    }

private var _signalTowerLine: ImageVector? = null
