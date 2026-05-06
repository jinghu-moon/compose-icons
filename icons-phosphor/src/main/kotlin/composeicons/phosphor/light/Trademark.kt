package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorLightIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM110 104c0 3.314-2.686 6-6 6h-10v42c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-42h-10c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6ZM190 104v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32l-17.48 20c-1.139 1.292-2.778 2.031-4.5 2.031-1.722 0-3.361-.74-4.5-2.031L134 120v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-48c-.023-2.511 1.52-4.77 3.867-5.663 2.347-.892 5.001-.229 6.653 1.663L156 126.89l23.48-26.84c1.645-1.885 4.287-2.551 6.629-1.671 2.342 .879 3.893 3.12 3.891 5.621Z"),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
