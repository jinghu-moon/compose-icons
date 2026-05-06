package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorLightIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 192c0 3.314-2.686 6-6 6h-63.06c-5.308 .018-10.164-2.984-12.52-7.74L96.84 87.11C96.504 86.434 95.815 86.004 95.06 86h-63.06c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h63.06c5.308-.018 10.164 2.984 12.52 7.74l51.58 103.15c.336 .676 1.025 1.106 1.78 1.11h63.06c3.314 0 6 2.686 6 6ZM152 86h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-72c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6Z"),
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
        return _option!!
    }

private var _option: ImageVector? = null
