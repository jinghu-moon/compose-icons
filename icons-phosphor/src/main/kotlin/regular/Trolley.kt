package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Trolley: ImageVector
    get() {
        if (_trolley != null) return _trolley!!
        _trolley = phosphorRegularIcon(
            name = "Trolley",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 88.000 224.000 C 88.000 232.837 80.837 240.000 72.000 240.000 C 63.163 240.000 56.000 232.837 56.000 224.000 C 56.000 215.163 63.163 208.000 72.000 208.000 C 80.837 208.000 88.000 215.163 88.000 224.000 ZM 216.000 208.000 C 207.163 208.000 200.000 215.163 200.000 224.000 C 200.000 232.837 207.163 240.000 216.000 240.000 C 224.837 240.000 232.000 232.837 232.000 224.000 C 232.000 215.163 224.837 208.000 216.000 208.000 ZM 240.000 176.000 L 56.000 176.000 L 56.000 75.310 C 56.014 71.064 54.324 66.990 51.310 64.000 L 29.660 42.340 C 26.534 39.214 21.466 39.214 18.340 42.340 C 15.214 45.466 15.214 50.534 18.340 53.660 L 40.000 75.310 L 40.000 176.000 L 32.000 176.000 C 27.582 176.000 24.000 179.582 24.000 184.000 C 24.000 188.418 27.582 192.000 32.000 192.000 L 240.000 192.000 C 244.418 192.000 248.000 188.418 248.000 184.000 C 248.000 179.582 244.418 176.000 240.000 176.000 Z"),
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
        return _trolley!!
    }

private var _trolley: ImageVector? = null
