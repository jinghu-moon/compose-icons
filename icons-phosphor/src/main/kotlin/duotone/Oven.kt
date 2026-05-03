package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Oven: ImageVector
    get() {
        if (_oven != null) return _oven!!
        _oven = phosphorDuotoneIcon(
            name = "Oven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 184.000 112.000 L 184.000 184.000 L 72.000 184.000 L 72.000 112.000 Z"),
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
                pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 208.000 208.000 L 48.000 208.000 L 48.000 48.000 L 208.000 48.000 L 208.000 208.000 ZM 72.000 76.000 C 72.000 69.373 77.373 64.000 84.000 64.000 C 90.627 64.000 96.000 69.373 96.000 76.000 C 96.000 82.627 90.627 88.000 84.000 88.000 C 77.373 88.000 72.000 82.627 72.000 76.000 ZM 116.000 76.000 C 116.000 69.373 121.373 64.000 128.000 64.000 C 134.627 64.000 140.000 69.373 140.000 76.000 C 140.000 82.627 134.627 88.000 128.000 88.000 C 121.373 88.000 116.000 82.627 116.000 76.000 ZM 160.000 76.000 C 160.000 69.373 165.373 64.000 172.000 64.000 C 178.627 64.000 184.000 69.373 184.000 76.000 C 184.000 82.627 178.627 88.000 172.000 88.000 C 165.373 88.000 160.000 82.627 160.000 76.000 ZM 184.000 104.000 L 72.000 104.000 C 67.582 104.000 64.000 107.582 64.000 112.000 L 64.000 184.000 C 64.000 188.418 67.582 192.000 72.000 192.000 L 184.000 192.000 C 188.418 192.000 192.000 188.418 192.000 184.000 L 192.000 112.000 C 192.000 107.582 188.418 104.000 184.000 104.000 ZM 176.000 176.000 L 80.000 176.000 L 80.000 120.000 L 176.000 120.000 Z"),
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
        return _oven!!
    }

private var _oven: ImageVector? = null
