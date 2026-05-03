package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Prescription: ImageVector
    get() {
        if (_prescription != null) return _prescription!!
        _prescription = phosphorThinIcon(
            name = "Prescription",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 177.660 188.000 L 202.830 162.830 C 204.393 161.267 204.393 158.733 202.830 157.170 C 201.267 155.607 198.733 155.607 197.170 157.170 L 172.000 182.340 L 121.660 132.000 L 124.000 132.000 C 150.510 132.000 172.000 110.510 172.000 84.000 C 172.000 57.490 150.510 36.000 124.000 36.000 L 72.000 36.000 C 69.791 36.000 68.000 37.791 68.000 40.000 L 68.000 192.000 C 68.000 194.209 69.791 196.000 72.000 196.000 C 74.209 196.000 76.000 194.209 76.000 192.000 L 76.000 132.000 L 110.340 132.000 L 166.340 188.000 L 141.170 213.170 C 139.607 214.733 139.607 217.267 141.170 218.830 C 142.733 220.393 145.267 220.393 146.830 218.830 L 172.000 193.660 L 197.170 218.830 C 198.733 220.393 201.267 220.393 202.830 218.830 C 204.393 217.267 204.393 214.733 202.830 213.170 ZM 76.000 44.000 L 124.000 44.000 C 146.091 44.000 164.000 61.909 164.000 84.000 C 164.000 106.091 146.091 124.000 124.000 124.000 L 76.000 124.000 Z"),
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
        return _prescription!!
    }

private var _prescription: ImageVector? = null
