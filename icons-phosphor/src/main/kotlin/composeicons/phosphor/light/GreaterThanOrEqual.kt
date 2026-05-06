package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorLightIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M53.93 154.37 190.64 104 53.93 53.63C50.821 52.484 49.229 49.034 50.375 45.925c1.146-3.109 4.596-4.701 7.705-3.555l152 56c2.359 .869 3.926 3.116 3.926 5.63 0 2.514-1.567 4.761-3.926 5.63l-152 56c-.666 .244-1.37 .369-2.08 .37-2.906-.002-5.393-2.087-5.903-4.949-.509-2.861 1.106-5.677 3.833-6.681ZM208 194h-152c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h152c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
