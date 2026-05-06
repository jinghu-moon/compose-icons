package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) return _whatsappLogo!!
        _whatsappLogo = phosphorThinIcon(
            name = "WhatsappLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M185.79 148.42l-32-16c-1.282-.639-2.808-.543-4 .25l-16.64 11.1c-9.147-4.387-16.523-11.763-20.91-20.91l11.1-16.64c.793-1.192 .889-2.718 .25-4l-16-32C106.913 68.857 105.521 67.997 104 68 84.118 68 68 84.118 68 104c.05 46.371 37.629 83.95 84 84 19.882 0 36-16.118 36-36 .001-1.516-.855-2.902-2.21-3.58ZM152 180C110.045 179.956 76.044 145.955 76 104 75.998 89.472 87.107 77.356 101.58 76.1l13.8 27.61-11 16.54c-.745 1.108-.887 2.515-.38 3.75 5.314 12.635 15.365 22.686 28 28 1.236 .514 2.648 .375 3.76-.37l16.54-11 27.61 13.8C178.649 168.903 166.528 180.008 152 180ZM128 28C92.578 27.993 59.795 46.726 41.818 77.248c-17.978 30.521-18.467 68.275-1.288 99.252L28.63 212.19c-1.438 4.312-.316 9.067 2.898 12.282 3.214 3.214 7.969 4.337 12.282 2.898L79.5 215.47c36.58 20.269 81.911 15.634 113.632-11.619 31.722-27.253 43.134-71.367 28.609-110.584C207.216 54.051 169.821 28.014 128 28ZM128 220c-16.175 .005-32.066-4.255-46.07-12.35-.609-.35-1.298-.536-2-.54-.432-0-.861 .071-1.27 .21L41.28 219.78c-1.437 .479-3.022 .105-4.094-.966-1.071-1.071-1.446-2.656-.966-4.094L48.68 177.34c.364-1.087 .243-2.278-.33-3.27C27.495 138.022 33.457 92.461 62.884 62.992 92.312 33.523 137.865 27.498 173.942 48.301c36.077 20.804 53.68 63.248 42.916 103.479C206.093 192.011 169.646 219.993 128 220Z"),
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
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
