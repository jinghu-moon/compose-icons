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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.116 20.087 7.131 18.348C5.227 16.886 4 14.586 4 12 4 7.582 7.582 4 12 4c4.418 0 8 3.582 8 8 0 2.586-1.227 4.886-3.131 6.348l1.014 1.739C20.379 18.268 22 15.324 22 12 22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12c0 3.324 1.621 6.268 4.116 8.087ZM8.15 16.602C6.836 15.501 6 13.848 6 12 6 8.686 8.686 6 12 6c3.314 0 6 2.686 6 6 0 1.848-.836 3.501-2.15 4.602L14.82 14.837C15.549 14.112 16 13.109 16 12 16 9.791 14.209 8 12 8 9.791 8 8 9.791 8 12c0 1.109 .451 2.112 1.18 2.837L8.15 16.602ZM11 13h2v9h-2v-9Z"),
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
        return _signalTowerLine!!
    }

private var _signalTowerLine: ImageVector? = null
