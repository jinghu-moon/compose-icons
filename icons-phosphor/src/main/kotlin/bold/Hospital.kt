package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorBoldIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 204.000 L 240.000 204.000 L 240.000 128.000 C 240.000 116.954 231.046 108.000 220.000 108.000 L 172.000 108.000 L 172.000 48.000 C 172.000 36.954 163.046 28.000 152.000 28.000 L 56.000 28.000 C 44.954 28.000 36.000 36.954 36.000 48.000 L 36.000 204.000 L 32.000 204.000 C 25.373 204.000 20.000 209.373 20.000 216.000 C 20.000 222.627 25.373 228.000 32.000 228.000 L 244.000 228.000 C 250.627 228.000 256.000 222.627 256.000 216.000 C 256.000 209.373 250.627 204.000 244.000 204.000 ZM 216.000 132.000 L 216.000 204.000 L 172.000 204.000 L 172.000 132.000 ZM 60.000 52.000 L 148.000 52.000 L 148.000 204.000 L 136.000 204.000 L 136.000 160.000 C 136.000 153.373 130.627 148.000 124.000 148.000 L 84.000 148.000 C 77.373 148.000 72.000 153.373 72.000 160.000 L 72.000 204.000 L 60.000 204.000 ZM 112.000 204.000 L 96.000 204.000 L 96.000 172.000 L 112.000 172.000 ZM 72.000 96.000 C 72.000 89.373 77.373 84.000 84.000 84.000 L 92.000 84.000 L 92.000 76.000 C 92.000 69.373 97.373 64.000 104.000 64.000 C 110.627 64.000 116.000 69.373 116.000 76.000 L 116.000 84.000 L 124.000 84.000 C 130.627 84.000 136.000 89.373 136.000 96.000 C 136.000 102.627 130.627 108.000 124.000 108.000 L 116.000 108.000 L 116.000 116.000 C 116.000 122.627 110.627 128.000 104.000 128.000 C 97.373 128.000 92.000 122.627 92.000 116.000 L 92.000 108.000 L 84.000 108.000 C 77.373 108.000 72.000 102.627 72.000 96.000 Z"),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null
