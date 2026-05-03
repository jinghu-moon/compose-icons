package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberOne: ImageVector
    get() {
        if (_numberOne != null) return _numberOne!!
        _numberOne = phosphorThinIcon(
            name = "NumberOne",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 140.000 48.000 L 140.000 208.000 C 140.000 210.209 138.209 212.000 136.000 212.000 C 133.791 212.000 132.000 210.209 132.000 208.000 L 132.000 55.060 L 98.060 75.430 C 96.166 76.568 93.708 75.954 92.570 74.060 C 91.432 72.166 92.046 69.708 93.940 68.570 L 133.940 44.570 C 135.176 43.828 136.716 43.808 137.970 44.518 C 139.225 45.228 140.000 46.558 140.000 48.000 Z"),
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
        return _numberOne!!
    }

private var _numberOne: ImageVector? = null
