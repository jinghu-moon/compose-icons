package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HardHat: ImageVector
    get() {
        if (_hardHat != null) return _hardHat!!
        _hardHat = phosphorLightIcon(
            name = "HardHat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 154.000 L 222.000 154.000 L 222.000 136.000 C 221.893 95.677 196.178 59.877 158.000 46.900 L 158.000 40.000 C 158.000 32.268 151.732 26.000 144.000 26.000 L 112.000 26.000 C 104.268 26.000 98.000 32.268 98.000 40.000 L 98.000 46.900 C 59.822 59.877 34.107 95.677 34.000 136.000 L 34.000 154.000 L 32.000 154.000 C 24.268 154.000 18.000 160.268 18.000 168.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 168.000 C 238.000 160.268 231.732 154.000 224.000 154.000 ZM 210.000 136.000 L 210.000 154.000 L 158.000 154.000 L 158.000 59.680 C 189.313 72.088 209.910 102.318 210.000 136.000 ZM 112.000 38.000 L 144.000 38.000 C 145.105 38.000 146.000 38.895 146.000 40.000 L 146.000 154.000 L 110.000 154.000 L 110.000 40.000 C 110.000 38.895 110.895 38.000 112.000 38.000 ZM 46.000 136.000 C 46.090 102.318 66.687 72.088 98.000 59.680 L 98.000 154.000 L 46.000 154.000 ZM 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 L 30.000 168.000 C 30.000 166.895 30.895 166.000 32.000 166.000 L 224.000 166.000 C 225.105 166.000 226.000 166.895 226.000 168.000 Z"),
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
        return _hardHat!!
    }

private var _hardHat: ImageVector? = null
