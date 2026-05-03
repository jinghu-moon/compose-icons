package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Barricade: ImageVector
    get() {
        if (_barricade != null) return _barricade!!
        _barricade = phosphorLightIcon(
            name = "Barricade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 66.000 L 32.000 66.000 C 24.268 66.000 18.000 72.268 18.000 80.000 L 18.000 152.000 C 18.000 159.732 24.268 166.000 32.000 166.000 L 58.000 166.000 L 58.000 200.000 C 58.000 203.314 60.686 206.000 64.000 206.000 C 67.314 206.000 70.000 203.314 70.000 200.000 L 70.000 166.000 L 186.000 166.000 L 186.000 200.000 C 186.000 203.314 188.686 206.000 192.000 206.000 C 195.314 206.000 198.000 203.314 198.000 200.000 L 198.000 166.000 L 224.000 166.000 C 231.732 166.000 238.000 159.732 238.000 152.000 L 238.000 80.000 C 238.000 72.268 231.732 66.000 224.000 66.000 ZM 226.000 80.000 L 226.000 133.520 L 170.480 78.000 L 224.000 78.000 C 225.105 78.000 226.000 78.895 226.000 80.000 ZM 32.000 78.000 L 81.520 78.000 L 157.520 154.000 L 102.520 154.000 L 30.000 81.520 L 30.000 80.000 C 30.000 78.895 30.895 78.000 32.000 78.000 ZM 30.000 152.000 L 30.000 98.480 L 85.520 154.000 L 32.000 154.000 C 30.895 154.000 30.000 153.105 30.000 152.000 ZM 224.000 154.000 L 174.480 154.000 L 98.480 78.000 L 153.480 78.000 L 226.000 150.480 L 226.000 152.000 C 226.000 153.105 225.105 154.000 224.000 154.000 Z"),
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
        return _barricade!!
    }

private var _barricade: ImageVector? = null
