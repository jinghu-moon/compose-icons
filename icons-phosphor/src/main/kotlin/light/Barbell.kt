package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorLightIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 122.000 L 238.000 122.000 L 238.000 88.000 C 238.000 80.268 231.732 74.000 224.000 74.000 L 206.000 74.000 L 206.000 64.000 C 206.000 56.268 199.732 50.000 192.000 50.000 L 168.000 50.000 C 160.268 50.000 154.000 56.268 154.000 64.000 L 154.000 122.000 L 102.000 122.000 L 102.000 64.000 C 102.000 56.268 95.732 50.000 88.000 50.000 L 64.000 50.000 C 56.268 50.000 50.000 56.268 50.000 64.000 L 50.000 74.000 L 32.000 74.000 C 24.268 74.000 18.000 80.268 18.000 88.000 L 18.000 122.000 L 8.000 122.000 C 4.686 122.000 2.000 124.686 2.000 128.000 C 2.000 131.314 4.686 134.000 8.000 134.000 L 18.000 134.000 L 18.000 168.000 C 18.000 175.732 24.268 182.000 32.000 182.000 L 50.000 182.000 L 50.000 192.000 C 50.000 199.732 56.268 206.000 64.000 206.000 L 88.000 206.000 C 95.732 206.000 102.000 199.732 102.000 192.000 L 102.000 134.000 L 154.000 134.000 L 154.000 192.000 C 154.000 199.732 160.268 206.000 168.000 206.000 L 192.000 206.000 C 199.732 206.000 206.000 199.732 206.000 192.000 L 206.000 182.000 L 224.000 182.000 C 231.732 182.000 238.000 175.732 238.000 168.000 L 238.000 134.000 L 248.000 134.000 C 251.314 134.000 254.000 131.314 254.000 128.000 C 254.000 124.686 251.314 122.000 248.000 122.000 ZM 32.000 170.000 C 30.895 170.000 30.000 169.105 30.000 168.000 L 30.000 88.000 C 30.000 86.895 30.895 86.000 32.000 86.000 L 50.000 86.000 L 50.000 170.000 ZM 90.000 192.000 C 90.000 193.105 89.105 194.000 88.000 194.000 L 64.000 194.000 C 62.895 194.000 62.000 193.105 62.000 192.000 L 62.000 64.000 C 62.000 62.895 62.895 62.000 64.000 62.000 L 88.000 62.000 C 89.105 62.000 90.000 62.895 90.000 64.000 ZM 194.000 192.000 C 194.000 193.105 193.105 194.000 192.000 194.000 L 168.000 194.000 C 166.895 194.000 166.000 193.105 166.000 192.000 L 166.000 64.000 C 166.000 62.895 166.895 62.000 168.000 62.000 L 192.000 62.000 C 193.105 62.000 194.000 62.895 194.000 64.000 ZM 226.000 168.000 C 226.000 169.105 225.105 170.000 224.000 170.000 L 206.000 170.000 L 206.000 86.000 L 224.000 86.000 C 225.105 86.000 226.000 86.895 226.000 88.000 Z"),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
