package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorDuotoneIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 176.000 80.000 C 176.000 106.510 154.510 128.000 128.000 128.000 C 101.490 128.000 80.000 106.510 80.000 80.000 C 80.000 53.490 101.490 32.000 128.000 32.000 C 154.510 32.000 176.000 53.490 176.000 80.000 Z"),
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
        pathData = parseSvgPathData("M 216.000 208.000 L 136.000 208.000 L 136.000 135.420 C 165.071 131.224 185.960 105.281 183.856 75.984 C 181.753 46.688 157.372 23.994 128.000 23.994 C 98.628 23.994 74.247 46.688 72.144 75.984 C 70.040 105.281 90.929 131.224 120.000 135.420 L 120.000 208.000 L 40.000 208.000 C 35.582 208.000 32.000 211.582 32.000 216.000 C 32.000 220.418 35.582 224.000 40.000 224.000 L 216.000 224.000 C 220.418 224.000 224.000 220.418 224.000 216.000 C 224.000 211.582 220.418 208.000 216.000 208.000 ZM 88.000 80.000 C 88.000 57.909 105.909 40.000 128.000 40.000 C 150.091 40.000 168.000 57.909 168.000 80.000 C 168.000 102.091 150.091 120.000 128.000 120.000 C 105.909 120.000 88.000 102.091 88.000 80.000 Z"),
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
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
