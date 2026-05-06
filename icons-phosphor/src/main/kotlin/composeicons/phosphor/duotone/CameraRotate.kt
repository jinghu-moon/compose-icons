package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = phosphorDuotoneIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 80v112c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-112C32 71.163 39.163 64 48 64h32L96 40h64l16 24h32c8.837 0 16 7.163 16 16Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 56h-27.72L166.65 35.56C165.167 33.337 162.672 32.002 160 32h-64c-2.672 .002-5.167 1.337-6.65 3.56L75.71 56h-27.71C34.745 56 24 66.745 24 80v112c0 13.255 10.745 24 24 24h160c13.255 0 24-10.745 24-24v-112C232 66.745 221.255 56 208 56ZM216 192c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8h32c2.676 .002 5.175-1.334 6.66-3.56L100.28 48h55.43l13.63 20.44c1.485 2.226 3.984 3.562 6.66 3.56h32c4.418 0 8 3.582 8 8ZM176 96v24c0 4.418-3.582 8-8 8h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h5.15c-11.387-9.976-28.194-10.647-40.34-1.61-3.532 2.656-8.549 1.947-11.205-1.585-2.656-3.532-1.947-8.549 1.585-11.205C117.521 83.953 142.916 85.051 160 100.23v-4.23c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM158.39 155.2c2.655 3.529 1.948 8.543-1.58 11.2C138.479 180.047 113.084 178.949 96 163.77v4.23c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24c0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-5.15c11.387 9.976 28.194 10.647 40.34 1.61 3.532-2.653 8.546-1.941 11.2 1.59Z"),
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
