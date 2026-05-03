package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SignalTowerFill: ImageVector
    get() {
        if (_signalTowerFill != null) return _signalTowerFill!!
        _signalTowerFill = remixIcon(
            name = "SignalTowerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.116 20.087 C 3.621 18.268 2.000 15.324 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 15.324 20.379 18.268 17.884 20.087 L 16.869 18.348 C 18.773 16.886 20.000 14.586 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 14.586 5.227 16.886 7.131 18.348 L 6.116 20.087 ZM 8.150 16.602 C 6.836 15.501 6.000 13.848 6.000 12.000 C 6.000 8.686 8.686 6.000 12.000 6.000 C 15.314 6.000 18.000 8.686 18.000 12.000 C 18.000 13.848 17.164 15.501 15.850 16.602 L 14.820 14.837 C 15.549 14.112 16.000 13.109 16.000 12.000 C 16.000 9.791 14.209 8.000 12.000 8.000 C 9.791 8.000 8.000 9.791 8.000 12.000 C 8.000 13.109 8.451 14.112 9.180 14.837 L 8.150 16.602 ZM 11.000 13.000 L 13.000 13.000 L 14.000 22.000 L 10.000 22.000 L 11.000 13.000 Z"),
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
        return _signalTowerFill!!
    }

private var _signalTowerFill: ImageVector? = null
