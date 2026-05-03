package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Jeep: ImageVector
    get() {
        if (_jeep != null) return _jeep!!
        _jeep = phosphorDuotoneIcon(
            name = "Jeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 96.000 L 32.000 96.000 L 42.650 46.320 C 43.442 42.634 46.700 40.001 50.470 40.000 L 205.530 40.000 C 209.300 40.001 212.558 42.634 213.350 46.320 Z"),
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
                pathData = parseSvgPathData("M 240.000 88.000 L 230.470 88.000 L 221.180 44.650 C 219.572 37.287 213.067 32.028 205.530 32.000 L 50.470 32.000 C 42.933 32.028 36.428 37.287 34.820 44.650 L 25.530 88.000 L 16.000 88.000 C 11.582 88.000 8.000 91.582 8.000 96.000 C 8.000 100.418 11.582 104.000 16.000 104.000 L 24.000 104.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 64.000 216.000 C 72.837 216.000 80.000 208.837 80.000 200.000 L 80.000 176.000 L 176.000 176.000 L 176.000 200.000 C 176.000 208.837 183.163 216.000 192.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 104.000 L 240.000 104.000 C 244.418 104.000 248.000 100.418 248.000 96.000 C 248.000 91.582 244.418 88.000 240.000 88.000 ZM 50.470 48.000 L 205.530 48.000 L 214.100 88.000 L 41.900 88.000 ZM 64.000 200.000 L 40.000 200.000 L 40.000 176.000 L 64.000 176.000 ZM 192.000 200.000 L 192.000 176.000 L 216.000 176.000 L 216.000 200.000 ZM 216.000 160.000 L 152.000 160.000 L 152.000 128.000 C 152.000 123.582 148.418 120.000 144.000 120.000 C 139.582 120.000 136.000 123.582 136.000 128.000 L 136.000 160.000 L 120.000 160.000 L 120.000 128.000 C 120.000 123.582 116.418 120.000 112.000 120.000 C 107.582 120.000 104.000 123.582 104.000 128.000 L 104.000 160.000 L 40.000 160.000 L 40.000 104.000 L 216.000 104.000 ZM 56.000 132.000 C 56.000 125.373 61.373 120.000 68.000 120.000 C 74.627 120.000 80.000 125.373 80.000 132.000 C 80.000 138.627 74.627 144.000 68.000 144.000 C 61.373 144.000 56.000 138.627 56.000 132.000 ZM 176.000 132.000 C 176.000 125.373 181.373 120.000 188.000 120.000 C 194.627 120.000 200.000 125.373 200.000 132.000 C 200.000 138.627 194.627 144.000 188.000 144.000 C 181.373 144.000 176.000 138.627 176.000 132.000 Z"),
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
        return _jeep!!
    }

private var _jeep: ImageVector? = null
