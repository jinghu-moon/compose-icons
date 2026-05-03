package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rug: ImageVector
    get() {
        if (_rug != null) return _rug!!
        _rug = phosphorBoldIcon(
            name = "Rug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 12.000 C 193.373 12.000 188.000 17.373 188.000 24.000 L 188.000 36.000 L 164.000 36.000 L 164.000 24.000 C 164.000 17.373 158.627 12.000 152.000 12.000 C 145.373 12.000 140.000 17.373 140.000 24.000 L 140.000 36.000 L 116.000 36.000 L 116.000 24.000 C 116.000 17.373 110.627 12.000 104.000 12.000 C 97.373 12.000 92.000 17.373 92.000 24.000 L 92.000 36.000 L 68.000 36.000 L 68.000 24.000 C 68.000 17.373 62.627 12.000 56.000 12.000 C 49.373 12.000 44.000 17.373 44.000 24.000 L 44.000 232.000 C 44.000 238.627 49.373 244.000 56.000 244.000 C 62.627 244.000 68.000 238.627 68.000 232.000 L 68.000 220.000 L 92.000 220.000 L 92.000 232.000 C 92.000 238.627 97.373 244.000 104.000 244.000 C 110.627 244.000 116.000 238.627 116.000 232.000 L 116.000 220.000 L 140.000 220.000 L 140.000 232.000 C 140.000 238.627 145.373 244.000 152.000 244.000 C 158.627 244.000 164.000 238.627 164.000 232.000 L 164.000 220.000 L 188.000 220.000 L 188.000 232.000 C 188.000 238.627 193.373 244.000 200.000 244.000 C 206.627 244.000 212.000 238.627 212.000 232.000 L 212.000 24.000 C 212.000 17.373 206.627 12.000 200.000 12.000 ZM 68.000 60.000 L 188.000 60.000 L 188.000 196.000 L 68.000 196.000 ZM 128.000 180.000 C 132.216 179.999 136.122 177.786 138.290 174.170 L 162.290 134.170 C 164.567 130.372 164.567 125.628 162.290 121.830 L 138.290 81.830 C 136.121 78.215 132.215 76.004 128.000 76.004 C 123.785 76.004 119.879 78.215 117.710 81.830 L 93.710 121.830 C 91.433 125.628 91.433 130.372 93.710 134.170 L 117.710 174.170 C 119.878 177.786 123.784 179.999 128.000 180.000 ZM 128.000 111.320 L 138.000 128.000 L 128.000 144.680 L 118.000 128.000 Z"),
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
        return _rug!!
    }

private var _rug: ImageVector? = null
