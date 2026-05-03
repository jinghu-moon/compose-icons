package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorRegularIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 80.000 192.000 L 92.000 176.000 L 164.000 176.000 L 176.000 192.000 ZM 224.000 192.000 L 196.000 192.000 L 174.400 163.200 C 172.889 161.186 170.518 160.000 168.000 160.000 L 88.000 160.000 C 85.482 160.000 83.111 161.186 81.600 163.200 L 60.000 192.000 L 32.000 192.000 L 32.000 64.000 L 224.000 64.000 L 224.000 192.000 ZM 176.000 80.000 L 80.000 80.000 C 62.327 80.000 48.000 94.327 48.000 112.000 C 48.000 129.673 62.327 144.000 80.000 144.000 L 176.000 144.000 C 193.673 144.000 208.000 129.673 208.000 112.000 C 208.000 94.327 193.673 80.000 176.000 80.000 ZM 148.300 96.000 C 142.567 105.896 142.567 118.104 148.300 128.000 L 107.700 128.000 C 113.433 118.104 113.433 105.896 107.700 96.000 ZM 64.000 112.000 C 64.000 103.163 71.163 96.000 80.000 96.000 C 88.837 96.000 96.000 103.163 96.000 112.000 C 96.000 120.837 88.837 128.000 80.000 128.000 C 71.163 128.000 64.000 120.837 64.000 112.000 ZM 176.000 128.000 C 167.163 128.000 160.000 120.837 160.000 112.000 C 160.000 103.163 167.163 96.000 176.000 96.000 C 184.837 96.000 192.000 103.163 192.000 112.000 C 192.000 120.837 184.837 128.000 176.000 128.000 Z"),
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
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
