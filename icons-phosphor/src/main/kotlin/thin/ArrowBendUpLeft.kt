package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorThinIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 200.000 C 228.000 202.209 226.209 204.000 224.000 204.000 C 221.791 204.000 220.000 202.209 220.000 200.000 C 219.945 149.213 178.787 108.055 128.000 108.000 L 41.660 108.000 L 82.830 149.170 C 84.393 150.733 84.393 153.267 82.830 154.830 C 81.267 156.393 78.733 156.393 77.170 154.830 L 29.170 106.830 C 28.419 106.080 27.997 105.062 27.997 104.000 C 27.997 102.938 28.419 101.920 29.170 101.170 L 77.170 53.170 C 78.733 51.607 81.267 51.607 82.830 53.170 C 84.393 54.733 84.393 57.267 82.830 58.830 L 41.660 100.000 L 128.000 100.000 C 183.203 100.061 227.939 144.797 228.000 200.000 Z"),
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
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
