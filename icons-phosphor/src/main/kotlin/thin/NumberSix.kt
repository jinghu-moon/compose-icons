package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorThinIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 108.000 C 119.359 107.988 110.852 110.144 103.260 114.270 L 139.490 50.000 C 140.572 48.067 139.883 45.622 137.950 44.540 C 136.017 43.458 133.572 44.147 132.490 46.080 L 83.000 134.050 C 71.255 154.446 74.673 180.188 91.334 196.811 C 107.995 213.435 133.745 216.795 154.114 205.003 C 174.483 193.212 184.393 169.209 178.274 146.482 C 172.156 123.756 151.536 107.972 128.000 108.000 ZM 128.000 204.000 C 103.699 204.000 84.000 184.301 84.000 160.000 C 84.000 135.699 103.699 116.000 128.000 116.000 C 152.301 116.000 172.000 135.699 172.000 160.000 C 171.972 184.289 152.289 203.972 128.000 204.000 Z"),
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
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
