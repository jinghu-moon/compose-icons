package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Cube: ImageVector
    get() {
        if (_cube != null) return _cube!!
        _cube = radixIcon(
            name = "Cube",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.393 0.762 C 7.499 0.738 7.611 0.750 7.712 0.797 L 13.712 3.597 C 13.888 3.679 14.000 3.856 14.000 4.050 L 14.000 10.950 C 14.000 11.144 13.888 11.321 13.712 11.403 L 7.712 14.203 C 7.578 14.266 7.422 14.266 7.288 14.203 L 1.288 11.403 C 1.112 11.321 1.000 11.144 1.000 10.950 L 1.000 4.050 C 1.000 3.856 1.112 3.679 1.288 3.597 L 7.288 0.797 L 7.393 0.762 ZM 2.000 10.631 L 7.000 12.964 L 7.000 6.931 L 2.000 4.805 L 2.000 10.631 ZM 8.000 6.931 L 8.000 12.964 L 13.000 10.631 L 13.000 4.805 L 8.000 6.931 ZM 2.728 4.028 L 7.500 6.057 L 12.271 4.028 L 7.500 1.802 L 2.728 4.028 Z"),
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
        return _cube!!
    }

private var _cube: ImageVector? = null
