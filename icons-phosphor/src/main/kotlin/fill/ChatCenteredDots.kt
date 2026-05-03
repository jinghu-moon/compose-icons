package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChatCenteredDots: ImageVector
    get() {
        if (_chatCenteredDots != null) return _chatCenteredDots!!
        _chatCenteredDots = phosphorFillIcon(
            name = "ChatCenteredDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 184.000 C 24.000 192.837 31.163 200.000 40.000 200.000 L 100.430 200.000 L 114.110 223.940 C 116.959 228.923 122.260 231.998 128.000 231.998 C 133.740 231.998 139.041 228.923 141.890 223.940 L 155.570 200.000 L 216.000 200.000 C 224.837 200.000 232.000 192.837 232.000 184.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 84.000 132.000 C 77.373 132.000 72.000 126.627 72.000 120.000 C 72.000 113.373 77.373 108.000 84.000 108.000 C 90.627 108.000 96.000 113.373 96.000 120.000 C 96.000 126.627 90.627 132.000 84.000 132.000 ZM 128.000 132.000 C 121.373 132.000 116.000 126.627 116.000 120.000 C 116.000 113.373 121.373 108.000 128.000 108.000 C 134.627 108.000 140.000 113.373 140.000 120.000 C 140.000 126.627 134.627 132.000 128.000 132.000 ZM 172.000 132.000 C 165.373 132.000 160.000 126.627 160.000 120.000 C 160.000 113.373 165.373 108.000 172.000 108.000 C 178.627 108.000 184.000 113.373 184.000 120.000 C 184.000 126.627 178.627 132.000 172.000 132.000 Z"),
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
