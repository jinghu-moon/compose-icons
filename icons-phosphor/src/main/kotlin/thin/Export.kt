package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorThinIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 112.000 L 212.000 208.000 C 212.000 214.627 206.627 220.000 200.000 220.000 L 56.000 220.000 C 49.373 220.000 44.000 214.627 44.000 208.000 L 44.000 112.000 C 44.000 105.373 49.373 100.000 56.000 100.000 L 80.000 100.000 C 82.209 100.000 84.000 101.791 84.000 104.000 C 84.000 106.209 82.209 108.000 80.000 108.000 L 56.000 108.000 C 53.791 108.000 52.000 109.791 52.000 112.000 L 52.000 208.000 C 52.000 210.209 53.791 212.000 56.000 212.000 L 200.000 212.000 C 202.209 212.000 204.000 210.209 204.000 208.000 L 204.000 112.000 C 204.000 109.791 202.209 108.000 200.000 108.000 L 176.000 108.000 C 173.791 108.000 172.000 106.209 172.000 104.000 C 172.000 101.791 173.791 100.000 176.000 100.000 L 200.000 100.000 C 206.627 100.000 212.000 105.373 212.000 112.000 ZM 90.830 66.830 L 124.000 33.660 L 124.000 136.000 C 124.000 138.209 125.791 140.000 128.000 140.000 C 130.209 140.000 132.000 138.209 132.000 136.000 L 132.000 33.660 L 165.170 66.830 C 166.733 68.393 169.267 68.393 170.830 66.830 C 172.393 65.267 172.393 62.733 170.830 61.170 L 130.830 21.170 C 130.080 20.419 129.062 19.997 128.000 19.997 C 126.938 19.997 125.920 20.419 125.170 21.170 L 85.170 61.170 C 83.607 62.733 83.607 65.267 85.170 66.830 C 86.733 68.393 89.267 68.393 90.830 66.830 Z"),
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
        return _export!!
    }

private var _export: ImageVector? = null
