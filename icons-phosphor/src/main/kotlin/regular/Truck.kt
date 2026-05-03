package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = phosphorRegularIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 255.420 117.000 L 241.420 82.000 C 238.990 75.941 233.108 71.978 226.580 72.000 L 192.000 72.000 L 192.000 64.000 C 192.000 59.582 188.418 56.000 184.000 56.000 L 32.000 56.000 C 23.163 56.000 16.000 63.163 16.000 72.000 L 16.000 184.000 C 16.000 192.837 23.163 200.000 32.000 200.000 L 49.000 200.000 C 52.625 214.159 65.384 224.063 80.000 224.063 C 94.616 224.063 107.375 214.159 111.000 200.000 L 161.000 200.000 C 164.625 214.159 177.384 224.063 192.000 224.063 C 206.616 224.063 219.375 214.159 223.000 200.000 L 240.000 200.000 C 248.837 200.000 256.000 192.837 256.000 184.000 L 256.000 120.000 C 256.003 118.972 255.806 117.953 255.420 117.000 ZM 192.000 88.000 L 226.580 88.000 L 236.180 112.000 L 192.000 112.000 ZM 32.000 72.000 L 176.000 72.000 L 176.000 136.000 L 32.000 136.000 ZM 80.000 208.000 C 71.163 208.000 64.000 200.837 64.000 192.000 C 64.000 183.163 71.163 176.000 80.000 176.000 C 88.837 176.000 96.000 183.163 96.000 192.000 C 96.000 200.837 88.837 208.000 80.000 208.000 ZM 161.000 184.000 L 111.000 184.000 C 107.375 169.841 94.616 159.937 80.000 159.937 C 65.384 159.937 52.625 169.841 49.000 184.000 L 32.000 184.000 L 32.000 152.000 L 176.000 152.000 L 176.000 164.310 C 168.570 168.605 163.168 175.696 161.000 184.000 ZM 192.000 208.000 C 183.163 208.000 176.000 200.837 176.000 192.000 C 176.000 183.163 183.163 176.000 192.000 176.000 C 200.837 176.000 208.000 183.163 208.000 192.000 C 208.000 200.837 200.837 208.000 192.000 208.000 ZM 240.000 184.000 L 223.000 184.000 C 219.332 169.878 206.591 160.014 192.000 160.000 L 192.000 128.000 L 240.000 128.000 Z"),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
