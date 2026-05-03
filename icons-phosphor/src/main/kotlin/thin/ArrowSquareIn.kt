package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorThinIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 124.000 136.000 L 124.000 200.000 C 124.000 202.209 122.209 204.000 120.000 204.000 C 117.791 204.000 116.000 202.209 116.000 200.000 L 116.000 145.660 L 42.830 218.830 C 41.267 220.393 38.733 220.393 37.170 218.830 C 35.607 217.267 35.607 214.733 37.170 213.170 L 110.340 140.000 L 56.000 140.000 C 53.791 140.000 52.000 138.209 52.000 136.000 C 52.000 133.791 53.791 132.000 56.000 132.000 L 120.000 132.000 C 122.209 132.000 124.000 133.791 124.000 136.000 ZM 208.000 36.000 L 80.000 36.000 C 73.373 36.000 68.000 41.373 68.000 48.000 L 68.000 96.000 C 68.000 98.209 69.791 100.000 72.000 100.000 C 74.209 100.000 76.000 98.209 76.000 96.000 L 76.000 48.000 C 76.000 45.791 77.791 44.000 80.000 44.000 L 208.000 44.000 C 210.209 44.000 212.000 45.791 212.000 48.000 L 212.000 176.000 C 212.000 178.209 210.209 180.000 208.000 180.000 L 160.000 180.000 C 157.791 180.000 156.000 181.791 156.000 184.000 C 156.000 186.209 157.791 188.000 160.000 188.000 L 208.000 188.000 C 214.627 188.000 220.000 182.627 220.000 176.000 L 220.000 48.000 C 220.000 41.373 214.627 36.000 208.000 36.000 Z"),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
