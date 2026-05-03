package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorBoldIcon(
            name = "FrameCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 88.000 C 140.000 81.373 145.373 76.000 152.000 76.000 L 184.000 76.000 C 190.627 76.000 196.000 81.373 196.000 88.000 L 196.000 120.000 C 196.000 126.627 190.627 132.000 184.000 132.000 C 177.373 132.000 172.000 126.627 172.000 120.000 L 172.000 100.000 L 152.000 100.000 C 145.373 100.000 140.000 94.627 140.000 88.000 ZM 72.000 180.000 L 104.000 180.000 C 110.627 180.000 116.000 174.627 116.000 168.000 C 116.000 161.373 110.627 156.000 104.000 156.000 L 84.000 156.000 L 84.000 136.000 C 84.000 129.373 78.627 124.000 72.000 124.000 C 65.373 124.000 60.000 129.373 60.000 136.000 L 60.000 168.000 C 60.000 174.627 65.373 180.000 72.000 180.000 ZM 236.000 56.000 L 236.000 200.000 C 236.000 211.046 227.046 220.000 216.000 220.000 L 40.000 220.000 C 28.954 220.000 20.000 211.046 20.000 200.000 L 20.000 56.000 C 20.000 44.954 28.954 36.000 40.000 36.000 L 216.000 36.000 C 227.046 36.000 236.000 44.954 236.000 56.000 ZM 212.000 60.000 L 44.000 60.000 L 44.000 196.000 L 212.000 196.000 Z"),
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
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
