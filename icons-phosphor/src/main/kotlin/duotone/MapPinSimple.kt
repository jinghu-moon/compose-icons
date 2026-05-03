package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) return _mapPinSimple!!
        _mapPinSimple = phosphorDuotoneIcon(
            name = "MapPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 72.000 C 176.000 98.510 154.510 120.000 128.000 120.000 C 101.490 120.000 80.000 98.510 80.000 72.000 C 80.000 45.490 101.490 24.000 128.000 24.000 C 154.510 24.000 176.000 45.490 176.000 72.000 Z"),
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
        pathData = parseSvgPathData("M 184.000 72.000 C 184.003 42.111 160.533 17.488 130.679 16.058 C 100.824 14.629 75.109 36.897 72.256 66.649 C 69.403 96.401 90.418 123.150 120.000 127.420 L 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 L 136.000 127.420 C 163.530 123.407 183.959 99.821 184.000 72.000 ZM 128.000 112.000 C 105.909 112.000 88.000 94.091 88.000 72.000 C 88.000 49.909 105.909 32.000 128.000 32.000 C 150.091 32.000 168.000 49.909 168.000 72.000 C 168.000 94.091 150.091 112.000 128.000 112.000 Z"),
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
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
