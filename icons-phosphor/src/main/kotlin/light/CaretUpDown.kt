package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretUpDown: ImageVector
    get() {
        if (_caretUpDown != null) return _caretUpDown!!
        _caretUpDown = phosphorLightIcon(
            name = "CaretUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.240 171.760 C 182.580 174.103 182.580 177.897 180.240 180.240 L 132.240 228.240 C 129.897 230.580 126.103 230.580 123.760 228.240 L 75.760 180.240 C 73.557 177.876 73.622 174.192 75.907 171.907 C 78.192 169.622 81.876 169.557 84.240 171.760 L 128.000 215.510 L 171.760 171.760 C 174.103 169.420 177.897 169.420 180.240 171.760 ZM 84.240 84.240 L 128.000 40.490 L 171.760 84.240 C 174.124 86.443 177.808 86.378 180.093 84.093 C 182.378 81.808 182.443 78.124 180.240 75.760 L 132.240 27.760 C 129.897 25.420 126.103 25.420 123.760 27.760 L 75.760 75.760 C 73.557 78.124 73.622 81.808 75.907 84.093 C 78.192 86.378 81.876 86.443 84.240 84.240 Z"),
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
        return _caretUpDown!!
    }

private var _caretUpDown: ImageVector? = null
