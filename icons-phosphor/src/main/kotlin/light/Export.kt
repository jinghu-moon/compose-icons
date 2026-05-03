package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorLightIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 214.000 112.000 L 214.000 208.000 C 214.000 215.732 207.732 222.000 200.000 222.000 L 56.000 222.000 C 48.268 222.000 42.000 215.732 42.000 208.000 L 42.000 112.000 C 42.000 104.268 48.268 98.000 56.000 98.000 L 80.000 98.000 C 83.314 98.000 86.000 100.686 86.000 104.000 C 86.000 107.314 83.314 110.000 80.000 110.000 L 56.000 110.000 C 54.895 110.000 54.000 110.895 54.000 112.000 L 54.000 208.000 C 54.000 209.105 54.895 210.000 56.000 210.000 L 200.000 210.000 C 201.105 210.000 202.000 209.105 202.000 208.000 L 202.000 112.000 C 202.000 110.895 201.105 110.000 200.000 110.000 L 176.000 110.000 C 172.686 110.000 170.000 107.314 170.000 104.000 C 170.000 100.686 172.686 98.000 176.000 98.000 L 200.000 98.000 C 207.732 98.000 214.000 104.268 214.000 112.000 ZM 92.240 68.240 L 122.000 38.490 L 122.000 136.000 C 122.000 139.314 124.686 142.000 128.000 142.000 C 131.314 142.000 134.000 139.314 134.000 136.000 L 134.000 38.490 L 163.760 68.240 C 165.256 69.845 167.508 70.506 169.634 69.963 C 171.760 69.420 173.420 67.760 173.963 65.634 C 174.506 63.508 173.845 61.256 172.240 59.760 L 132.240 19.760 C 129.897 17.420 126.103 17.420 123.760 19.760 L 83.760 59.760 C 82.155 61.256 81.494 63.508 82.037 65.634 C 82.580 67.760 84.240 69.420 86.366 69.963 C 88.492 70.506 90.744 69.845 92.240 68.240 Z"),
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
        return _export!!
    }

private var _export: ImageVector? = null
