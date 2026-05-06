package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorBoldIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L71.79 84C34.235 84.058 3.837 114.55 3.895 152.105 3.953 189.66 34.445 220.058 72 220h88c10.445 .021 20.815-1.752 30.66-5.24l8.46 9.31c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM160 196h-88C48.159 195.849 28.776 176.738 28.288 152.901c-.488-23.836 18.098-43.725 41.912-44.851C68.741 114.6 68.003 121.29 68 128c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 .002-6.373 .898-12.715 2.66-18.84l77.88 85.67c-4.135 .773-8.333 1.165-12.54 1.17ZM252 128c.043 19.405-6.098 38.32-17.53 54-2.49 3.548-6.7 5.478-11.014 5.047-4.313-.43-8.059-3.153-9.8-7.124-1.74-3.97-1.204-8.57 1.403-12.034 18.938-26.073 16.975-61.858-4.702-85.703C188.682 58.342 153.245 52.986 125.49 69.36c-5.688 3.179-12.874 1.238-16.188-4.373-3.313-5.611-1.543-12.841 3.988-16.287 28.45-16.766 63.703-16.998 92.371-.609C234.329 64.481 252.014 94.978 252 128Z"),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
