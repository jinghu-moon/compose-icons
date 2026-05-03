package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorFillIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 68.000 188.000 C 61.373 188.000 56.000 182.627 56.000 176.000 C 56.000 169.373 61.373 164.000 68.000 164.000 C 74.627 164.000 80.000 169.373 80.000 176.000 C 80.000 182.627 74.627 188.000 68.000 188.000 ZM 68.000 140.000 C 61.373 140.000 56.000 134.627 56.000 128.000 C 56.000 121.373 61.373 116.000 68.000 116.000 C 74.627 116.000 80.000 121.373 80.000 128.000 C 80.000 134.627 74.627 140.000 68.000 140.000 ZM 68.000 92.000 C 61.373 92.000 56.000 86.627 56.000 80.000 C 56.000 73.373 61.373 68.000 68.000 68.000 C 74.627 68.000 80.000 73.373 80.000 80.000 C 80.000 86.627 74.627 92.000 68.000 92.000 ZM 192.000 184.000 L 104.000 184.000 C 99.582 184.000 96.000 180.418 96.000 176.000 C 96.000 171.582 99.582 168.000 104.000 168.000 L 192.000 168.000 C 196.418 168.000 200.000 171.582 200.000 176.000 C 200.000 180.418 196.418 184.000 192.000 184.000 ZM 192.000 136.000 L 104.000 136.000 C 99.582 136.000 96.000 132.418 96.000 128.000 C 96.000 123.582 99.582 120.000 104.000 120.000 L 192.000 120.000 C 196.418 120.000 200.000 123.582 200.000 128.000 C 200.000 132.418 196.418 136.000 192.000 136.000 ZM 192.000 88.000 L 104.000 88.000 C 99.582 88.000 96.000 84.418 96.000 80.000 C 96.000 75.582 99.582 72.000 104.000 72.000 L 192.000 72.000 C 196.418 72.000 200.000 75.582 200.000 80.000 C 200.000 84.418 196.418 88.000 192.000 88.000 Z"),
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
        return _listBullets!!
    }

private var _listBullets: ImageVector? = null
