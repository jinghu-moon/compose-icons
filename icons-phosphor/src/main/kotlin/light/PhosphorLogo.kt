package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorLightIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 34.000 L 72.000 34.000 C 68.686 34.000 66.000 36.686 66.000 40.000 L 66.000 168.000 C 66.050 211.058 100.942 245.950 144.000 246.000 C 147.314 246.000 150.000 243.314 150.000 240.000 L 150.000 174.000 L 152.000 174.000 C 190.660 174.000 222.000 142.660 222.000 104.000 C 222.000 65.340 190.660 34.000 152.000 34.000 ZM 78.000 62.910 L 133.740 162.000 L 78.000 162.000 ZM 138.000 145.100 L 82.260 46.000 L 138.000 46.000 ZM 78.280 174.000 L 138.000 174.000 L 138.000 233.730 C 106.310 230.793 81.211 205.691 78.280 174.000 ZM 152.000 162.000 L 150.000 162.000 L 150.000 46.000 L 152.000 46.000 C 184.033 46.000 210.000 71.967 210.000 104.000 C 210.000 136.033 184.033 162.000 152.000 162.000 Z"),
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
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
