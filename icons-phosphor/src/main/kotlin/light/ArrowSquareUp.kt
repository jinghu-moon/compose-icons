package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareUp: ImageVector
    get() {
        if (_arrowSquareUp != null) return _arrowSquareUp!!
        _arrowSquareUp = phosphorLightIcon(
            name = "ArrowSquareUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 164.240 115.760 C 165.845 117.256 166.506 119.508 165.963 121.634 C 165.420 123.760 163.760 125.420 161.634 125.963 C 159.508 126.506 157.256 125.845 155.760 124.240 L 134.000 102.490 L 134.000 168.000 C 134.000 171.314 131.314 174.000 128.000 174.000 C 124.686 174.000 122.000 171.314 122.000 168.000 L 122.000 102.490 L 100.240 124.240 C 97.876 126.443 94.192 126.378 91.907 124.093 C 89.622 121.808 89.557 118.124 91.760 115.760 L 123.760 83.760 C 126.103 81.420 129.897 81.420 132.240 83.760 Z"),
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
        return _arrowSquareUp!!
    }

private var _arrowSquareUp: ImageVector? = null
