package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorLightIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 200c0 3.314-2.686 6-6 6h-192c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h192c3.314 0 6 2.686 6 6ZM27.39 150c-2.389-4.917-1.698-10.774 1.77-15L110.82 34.2c4.196-5.185 10.51-8.198 17.18-8.198 6.67 0 12.984 3.013 17.18 8.198L226.84 135c3.443 4.217 4.148 10.041 1.811 14.958-2.337 4.917-7.297 8.048-12.741 8.042h-175.82c-5.426 .02-10.375-3.098-12.7-8ZM38.22 144.84c.335 .726 1.071 1.182 1.87 1.16h175.82c.804 .018 1.541-.447 1.87-1.18 .38-.731 .273-1.62-.27-2.24L135.86 41.76C133.943 39.384 131.053 38.003 128 38.003c-3.053 0-5.943 1.381-7.86 3.757L38.49 142.58c-.543 .62-.65 1.509-.27 2.24Z"),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
