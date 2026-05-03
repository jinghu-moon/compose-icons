package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Radical: ImageVector
    get() {
        if (_radical != null) return _radical!!
        _radical = phosphorThinIcon(
            name = "Radical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 244.000 80.000 L 244.000 104.000 C 244.000 106.209 242.209 108.000 240.000 108.000 C 237.791 108.000 236.000 106.209 236.000 104.000 L 236.000 84.000 L 130.770 84.000 L 83.770 209.400 C 83.184 210.961 81.692 211.995 80.025 211.995 C 78.358 211.995 76.866 210.961 76.280 209.400 L 28.280 81.400 C 27.765 80.059 28.009 78.545 28.918 77.433 C 29.828 76.322 31.264 75.783 32.680 76.022 C 34.096 76.261 35.276 77.241 35.770 78.590 L 80.000 196.610 L 124.260 78.610 C 124.840 77.045 126.331 76.004 128.000 76.000 L 240.000 76.000 C 242.209 76.000 244.000 77.791 244.000 80.000 Z"),
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
        return _radical!!
    }

private var _radical: ImageVector? = null
