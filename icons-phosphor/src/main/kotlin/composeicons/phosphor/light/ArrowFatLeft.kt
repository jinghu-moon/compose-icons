package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowFatLeft: ImageVector
    get() {
        if (_arrowFatLeft != null) return _arrowFatLeft!!
        _arrowFatLeft = phosphorLightIcon(
            name = "ArrowFatLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 74h-82v-42c-.002-2.425-1.464-4.611-3.705-5.538-2.241-.928-4.819-.415-6.535 1.298L19.76 123.76c-2.34 2.343-2.34 6.137 0 8.48l96 96c1.716 1.714 4.295 2.226 6.535 1.298 2.241-.928 3.702-3.113 3.705-5.538v-42h82c7.732 0 14-6.268 14-14v-80c0-7.732-6.268-14-14-14ZM210 168c0 1.105-.895 2-2 2h-88c-3.314 0-6 2.686-6 6v33.51L32.49 128 114 46.49v33.51c0 3.314 2.686 6 6 6h88c1.105 0 2 .895 2 2Z"),
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
        return _arrowFatLeft!!
    }

private var _arrowFatLeft: ImageVector? = null
