package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorThinIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 251.660 190.380 L 187.660 46.380 C 187.019 44.932 185.584 43.999 184.000 44.000 L 72.000 44.000 C 70.434 44.005 69.016 44.924 68.370 46.350 C 68.370 46.350 68.370 46.350 68.370 46.350 L 68.370 46.410 L 68.370 46.410 L 4.370 190.340 C 3.806 191.577 3.908 193.015 4.642 194.159 C 5.376 195.304 6.641 195.997 8.000 196.000 L 248.000 196.000 C 249.354 196.001 250.616 195.317 251.355 194.183 C 252.093 193.049 252.208 191.618 251.660 190.380 ZM 68.000 66.850 L 68.000 188.000 L 14.160 188.000 ZM 76.000 188.000 L 76.000 66.850 L 129.840 188.000 ZM 138.600 188.000 L 78.160 52.000 L 181.400 52.000 L 241.840 188.000 Z"),
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
        return _tent!!
    }

private var _tent: ImageVector? = null
