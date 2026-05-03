package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorFillIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 92.000 L 216.000 116.000 C 216.000 124.837 208.837 132.000 200.000 132.000 L 156.000 132.000 L 156.000 224.000 C 156.000 232.837 148.837 240.000 140.000 240.000 L 116.000 240.000 C 107.163 240.000 100.000 232.837 100.000 224.000 L 100.000 132.000 L 56.000 132.000 C 47.163 132.000 40.000 124.837 40.000 116.000 L 40.000 92.000 C 40.000 83.163 47.163 76.000 56.000 76.000 L 100.000 76.000 L 100.000 32.000 C 100.000 23.163 107.163 16.000 116.000 16.000 L 140.000 16.000 C 148.837 16.000 156.000 23.163 156.000 32.000 L 156.000 76.000 L 200.000 76.000 C 208.837 76.000 216.000 83.163 216.000 92.000 Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
