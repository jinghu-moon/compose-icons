package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Person: ImageVector
    get() {
        if (_person != null) return _person!!
        _person = phosphorFillIcon(
            name = "Person",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 36.000 C 100.000 20.536 112.536 8.000 128.000 8.000 C 143.464 8.000 156.000 20.536 156.000 36.000 C 156.000 51.464 143.464 64.000 128.000 64.000 C 112.536 64.000 100.000 51.464 100.000 36.000 ZM 215.420 140.780 L 170.170 89.480 C 164.855 83.453 157.206 80.000 149.170 80.000 L 106.830 80.000 C 98.794 80.000 91.145 83.453 85.830 89.480 L 40.580 140.780 C 34.466 147.036 34.509 157.042 40.676 163.244 C 46.844 169.447 56.849 169.548 63.140 163.470 L 89.000 142.700 L 69.300 217.580 C 65.733 225.587 69.274 234.974 77.240 238.631 C 85.207 242.289 94.633 238.855 98.380 230.930 L 128.000 180.000 L 157.580 231.000 C 161.327 238.925 170.753 242.359 178.720 238.701 C 186.686 235.044 190.227 225.657 186.660 217.650 L 167.000 142.700 L 192.900 163.470 C 199.191 169.548 209.196 169.447 215.364 163.244 C 221.531 157.042 221.574 147.036 215.460 140.780 Z"),
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
        return _person!!
    }

private var _person: ImageVector? = null
