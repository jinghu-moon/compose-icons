package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) return _greaterThanOrEqual!!
        _greaterThanOrEqual = phosphorDuotoneIcon(
            name = "GreaterThanOrEqual",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 104.000 L 56.000 160.000 L 56.000 48.000 Z"),
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
        pathData = parseSvgPathData("M 53.240 152.490 L 184.860 104.000 L 53.240 55.510 C 50.447 54.607 48.373 52.247 47.836 49.361 C 47.299 46.475 48.386 43.527 50.668 41.680 C 52.949 39.833 56.059 39.384 58.770 40.510 L 210.770 96.510 C 213.906 97.674 215.986 100.665 215.986 104.010 C 215.986 107.355 213.906 110.346 210.770 111.510 L 58.770 167.510 C 57.882 167.833 56.945 167.999 56.000 168.000 C 52.121 168.002 48.800 165.220 48.121 161.402 C 47.441 157.583 49.599 153.827 53.240 152.490 ZM 208.000 192.000 L 56.000 192.000 C 51.582 192.000 48.000 195.582 48.000 200.000 C 48.000 204.418 51.582 208.000 56.000 208.000 L 208.000 208.000 C 212.418 208.000 216.000 204.418 216.000 200.000 C 216.000 195.582 212.418 192.000 208.000 192.000 Z"),
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
