package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Textbox: ImageVector
    get() {
        if (_textbox != null) return _textbox!!
        _textbox = phosphorLightIcon(
            name = "Textbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 42c-3.314 0-6 2.686-6 6v18h-82C16.268 66 10 72.268 10 80v96c0 7.732 6.268 14 14 14h82v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-160c0-3.314-2.686-6-6-6ZM24 178c-1.105 0-2-.895-2-2v-96c0-1.105 .895-2 2-2h82v100ZM246 80v96c0 7.732-6.268 14-14 14h-88c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h88c1.105 0 2-.895 2-2v-96c0-1.105-.895-2-2-2h-88c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h88c7.732 0 14 6.268 14 14ZM86 112c0 3.314-2.686 6-6 6h-10v26c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-26h-10c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6Z"),
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
        return _textbox!!
    }

private var _textbox: ImageVector? = null
