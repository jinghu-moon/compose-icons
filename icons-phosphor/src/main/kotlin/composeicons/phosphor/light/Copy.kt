package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Copy: ImageVector
    get() {
        if (_copy != null) return _copy!!
        _copy = phosphorLightIcon(
            name = "Copy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 34h-128c-3.314 0-6 2.686-6 6v42h-42c-3.314 0-6 2.686-6 6v128c0 3.314 2.686 6 6 6h128c3.314 0 6-2.686 6-6v-42h42c3.314 0 6-2.686 6-6v-128c0-3.314-2.686-6-6-6ZM162 210h-116v-116h116ZM210 162h-36v-74c0-3.314-2.686-6-6-6h-74v-36h116Z"),
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
        return _copy!!
    }

private var _copy: ImageVector? = null
