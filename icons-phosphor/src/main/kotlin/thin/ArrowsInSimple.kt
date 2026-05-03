package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsInSimple: ImageVector
    get() {
        if (_arrowsInSimple != null) return _arrowsInSimple!!
        _arrowsInSimple = phosphorThinIcon(
            name = "ArrowsInSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.830 50.830 L 153.660 108.000 L 192.000 108.000 C 194.209 108.000 196.000 109.791 196.000 112.000 C 196.000 114.209 194.209 116.000 192.000 116.000 L 144.000 116.000 C 141.791 116.000 140.000 114.209 140.000 112.000 L 140.000 64.000 C 140.000 61.791 141.791 60.000 144.000 60.000 C 146.209 60.000 148.000 61.791 148.000 64.000 L 148.000 102.340 L 205.170 45.170 C 206.733 43.607 209.267 43.607 210.830 45.170 C 212.393 46.733 212.393 49.267 210.830 50.830 ZM 112.000 140.000 L 64.000 140.000 C 61.791 140.000 60.000 141.791 60.000 144.000 C 60.000 146.209 61.791 148.000 64.000 148.000 L 102.340 148.000 L 45.170 205.170 C 43.607 206.733 43.607 209.267 45.170 210.830 C 46.733 212.393 49.267 212.393 50.830 210.830 L 108.000 153.660 L 108.000 192.000 C 108.000 194.209 109.791 196.000 112.000 196.000 C 114.209 196.000 116.000 194.209 116.000 192.000 L 116.000 144.000 C 116.000 141.791 114.209 140.000 112.000 140.000 Z"),
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
        return _arrowsInSimple!!
    }

private var _arrowsInSimple: ImageVector? = null
