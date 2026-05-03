package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorRegularIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 88.000 L 240.000 152.000 C 240.000 156.418 236.418 160.000 232.000 160.000 L 168.000 160.000 C 163.582 160.000 160.000 156.418 160.000 152.000 C 160.000 147.582 163.582 144.000 168.000 144.000 L 212.600 144.000 L 190.240 121.790 C 165.076 96.614 127.222 89.077 94.334 102.695 C 61.445 116.313 40.000 148.404 40.000 184.000 C 40.000 188.418 36.418 192.000 32.000 192.000 C 27.582 192.000 24.000 188.418 24.000 184.000 C 23.999 141.935 49.338 104.012 88.201 87.915 C 127.063 71.817 171.796 80.715 201.540 110.460 L 224.000 132.770 L 224.000 88.000 C 224.000 83.582 227.582 80.000 232.000 80.000 C 236.418 80.000 240.000 83.582 240.000 88.000 Z"),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
