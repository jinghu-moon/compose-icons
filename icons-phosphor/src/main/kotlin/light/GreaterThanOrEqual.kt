package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorLightIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 53.930 154.370 L 190.640 104.000 L 53.930 53.630 C 50.821 52.484 49.229 49.034 50.375 45.925 C 51.521 42.816 54.971 41.224 58.080 42.370 L 210.080 98.370 C 212.439 99.239 214.006 101.486 214.006 104.000 C 214.006 106.514 212.439 108.761 210.080 109.630 L 58.080 165.630 C 57.414 165.874 56.710 165.999 56.000 166.000 C 53.094 165.998 50.607 163.913 50.097 161.051 C 49.588 158.190 51.203 155.375 53.930 154.370 ZM 208.000 194.000 L 56.000 194.000 C 52.686 194.000 50.000 196.686 50.000 200.000 C 50.000 203.314 52.686 206.000 56.000 206.000 L 208.000 206.000 C 211.314 206.000 214.000 203.314 214.000 200.000 C 214.000 196.686 211.314 194.000 208.000 194.000 Z"),
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
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
