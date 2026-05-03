package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorLightIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 106.000 112.000 C 106.000 108.686 108.686 106.000 112.000 106.000 L 144.000 106.000 C 147.314 106.000 150.000 108.686 150.000 112.000 C 150.000 115.314 147.314 118.000 144.000 118.000 L 112.000 118.000 C 108.686 118.000 106.000 115.314 106.000 112.000 ZM 230.000 72.000 L 230.000 200.000 C 230.000 207.732 223.732 214.000 216.000 214.000 L 40.000 214.000 C 32.268 214.000 26.000 207.732 26.000 200.000 L 26.000 72.000 C 26.000 64.268 32.268 58.000 40.000 58.000 L 82.000 58.000 L 82.000 48.000 C 82.000 35.850 91.850 26.000 104.000 26.000 L 152.000 26.000 C 164.150 26.000 174.000 35.850 174.000 48.000 L 174.000 58.000 L 216.000 58.000 C 223.732 58.000 230.000 64.268 230.000 72.000 ZM 94.000 58.000 L 162.000 58.000 L 162.000 48.000 C 162.000 42.477 157.523 38.000 152.000 38.000 L 104.000 38.000 C 98.477 38.000 94.000 42.477 94.000 48.000 ZM 38.000 72.000 L 38.000 114.790 C 65.552 130.018 96.519 138.004 128.000 138.000 C 159.482 138.005 190.450 130.015 218.000 114.780 L 218.000 72.000 C 218.000 70.895 217.105 70.000 216.000 70.000 L 40.000 70.000 C 38.895 70.000 38.000 70.895 38.000 72.000 ZM 218.000 200.000 L 218.000 128.370 C 190.129 142.585 159.287 149.998 128.000 150.000 C 96.713 150.003 65.871 142.594 38.000 128.380 L 38.000 200.000 C 38.000 201.105 38.895 202.000 40.000 202.000 L 216.000 202.000 C 217.105 202.000 218.000 201.105 218.000 200.000 Z"),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
