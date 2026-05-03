package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsLeftRight: ImageVector
    get() {
        if (_arrowsLeftRight != null) return _arrowsLeftRight!!
        _arrowsLeftRight = phosphorThinIcon(
            name = "ArrowsLeftRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 210.830 173.170 C 211.581 173.920 212.003 174.938 212.003 176.000 C 212.003 177.062 211.581 178.080 210.830 178.830 L 178.830 210.830 C 177.267 212.393 174.733 212.393 173.170 210.830 C 171.607 209.267 171.607 206.733 173.170 205.170 L 198.340 180.000 L 48.000 180.000 C 45.791 180.000 44.000 178.209 44.000 176.000 C 44.000 173.791 45.791 172.000 48.000 172.000 L 198.340 172.000 L 173.170 146.830 C 171.607 145.267 171.607 142.733 173.170 141.170 C 174.733 139.607 177.267 139.607 178.830 141.170 ZM 77.170 114.830 C 78.733 116.393 81.267 116.393 82.830 114.830 C 84.393 113.267 84.393 110.733 82.830 109.170 L 57.660 84.000 L 208.000 84.000 C 210.209 84.000 212.000 82.209 212.000 80.000 C 212.000 77.791 210.209 76.000 208.000 76.000 L 57.660 76.000 L 82.830 50.830 C 84.393 49.267 84.393 46.733 82.830 45.170 C 81.267 43.607 78.733 43.607 77.170 45.170 L 45.170 77.170 C 44.419 77.920 43.997 78.938 43.997 80.000 C 43.997 81.062 44.419 82.080 45.170 82.830 Z"),
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
        return _arrowsLeftRight!!
    }

private var _arrowsLeftRight: ImageVector? = null
