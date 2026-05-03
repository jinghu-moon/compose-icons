package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorDuotoneIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 120.000 L 232.000 192.000 C 232.000 196.418 228.418 200.000 224.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 196.418 24.000 192.000 L 24.000 120.000 Z"),
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
                pathData = parseSvgPathData("M 224.000 64.000 L 176.000 64.000 L 176.000 56.000 C 176.000 42.745 165.255 32.000 152.000 32.000 L 104.000 32.000 C 90.745 32.000 80.000 42.745 80.000 56.000 L 80.000 64.000 L 32.000 64.000 C 23.163 64.000 16.000 71.163 16.000 80.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 80.000 C 240.000 71.163 232.837 64.000 224.000 64.000 ZM 96.000 56.000 C 96.000 51.582 99.582 48.000 104.000 48.000 L 152.000 48.000 C 156.418 48.000 160.000 51.582 160.000 56.000 L 160.000 64.000 L 96.000 64.000 ZM 32.000 80.000 L 224.000 80.000 L 224.000 112.000 L 192.000 112.000 L 192.000 104.000 C 192.000 99.582 188.418 96.000 184.000 96.000 C 179.582 96.000 176.000 99.582 176.000 104.000 L 176.000 112.000 L 80.000 112.000 L 80.000 104.000 C 80.000 99.582 76.418 96.000 72.000 96.000 C 67.582 96.000 64.000 99.582 64.000 104.000 L 64.000 112.000 L 32.000 112.000 ZM 224.000 192.000 L 32.000 192.000 L 32.000 128.000 L 64.000 128.000 L 64.000 136.000 C 64.000 140.418 67.582 144.000 72.000 144.000 C 76.418 144.000 80.000 140.418 80.000 136.000 L 80.000 128.000 L 176.000 128.000 L 176.000 136.000 C 176.000 140.418 179.582 144.000 184.000 144.000 C 188.418 144.000 192.000 140.418 192.000 136.000 L 192.000 128.000 L 224.000 128.000 L 224.000 192.000 Z"),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
