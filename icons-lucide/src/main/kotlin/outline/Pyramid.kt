package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Pyramid: ImageVector
    get() {
        if (_pyramid != null) return _pyramid!!
        _pyramid = lucideOutlineIcon(
            name = "Pyramid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.500 16.880 C 2.260 16.740 2.089 16.506 2.028 16.235 C 1.968 15.963 2.023 15.679 2.180 15.450 L 11.180 2.430 C 11.367 2.162 11.673 2.002 12.000 2.002 C 12.327 2.002 12.633 2.162 12.820 2.430 L 21.820 15.440 C 21.981 15.670 22.038 15.957 21.977 16.230 C 21.916 16.504 21.743 16.740 21.500 16.880 L 12.990 21.740 C 12.376 22.090 11.624 22.090 11.010 21.740 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.000 22.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
