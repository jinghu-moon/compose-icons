package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) return _phoneDisconnect!!
        _phoneDisconnect = phosphorLightIcon(
            name = "PhoneDisconnect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.19 91.55h0c-55.39-55.4-149-55.4-204.38 0C6.56 110.82 4.7 139.22 21.29 160.61c3.813 4.851 10.352 6.635 16.1 4.39l49-17.38 .22-.09c4.4-1.745 7.613-5.606 8.53-10.25l5.9-29.52c.117-.669 .576-1.227 1.21-1.47 16.569-5.751 34.586-5.79 51.18-.11 .632 .237 1.095 .787 1.22 1.45l6.21 29.75c.957 4.59 4.147 8.397 8.5 10.14l.23 .08 49 17.4c5.754 2.238 12.295 .442 16.1-4.42 16.61-21.36 14.75-49.76-4.5-69.03ZM225.19 153.26c-.555 .672-1.482 .906-2.29 .58l-.22-.09-49-17.38c-.551-.267-.949-.772-1.08-1.37l-6.22-29.74c-1-4.798-4.437-8.724-9.06-10.35-19.129-6.546-39.9-6.5-59 .13-4.627 1.662-8.043 5.628-9 10.45L83.37 135c-.126 .639-.555 1.176-1.15 1.44L33.28 153.75l-.22 .09c-.808 .326-1.735 .092-2.29-.58-13-16.74-11.56-38.12 3.53-53.22C59.69 74.64 93.85 61.94 128 61.94c34.15 0 68.31 12.7 93.7 38.1 15.09 15.1 16.51 36.48 3.53 53.22ZM222 200c0 3.314-2.686 6-6 6h-176c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h176c3.314 0 6 2.686 6 6Z"),
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
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
