package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseLeftClick: ImageVector
    get() {
        if (_mouseLeftClick != null) return _mouseLeftClick!!
        _mouseLeftClick = phosphorLightIcon(
            name = "MouseLeftClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 18.000 L 112.000 18.000 C 77.774 18.039 50.039 45.774 50.000 80.000 L 50.000 176.000 C 50.039 210.226 77.774 237.961 112.000 238.000 L 144.000 238.000 C 178.226 237.961 205.961 210.226 206.000 176.000 L 206.000 80.000 C 205.961 45.774 178.226 18.039 144.000 18.000 ZM 194.000 80.000 L 194.000 106.000 L 134.000 106.000 L 134.000 30.000 L 144.000 30.000 C 171.601 30.033 193.967 52.399 194.000 80.000 ZM 122.000 30.000 L 122.000 65.510 L 91.090 34.600 C 97.643 31.567 104.779 29.997 112.000 30.000 ZM 80.620 41.110 L 122.000 82.490 L 122.000 106.000 L 114.490 106.000 L 66.900 58.420 C 70.134 51.705 74.821 45.792 80.620 41.110 ZM 62.000 80.000 C 62.005 77.073 62.266 74.152 62.780 71.270 L 97.510 106.000 L 62.000 106.000 ZM 144.000 226.000 L 112.000 226.000 C 84.399 225.967 62.033 203.601 62.000 176.000 L 62.000 118.000 L 194.000 118.000 L 194.000 176.000 C 193.967 203.601 171.601 225.967 144.000 226.000 Z"),
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
        return _mouseLeftClick!!
    }

private var _mouseLeftClick: ImageVector? = null
