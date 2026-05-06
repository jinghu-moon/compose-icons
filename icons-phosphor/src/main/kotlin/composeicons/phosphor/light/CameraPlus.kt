package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorLightIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M166 136c0 3.314-2.686 6-6 6h-26v26c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-26h-26c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h26v-26c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v26h26c3.314 0 6 2.686 6 6ZM230 80v112c0 12.15-9.85 22-22 22h-160C35.85 214 26 204.15 26 192v-112C26 67.85 35.85 58 48 58h28.79L88.63 40.23C91.228 36.336 95.599 33.999 100.28 34h55.44c4.681-.001 9.052 2.336 11.65 6.23L179.21 58h28.79c12.15 0 22 9.85 22 22ZM218 80c0-5.523-4.477-10-10-10h-32c-2.008 .003-3.885-.999-5-2.67L157.38 46.89c-.37-.555-.993-.889-1.66-.89h-55.44c-.667 .001-1.29 .335-1.66 .89L85 67.33C83.885 69.001 82.009 70.003 80 70h-32C42.477 70 38 74.477 38 80v112c0 5.523 4.477 10 10 10h160c5.523 0 10-4.477 10-10Z"),
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
