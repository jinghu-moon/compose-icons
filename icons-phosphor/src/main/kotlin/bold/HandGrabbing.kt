package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorBoldIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 76.000 C 184.174 75.988 180.376 76.665 176.790 78.000 C 172.539 69.245 164.535 62.901 155.042 60.760 C 145.548 58.620 135.596 60.916 128.000 67.000 C 118.393 59.308 105.226 57.807 94.135 63.140 C 83.043 68.472 75.992 79.693 76.000 92.000 L 76.000 108.000 L 68.000 108.000 C 50.327 108.000 36.000 122.327 36.000 140.000 L 36.000 152.000 C 36.000 202.810 77.190 244.000 128.000 244.000 C 178.810 244.000 220.000 202.810 220.000 152.000 L 220.000 108.000 C 220.000 90.327 205.673 76.000 188.000 76.000 ZM 196.000 152.000 C 196.000 189.555 165.555 220.000 128.000 220.000 C 90.445 220.000 60.000 189.555 60.000 152.000 L 60.000 140.000 C 60.000 135.582 63.582 132.000 68.000 132.000 L 76.000 132.000 L 76.000 152.000 C 76.000 158.627 81.373 164.000 88.000 164.000 C 94.627 164.000 100.000 158.627 100.000 152.000 L 100.000 92.000 C 100.000 87.582 103.582 84.000 108.000 84.000 C 112.418 84.000 116.000 87.582 116.000 92.000 L 116.000 120.000 C 116.000 126.627 121.373 132.000 128.000 132.000 C 134.627 132.000 140.000 126.627 140.000 120.000 L 140.000 92.000 C 140.000 87.582 143.582 84.000 148.000 84.000 C 152.418 84.000 156.000 87.582 156.000 92.000 L 156.000 120.000 C 156.000 126.627 161.373 132.000 168.000 132.000 C 174.627 132.000 180.000 126.627 180.000 120.000 L 180.000 108.000 C 180.000 103.582 183.582 100.000 188.000 100.000 C 192.418 100.000 196.000 103.582 196.000 108.000 Z"),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
