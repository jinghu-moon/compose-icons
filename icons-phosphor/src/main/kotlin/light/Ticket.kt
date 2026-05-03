package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorLightIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 102.000 C 235.314 102.000 238.000 99.314 238.000 96.000 L 238.000 64.000 C 238.000 56.268 231.732 50.000 224.000 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 96.000 C 18.000 99.314 20.686 102.000 24.000 102.000 C 38.359 102.000 50.000 113.641 50.000 128.000 C 50.000 142.359 38.359 154.000 24.000 154.000 C 20.686 154.000 18.000 156.686 18.000 160.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 160.000 C 238.000 156.686 235.314 154.000 232.000 154.000 C 217.641 154.000 206.000 142.359 206.000 128.000 C 206.000 113.641 217.641 102.000 232.000 102.000 ZM 30.000 192.000 L 30.000 165.530 C 48.456 162.600 62.042 146.687 62.042 128.000 C 62.042 109.313 48.456 93.400 30.000 90.470 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 L 90.000 62.000 L 90.000 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 ZM 226.000 165.530 L 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 L 102.000 194.000 L 102.000 62.000 L 224.000 62.000 C 225.105 62.000 226.000 62.895 226.000 64.000 L 226.000 90.470 C 207.544 93.400 193.958 109.313 193.958 128.000 C 193.958 146.687 207.544 162.600 226.000 165.530 Z"),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
