package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = phosphorLightIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 90.000 L 214.000 90.000 L 214.000 64.000 C 214.000 56.268 207.732 50.000 200.000 50.000 L 48.000 50.000 C 40.268 50.000 34.000 56.268 34.000 64.000 L 34.000 90.000 L 16.000 90.000 C 12.686 90.000 10.000 92.686 10.000 96.000 C 10.000 99.314 12.686 102.000 16.000 102.000 L 34.000 102.000 L 34.000 128.000 C 34.000 135.732 40.268 142.000 48.000 142.000 L 200.000 142.000 C 207.732 142.000 214.000 135.732 214.000 128.000 L 214.000 102.000 L 232.000 102.000 C 233.105 102.000 234.000 102.895 234.000 104.000 L 234.000 154.000 C 233.999 154.892 233.407 155.675 232.550 155.920 L 132.150 184.600 C 126.175 186.330 122.047 191.780 122.000 198.000 L 122.000 232.000 C 122.000 235.314 124.686 238.000 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 L 134.000 198.000 C 134.001 197.108 134.593 196.325 135.450 196.080 L 235.850 167.400 C 241.825 165.670 245.953 160.220 246.000 154.000 L 246.000 104.000 C 246.000 96.268 239.732 90.000 232.000 90.000 ZM 202.000 128.000 C 202.000 129.105 201.105 130.000 200.000 130.000 L 48.000 130.000 C 46.895 130.000 46.000 129.105 46.000 128.000 L 46.000 64.000 C 46.000 62.895 46.895 62.000 48.000 62.000 L 200.000 62.000 C 201.105 62.000 202.000 62.895 202.000 64.000 Z"),
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
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
