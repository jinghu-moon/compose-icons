package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorRegularIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M175.84 111.54c-.514-2.523-2.211-4.645-4.56-5.7l-50-22.43L135 25.85c.835-3.535-.817-7.188-4.021-8.897-3.205-1.709-7.158-1.045-9.629 1.617L26.13 121.42c-1.749 1.89-2.481 4.506-1.968 7.029 .513 2.523 2.21 4.645 4.558 5.701l50 22.44L65 214.15c-.835 3.535 .817 7.188 4.021 8.897 3.205 1.709 7.158 1.045 9.629-1.617L173.85 118.58c1.76-1.888 2.501-4.51 1.99-7.04ZM87.62 188.21l8.16-34.36c.89-3.735-.999-7.575-4.5-9.15L45.43 124.12 112.38 51.79l-8.16 34.36c-.89 3.735 .999 7.575 4.5 9.15l45.84 20.58ZM239.15 212.42l-36-72c-1.355-2.71-4.125-4.421-7.155-4.421-3.03 0-5.8 1.712-7.155 4.421l-36 72c-1.977 3.952-.377 8.758 3.575 10.735 3.952 1.977 8.758 .377 10.735-3.575L176.94 200h38.11l9.79 19.58c1.357 2.711 4.129 4.422 7.16 4.42 2.772-.001 5.346-1.438 6.803-3.797 1.456-2.359 1.588-5.304 .347-7.783ZM184.94 184 196 161.89 207.05 184Z"),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
