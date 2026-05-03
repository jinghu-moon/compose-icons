package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorThinIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 202.830 178.830 L 154.830 226.830 C 154.080 227.581 153.062 228.003 152.000 228.003 C 150.938 228.003 149.920 227.581 149.170 226.830 L 101.170 178.830 C 99.607 177.267 99.607 174.733 101.170 173.170 C 102.733 171.607 105.267 171.607 106.830 173.170 L 148.000 214.340 L 148.000 128.000 C 147.945 77.213 106.787 36.055 56.000 36.000 C 53.791 36.000 52.000 34.209 52.000 32.000 C 52.000 29.791 53.791 28.000 56.000 28.000 C 111.203 28.061 155.939 72.797 156.000 128.000 L 156.000 214.340 L 197.170 173.170 C 198.733 171.607 201.267 171.607 202.830 173.170 C 204.393 174.733 204.393 177.267 202.830 178.830 Z"),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
