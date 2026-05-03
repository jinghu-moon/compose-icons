package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorBoldIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 104.000 C 227.956 62.045 193.955 28.044 152.000 28.000 L 72.000 28.000 C 65.373 28.000 60.000 33.373 60.000 40.000 L 60.000 168.000 C 60.050 214.371 97.629 251.950 144.000 252.000 C 150.627 252.000 156.000 246.627 156.000 240.000 L 156.000 179.890 C 196.341 177.718 227.952 144.399 228.000 104.000 ZM 84.000 85.810 L 123.480 156.000 L 84.000 156.000 ZM 132.000 122.190 L 92.520 52.000 L 132.000 52.000 ZM 85.220 180.000 L 132.000 180.000 L 132.000 226.790 C 108.463 221.933 90.072 203.538 85.220 180.000 ZM 156.000 155.830 L 156.000 52.170 C 183.001 54.359 203.799 76.910 203.799 104.000 C 203.799 131.090 183.001 153.641 156.000 155.830 Z"),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
