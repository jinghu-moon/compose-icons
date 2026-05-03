package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) return _alignCenterVertical!!
        _alignCenterVertical = phosphorDuotoneIcon(
            name = "AlignCenterVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 72.000 L 200.000 184.000 C 200.000 188.418 196.418 192.000 192.000 192.000 L 152.000 192.000 C 147.582 192.000 144.000 188.418 144.000 184.000 L 144.000 72.000 C 144.000 67.582 147.582 64.000 152.000 64.000 L 192.000 64.000 C 196.418 64.000 200.000 67.582 200.000 72.000 ZM 104.000 40.000 L 64.000 40.000 C 59.582 40.000 56.000 43.582 56.000 48.000 L 56.000 208.000 C 56.000 212.418 59.582 216.000 64.000 216.000 L 104.000 216.000 C 108.418 216.000 112.000 212.418 112.000 208.000 L 112.000 48.000 C 112.000 43.582 108.418 40.000 104.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 224.000 120.000 L 208.000 120.000 L 208.000 72.000 C 208.000 63.163 200.837 56.000 192.000 56.000 L 152.000 56.000 C 143.163 56.000 136.000 63.163 136.000 72.000 L 136.000 120.000 L 120.000 120.000 L 120.000 48.000 C 120.000 39.163 112.837 32.000 104.000 32.000 L 64.000 32.000 C 55.163 32.000 48.000 39.163 48.000 48.000 L 48.000 120.000 L 32.000 120.000 C 27.582 120.000 24.000 123.582 24.000 128.000 C 24.000 132.418 27.582 136.000 32.000 136.000 L 48.000 136.000 L 48.000 208.000 C 48.000 216.837 55.163 224.000 64.000 224.000 L 104.000 224.000 C 112.837 224.000 120.000 216.837 120.000 208.000 L 120.000 136.000 L 136.000 136.000 L 136.000 184.000 C 136.000 192.837 143.163 200.000 152.000 200.000 L 192.000 200.000 C 200.837 200.000 208.000 192.837 208.000 184.000 L 208.000 136.000 L 224.000 136.000 C 228.418 136.000 232.000 132.418 232.000 128.000 C 232.000 123.582 228.418 120.000 224.000 120.000 ZM 104.000 208.000 L 64.000 208.000 L 64.000 48.000 L 104.000 48.000 ZM 192.000 184.000 L 152.000 184.000 L 152.000 72.000 L 192.000 72.000 Z"),
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
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
