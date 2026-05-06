package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorLightIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 170h-11L183.15 46h8.85c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-128c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h8.85L51 170h-11c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h82v58c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-58h82c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM85 46h86l21.88 124h-129.73Z"),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
