package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorThinIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 226.830 154.830 L 178.830 202.830 C 177.267 204.393 174.733 204.393 173.170 202.830 C 171.607 201.267 171.607 198.733 173.170 197.170 L 214.340 156.000 L 128.000 156.000 C 72.797 155.939 28.061 111.203 28.000 56.000 C 28.000 53.791 29.791 52.000 32.000 52.000 C 34.209 52.000 36.000 53.791 36.000 56.000 C 36.055 106.787 77.213 147.945 128.000 148.000 L 214.340 148.000 L 173.170 106.830 C 171.607 105.267 171.607 102.733 173.170 101.170 C 174.733 99.607 177.267 99.607 178.830 101.170 L 226.830 149.170 C 227.581 149.920 228.003 150.938 228.003 152.000 C 228.003 153.062 227.581 154.080 226.830 154.830 Z"),
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
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
