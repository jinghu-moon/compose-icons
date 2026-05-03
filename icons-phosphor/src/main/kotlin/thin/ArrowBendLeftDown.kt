package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) return _arrowBendLeftDown!!
        _arrowBendLeftDown = phosphorThinIcon(
            name = "ArrowBendLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.000 32.000 C 204.000 34.209 202.209 36.000 200.000 36.000 C 149.213 36.055 108.055 77.213 108.000 128.000 L 108.000 214.340 L 149.170 173.170 C 150.733 171.607 153.267 171.607 154.830 173.170 C 156.393 174.733 156.393 177.267 154.830 178.830 L 106.830 226.830 C 106.080 227.581 105.062 228.003 104.000 228.003 C 102.938 228.003 101.920 227.581 101.170 226.830 L 53.170 178.830 C 51.607 177.267 51.607 174.733 53.170 173.170 C 54.733 171.607 57.267 171.607 58.830 173.170 L 100.000 214.340 L 100.000 128.000 C 100.061 72.797 144.797 28.061 200.000 28.000 C 202.209 28.000 204.000 29.791 204.000 32.000 Z"),
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
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
