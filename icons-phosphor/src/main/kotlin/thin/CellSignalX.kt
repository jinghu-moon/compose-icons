package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorThinIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 210.830 197.170 C 212.393 198.733 212.393 201.267 210.830 202.830 C 209.267 204.393 206.733 204.393 205.170 202.830 L 184.000 181.660 L 162.830 202.830 C 161.267 204.393 158.733 204.393 157.170 202.830 C 155.607 201.267 155.607 198.733 157.170 197.170 L 178.340 176.000 L 157.170 154.830 C 155.607 153.267 155.607 150.733 157.170 149.170 C 158.733 147.607 161.267 147.607 162.830 149.170 L 184.000 170.340 L 205.170 149.170 C 206.733 147.607 209.267 147.607 210.830 149.170 C 212.393 150.733 212.393 153.267 210.830 154.830 L 189.660 176.000 ZM 160.000 116.000 C 162.209 116.000 164.000 114.209 164.000 112.000 L 164.000 72.000 C 164.000 69.791 162.209 68.000 160.000 68.000 C 157.791 68.000 156.000 69.791 156.000 72.000 L 156.000 112.000 C 156.000 114.209 157.791 116.000 160.000 116.000 ZM 200.000 116.000 C 202.209 116.000 204.000 114.209 204.000 112.000 L 204.000 32.000 C 204.000 29.791 202.209 28.000 200.000 28.000 C 197.791 28.000 196.000 29.791 196.000 32.000 L 196.000 112.000 C 196.000 114.209 197.791 116.000 200.000 116.000 ZM 120.000 108.000 C 117.791 108.000 116.000 109.791 116.000 112.000 L 116.000 200.000 C 116.000 202.209 117.791 204.000 120.000 204.000 C 122.209 204.000 124.000 202.209 124.000 200.000 L 124.000 112.000 C 124.000 109.791 122.209 108.000 120.000 108.000 ZM 80.000 148.000 C 77.791 148.000 76.000 149.791 76.000 152.000 L 76.000 200.000 C 76.000 202.209 77.791 204.000 80.000 204.000 C 82.209 204.000 84.000 202.209 84.000 200.000 L 84.000 152.000 C 84.000 149.791 82.209 148.000 80.000 148.000 ZM 40.000 188.000 C 37.791 188.000 36.000 189.791 36.000 192.000 L 36.000 200.000 C 36.000 202.209 37.791 204.000 40.000 204.000 C 42.209 204.000 44.000 202.209 44.000 200.000 L 44.000 192.000 C 44.000 189.791 42.209 188.000 40.000 188.000 Z"),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
