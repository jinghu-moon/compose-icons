package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.XCircle: ImageVector
    get() {
        if (_xCircle != null) return _xCircle!!
        _xCircle = phosphorFillIcon(
            name = "XCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 165.660 154.340 C 168.786 157.466 168.786 162.534 165.660 165.660 C 162.534 168.786 157.466 168.786 154.340 165.660 L 128.000 139.310 L 101.660 165.660 C 98.534 168.786 93.466 168.786 90.340 165.660 C 87.214 162.534 87.214 157.466 90.340 154.340 L 116.690 128.000 L 90.340 101.660 C 87.214 98.534 87.214 93.466 90.340 90.340 C 93.466 87.214 98.534 87.214 101.660 90.340 L 128.000 116.690 L 154.340 90.340 C 157.466 87.214 162.534 87.214 165.660 90.340 C 168.786 93.466 168.786 98.534 165.660 101.660 L 139.310 128.000 Z"),
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
        return _xCircle!!
    }

private var _xCircle: ImageVector? = null
