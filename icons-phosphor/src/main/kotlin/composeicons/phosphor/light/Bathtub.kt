package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorLightIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 98h-34v-2c0-3.314-2.686-6-6-6h-64c-3.314 0-6 2.686-6 6v2h-68v-46C62 44.268 68.268 38 76 38c6.738-.012 12.593 4.627 14.12 11.19 .395 2.13 1.909 3.882 3.959 4.583 2.05 .701 4.319 .242 5.936-1.201 1.617-1.443 2.33-3.645 1.865-5.762C99.27 34.62 88.466 25.932 76 26 61.641 26 50 37.641 50 52v46h-34c-3.314 0-6 2.686-6 6v40c.033 29.81 24.19 53.967 54 54h2v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h100v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h2c29.81-.033 53.967-24.19 54-54v-40c0-3.314-2.686-6-6-6ZM142 102h52v36h-52ZM234 144c0 23.196-18.804 42-42 42h-128C40.804 186 22 167.196 22 144v-34h108v34c0 3.314 2.686 6 6 6h64c3.314 0 6-2.686 6-6v-34h28Z"),
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
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
