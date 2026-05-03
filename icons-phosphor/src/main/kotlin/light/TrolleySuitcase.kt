package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) return _trolleySuitcase!!
        _trolleySuitcase = phosphorLightIcon(
            name = "TrolleySuitcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 158.000 L 216.000 158.000 C 223.732 158.000 230.000 151.732 230.000 144.000 L 230.000 72.000 C 230.000 64.268 223.732 58.000 216.000 58.000 L 182.000 58.000 L 182.000 40.000 C 182.000 32.268 175.732 26.000 168.000 26.000 L 136.000 26.000 C 128.268 26.000 122.000 32.268 122.000 40.000 L 122.000 58.000 L 88.000 58.000 C 80.268 58.000 74.000 64.268 74.000 72.000 L 74.000 144.000 C 74.000 151.732 80.268 158.000 88.000 158.000 ZM 134.000 40.000 C 134.000 38.895 134.895 38.000 136.000 38.000 L 168.000 38.000 C 169.105 38.000 170.000 38.895 170.000 40.000 L 170.000 58.000 L 134.000 58.000 ZM 86.000 72.000 C 86.000 70.895 86.895 70.000 88.000 70.000 L 216.000 70.000 C 217.105 70.000 218.000 70.895 218.000 72.000 L 218.000 144.000 C 218.000 145.105 217.105 146.000 216.000 146.000 L 88.000 146.000 C 86.895 146.000 86.000 145.105 86.000 144.000 ZM 86.000 224.000 C 86.000 231.732 79.732 238.000 72.000 238.000 C 64.268 238.000 58.000 231.732 58.000 224.000 C 58.000 216.268 64.268 210.000 72.000 210.000 C 79.732 210.000 86.000 216.268 86.000 224.000 ZM 230.000 224.000 C 230.000 231.732 223.732 238.000 216.000 238.000 C 208.268 238.000 202.000 231.732 202.000 224.000 C 202.000 216.268 208.268 210.000 216.000 210.000 C 223.732 210.000 230.000 216.268 230.000 224.000 ZM 246.000 184.000 C 246.000 187.314 243.314 190.000 240.000 190.000 L 32.000 190.000 C 28.686 190.000 26.000 187.314 26.000 184.000 C 26.000 180.686 28.686 178.000 32.000 178.000 L 42.000 178.000 L 42.000 75.310 C 41.998 74.780 41.786 74.273 41.410 73.900 L 19.760 52.240 C 18.155 50.744 17.494 48.492 18.037 46.366 C 18.580 44.240 20.240 42.580 22.366 42.037 C 24.492 41.494 26.744 42.155 28.240 43.760 L 49.900 65.410 C 52.531 68.032 54.007 71.596 54.000 75.310 L 54.000 178.000 L 240.000 178.000 C 243.314 178.000 246.000 180.686 246.000 184.000 Z"),
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
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null
