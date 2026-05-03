package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorThinIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.830 106.830 L 178.830 154.830 C 177.267 156.393 174.733 156.393 173.170 154.830 C 171.607 153.267 171.607 150.733 173.170 149.170 L 214.340 108.000 L 128.000 108.000 C 77.213 108.055 36.055 149.213 36.000 200.000 C 36.000 202.209 34.209 204.000 32.000 204.000 C 29.791 204.000 28.000 202.209 28.000 200.000 C 28.061 144.797 72.797 100.061 128.000 100.000 L 214.340 100.000 L 173.170 58.830 C 171.607 57.267 171.607 54.733 173.170 53.170 C 174.733 51.607 177.267 51.607 178.830 53.170 L 226.830 101.170 C 227.581 101.920 228.003 102.938 228.003 104.000 C 228.003 105.062 227.581 106.080 226.830 106.830 Z"),
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
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null
