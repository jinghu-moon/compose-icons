package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorBoldIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 76.000 64.000 C 76.000 57.373 81.373 52.000 88.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 C 228.000 70.627 222.627 76.000 216.000 76.000 L 88.000 76.000 C 81.373 76.000 76.000 70.627 76.000 64.000 ZM 216.000 116.000 L 88.000 116.000 C 81.373 116.000 76.000 121.373 76.000 128.000 C 76.000 134.627 81.373 140.000 88.000 140.000 L 216.000 140.000 C 222.627 140.000 228.000 134.627 228.000 128.000 C 228.000 121.373 222.627 116.000 216.000 116.000 ZM 216.000 180.000 L 88.000 180.000 C 81.373 180.000 76.000 185.373 76.000 192.000 C 76.000 198.627 81.373 204.000 88.000 204.000 L 216.000 204.000 C 222.627 204.000 228.000 198.627 228.000 192.000 C 228.000 185.373 222.627 180.000 216.000 180.000 ZM 44.000 112.000 C 35.163 112.000 28.000 119.163 28.000 128.000 C 28.000 136.837 35.163 144.000 44.000 144.000 C 52.837 144.000 60.000 136.837 60.000 128.000 C 60.000 119.163 52.837 112.000 44.000 112.000 ZM 44.000 48.000 C 35.163 48.000 28.000 55.163 28.000 64.000 C 28.000 72.837 35.163 80.000 44.000 80.000 C 52.837 80.000 60.000 72.837 60.000 64.000 C 60.000 55.163 52.837 48.000 44.000 48.000 ZM 44.000 176.000 C 35.163 176.000 28.000 183.163 28.000 192.000 C 28.000 200.837 35.163 208.000 44.000 208.000 C 52.837 208.000 60.000 200.837 60.000 192.000 C 60.000 183.163 52.837 176.000 44.000 176.000 Z"),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
