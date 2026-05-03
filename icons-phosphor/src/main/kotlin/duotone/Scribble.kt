package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Scribble: ImageVector
    get() {
        if (_scribble != null) return _scribble!!
        _scribble = phosphorDuotoneIcon(
            name = "Scribble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 56.000 L 216.000 200.000 C 216.000 208.837 208.837 216.000 200.000 216.000 L 56.000 216.000 C 47.163 216.000 40.000 208.837 40.000 200.000 L 40.000 56.000 C 40.000 47.163 47.163 40.000 56.000 40.000 L 200.000 40.000 C 208.837 40.000 216.000 47.163 216.000 56.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 205.670 189.660 C 202.924 192.401 201.382 196.121 201.382 200.000 C 201.382 203.879 202.924 207.599 205.670 210.340 C 208.796 213.466 208.796 218.534 205.670 221.660 C 202.544 224.786 197.476 224.786 194.350 221.660 C 182.392 209.696 182.392 190.304 194.350 178.340 L 203.730 168.970 C 209.443 163.246 209.434 153.973 203.710 148.260 C 197.986 142.547 188.713 142.556 183.000 148.280 L 116.280 215.000 C 104.196 226.120 85.493 225.731 73.881 214.119 C 62.269 202.507 61.880 183.804 73.000 171.720 L 171.720 73.000 C 177.442 67.278 177.442 58.002 171.720 52.280 C 165.998 46.558 156.722 46.558 151.000 52.280 L 84.280 119.000 C 72.196 130.120 53.493 129.731 41.881 118.119 C 30.269 106.507 29.880 87.804 41.000 75.720 L 82.340 34.340 C 85.466 31.217 90.532 31.219 93.655 34.345 C 96.778 37.471 96.776 42.537 93.650 45.660 L 52.270 87.000 C 46.548 92.724 46.551 102.003 52.275 107.725 C 57.999 113.447 67.278 113.444 73.000 107.720 L 139.720 41.000 C 151.804 29.880 170.507 30.269 182.119 41.881 C 193.731 53.493 194.120 72.196 183.000 84.280 L 84.280 183.000 C 78.558 188.722 78.558 197.998 84.280 203.720 C 90.002 209.442 99.278 209.442 105.000 203.720 L 171.720 137.000 C 183.804 125.880 202.507 126.269 214.119 137.881 C 225.731 149.493 226.120 168.196 215.000 180.280 Z"),
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
        return _scribble!!
    }

private var _scribble: ImageVector? = null
