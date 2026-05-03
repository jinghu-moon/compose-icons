package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Divide: ImageVector
    get() {
        if (_divide != null) return _divide!!
        _divide = phosphorLightIcon(
            name = "Divide",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 128.000 C 222.000 131.314 219.314 134.000 216.000 134.000 L 40.000 134.000 C 36.686 134.000 34.000 131.314 34.000 128.000 C 34.000 124.686 36.686 122.000 40.000 122.000 L 216.000 122.000 C 219.314 122.000 222.000 124.686 222.000 128.000 ZM 128.000 78.000 C 135.732 78.000 142.000 71.732 142.000 64.000 C 142.000 56.268 135.732 50.000 128.000 50.000 C 120.268 50.000 114.000 56.268 114.000 64.000 C 114.000 71.732 120.268 78.000 128.000 78.000 ZM 128.000 178.000 C 120.268 178.000 114.000 184.268 114.000 192.000 C 114.000 199.732 120.268 206.000 128.000 206.000 C 135.732 206.000 142.000 199.732 142.000 192.000 C 142.000 184.268 135.732 178.000 128.000 178.000 Z"),
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
        return _divide!!
    }

private var _divide: ImageVector? = null
