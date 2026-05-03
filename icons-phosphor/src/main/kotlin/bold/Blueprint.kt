package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Blueprint: ImageVector
    get() {
        if (_blueprint != null) return _blueprint!!
        _blueprint = phosphorBoldIcon(
            name = "Blueprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 48.000 L 76.000 48.000 L 76.000 40.000 C 76.000 33.373 70.627 28.000 64.000 28.000 L 48.000 28.000 C 28.118 28.000 12.000 44.118 12.000 64.000 L 12.000 176.000 C 12.000 195.882 28.118 212.000 48.000 212.000 L 232.000 212.000 C 238.627 212.000 244.000 206.627 244.000 200.000 L 244.000 60.000 C 244.000 53.373 238.627 48.000 232.000 48.000 ZM 36.000 64.000 C 36.000 57.373 41.373 52.000 48.000 52.000 L 52.000 52.000 L 52.000 140.000 L 48.000 140.000 C 43.911 139.992 39.852 140.689 36.000 142.060 ZM 220.000 188.000 L 48.000 188.000 C 41.373 188.000 36.000 182.627 36.000 176.000 C 36.000 169.373 41.373 164.000 48.000 164.000 L 64.000 164.000 C 70.627 164.000 76.000 158.627 76.000 152.000 L 76.000 72.000 L 220.000 72.000 ZM 104.000 136.000 C 97.373 136.000 92.000 141.373 92.000 148.000 C 92.000 154.627 97.373 160.000 104.000 160.000 L 116.000 160.000 L 116.000 164.000 C 116.000 170.627 121.373 176.000 128.000 176.000 C 134.627 176.000 140.000 170.627 140.000 164.000 L 140.000 160.000 L 156.000 160.000 L 156.000 164.000 C 156.000 170.627 161.373 176.000 168.000 176.000 C 174.627 176.000 180.000 170.627 180.000 164.000 L 180.000 160.000 L 192.000 160.000 C 198.627 160.000 204.000 154.627 204.000 148.000 C 204.000 141.373 198.627 136.000 192.000 136.000 L 180.000 136.000 L 180.000 124.000 L 192.000 124.000 C 198.627 124.000 204.000 118.627 204.000 112.000 C 204.000 105.373 198.627 100.000 192.000 100.000 L 180.000 100.000 L 180.000 96.000 C 180.000 89.373 174.627 84.000 168.000 84.000 C 161.373 84.000 156.000 89.373 156.000 96.000 L 156.000 100.000 L 140.000 100.000 L 140.000 96.000 C 140.000 89.373 134.627 84.000 128.000 84.000 C 121.373 84.000 116.000 89.373 116.000 96.000 L 116.000 100.000 L 104.000 100.000 C 97.373 100.000 92.000 105.373 92.000 112.000 C 92.000 118.627 97.373 124.000 104.000 124.000 L 116.000 124.000 L 116.000 136.000 ZM 140.000 124.000 L 156.000 124.000 L 156.000 136.000 L 140.000 136.000 Z"),
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
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
