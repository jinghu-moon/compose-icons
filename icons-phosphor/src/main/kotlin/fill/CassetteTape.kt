package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorFillIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 156.300 96.000 C 150.567 105.896 150.567 118.104 156.300 128.000 L 99.700 128.000 C 105.433 118.104 105.433 105.896 99.700 96.000 ZM 72.000 96.000 C 63.163 96.000 56.000 103.163 56.000 112.000 C 56.000 120.837 63.163 128.000 72.000 128.000 C 80.837 128.000 88.000 120.837 88.000 112.000 C 88.000 103.163 80.837 96.000 72.000 96.000 ZM 240.000 64.000 L 240.000 192.000 C 240.000 200.837 232.837 208.000 224.000 208.000 L 32.000 208.000 C 23.163 208.000 16.000 200.837 16.000 192.000 L 16.000 64.000 C 16.000 55.163 23.163 48.000 32.000 48.000 L 224.000 48.000 C 232.837 48.000 240.000 55.163 240.000 64.000 ZM 186.000 192.000 L 170.400 171.200 C 168.889 169.186 166.518 168.000 164.000 168.000 L 92.000 168.000 C 89.482 168.000 87.111 169.186 85.600 171.200 L 70.000 192.000 ZM 216.000 112.000 C 216.000 94.327 201.673 80.000 184.000 80.000 L 72.000 80.000 C 54.327 80.000 40.000 94.327 40.000 112.000 C 40.000 129.673 54.327 144.000 72.000 144.000 L 184.000 144.000 C 201.673 144.000 216.000 129.673 216.000 112.000 ZM 184.000 96.000 C 175.163 96.000 168.000 103.163 168.000 112.000 C 168.000 120.837 175.163 128.000 184.000 128.000 C 192.837 128.000 200.000 120.837 200.000 112.000 C 200.000 103.163 192.837 96.000 184.000 96.000 Z"),
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
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
