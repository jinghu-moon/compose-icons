package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Notches: ImageVector
    get() {
        if (_notches != null) return _notches!!
        _notches = phosphorLightIcon(
            name = "Notches",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.240 132.240 L 132.240 212.240 C 130.744 213.845 128.492 214.506 126.366 213.963 C 124.240 213.420 122.580 211.760 122.037 209.634 C 121.494 207.508 122.155 205.256 123.760 203.760 L 203.760 123.760 C 205.256 122.155 207.508 121.494 209.634 122.037 C 211.760 122.580 213.420 124.240 213.963 126.366 C 214.506 128.492 213.845 130.744 212.240 132.240 ZM 196.240 35.760 C 193.897 33.420 190.103 33.420 187.760 35.760 L 35.760 187.760 C 34.155 189.256 33.494 191.508 34.037 193.634 C 34.580 195.760 36.240 197.420 38.366 197.963 C 40.492 198.506 42.744 197.845 44.240 196.240 L 196.240 44.240 C 198.580 41.897 198.580 38.103 196.240 35.760 Z"),
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
        return _notches!!
    }

private var _notches: ImageVector? = null
