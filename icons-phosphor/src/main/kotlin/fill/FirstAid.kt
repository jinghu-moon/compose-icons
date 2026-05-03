package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorFillIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 108.000 L 232.000 148.000 C 232.000 156.837 224.837 164.000 216.000 164.000 L 164.000 164.000 L 164.000 216.000 C 164.000 224.837 156.837 232.000 148.000 232.000 L 108.000 232.000 C 99.163 232.000 92.000 224.837 92.000 216.000 L 92.000 164.000 L 40.000 164.000 C 31.163 164.000 24.000 156.837 24.000 148.000 L 24.000 108.000 C 24.000 99.163 31.163 92.000 40.000 92.000 L 92.000 92.000 L 92.000 40.000 C 92.000 31.163 99.163 24.000 108.000 24.000 L 148.000 24.000 C 156.837 24.000 164.000 31.163 164.000 40.000 L 164.000 92.000 L 216.000 92.000 C 224.837 92.000 232.000 99.163 232.000 108.000 Z"),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
