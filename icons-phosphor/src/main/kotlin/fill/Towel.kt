package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorFillIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 48.000 L 224.000 152.000 C 224.005 154.217 223.090 156.336 221.473 157.853 C 219.856 159.369 217.682 160.147 215.470 160.000 C 211.202 159.633 207.942 156.033 208.000 151.750 L 208.000 48.000 C 208.005 45.779 207.087 43.657 205.466 42.139 C 203.844 40.622 201.665 39.847 199.450 40.000 C 195.183 40.387 191.935 43.996 192.000 48.280 L 192.000 180.000 C 192.000 182.209 190.209 184.000 188.000 184.000 L 52.000 184.000 C 49.791 184.000 48.000 182.209 48.000 180.000 L 48.000 48.000 C 48.000 34.745 58.745 24.000 72.000 24.000 L 200.000 24.000 C 213.255 24.000 224.000 34.745 224.000 48.000 ZM 188.000 200.000 L 52.000 200.000 C 49.791 200.000 48.000 201.791 48.000 204.000 L 48.000 216.000 C 48.000 224.837 55.163 232.000 64.000 232.000 L 176.000 232.000 C 184.837 232.000 192.000 224.837 192.000 216.000 L 192.000 204.000 C 192.000 201.791 190.209 200.000 188.000 200.000 Z"),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
