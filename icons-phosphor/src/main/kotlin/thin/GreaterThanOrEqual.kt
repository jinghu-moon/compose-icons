package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorThinIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 54.620 156.250 L 196.430 104.000 L 54.620 51.750 C 52.649 50.921 51.678 48.688 52.417 46.681 C 53.155 44.675 55.342 43.604 57.380 44.250 L 209.380 100.250 C 210.948 100.832 211.988 102.328 211.988 104.000 C 211.988 105.672 210.948 107.168 209.380 107.750 L 57.380 163.750 C 56.939 163.916 56.471 164.001 56.000 164.000 C 54.066 163.994 52.413 162.605 52.074 160.701 C 51.735 158.797 52.807 156.923 54.620 156.250 ZM 208.000 196.000 L 56.000 196.000 C 53.791 196.000 52.000 197.791 52.000 200.000 C 52.000 202.209 53.791 204.000 56.000 204.000 L 208.000 204.000 C 210.209 204.000 212.000 202.209 212.000 200.000 C 212.000 197.791 210.209 196.000 208.000 196.000 Z"),
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
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
