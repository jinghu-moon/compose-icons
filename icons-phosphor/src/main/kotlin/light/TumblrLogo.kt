package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) return _tumblrLogo!!
        _tumblrLogo = phosphorLightIcon(
            name = "TumblrLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 118.000 C 195.314 118.000 198.000 115.314 198.000 112.000 L 198.000 72.000 C 198.000 68.686 195.314 66.000 192.000 66.000 L 150.000 66.000 L 150.000 24.000 C 150.000 20.686 147.314 18.000 144.000 18.000 L 112.000 18.000 C 108.686 18.000 106.000 20.686 106.000 24.000 C 106.000 47.196 87.196 66.000 64.000 66.000 C 60.686 66.000 58.000 68.686 58.000 72.000 L 58.000 112.000 C 58.000 115.314 60.686 118.000 64.000 118.000 L 90.000 118.000 L 90.000 176.000 C 90.039 210.226 117.774 237.961 152.000 238.000 L 192.000 238.000 C 195.314 238.000 198.000 235.314 198.000 232.000 L 198.000 184.000 C 198.000 180.686 195.314 178.000 192.000 178.000 L 160.000 178.000 C 154.477 178.000 150.000 173.523 150.000 168.000 L 150.000 118.000 ZM 160.000 190.000 L 186.000 190.000 L 186.000 226.000 L 152.000 226.000 C 124.399 225.967 102.033 203.601 102.000 176.000 L 102.000 112.000 C 102.000 108.686 99.314 106.000 96.000 106.000 L 70.000 106.000 L 70.000 77.670 C 95.055 74.826 114.826 55.055 117.670 30.000 L 138.000 30.000 L 138.000 72.000 C 138.000 75.314 140.686 78.000 144.000 78.000 L 186.000 78.000 L 186.000 106.000 L 144.000 106.000 C 140.686 106.000 138.000 108.686 138.000 112.000 L 138.000 168.000 C 138.000 180.150 147.850 190.000 160.000 190.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
