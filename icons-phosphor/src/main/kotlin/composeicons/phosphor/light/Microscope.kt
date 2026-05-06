package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorLightIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 210h-24.47C214.062 194.189 222.087 173.474 222 152 221.94 106.859 187.028 69.428 142 66.23v-34.23c0-7.732-6.268-14-14-14h-48C72.268 18 66 24.268 66 32v104c0 7.732 6.268 14 14 14h48c7.732 0 14-6.268 14-14v-57.74c30.29 2.455 56 23.18 64.829 52.259C215.658 159.597 205.811 191.118 182 210h-150c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h192c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM130 136c0 1.105-.895 2-2 2h-48c-1.105 0-2-.895-2-2v-104c0-1.105 .895-2 2-2h48c1.105 0 2 .895 2 2ZM72 182c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6Z"),
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
