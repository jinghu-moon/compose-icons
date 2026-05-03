package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatDots: ImageVector
    get() {
        if (_chatDots != null) return _chatDots!!
        _chatDots = phosphorDuotoneIcon(
            name = "ChatDots",
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
                pathData = parseSvgPathData("M 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 ZM 84.000 140.000 C 90.627 140.000 96.000 134.627 96.000 128.000 C 96.000 121.373 90.627 116.000 84.000 116.000 C 77.373 116.000 72.000 121.373 72.000 128.000 C 72.000 134.627 77.373 140.000 84.000 140.000 ZM 172.000 140.000 C 178.627 140.000 184.000 134.627 184.000 128.000 C 184.000 121.373 178.627 116.000 172.000 116.000 C 165.373 116.000 160.000 121.373 160.000 128.000 C 160.000 134.627 165.373 140.000 172.000 140.000 ZM 232.000 64.000 L 232.000 192.000 C 232.000 200.837 224.837 208.000 216.000 208.000 L 83.000 208.000 L 50.400 236.160 L 50.310 236.230 C 47.430 238.672 43.775 240.008 40.000 240.000 C 37.650 239.995 35.329 239.476 33.200 238.480 C 27.561 235.874 23.964 230.213 24.000 224.000 L 24.000 64.000 C 24.000 55.163 31.163 48.000 40.000 48.000 L 216.000 48.000 C 224.837 48.000 232.000 55.163 232.000 64.000 ZM 40.000 224.000 L 40.000 224.000 ZM 216.000 64.000 L 40.000 64.000 L 40.000 224.000 L 74.770 194.000 C 76.215 192.725 78.073 192.015 80.000 192.000 L 216.000 192.000 Z"),
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
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
