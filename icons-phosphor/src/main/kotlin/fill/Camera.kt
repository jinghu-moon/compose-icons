package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = phosphorFillIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 56.000 L 180.280 56.000 L 166.650 35.560 C 165.167 33.337 162.672 32.002 160.000 32.000 L 96.000 32.000 C 93.328 32.002 90.833 33.337 89.350 35.560 L 75.710 56.000 L 48.000 56.000 C 34.745 56.000 24.000 66.745 24.000 80.000 L 24.000 192.000 C 24.000 205.255 34.745 216.000 48.000 216.000 L 208.000 216.000 C 221.255 216.000 232.000 205.255 232.000 192.000 L 232.000 80.000 C 232.000 66.745 221.255 56.000 208.000 56.000 ZM 164.000 132.000 C 164.000 151.882 147.882 168.000 128.000 168.000 C 108.118 168.000 92.000 151.882 92.000 132.000 C 92.000 112.118 108.118 96.000 128.000 96.000 C 147.882 96.000 164.000 112.118 164.000 132.000 Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
