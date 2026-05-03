package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorRegularIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 16.000 C 87.630 16.000 56.000 35.330 56.000 60.000 L 56.000 196.000 C 56.000 220.670 87.630 240.000 128.000 240.000 C 168.370 240.000 200.000 220.670 200.000 196.000 L 200.000 60.000 C 200.000 35.330 168.370 16.000 128.000 16.000 ZM 128.000 32.000 C 154.490 32.000 184.000 43.500 184.000 60.000 C 184.000 76.500 154.490 88.000 128.000 88.000 C 101.510 88.000 72.000 76.500 72.000 60.000 C 72.000 43.500 101.510 32.000 128.000 32.000 ZM 128.000 224.000 C 98.170 224.000 72.000 210.920 72.000 196.000 L 72.000 88.000 C 85.100 97.850 105.140 104.000 128.000 104.000 C 150.860 104.000 170.900 97.800 184.000 88.000 L 184.000 196.000 C 184.000 210.920 157.830 224.000 128.000 224.000 Z"),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
