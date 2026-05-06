package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = phosphorLightIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200.47 56.07C181.517 36.915 155.717 26.095 128.77 26h-.77C71.667 26 26 71.667 26 128v56c0 12.15 9.85 22 22 22h16c12.15 0 22-9.85 22-22v-40C86 131.85 76.15 122 64 122h-25.8C40.589 86.694 63.418 56.054 96.565 43.666 129.712 31.278 167.042 39.435 192 64.52c15.293 15.393 24.467 35.823 25.81 57.48h-25.81c-12.15 0-22 9.85-22 22v40c0 12.15 9.85 22 22 22h16c12.15 0 22-9.85 22-22v-56c.101-26.947-10.523-52.827-29.53-71.93ZM64 134c5.523 0 10 4.477 10 10v40c0 5.523-4.477 10-10 10h-16c-5.523 0-10-4.477-10-10v-50ZM218 184c0 5.523-4.477 10-10 10h-16c-5.523 0-10-4.477-10-10v-40c0-5.523 4.477-10 10-10h26Z"),
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
        return _headphones!!
    }

private var _headphones: ImageVector? = null
