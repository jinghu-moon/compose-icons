package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorLightIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 66.000 L 174.000 66.000 L 174.000 56.000 C 174.000 43.850 164.150 34.000 152.000 34.000 L 104.000 34.000 C 91.850 34.000 82.000 43.850 82.000 56.000 L 82.000 66.000 L 32.000 66.000 C 24.268 66.000 18.000 72.268 18.000 80.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 80.000 C 238.000 72.268 231.732 66.000 224.000 66.000 ZM 94.000 56.000 C 94.000 50.477 98.477 46.000 104.000 46.000 L 152.000 46.000 C 157.523 46.000 162.000 50.477 162.000 56.000 L 162.000 66.000 L 94.000 66.000 ZM 32.000 78.000 L 224.000 78.000 C 225.105 78.000 226.000 78.895 226.000 80.000 L 226.000 114.000 L 190.000 114.000 L 190.000 104.000 C 190.000 100.686 187.314 98.000 184.000 98.000 C 180.686 98.000 178.000 100.686 178.000 104.000 L 178.000 114.000 L 78.000 114.000 L 78.000 104.000 C 78.000 100.686 75.314 98.000 72.000 98.000 C 68.686 98.000 66.000 100.686 66.000 104.000 L 66.000 114.000 L 30.000 114.000 L 30.000 80.000 C 30.000 78.895 30.895 78.000 32.000 78.000 ZM 224.000 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 L 30.000 126.000 L 66.000 126.000 L 66.000 136.000 C 66.000 139.314 68.686 142.000 72.000 142.000 C 75.314 142.000 78.000 139.314 78.000 136.000 L 78.000 126.000 L 178.000 126.000 L 178.000 136.000 C 178.000 139.314 180.686 142.000 184.000 142.000 C 187.314 142.000 190.000 139.314 190.000 136.000 L 190.000 126.000 L 226.000 126.000 L 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 Z"),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
