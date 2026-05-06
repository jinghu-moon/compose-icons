package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = phosphorLightIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 74h-186v-26c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v160c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-34h212v34c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-96C254 91.013 236.987 74 216 74ZM30 86h76v76h-76ZM118 162v-76h98c14.359 0 26 11.641 26 26v50Z"),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
