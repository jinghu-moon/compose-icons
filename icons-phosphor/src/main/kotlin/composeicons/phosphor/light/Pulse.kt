package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorLightIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 128c0 3.314-2.686 6-6 6h-28.29l-38.34 76.68c-1.016 2.035-3.095 3.321-5.37 3.32h-.3c-2.377-.117-4.46-1.627-5.31-3.85L95.51 55.57 61.46 130.48c-.972 2.142-3.107 3.519-5.46 3.52h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h28.14L90.54 37.52c1-2.205 3.228-3.593 5.648-3.519 2.42 .074 4.559 1.596 5.422 3.859l59.13 155.24 33.89-67.78c1.016-2.035 3.095-3.321 5.37-3.32h32c3.314 0 6 2.686 6 6Z"),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
