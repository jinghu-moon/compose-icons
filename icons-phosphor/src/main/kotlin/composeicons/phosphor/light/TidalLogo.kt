package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorLightIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252.24 91.76l-40-40c-2.343-2.34-6.137-2.34-8.48 0L168 87.52 132.24 51.76c-2.343-2.34-6.137-2.34-8.48 0L88 87.52 52.24 51.76c-2.343-2.34-6.137-2.34-8.48 0L3.76 91.76c-2.34 2.343-2.34 6.137 0 8.48l40 40c2.343 2.34 6.137 2.34 8.48 0L88 104.48 119.52 136 83.76 171.76c-2.34 2.343-2.34 6.137 0 8.48l40 40c2.343 2.34 6.137 2.34 8.48 0l40-40c2.34-2.343 2.34-6.137 0-8.48L136.48 136 168 104.48l35.76 35.76c2.343 2.34 6.137 2.34 8.48 0l40-40c2.34-2.343 2.34-6.137 0-8.48ZM48 127.51 16.49 96 48 64.49 79.51 96ZM128 207.51 96.49 176 128 144.49 159.51 176ZM128 127.51 96.49 96 128 64.49 159.51 96ZM208 127.51 176.49 96 208 64.49 239.51 96Z"),
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
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
