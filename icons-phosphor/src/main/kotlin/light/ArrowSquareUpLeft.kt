package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowSquareUpLeft: ImageVector
    get() {
        if (_arrowSquareUpLeft != null) return _arrowSquareUpLeft!!
        _arrowSquareUpLeft = phosphorLightIcon(
            name = "ArrowSquareUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 164.240 155.760 C 165.845 157.256 166.506 159.508 165.963 161.634 C 165.420 163.760 163.760 165.420 161.634 165.963 C 159.508 166.506 157.256 165.845 155.760 164.240 L 102.000 110.480 L 102.000 144.000 C 102.000 147.314 99.314 150.000 96.000 150.000 C 92.686 150.000 90.000 147.314 90.000 144.000 L 90.000 96.000 C 90.000 92.686 92.686 90.000 96.000 90.000 L 144.000 90.000 C 147.314 90.000 150.000 92.686 150.000 96.000 C 150.000 99.314 147.314 102.000 144.000 102.000 L 110.480 102.000 Z"),
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
        return _arrowSquareUpLeft!!
    }

private var _arrowSquareUpLeft: ImageVector? = null
