package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorDuotoneIcon(
            name = "Angle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 168v32h-128v-128h32c53.019 0 96 42.981 96 96Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M96 72c0-4.418 3.582-8 8-8 57.412 .061 103.939 46.588 104 104 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C191.945 119.422 152.578 80.055 104 80c-4.418 0-8-3.582-8-8ZM240 192h-160v-160c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v32h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v120c0 4.418 3.582 8 8 8h168c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
