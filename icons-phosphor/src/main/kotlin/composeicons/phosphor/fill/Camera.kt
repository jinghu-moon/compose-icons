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
                pathData = parseSvgPathData("M208 56h-27.72L166.65 35.56C165.167 33.337 162.672 32.002 160 32h-64c-2.672 .002-5.167 1.337-6.65 3.56L75.71 56h-27.71C34.745 56 24 66.745 24 80v112c0 13.255 10.745 24 24 24h160c13.255 0 24-10.745 24-24v-112C232 66.745 221.255 56 208 56ZM164 132c0 19.882-16.118 36-36 36C108.118 168 92 151.882 92 132c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36Z"),
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
