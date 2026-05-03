package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cross: ImageVector
    get() {
        if (_cross != null) return _cross!!
        _cross = phosphorLightIcon(
            name = "Cross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 74.000 L 158.000 74.000 L 158.000 32.000 C 158.000 24.268 151.732 18.000 144.000 18.000 L 112.000 18.000 C 104.268 18.000 98.000 24.268 98.000 32.000 L 98.000 74.000 L 56.000 74.000 C 48.268 74.000 42.000 80.268 42.000 88.000 L 42.000 120.000 C 42.000 127.732 48.268 134.000 56.000 134.000 L 98.000 134.000 L 98.000 224.000 C 98.000 231.732 104.268 238.000 112.000 238.000 L 144.000 238.000 C 151.732 238.000 158.000 231.732 158.000 224.000 L 158.000 134.000 L 200.000 134.000 C 207.732 134.000 214.000 127.732 214.000 120.000 L 214.000 88.000 C 214.000 80.268 207.732 74.000 200.000 74.000 ZM 202.000 120.000 C 202.000 121.105 201.105 122.000 200.000 122.000 L 152.000 122.000 C 148.686 122.000 146.000 124.686 146.000 128.000 L 146.000 224.000 C 146.000 225.105 145.105 226.000 144.000 226.000 L 112.000 226.000 C 110.895 226.000 110.000 225.105 110.000 224.000 L 110.000 128.000 C 110.000 124.686 107.314 122.000 104.000 122.000 L 56.000 122.000 C 54.895 122.000 54.000 121.105 54.000 120.000 L 54.000 88.000 C 54.000 86.895 54.895 86.000 56.000 86.000 L 104.000 86.000 C 107.314 86.000 110.000 83.314 110.000 80.000 L 110.000 32.000 C 110.000 30.895 110.895 30.000 112.000 30.000 L 144.000 30.000 C 145.105 30.000 146.000 30.895 146.000 32.000 L 146.000 80.000 C 146.000 83.314 148.686 86.000 152.000 86.000 L 200.000 86.000 C 201.105 86.000 202.000 86.895 202.000 88.000 Z"),
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
        return _cross!!
    }

private var _cross: ImageVector? = null
