package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorLightIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 192.000 C 222.000 195.314 219.314 198.000 216.000 198.000 C 212.686 198.000 210.000 195.314 210.000 192.000 C 210.000 111.500 144.500 46.000 64.000 46.000 C 60.686 46.000 58.000 43.314 58.000 40.000 C 58.000 36.686 60.686 34.000 64.000 34.000 C 151.120 34.000 222.000 104.880 222.000 192.000 ZM 64.000 106.000 C 60.686 106.000 58.000 108.686 58.000 112.000 C 58.000 115.314 60.686 118.000 64.000 118.000 C 104.849 118.050 137.950 151.151 138.000 192.000 C 138.000 195.314 140.686 198.000 144.000 198.000 C 147.314 198.000 150.000 195.314 150.000 192.000 C 149.945 144.526 111.474 106.055 64.000 106.000 ZM 68.000 178.000 C 62.477 178.000 58.000 182.477 58.000 188.000 C 58.000 193.523 62.477 198.000 68.000 198.000 C 73.523 198.000 78.000 193.523 78.000 188.000 C 78.000 182.477 73.523 178.000 68.000 178.000 Z"),
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
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
