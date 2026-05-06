package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorLightIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 194h-10v-69.68l5.12 7.17c1.933 2.695 5.685 3.313 8.38 1.38 2.695-1.933 3.313-5.685 1.38-8.38l-40-56c-.405-.563-.902-1.053-1.47-1.45L135.77 20.35c-4.735-3.156-10.909-3.133-15.62 .06L52.59 67.06c-.568 .397-1.065 .887-1.47 1.45l-40 56c-1.933 2.695-1.315 6.447 1.38 8.38 2.695 1.933 6.447 1.315 8.38-1.38L26 124.32v69.68h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h224c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM38 107.52 60.27 76.34 126.89 30.34c.642-.432 1.475-.456 2.14-.06l66.7 46.06L218 107.52v86.48h-28v-74c0-3.314-2.686-6-6-6h-112c-3.314 0-6 2.686-6 6v74h-28ZM128 152.63 90.72 126h74.56ZM178 131.63v56.68L138.32 160ZM117.68 160 78 188.34v-56.68ZM128 167.37 165.28 194h-74.56ZM106 88c0-3.314 2.686-6 6-6h32c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-32c-3.314 0-6-2.686-6-6Z"),
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
        return _barn!!
    }

private var _barn: ImageVector? = null
