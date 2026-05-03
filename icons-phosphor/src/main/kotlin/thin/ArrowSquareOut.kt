package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareOut: ImageVector
    get() {
        if (_arrowSquareOut != null) return _arrowSquareOut!!
        _arrowSquareOut = phosphorThinIcon(
            name = "ArrowSquareOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 104.000 C 220.000 106.209 218.209 108.000 216.000 108.000 C 213.791 108.000 212.000 106.209 212.000 104.000 L 212.000 49.660 L 138.840 122.830 C 137.277 124.393 134.743 124.393 133.180 122.830 C 131.617 121.267 131.617 118.733 133.180 117.170 L 206.340 44.000 L 152.000 44.000 C 149.791 44.000 148.000 42.209 148.000 40.000 C 148.000 37.791 149.791 36.000 152.000 36.000 L 216.000 36.000 C 218.209 36.000 220.000 37.791 220.000 40.000 ZM 184.000 132.000 C 181.791 132.000 180.000 133.791 180.000 136.000 L 180.000 208.000 C 180.000 210.209 178.209 212.000 176.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 80.000 C 44.000 77.791 45.791 76.000 48.000 76.000 L 120.000 76.000 C 122.209 76.000 124.000 74.209 124.000 72.000 C 124.000 69.791 122.209 68.000 120.000 68.000 L 48.000 68.000 C 41.373 68.000 36.000 73.373 36.000 80.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 176.000 220.000 C 182.627 220.000 188.000 214.627 188.000 208.000 L 188.000 136.000 C 188.000 133.791 186.209 132.000 184.000 132.000 Z"),
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
        return _arrowSquareOut!!
    }

private var _arrowSquareOut: ImageVector? = null
