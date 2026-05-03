package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorLightIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 98.000 L 206.000 98.000 L 206.000 96.000 C 206.000 92.686 203.314 90.000 200.000 90.000 L 136.000 90.000 C 132.686 90.000 130.000 92.686 130.000 96.000 L 130.000 98.000 L 62.000 98.000 L 62.000 52.000 C 62.000 44.268 68.268 38.000 76.000 38.000 C 82.738 37.988 88.593 42.627 90.120 49.190 C 90.515 51.320 92.029 53.072 94.079 53.773 C 96.129 54.474 98.398 54.015 100.015 52.572 C 101.631 51.129 102.344 48.927 101.880 46.810 C 99.270 34.620 88.466 25.932 76.000 26.000 C 61.641 26.000 50.000 37.641 50.000 52.000 L 50.000 98.000 L 16.000 98.000 C 12.686 98.000 10.000 100.686 10.000 104.000 L 10.000 144.000 C 10.033 173.810 34.190 197.967 64.000 198.000 L 66.000 198.000 L 66.000 216.000 C 66.000 219.314 68.686 222.000 72.000 222.000 C 75.314 222.000 78.000 219.314 78.000 216.000 L 78.000 198.000 L 178.000 198.000 L 178.000 216.000 C 178.000 219.314 180.686 222.000 184.000 222.000 C 187.314 222.000 190.000 219.314 190.000 216.000 L 190.000 198.000 L 192.000 198.000 C 221.810 197.967 245.967 173.810 246.000 144.000 L 246.000 104.000 C 246.000 100.686 243.314 98.000 240.000 98.000 ZM 142.000 102.000 L 194.000 102.000 L 194.000 138.000 L 142.000 138.000 ZM 234.000 144.000 C 234.000 167.196 215.196 186.000 192.000 186.000 L 64.000 186.000 C 40.804 186.000 22.000 167.196 22.000 144.000 L 22.000 110.000 L 130.000 110.000 L 130.000 144.000 C 130.000 147.314 132.686 150.000 136.000 150.000 L 200.000 150.000 C 203.314 150.000 206.000 147.314 206.000 144.000 L 206.000 110.000 L 234.000 110.000 Z"),
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
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
