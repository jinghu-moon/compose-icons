package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorFillIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 224.000 L 150.540 224.000 C 158.849 216.581 166.684 208.649 174.000 200.250 C 201.450 168.680 216.000 135.400 216.000 104.000 C 216.000 55.399 176.601 16.000 128.000 16.000 C 79.399 16.000 40.000 55.399 40.000 104.000 C 40.000 135.400 54.510 168.680 82.000 200.250 C 89.316 208.649 97.151 216.581 105.460 224.000 L 56.000 224.000 C 51.582 224.000 48.000 227.582 48.000 232.000 C 48.000 236.418 51.582 240.000 56.000 240.000 L 200.000 240.000 C 204.418 240.000 208.000 236.418 208.000 232.000 C 208.000 227.582 204.418 224.000 200.000 224.000 ZM 128.000 72.000 C 145.673 72.000 160.000 86.327 160.000 104.000 C 160.000 121.673 145.673 136.000 128.000 136.000 C 110.327 136.000 96.000 121.673 96.000 104.000 C 96.000 86.327 110.327 72.000 128.000 72.000 Z"),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
