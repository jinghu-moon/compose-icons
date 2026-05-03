package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorFillIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 93.660 202.340 C 95.951 204.628 96.636 208.071 95.397 211.062 C 94.158 214.053 91.238 216.003 88.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 168.000 C 39.997 164.762 41.947 161.842 44.938 160.603 C 47.929 159.364 51.372 160.049 53.660 162.340 ZM 88.000 40.000 L 48.000 40.000 C 43.582 40.000 40.000 43.582 40.000 48.000 L 40.000 88.000 C 39.997 91.238 41.947 94.158 44.938 95.397 C 47.929 96.636 51.372 95.951 53.660 93.660 L 93.660 53.660 C 95.951 51.372 96.636 47.929 95.397 44.938 C 94.158 41.947 91.238 39.997 88.000 40.000 ZM 211.060 160.610 C 208.071 159.370 204.629 160.053 202.340 162.340 L 162.340 202.340 C 160.049 204.628 159.364 208.071 160.603 211.062 C 161.842 214.053 164.762 216.003 168.000 216.000 L 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 168.000 C 215.999 164.764 214.050 161.848 211.060 160.610 ZM 208.000 40.000 L 168.000 40.000 C 164.762 39.997 161.842 41.947 160.603 44.938 C 159.364 47.929 160.049 51.372 162.340 53.660 L 202.340 93.660 C 204.628 95.951 208.071 96.636 211.062 95.397 C 214.053 94.158 216.003 91.238 216.000 88.000 L 216.000 48.000 C 216.000 43.582 212.418 40.000 208.000 40.000 Z"),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
