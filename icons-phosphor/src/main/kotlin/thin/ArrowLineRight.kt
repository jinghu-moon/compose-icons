package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowLineRight: ImageVector
    get() {
        if (_arrowLineRight != null) return _arrowLineRight!!
        _arrowLineRight = phosphorThinIcon(
            name = "ArrowLineRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 186.830 125.170 C 187.581 125.920 188.003 126.938 188.003 128.000 C 188.003 129.062 187.581 130.080 186.830 130.830 L 114.830 202.830 C 113.267 204.393 110.733 204.393 109.170 202.830 C 107.607 201.267 107.607 198.733 109.170 197.170 L 174.340 132.000 L 32.000 132.000 C 29.791 132.000 28.000 130.209 28.000 128.000 C 28.000 125.791 29.791 124.000 32.000 124.000 L 174.340 124.000 L 109.170 58.830 C 107.607 57.267 107.607 54.733 109.170 53.170 C 110.733 51.607 113.267 51.607 114.830 53.170 ZM 216.000 36.000 C 213.791 36.000 212.000 37.791 212.000 40.000 L 212.000 216.000 C 212.000 218.209 213.791 220.000 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 L 220.000 40.000 C 220.000 37.791 218.209 36.000 216.000 36.000 Z"),
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
        return _arrowLineRight!!
    }

private var _arrowLineRight: ImageVector? = null
