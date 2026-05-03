package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = phosphorDuotoneIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 64.000 104.000 L 64.000 64.000 C 64.000 59.582 67.582 56.000 72.000 56.000 L 184.000 56.000 C 188.418 56.000 192.000 59.582 192.000 64.000 L 192.000 104.000 C 192.000 108.418 188.418 112.000 184.000 112.000 L 72.000 112.000 C 67.582 112.000 64.000 108.418 64.000 104.000 ZM 208.000 144.000 L 48.000 144.000 C 43.582 144.000 40.000 147.582 40.000 152.000 L 40.000 192.000 C 40.000 196.418 43.582 200.000 48.000 200.000 L 208.000 200.000 C 212.418 200.000 216.000 196.418 216.000 192.000 L 216.000 152.000 C 216.000 147.582 212.418 144.000 208.000 144.000 Z"),
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
                pathData = parseSvgPathData("M 208.000 136.000 L 136.000 136.000 L 136.000 120.000 L 184.000 120.000 C 192.837 120.000 200.000 112.837 200.000 104.000 L 200.000 64.000 C 200.000 55.163 192.837 48.000 184.000 48.000 L 136.000 48.000 L 136.000 32.000 C 136.000 27.582 132.418 24.000 128.000 24.000 C 123.582 24.000 120.000 27.582 120.000 32.000 L 120.000 48.000 L 72.000 48.000 C 63.163 48.000 56.000 55.163 56.000 64.000 L 56.000 104.000 C 56.000 112.837 63.163 120.000 72.000 120.000 L 120.000 120.000 L 120.000 136.000 L 48.000 136.000 C 39.163 136.000 32.000 143.163 32.000 152.000 L 32.000 192.000 C 32.000 200.837 39.163 208.000 48.000 208.000 L 120.000 208.000 L 120.000 224.000 C 120.000 228.418 123.582 232.000 128.000 232.000 C 132.418 232.000 136.000 228.418 136.000 224.000 L 136.000 208.000 L 208.000 208.000 C 216.837 208.000 224.000 200.837 224.000 192.000 L 224.000 152.000 C 224.000 143.163 216.837 136.000 208.000 136.000 ZM 72.000 64.000 L 184.000 64.000 L 184.000 104.000 L 72.000 104.000 ZM 208.000 192.000 L 48.000 192.000 L 48.000 152.000 L 208.000 152.000 L 208.000 192.000 Z"),
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
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
