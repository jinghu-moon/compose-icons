package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorFillIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 96.000 L 152.000 48.000 C 151.997 44.762 153.947 41.842 156.938 40.603 C 159.929 39.364 163.372 40.049 165.660 42.340 L 213.660 90.340 C 215.951 92.628 216.636 96.071 215.397 99.062 C 214.158 102.053 211.238 104.003 208.000 104.000 L 160.000 104.000 C 155.582 104.000 152.000 100.418 152.000 96.000 ZM 96.000 152.000 L 48.000 152.000 C 44.762 151.997 41.842 153.947 40.603 156.938 C 39.364 159.929 40.049 163.372 42.340 165.660 L 90.340 213.660 C 92.628 215.951 96.071 216.636 99.062 215.397 C 102.053 214.158 104.003 211.238 104.000 208.000 L 104.000 160.000 C 104.000 155.582 100.418 152.000 96.000 152.000 ZM 99.060 40.610 C 96.071 39.370 92.629 40.053 90.340 42.340 L 42.340 90.340 C 40.049 92.628 39.364 96.071 40.603 99.062 C 41.842 102.053 44.762 104.003 48.000 104.000 L 96.000 104.000 C 100.418 104.000 104.000 100.418 104.000 96.000 L 104.000 48.000 C 103.999 44.764 102.050 41.848 99.060 40.610 ZM 208.000 152.000 L 160.000 152.000 C 155.582 152.000 152.000 155.582 152.000 160.000 L 152.000 208.000 C 151.997 211.238 153.947 214.158 156.938 215.397 C 159.929 216.636 163.372 215.951 165.660 213.660 L 213.660 165.660 C 215.951 163.372 216.636 159.929 215.397 156.938 C 214.158 153.947 211.238 151.997 208.000 152.000 Z"),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
