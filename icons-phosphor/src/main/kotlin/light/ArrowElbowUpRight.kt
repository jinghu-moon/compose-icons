package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorLightIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.240 84.240 L 172.240 132.240 C 169.876 134.443 166.192 134.378 163.907 132.093 C 161.622 129.808 161.557 126.124 163.760 123.760 L 201.510 86.000 L 78.000 86.000 L 78.000 224.000 C 78.000 227.314 75.314 230.000 72.000 230.000 C 68.686 230.000 66.000 227.314 66.000 224.000 L 66.000 80.000 C 66.000 76.686 68.686 74.000 72.000 74.000 L 201.510 74.000 L 163.760 36.240 C 161.557 33.876 161.622 30.192 163.907 27.907 C 166.192 25.622 169.876 25.557 172.240 27.760 L 220.240 75.760 C 222.580 78.103 222.580 81.897 220.240 84.240 Z"),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null
