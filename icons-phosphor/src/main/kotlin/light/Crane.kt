package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorLightIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.090 18.860 C 225.283 17.776 223.040 17.719 221.180 18.710 L 102.500 82.000 L 32.000 82.000 C 24.268 82.000 18.000 88.268 18.000 96.000 L 18.000 200.000 C 18.000 207.732 24.268 214.000 32.000 214.000 L 120.000 214.000 C 127.732 214.000 134.000 207.732 134.000 200.000 L 134.000 168.000 C 133.997 167.418 133.913 166.839 133.750 166.280 L 111.160 91.000 L 218.000 34.000 L 218.000 160.000 C 218.000 161.105 217.105 162.000 216.000 162.000 L 200.000 162.000 C 198.895 162.000 198.000 161.105 198.000 160.000 L 198.000 152.000 C 198.000 148.686 195.314 146.000 192.000 146.000 C 188.686 146.000 186.000 148.686 186.000 152.000 L 186.000 160.000 C 186.000 167.732 192.268 174.000 200.000 174.000 L 216.000 174.000 C 223.732 174.000 230.000 167.732 230.000 160.000 L 230.000 24.000 C 229.999 21.895 228.895 19.944 227.090 18.860 ZM 99.540 94.000 L 119.940 162.000 L 62.000 162.000 L 62.000 94.000 ZM 32.000 94.000 L 50.000 94.000 L 50.000 162.000 L 30.000 162.000 L 30.000 96.000 C 30.000 94.895 30.895 94.000 32.000 94.000 ZM 120.000 202.000 L 32.000 202.000 C 30.895 202.000 30.000 201.105 30.000 200.000 L 30.000 174.000 L 122.000 174.000 L 122.000 200.000 C 122.000 201.105 121.105 202.000 120.000 202.000 Z"),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
