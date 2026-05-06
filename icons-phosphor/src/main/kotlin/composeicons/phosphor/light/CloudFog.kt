package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorLightIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 206h-48c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM184 194h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM160 226h-56c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h56c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM230 100c-.05 40.849-33.151 73.95-74 74h-80C56.969 173.904 39.644 163.012 31.307 145.905 22.969 128.797 25.067 108.44 36.717 93.392 48.367 78.344 67.55 71.214 86.2 75 98.369 41.116 133.138 20.887 168.609 27.054 204.079 33.221 229.981 63.997 230 100ZM218 100C217.891 66.515 191.237 39.154 157.766 38.169 124.296 37.184 96.078 62.929 94 96.35c-.193 3.314-3.036 5.843-6.35 5.65C84.336 101.807 81.807 98.964 82 95.65c.177-3.019 .534-6.024 1.07-9C68.907 83.996 54.462 89.582 45.768 101.072c-8.694 11.491-10.141 26.91-3.736 39.818C48.437 153.798 61.591 161.973 76 162h80c34.226-.039 61.961-27.774 62-62Z"),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
