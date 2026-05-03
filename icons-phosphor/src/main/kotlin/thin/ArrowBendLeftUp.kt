package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorThinIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.000 224.000 C 204.000 226.209 202.209 228.000 200.000 228.000 C 144.797 227.939 100.061 183.203 100.000 128.000 L 100.000 41.660 L 58.830 82.830 C 57.267 84.393 54.733 84.393 53.170 82.830 C 51.607 81.267 51.607 78.733 53.170 77.170 L 101.170 29.170 C 101.920 28.419 102.938 27.997 104.000 27.997 C 105.062 27.997 106.080 28.419 106.830 29.170 L 154.830 77.170 C 156.393 78.733 156.393 81.267 154.830 82.830 C 153.267 84.393 150.733 84.393 149.170 82.830 L 108.000 41.660 L 108.000 128.000 C 108.055 178.787 149.213 219.945 200.000 220.000 C 202.209 220.000 204.000 221.791 204.000 224.000 Z"),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
