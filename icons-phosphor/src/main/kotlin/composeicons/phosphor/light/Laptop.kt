package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorLightIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 170h-10v-98C222 59.85 212.15 50 200 50h-144C43.85 50 34 59.85 34 72v98h-10c-3.314 0-6 2.686-6 6v16c0 12.15 9.85 22 22 22h176c12.15 0 22-9.85 22-22v-16c0-3.314-2.686-6-6-6ZM46 72C46 66.477 50.477 62 56 62h144c5.523 0 10 4.477 10 10v98h-164ZM226 192c0 5.523-4.477 10-10 10h-176c-5.523 0-10-4.477-10-10v-10h196ZM150 88c0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6Z"),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
