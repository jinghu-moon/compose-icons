package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Chat: ImageVector
    get() {
        if (_chat != null) return _chat!!
        _chat = phosphorDuotoneIcon(
            name = "Chat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 64.000 L 224.000 192.000 C 224.000 196.418 220.418 200.000 216.000 200.000 L 80.000 200.000 L 45.150 230.110 C 42.771 232.111 39.448 232.553 36.629 231.243 C 33.810 229.933 32.005 227.109 32.000 224.000 L 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 216.000 48.000 L 40.000 48.000 C 31.163 48.000 24.000 55.163 24.000 64.000 L 24.000 224.000 C 23.962 230.232 27.583 235.907 33.250 238.500 C 35.364 239.484 37.668 239.996 40.000 240.000 C 43.756 239.991 47.387 238.652 50.250 236.220 L 50.340 236.150 L 83.000 208.000 L 216.000 208.000 C 224.837 208.000 232.000 200.837 232.000 192.000 L 232.000 64.000 C 232.000 55.163 224.837 48.000 216.000 48.000 ZM 40.000 224.000 L 40.000 224.000 ZM 216.000 192.000 L 80.000 192.000 C 78.079 192.001 76.223 192.693 74.770 193.950 L 40.000 224.000 L 40.000 64.000 L 216.000 64.000 Z"),
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
        return _chat!!
    }

private var _chat: ImageVector? = null
