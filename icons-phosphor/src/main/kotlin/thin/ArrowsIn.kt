package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorThinIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 148.000 104.000 L 148.000 64.000 C 148.000 61.791 149.791 60.000 152.000 60.000 C 154.209 60.000 156.000 61.791 156.000 64.000 L 156.000 94.340 L 205.170 45.170 C 206.733 43.607 209.267 43.607 210.830 45.170 C 212.393 46.733 212.393 49.267 210.830 50.830 L 161.660 100.000 L 192.000 100.000 C 194.209 100.000 196.000 101.791 196.000 104.000 C 196.000 106.209 194.209 108.000 192.000 108.000 L 152.000 108.000 C 149.791 108.000 148.000 106.209 148.000 104.000 ZM 104.000 148.000 L 64.000 148.000 C 61.791 148.000 60.000 149.791 60.000 152.000 C 60.000 154.209 61.791 156.000 64.000 156.000 L 94.340 156.000 L 45.170 205.170 C 43.607 206.733 43.607 209.267 45.170 210.830 C 46.733 212.393 49.267 212.393 50.830 210.830 L 100.000 161.660 L 100.000 192.000 C 100.000 194.209 101.791 196.000 104.000 196.000 C 106.209 196.000 108.000 194.209 108.000 192.000 L 108.000 152.000 C 108.000 149.791 106.209 148.000 104.000 148.000 ZM 161.660 156.000 L 192.000 156.000 C 194.209 156.000 196.000 154.209 196.000 152.000 C 196.000 149.791 194.209 148.000 192.000 148.000 L 152.000 148.000 C 149.791 148.000 148.000 149.791 148.000 152.000 L 148.000 192.000 C 148.000 194.209 149.791 196.000 152.000 196.000 C 154.209 196.000 156.000 194.209 156.000 192.000 L 156.000 161.660 L 205.170 210.830 C 206.733 212.393 209.267 212.393 210.830 210.830 C 212.393 209.267 212.393 206.733 210.830 205.170 ZM 104.000 60.000 C 101.791 60.000 100.000 61.791 100.000 64.000 L 100.000 94.340 L 50.830 45.170 C 49.267 43.607 46.733 43.607 45.170 45.170 C 43.607 46.733 43.607 49.267 45.170 50.830 L 94.340 100.000 L 64.000 100.000 C 61.791 100.000 60.000 101.791 60.000 104.000 C 60.000 106.209 61.791 108.000 64.000 108.000 L 104.000 108.000 C 106.209 108.000 108.000 106.209 108.000 104.000 L 108.000 64.000 C 108.000 61.791 106.209 60.000 104.000 60.000 Z"),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
