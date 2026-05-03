package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TipJar: ImageVector
    get() {
        if (_tipJar != null) return _tipJar!!
        _tipJar = phosphorThinIcon(
            name = "TipJar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 52.230 L 180.000 32.000 C 180.000 25.373 174.627 20.000 168.000 20.000 L 88.000 20.000 C 81.373 20.000 76.000 25.373 76.000 32.000 L 76.000 52.230 C 57.782 54.267 44.004 69.668 44.000 88.000 L 44.000 200.000 C 44.000 219.882 60.118 236.000 80.000 236.000 L 176.000 236.000 C 195.882 236.000 212.000 219.882 212.000 200.000 L 212.000 88.000 C 211.996 69.668 198.218 54.267 180.000 52.230 ZM 148.000 28.000 L 168.000 28.000 C 170.209 28.000 172.000 29.791 172.000 32.000 L 172.000 52.000 L 148.000 52.000 ZM 116.000 28.000 L 140.000 28.000 L 140.000 52.000 L 116.000 52.000 ZM 84.000 32.000 C 84.000 29.791 85.791 28.000 88.000 28.000 L 108.000 28.000 L 108.000 52.000 L 84.000 52.000 ZM 204.000 200.000 C 204.000 215.464 191.464 228.000 176.000 228.000 L 80.000 228.000 C 64.536 228.000 52.000 215.464 52.000 200.000 L 52.000 88.000 C 52.000 72.536 64.536 60.000 80.000 60.000 L 176.000 60.000 C 191.464 60.000 204.000 72.536 204.000 88.000 ZM 156.000 160.000 C 156.000 171.046 147.046 180.000 136.000 180.000 L 132.000 180.000 L 132.000 192.000 C 132.000 194.209 130.209 196.000 128.000 196.000 C 125.791 196.000 124.000 194.209 124.000 192.000 L 124.000 180.000 L 112.000 180.000 C 109.791 180.000 108.000 178.209 108.000 176.000 C 108.000 173.791 109.791 172.000 112.000 172.000 L 136.000 172.000 C 142.627 172.000 148.000 166.627 148.000 160.000 C 148.000 153.373 142.627 148.000 136.000 148.000 L 120.000 148.000 C 108.954 148.000 100.000 139.046 100.000 128.000 C 100.000 116.954 108.954 108.000 120.000 108.000 L 124.000 108.000 L 124.000 96.000 C 124.000 93.791 125.791 92.000 128.000 92.000 C 130.209 92.000 132.000 93.791 132.000 96.000 L 132.000 108.000 L 144.000 108.000 C 146.209 108.000 148.000 109.791 148.000 112.000 C 148.000 114.209 146.209 116.000 144.000 116.000 L 120.000 116.000 C 113.373 116.000 108.000 121.373 108.000 128.000 C 108.000 134.627 113.373 140.000 120.000 140.000 L 136.000 140.000 C 147.046 140.000 156.000 148.954 156.000 160.000 Z"),
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
        return _tipJar!!
    }

private var _tipJar: ImageVector? = null
