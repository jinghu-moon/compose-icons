package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Van: ImageVector
    get() {
        if (_van != null) return _van!!
        _van = phosphorRegularIcon(
            name = "Van",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 254.070 106.790 L 208.530 53.730 C 205.490 50.098 200.997 48.000 196.260 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 176.000 C 16.000 184.837 23.163 192.000 32.000 192.000 L 49.000 192.000 C 52.625 206.159 65.384 216.063 80.000 216.063 C 94.616 216.063 107.375 206.159 111.000 192.000 L 161.000 192.000 C 164.625 206.159 177.384 216.063 192.000 216.063 C 206.616 216.063 219.375 206.159 223.000 192.000 L 240.000 192.000 C 248.837 192.000 256.000 184.837 256.000 176.000 L 256.000 112.000 C 256.000 110.089 255.315 108.240 254.070 106.790 ZM 230.590 104.000 L 176.000 104.000 L 176.000 64.000 L 196.260 64.000 ZM 104.000 104.000 L 104.000 64.000 L 160.000 64.000 L 160.000 104.000 ZM 88.000 64.000 L 88.000 104.000 L 32.000 104.000 L 32.000 64.000 ZM 80.000 200.000 C 71.163 200.000 64.000 192.837 64.000 184.000 C 64.000 175.163 71.163 168.000 80.000 168.000 C 88.837 168.000 96.000 175.163 96.000 184.000 C 96.000 192.837 88.837 200.000 80.000 200.000 ZM 192.000 200.000 C 183.163 200.000 176.000 192.837 176.000 184.000 C 176.000 175.163 183.163 168.000 192.000 168.000 C 200.837 168.000 208.000 175.163 208.000 184.000 C 208.000 192.837 200.837 200.000 192.000 200.000 ZM 223.000 176.000 C 219.375 161.841 206.616 151.937 192.000 151.937 C 177.384 151.937 164.625 161.841 161.000 176.000 L 111.000 176.000 C 107.375 161.841 94.616 151.937 80.000 151.937 C 65.384 151.937 52.625 161.841 49.000 176.000 L 32.000 176.000 L 32.000 120.000 L 240.000 120.000 L 240.000 176.000 Z"),
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
        return _van!!
    }

private var _van: ImageVector? = null
