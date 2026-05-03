package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ListBullets: ImageVector
    get() {
        if (_listBullets != null) return _listBullets!!
        _listBullets = phosphorDuotoneIcon(
            name = "ListBullets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 64.000 L 216.000 192.000 L 88.000 192.000 L 88.000 64.000 Z"),
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
                pathData = parseSvgPathData("M 80.000 64.000 C 80.000 59.582 83.582 56.000 88.000 56.000 L 216.000 56.000 C 220.418 56.000 224.000 59.582 224.000 64.000 C 224.000 68.418 220.418 72.000 216.000 72.000 L 88.000 72.000 C 83.582 72.000 80.000 68.418 80.000 64.000 ZM 216.000 120.000 L 88.000 120.000 C 83.582 120.000 80.000 123.582 80.000 128.000 C 80.000 132.418 83.582 136.000 88.000 136.000 L 216.000 136.000 C 220.418 136.000 224.000 132.418 224.000 128.000 C 224.000 123.582 220.418 120.000 216.000 120.000 ZM 216.000 184.000 L 88.000 184.000 C 83.582 184.000 80.000 187.582 80.000 192.000 C 80.000 196.418 83.582 200.000 88.000 200.000 L 216.000 200.000 C 220.418 200.000 224.000 196.418 224.000 192.000 C 224.000 187.582 220.418 184.000 216.000 184.000 ZM 44.000 52.000 C 37.373 52.000 32.000 57.373 32.000 64.000 C 32.000 70.627 37.373 76.000 44.000 76.000 C 50.627 76.000 56.000 70.627 56.000 64.000 C 56.000 57.373 50.627 52.000 44.000 52.000 ZM 44.000 116.000 C 37.373 116.000 32.000 121.373 32.000 128.000 C 32.000 134.627 37.373 140.000 44.000 140.000 C 50.627 140.000 56.000 134.627 56.000 128.000 C 56.000 121.373 50.627 116.000 44.000 116.000 ZM 44.000 180.000 C 37.373 180.000 32.000 185.373 32.000 192.000 C 32.000 198.627 37.373 204.000 44.000 204.000 C 50.627 204.000 56.000 198.627 56.000 192.000 C 56.000 185.373 50.627 180.000 44.000 180.000 Z"),
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
