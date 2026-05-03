package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorRegularIcon(
            name = "ChartPolar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 215.630 120.000 L 191.480 120.000 C 187.787 91.026 164.974 68.213 136.000 64.520 L 136.000 40.370 C 178.252 44.282 211.718 77.748 215.630 120.000 ZM 120.000 120.000 L 80.680 120.000 C 84.112 99.876 99.876 84.112 120.000 80.680 ZM 120.000 136.000 L 120.000 175.320 C 99.876 171.888 84.112 156.124 80.680 136.000 ZM 136.000 136.000 L 175.320 136.000 C 171.888 156.124 156.124 171.888 136.000 175.320 ZM 136.000 120.000 L 136.000 80.680 C 156.124 84.112 171.888 99.876 175.320 120.000 ZM 120.000 40.370 L 120.000 64.520 C 91.026 68.213 68.213 91.026 64.520 120.000 L 40.370 120.000 C 44.282 77.748 77.748 44.282 120.000 40.370 ZM 40.370 136.000 L 64.520 136.000 C 68.213 164.974 91.026 187.787 120.000 191.480 L 120.000 215.630 C 77.748 211.718 44.282 178.252 40.370 136.000 ZM 136.000 215.630 L 136.000 191.480 C 164.974 187.787 187.787 164.974 191.480 136.000 L 215.630 136.000 C 211.718 178.252 178.252 211.718 136.000 215.630 Z"),
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
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
