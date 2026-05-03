package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorFillIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 192.000 L 232.000 192.000 L 232.000 98.670 C 232.000 93.322 229.329 88.328 224.880 85.360 L 136.880 26.690 C 131.506 23.107 124.504 23.107 119.130 26.690 L 31.130 85.360 C 26.678 88.326 24.002 93.320 24.000 98.670 L 24.000 192.000 L 16.000 192.000 C 11.582 192.000 8.000 195.582 8.000 200.000 C 8.000 204.418 11.582 208.000 16.000 208.000 L 240.000 208.000 C 244.418 208.000 248.000 204.418 248.000 200.000 C 248.000 195.582 244.418 192.000 240.000 192.000 ZM 136.000 128.000 L 192.000 128.000 L 192.000 152.000 L 136.000 152.000 ZM 120.000 152.000 L 64.000 152.000 L 64.000 128.000 L 120.000 128.000 ZM 64.000 168.000 L 120.000 168.000 L 120.000 192.000 L 64.000 192.000 ZM 136.000 168.000 L 192.000 168.000 L 192.000 192.000 L 136.000 192.000 Z"),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
