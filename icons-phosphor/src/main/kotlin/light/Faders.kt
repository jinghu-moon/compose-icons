package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorLightIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 134.000 120.000 L 134.000 216.000 C 134.000 219.314 131.314 222.000 128.000 222.000 C 124.686 222.000 122.000 219.314 122.000 216.000 L 122.000 120.000 C 122.000 116.686 124.686 114.000 128.000 114.000 C 131.314 114.000 134.000 116.686 134.000 120.000 ZM 200.000 194.000 C 196.686 194.000 194.000 196.686 194.000 200.000 L 194.000 216.000 C 194.000 219.314 196.686 222.000 200.000 222.000 C 203.314 222.000 206.000 219.314 206.000 216.000 L 206.000 200.000 C 206.000 196.686 203.314 194.000 200.000 194.000 ZM 224.000 162.000 L 206.000 162.000 L 206.000 40.000 C 206.000 36.686 203.314 34.000 200.000 34.000 C 196.686 34.000 194.000 36.686 194.000 40.000 L 194.000 162.000 L 176.000 162.000 C 172.686 162.000 170.000 164.686 170.000 168.000 C 170.000 171.314 172.686 174.000 176.000 174.000 L 224.000 174.000 C 227.314 174.000 230.000 171.314 230.000 168.000 C 230.000 164.686 227.314 162.000 224.000 162.000 ZM 56.000 162.000 C 52.686 162.000 50.000 164.686 50.000 168.000 L 50.000 216.000 C 50.000 219.314 52.686 222.000 56.000 222.000 C 59.314 222.000 62.000 219.314 62.000 216.000 L 62.000 168.000 C 62.000 164.686 59.314 162.000 56.000 162.000 ZM 80.000 130.000 L 62.000 130.000 L 62.000 40.000 C 62.000 36.686 59.314 34.000 56.000 34.000 C 52.686 34.000 50.000 36.686 50.000 40.000 L 50.000 130.000 L 32.000 130.000 C 28.686 130.000 26.000 132.686 26.000 136.000 C 26.000 139.314 28.686 142.000 32.000 142.000 L 80.000 142.000 C 83.314 142.000 86.000 139.314 86.000 136.000 C 86.000 132.686 83.314 130.000 80.000 130.000 ZM 152.000 82.000 L 134.000 82.000 L 134.000 40.000 C 134.000 36.686 131.314 34.000 128.000 34.000 C 124.686 34.000 122.000 36.686 122.000 40.000 L 122.000 82.000 L 104.000 82.000 C 100.686 82.000 98.000 84.686 98.000 88.000 C 98.000 91.314 100.686 94.000 104.000 94.000 L 152.000 94.000 C 155.314 94.000 158.000 91.314 158.000 88.000 C 158.000 84.686 155.314 82.000 152.000 82.000 Z"),
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
        return _faders!!
    }

private var _faders: ImageVector? = null
