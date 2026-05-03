package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) return _chatCenteredDots!!
        _chatCenteredDots = phosphorDuotoneIcon(
            name = "ChatCenteredDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 56.000 L 224.000 184.000 C 224.000 188.418 220.418 192.000 216.000 192.000 L 150.930 192.000 L 134.930 220.000 C 133.507 222.497 130.854 224.038 127.980 224.038 C 125.106 224.038 122.453 222.497 121.030 220.000 L 105.030 192.000 L 40.000 192.000 C 35.582 192.000 32.000 188.418 32.000 184.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 216.000 48.000 C 220.418 48.000 224.000 51.582 224.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 116.000 120.000 C 116.000 113.373 121.373 108.000 128.000 108.000 C 134.627 108.000 140.000 113.373 140.000 120.000 C 140.000 126.627 134.627 132.000 128.000 132.000 C 121.373 132.000 116.000 126.627 116.000 120.000 ZM 84.000 132.000 C 90.627 132.000 96.000 126.627 96.000 120.000 C 96.000 113.373 90.627 108.000 84.000 108.000 C 77.373 108.000 72.000 113.373 72.000 120.000 C 72.000 126.627 77.373 132.000 84.000 132.000 ZM 172.000 132.000 C 178.627 132.000 184.000 126.627 184.000 120.000 C 184.000 113.373 178.627 108.000 172.000 108.000 C 165.373 108.000 160.000 113.373 160.000 120.000 C 160.000 126.627 165.373 132.000 172.000 132.000 ZM 232.000 56.000 L 232.000 184.000 C 232.000 192.837 224.837 200.000 216.000 200.000 L 155.570 200.000 L 141.890 223.940 C 139.041 228.923 133.740 231.998 128.000 231.998 C 122.260 231.998 116.959 228.923 114.110 223.940 L 100.430 200.000 L 40.000 200.000 C 31.163 200.000 24.000 192.837 24.000 184.000 L 24.000 56.000 C 24.000 47.163 31.163 40.000 40.000 40.000 L 216.000 40.000 C 224.837 40.000 232.000 47.163 232.000 56.000 ZM 216.000 56.000 L 40.000 56.000 L 40.000 184.000 L 105.070 184.000 C 107.954 183.974 110.628 185.502 112.070 188.000 L 128.070 216.000 L 144.070 188.000 C 145.512 185.502 148.186 183.974 151.070 184.000 L 216.000 184.000 Z"),
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
        return _chatCenteredDots!!
    }

private var _chatCenteredDots: ImageVector? = null
