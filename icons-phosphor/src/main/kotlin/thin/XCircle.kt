package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.XCircle: ImageVector
    get() {
        if (_xCircle != null) return _xCircle!!
        _xCircle = phosphorThinIcon(
            name = "XCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 162.830 98.830 L 133.660 128.000 L 162.830 157.170 C 164.393 158.733 164.393 161.267 162.830 162.830 C 161.267 164.393 158.733 164.393 157.170 162.830 L 128.000 133.660 L 98.830 162.830 C 97.267 164.393 94.733 164.393 93.170 162.830 C 91.607 161.267 91.607 158.733 93.170 157.170 L 122.340 128.000 L 93.170 98.830 C 91.607 97.267 91.607 94.733 93.170 93.170 C 94.733 91.607 97.267 91.607 98.830 93.170 L 128.000 122.340 L 157.170 93.170 C 158.733 91.607 161.267 91.607 162.830 93.170 C 164.393 94.733 164.393 97.267 162.830 98.830 ZM 228.000 128.000 C 228.000 183.228 183.228 228.000 128.000 228.000 C 72.772 228.000 28.000 183.228 28.000 128.000 C 28.000 72.772 72.772 28.000 128.000 28.000 C 183.203 28.061 227.939 72.797 228.000 128.000 ZM 220.000 128.000 C 220.000 77.190 178.810 36.000 128.000 36.000 C 77.190 36.000 36.000 77.190 36.000 128.000 C 36.000 178.810 77.190 220.000 128.000 220.000 C 178.787 219.945 219.945 178.787 220.000 128.000 Z"),
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
