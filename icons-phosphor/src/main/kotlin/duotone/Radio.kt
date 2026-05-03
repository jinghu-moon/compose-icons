package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorDuotoneIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 72.000 L 32.000 72.000 L 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 L 216.000 200.000 C 220.418 200.000 224.000 196.418 224.000 192.000 L 224.000 80.000 C 224.000 75.582 220.418 72.000 216.000 72.000 ZM 160.000 168.000 C 142.327 168.000 128.000 153.673 128.000 136.000 C 128.000 118.327 142.327 104.000 160.000 104.000 C 177.673 104.000 192.000 118.327 192.000 136.000 C 192.000 153.673 177.673 168.000 160.000 168.000 Z"),
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
                pathData = parseSvgPathData("M 104.000 168.000 C 104.000 172.418 100.418 176.000 96.000 176.000 L 64.000 176.000 C 59.582 176.000 56.000 172.418 56.000 168.000 C 56.000 163.582 59.582 160.000 64.000 160.000 L 96.000 160.000 C 100.418 160.000 104.000 163.582 104.000 168.000 ZM 96.000 128.000 L 64.000 128.000 C 59.582 128.000 56.000 131.582 56.000 136.000 C 56.000 140.418 59.582 144.000 64.000 144.000 L 96.000 144.000 C 100.418 144.000 104.000 140.418 104.000 136.000 C 104.000 131.582 100.418 128.000 96.000 128.000 ZM 96.000 96.000 L 64.000 96.000 C 59.582 96.000 56.000 99.582 56.000 104.000 C 56.000 108.418 59.582 112.000 64.000 112.000 L 96.000 112.000 C 100.418 112.000 104.000 108.418 104.000 104.000 C 104.000 99.582 100.418 96.000 96.000 96.000 ZM 232.000 80.000 L 232.000 192.000 C 232.000 200.837 224.837 208.000 216.000 208.000 L 40.000 208.000 C 31.163 208.000 24.000 200.837 24.000 192.000 L 24.000 72.000 C 24.001 68.468 26.318 65.355 29.700 64.340 L 189.700 16.340 C 193.933 15.070 198.395 17.472 199.665 21.705 C 200.935 25.938 198.533 30.400 194.300 31.670 L 86.510 64.000 L 216.000 64.000 C 224.837 64.000 232.000 71.163 232.000 80.000 ZM 216.000 192.000 L 216.000 80.000 L 40.000 80.000 L 40.000 192.000 L 216.000 192.000 ZM 200.000 136.000 C 200.000 158.091 182.091 176.000 160.000 176.000 C 137.909 176.000 120.000 158.091 120.000 136.000 C 120.000 113.909 137.909 96.000 160.000 96.000 C 182.091 96.000 200.000 113.909 200.000 136.000 ZM 184.000 136.000 C 184.000 122.745 173.255 112.000 160.000 112.000 C 146.745 112.000 136.000 122.745 136.000 136.000 C 136.000 149.255 146.745 160.000 160.000 160.000 C 173.255 160.000 184.000 149.255 184.000 136.000 Z"),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
