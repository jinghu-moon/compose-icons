package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorLightIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 120v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM48 90c-3.314 0-6 2.686-6 6v96c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-96c0-3.314-2.686-6-6-6ZM80 82c-3.314 0-6 2.686-6 6v104c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-104c0-3.314-2.686-6-6-6ZM112 50c-3.314 0-6 2.686-6 6v136c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-136c0-3.314-2.686-6-6-6ZM221.06 107.88C215.093 69.945 182.402 41.996 144 42c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6 33.916-.121 62.359 25.576 65.67 59.33 .265 2.636 2.229 4.787 4.83 5.29 17.208 3.332 29.063 19.199 27.38 36.645C240.197 172.711 225.527 186.019 208 186h-64c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h64c22.873 .022 42.288-16.766 45.568-39.403 3.28-22.637-10.57-44.245-32.508-50.717Z"),
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
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null
