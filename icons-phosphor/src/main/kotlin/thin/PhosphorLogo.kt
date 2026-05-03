package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) return _phosphorLogo!!
        _phosphorLogo = phosphorThinIcon(
            name = "PhosphorLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 36.000 L 72.000 36.000 C 69.791 36.000 68.000 37.791 68.000 40.000 L 68.000 168.000 C 68.044 209.955 102.045 243.956 144.000 244.000 C 146.209 244.000 148.000 242.209 148.000 240.000 L 148.000 172.000 L 152.000 172.000 C 189.555 172.000 220.000 141.555 220.000 104.000 C 220.000 66.445 189.555 36.000 152.000 36.000 ZM 76.000 55.270 L 137.160 164.000 L 76.000 164.000 ZM 140.000 152.730 L 78.840 44.000 L 140.000 44.000 ZM 76.130 172.000 L 140.000 172.000 L 140.000 235.880 C 105.619 233.803 78.202 206.381 76.130 172.000 ZM 152.000 164.000 L 148.000 164.000 L 148.000 44.000 L 152.000 44.000 C 185.137 44.000 212.000 70.863 212.000 104.000 C 212.000 137.137 185.137 164.000 152.000 164.000 Z"),
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
