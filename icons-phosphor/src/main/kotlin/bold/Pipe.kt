package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pipe: ImageVector
    get() {
        if (_pipe != null) return _pipe!!
        _pipe = phosphorBoldIcon(
            name = "Pipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 100.000 L 216.000 100.000 L 216.000 60.000 L 232.000 60.000 C 238.627 60.000 244.000 54.627 244.000 48.000 C 244.000 41.373 238.627 36.000 232.000 36.000 L 212.000 36.000 C 208.223 30.964 202.295 28.000 196.000 28.000 L 172.000 28.000 C 165.705 28.000 159.777 30.964 156.000 36.000 L 144.000 36.000 C 84.381 36.066 36.066 84.381 36.000 144.000 L 36.000 156.000 C 30.964 159.777 28.000 165.705 28.000 172.000 L 28.000 196.000 C 28.000 202.295 30.964 208.223 36.000 212.000 L 36.000 232.000 C 36.000 238.627 41.373 244.000 48.000 244.000 C 54.627 244.000 60.000 238.627 60.000 232.000 L 60.000 216.000 L 100.000 216.000 L 100.000 232.000 C 100.000 238.627 105.373 244.000 112.000 244.000 C 118.627 244.000 124.000 238.627 124.000 232.000 L 124.000 212.000 C 129.036 208.223 132.000 202.295 132.000 196.000 L 132.000 172.000 C 132.000 165.705 129.036 159.777 124.000 156.000 L 124.000 144.000 C 124.000 132.954 132.954 124.000 144.000 124.000 L 156.000 124.000 C 159.777 129.036 165.705 132.000 172.000 132.000 L 196.000 132.000 C 202.295 132.000 208.223 129.036 212.000 124.000 L 232.000 124.000 C 238.627 124.000 244.000 118.627 244.000 112.000 C 244.000 105.373 238.627 100.000 232.000 100.000 ZM 108.000 176.000 L 108.000 192.000 L 52.000 192.000 L 52.000 176.000 ZM 100.000 144.000 L 100.000 152.000 L 60.000 152.000 L 60.000 144.000 C 60.050 97.629 97.629 60.050 144.000 60.000 L 152.000 60.000 L 152.000 100.000 L 144.000 100.000 C 119.711 100.028 100.028 119.711 100.000 144.000 ZM 176.000 52.000 L 192.000 52.000 L 192.000 108.000 L 176.000 108.000 Z"),
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
        return _pipe!!
    }

private var _pipe: ImageVector? = null
