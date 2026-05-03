package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorThinIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 184.000 C 228.000 186.209 226.209 188.000 224.000 188.000 C 221.791 188.000 220.000 186.209 220.000 184.000 C 219.957 146.823 197.542 113.326 163.192 99.105 C 128.843 84.883 89.310 92.734 63.000 119.000 L 33.700 148.000 L 88.000 148.000 C 90.209 148.000 92.000 149.791 92.000 152.000 C 92.000 154.209 90.209 156.000 88.000 156.000 L 24.000 156.000 C 21.791 156.000 20.000 154.209 20.000 152.000 L 20.000 88.000 C 20.000 85.791 21.791 84.000 24.000 84.000 C 26.209 84.000 28.000 85.791 28.000 88.000 L 28.000 142.390 L 57.300 113.280 C 85.902 84.687 128.911 76.137 166.275 91.616 C 203.638 107.096 227.999 143.557 228.000 184.000 Z"),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
