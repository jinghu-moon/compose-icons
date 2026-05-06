package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorRegularIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 136c0 4.418-3.582 8-8 8h-24v24c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-24h-24c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24v-24c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v24h24c4.418 0 8 3.582 8 8ZM232 80v112c0 13.255-10.745 24-24 24h-160C34.745 216 24 205.255 24 192v-112C24 66.745 34.745 56 48 56h27.72L87 39.12C89.962 34.68 94.943 32.01 100.28 32h55.44c5.337 .01 10.318 2.68 13.28 7.12L180.28 56h27.72c13.255 0 24 10.745 24 24ZM216 80c0-4.418-3.582-8-8-8h-32c-2.676 .002-5.175-1.334-6.66-3.56L155.72 48h-55.44L86.66 68.44C85.175 70.666 82.676 72.002 80 72h-32c-4.418 0-8 3.582-8 8v112c0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8Z"),
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
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
