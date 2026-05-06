package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) return _mapPinSimple!!
        _mapPinSimple = phosphorFillIcon(
            name = "MapPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 127.42v104.58c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-104.58C90.929 123.224 70.04 97.281 72.144 67.984 74.247 38.688 98.628 15.994 128 15.994c29.372 0 53.753 22.693 55.856 51.99 2.103 29.296-18.786 55.24-47.856 59.436Z"),
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
