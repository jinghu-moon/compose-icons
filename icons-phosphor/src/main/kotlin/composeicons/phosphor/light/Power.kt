package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorLightIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122 128v-80c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v80c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM179.28 51c-2.743-1.493-6.173-.633-7.886 1.979-1.713 2.611-1.136 6.1 1.326 8.021C196.41 76.47 210 100.88 210 128c0 45.287-36.713 82-82 82C82.713 210 46 173.287 46 128 46 100.88 59.59 76.47 83.28 61c2.462-1.921 3.039-5.41 1.326-8.021C82.893 50.367 79.463 49.507 76.72 51 49.57 68.68 34 96.75 34 128c0 51.915 42.085 94 94 94 51.915 0 94-42.085 94-94C222 96.75 206.43 68.68 179.28 51Z"),
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
        return _power!!
    }

private var _power: ImageVector? = null
