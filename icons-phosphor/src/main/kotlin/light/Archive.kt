package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = phosphorLightIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 88.000 C 18.000 95.732 24.268 102.000 32.000 102.000 L 34.000 102.000 L 34.000 192.000 C 34.000 199.732 40.268 206.000 48.000 206.000 L 208.000 206.000 C 215.732 206.000 222.000 199.732 222.000 192.000 L 222.000 102.000 L 224.000 102.000 C 231.732 102.000 238.000 95.732 238.000 88.000 L 238.000 64.000 C 238.000 56.268 231.732 50.000 224.000 50.000 ZM 210.000 192.000 C 210.000 193.105 209.105 194.000 208.000 194.000 L 48.000 194.000 C 46.895 194.000 46.000 193.105 46.000 192.000 L 46.000 102.000 L 210.000 102.000 ZM 226.000 88.000 C 226.000 89.105 225.105 90.000 224.000 90.000 L 32.000 90.000 C 30.895 90.000 30.000 89.105 30.000 88.000 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 L 224.000 62.000 C 225.105 62.000 226.000 62.895 226.000 64.000 ZM 98.000 136.000 C 98.000 132.686 100.686 130.000 104.000 130.000 L 152.000 130.000 C 155.314 130.000 158.000 132.686 158.000 136.000 C 158.000 139.314 155.314 142.000 152.000 142.000 L 104.000 142.000 C 100.686 142.000 98.000 139.314 98.000 136.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _archive!!
    }

private var _archive: ImageVector? = null
