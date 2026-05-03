package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = phosphorRegularIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 199.870 77.270 L 136.000 114.140 L 136.000 40.370 C 161.666 42.723 185.011 56.210 199.870 77.270 ZM 120.000 40.370 L 120.000 123.370 L 48.110 164.870 C 36.134 138.913 37.513 108.756 51.808 84.000 C 66.103 59.244 91.532 42.974 120.000 40.370 ZM 128.000 216.000 C 99.412 215.988 72.611 202.090 56.130 178.730 L 207.890 91.120 C 220.467 118.367 218.292 150.144 202.120 175.423 C 185.948 200.702 158.009 215.997 128.000 216.000 Z"),
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
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
