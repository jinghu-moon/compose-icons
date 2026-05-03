package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorLightIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 163.330 107.000 L 115.330 75.000 C 113.488 73.771 111.118 73.656 109.166 74.703 C 107.214 75.749 105.997 77.785 106.000 80.000 L 106.000 144.000 C 105.997 146.215 107.214 148.251 109.166 149.297 C 111.118 150.344 113.488 150.229 115.330 149.000 L 163.330 117.000 C 165.006 115.888 166.013 114.011 166.013 112.000 C 166.013 109.989 165.006 108.112 163.330 107.000 ZM 118.000 132.790 L 118.000 91.210 L 149.180 112.000 ZM 216.000 42.000 L 40.000 42.000 C 32.268 42.000 26.000 48.268 26.000 56.000 L 26.000 168.000 C 26.000 175.732 32.268 182.000 40.000 182.000 L 216.000 182.000 C 223.732 182.000 230.000 175.732 230.000 168.000 L 230.000 56.000 C 230.000 48.268 223.732 42.000 216.000 42.000 ZM 218.000 168.000 C 218.000 169.105 217.105 170.000 216.000 170.000 L 40.000 170.000 C 38.895 170.000 38.000 169.105 38.000 168.000 L 38.000 56.000 C 38.000 54.895 38.895 54.000 40.000 54.000 L 216.000 54.000 C 217.105 54.000 218.000 54.895 218.000 56.000 ZM 230.000 208.000 C 230.000 211.314 227.314 214.000 224.000 214.000 L 32.000 214.000 C 28.686 214.000 26.000 211.314 26.000 208.000 C 26.000 204.686 28.686 202.000 32.000 202.000 L 224.000 202.000 C 227.314 202.000 230.000 204.686 230.000 208.000 Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
