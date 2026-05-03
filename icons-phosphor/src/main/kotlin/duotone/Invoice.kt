package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Invoice: ImageVector
    get() {
        if (_invoice != null) return _invoice!!
        _invoice = phosphorDuotoneIcon(
            name = "Invoice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 104.000 L 224.000 192.000 C 224.000 196.418 220.418 200.000 216.000 200.000 L 168.000 200.000 L 168.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 28.000 128.000 C 23.582 128.000 20.000 124.418 20.000 120.000 C 20.000 115.582 23.582 112.000 28.000 112.000 L 56.000 112.000 C 60.418 112.000 64.000 108.418 64.000 104.000 C 64.000 99.582 60.418 96.000 56.000 96.000 L 40.000 96.000 C 26.745 96.000 16.000 85.255 16.000 72.000 C 16.000 58.745 26.745 48.000 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 C 52.418 40.000 56.000 43.582 56.000 48.000 L 64.000 48.000 C 68.418 48.000 72.000 51.582 72.000 56.000 C 72.000 60.418 68.418 64.000 64.000 64.000 L 40.000 64.000 C 35.582 64.000 32.000 67.582 32.000 72.000 C 32.000 76.418 35.582 80.000 40.000 80.000 L 56.000 80.000 C 69.255 80.000 80.000 90.745 80.000 104.000 C 80.000 117.255 69.255 128.000 56.000 128.000 C 56.000 132.418 52.418 136.000 48.000 136.000 C 43.582 136.000 40.000 132.418 40.000 128.000 ZM 232.000 56.000 L 232.000 192.000 C 232.000 200.837 224.837 208.000 216.000 208.000 L 40.000 208.000 C 31.163 208.000 24.000 200.837 24.000 192.000 L 24.000 152.000 C 24.000 147.582 27.582 144.000 32.000 144.000 C 36.418 144.000 40.000 147.582 40.000 152.000 L 40.000 192.000 L 160.000 192.000 L 160.000 160.000 L 80.000 160.000 C 75.582 160.000 72.000 156.418 72.000 152.000 C 72.000 147.582 75.582 144.000 80.000 144.000 L 160.000 144.000 L 160.000 112.000 L 104.000 112.000 C 99.582 112.000 96.000 108.418 96.000 104.000 C 96.000 99.582 99.582 96.000 104.000 96.000 L 216.000 96.000 L 216.000 64.000 L 96.000 64.000 C 91.582 64.000 88.000 60.418 88.000 56.000 C 88.000 51.582 91.582 48.000 96.000 48.000 L 224.000 48.000 C 228.418 48.000 232.000 51.582 232.000 56.000 ZM 176.000 144.000 L 216.000 144.000 L 216.000 112.000 L 176.000 112.000 ZM 216.000 192.000 L 216.000 160.000 L 176.000 160.000 L 176.000 192.000 Z"),
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
        return _invoice!!
    }

private var _invoice: ImageVector? = null
