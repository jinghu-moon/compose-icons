package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorFillIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 16.000 C 87.630 16.000 56.000 35.330 56.000 60.000 L 56.000 196.000 C 56.000 220.670 87.630 240.000 128.000 240.000 C 168.370 240.000 200.000 220.670 200.000 196.000 L 200.000 60.000 C 200.000 35.330 168.370 16.000 128.000 16.000 ZM 128.000 224.000 C 98.170 224.000 72.000 210.920 72.000 196.000 L 72.000 77.430 C 82.920 88.500 103.900 96.000 128.000 96.000 C 152.100 96.000 173.080 88.500 184.000 77.430 L 184.000 196.000 C 184.000 210.920 157.830 224.000 128.000 224.000 Z"),
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
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
