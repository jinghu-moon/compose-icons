package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorThinIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 140.000 L 48.000 140.000 C 41.373 140.000 36.000 145.373 36.000 152.000 L 36.000 200.000 C 36.000 206.627 41.373 212.000 48.000 212.000 L 208.000 212.000 C 214.627 212.000 220.000 206.627 220.000 200.000 L 220.000 152.000 C 220.000 145.373 214.627 140.000 208.000 140.000 ZM 212.000 200.000 C 212.000 202.209 210.209 204.000 208.000 204.000 L 48.000 204.000 C 45.791 204.000 44.000 202.209 44.000 200.000 L 44.000 152.000 C 44.000 149.791 45.791 148.000 48.000 148.000 L 208.000 148.000 C 210.209 148.000 212.000 149.791 212.000 152.000 ZM 208.000 44.000 L 48.000 44.000 C 41.373 44.000 36.000 49.373 36.000 56.000 L 36.000 104.000 C 36.000 110.627 41.373 116.000 48.000 116.000 L 208.000 116.000 C 214.627 116.000 220.000 110.627 220.000 104.000 L 220.000 56.000 C 220.000 49.373 214.627 44.000 208.000 44.000 ZM 212.000 104.000 C 212.000 106.209 210.209 108.000 208.000 108.000 L 48.000 108.000 C 45.791 108.000 44.000 106.209 44.000 104.000 L 44.000 56.000 C 44.000 53.791 45.791 52.000 48.000 52.000 L 208.000 52.000 C 210.209 52.000 212.000 53.791 212.000 56.000 ZM 188.000 176.000 C 188.000 180.418 184.418 184.000 180.000 184.000 C 175.582 184.000 172.000 180.418 172.000 176.000 C 172.000 171.582 175.582 168.000 180.000 168.000 C 184.418 168.000 188.000 171.582 188.000 176.000 ZM 188.000 80.000 C 188.000 84.418 184.418 88.000 180.000 88.000 C 175.582 88.000 172.000 84.418 172.000 80.000 C 172.000 75.582 175.582 72.000 180.000 72.000 C 184.418 72.000 188.000 75.582 188.000 80.000 Z"),
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
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
