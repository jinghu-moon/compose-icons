package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorFillIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 56h-27.72L166.65 35.56C165.167 33.337 162.672 32.002 160 32h-64c-2.672 .002-5.167 1.337-6.65 3.56L75.71 56h-27.71C34.745 56 24 66.745 24 80v112c0 13.255 10.745 24 24 24h160c13.255 0 24-10.745 24-24v-112C232 66.745 221.255 56 208 56ZM156.81 166.4C138.479 180.047 113.084 178.949 96 163.77v4.23c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-5.15c11.387 9.976 28.194 10.647 40.34 1.61 3.532-2.656 8.549-1.947 11.205 1.585 2.656 3.532 1.947 8.549-1.585 11.205ZM176 120c0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h5.15c-11.387-9.976-28.194-10.647-40.34-1.61-3.532 2.656-8.549 1.947-11.205-1.585-2.656-3.532-1.947-8.549 1.585-11.205C117.521 83.953 142.916 85.051 160 100.23v-4.23c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
