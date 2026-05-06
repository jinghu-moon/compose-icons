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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 72c0 26.51-21.49 48-48 48C101.49 120 80 98.51 80 72 80 45.49 101.49 24 128 24c26.51 0 48 21.49 48 48Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M184 72C184.003 42.111 160.533 17.488 130.679 16.058 100.824 14.629 75.109 36.897 72.256 66.649 69.403 96.401 90.418 123.15 120 127.42v104.58c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-104.58C163.53 123.407 183.959 99.821 184 72ZM128 112C105.909 112 88 94.091 88 72 88 49.909 105.909 32 128 32c22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
