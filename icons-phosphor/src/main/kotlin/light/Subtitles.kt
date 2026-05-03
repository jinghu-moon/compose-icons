package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Subtitles: ImageVector
    get() {
        if (_subtitles != null) return _subtitles!!
        _subtitles = phosphorLightIcon(
            name = "Subtitles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 64.000 C 238.000 56.268 231.732 50.000 224.000 50.000 ZM 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 L 224.000 62.000 C 225.105 62.000 226.000 62.895 226.000 64.000 ZM 50.000 136.000 C 50.000 132.686 52.686 130.000 56.000 130.000 L 72.000 130.000 C 75.314 130.000 78.000 132.686 78.000 136.000 C 78.000 139.314 75.314 142.000 72.000 142.000 L 56.000 142.000 C 52.686 142.000 50.000 139.314 50.000 136.000 ZM 206.000 136.000 C 206.000 139.314 203.314 142.000 200.000 142.000 L 104.000 142.000 C 100.686 142.000 98.000 139.314 98.000 136.000 C 98.000 132.686 100.686 130.000 104.000 130.000 L 200.000 130.000 C 203.314 130.000 206.000 132.686 206.000 136.000 ZM 158.000 168.000 C 158.000 171.314 155.314 174.000 152.000 174.000 L 56.000 174.000 C 52.686 174.000 50.000 171.314 50.000 168.000 C 50.000 164.686 52.686 162.000 56.000 162.000 L 152.000 162.000 C 155.314 162.000 158.000 164.686 158.000 168.000 ZM 206.000 168.000 C 206.000 171.314 203.314 174.000 200.000 174.000 L 184.000 174.000 C 180.686 174.000 178.000 171.314 178.000 168.000 C 178.000 164.686 180.686 162.000 184.000 162.000 L 200.000 162.000 C 203.314 162.000 206.000 164.686 206.000 168.000 Z"),
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
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
