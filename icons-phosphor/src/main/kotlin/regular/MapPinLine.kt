package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorRegularIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 224.000 L 150.540 224.000 C 158.849 216.581 166.684 208.649 174.000 200.250 C 201.450 168.680 216.000 135.400 216.000 104.000 C 216.000 55.399 176.601 16.000 128.000 16.000 C 79.399 16.000 40.000 55.399 40.000 104.000 C 40.000 135.400 54.510 168.680 82.000 200.250 C 89.316 208.649 97.151 216.581 105.460 224.000 L 56.000 224.000 C 51.582 224.000 48.000 227.582 48.000 232.000 C 48.000 236.418 51.582 240.000 56.000 240.000 L 200.000 240.000 C 204.418 240.000 208.000 236.418 208.000 232.000 C 208.000 227.582 204.418 224.000 200.000 224.000 ZM 56.000 104.000 C 56.000 64.235 88.235 32.000 128.000 32.000 C 167.764 32.000 200.000 64.235 200.000 104.000 C 200.000 161.230 144.530 209.000 128.000 222.000 C 111.470 209.000 56.000 161.230 56.000 104.000 ZM 168.000 104.000 C 168.000 81.909 150.091 64.000 128.000 64.000 C 105.909 64.000 88.000 81.909 88.000 104.000 C 88.000 126.091 105.909 144.000 128.000 144.000 C 150.091 144.000 168.000 126.091 168.000 104.000 ZM 104.000 104.000 C 104.000 90.745 114.745 80.000 128.000 80.000 C 141.255 80.000 152.000 90.745 152.000 104.000 C 152.000 117.255 141.255 128.000 128.000 128.000 C 114.745 128.000 104.000 117.255 104.000 104.000 Z"),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
