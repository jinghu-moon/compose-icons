package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorFillIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 208c.001 2.164-.875 4.236-2.427 5.743-1.553 1.507-3.65 2.322-5.813 2.257-4.353-.274-7.748-3.878-7.76-8.24-.125-4.233-3.527-7.635-7.76-7.76-4.362-.012-7.966-3.407-8.24-7.76-.065-2.163 .749-4.26 2.257-5.813C27.764 184.875 29.836 183.999 32 184c13.255 0 24 10.745 24 24ZM32 152c-2.239-.007-4.379 .924-5.9 2.568-1.52 1.644-2.282 3.85-2.1 6.082 .425 4.216 4.003 7.408 8.24 7.35 21.904 .131 39.629 17.856 39.76 39.76-.057 4.241 3.14 7.82 7.36 8.24 2.23 .179 4.434-.584 6.075-2.104C87.077 212.376 88.007 210.237 88 208 87.967 177.086 62.914 152.033 32 152ZM32 120c-2.23-.006-4.361 .918-5.88 2.551-1.519 1.633-2.287 3.825-2.12 6.049 .425 4.248 4.032 7.463 8.3 7.4 39.505 .208 71.481 32.175 71.7 71.68-.063 4.268 3.152 7.875 7.4 8.3 2.224 .167 4.416-.601 6.049-2.12 1.633-1.519 2.557-3.65 2.551-5.88C119.934 159.41 80.57 120.055 32 120ZM216 40h-176C31.163 40 24 47.163 24 56v44.08c-.001 1.087 .441 2.128 1.224 2.883 .783 .755 1.839 1.158 2.926 1.117 28.889-1.038 56.909 9.983 77.35 30.423 20.442 20.44 31.465 48.458 30.43 77.347-.041 1.087 .363 2.143 1.117 2.926 .755 .783 1.795 1.225 2.883 1.224h76.07c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16Z"),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
