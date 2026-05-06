package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorDuotoneIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 118.31v81.69c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8v-81.69h0c29.175 16.878 62.295 25.741 96 25.69 33.706 .054 66.826-8.81 96-25.69Z"),
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
                pathData = parseSvgPathData("M104 112c0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8ZM232 72v128c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-128C24 63.163 31.163 56 40 56h40v-8C80 34.745 90.745 24 104 24h48c13.255 0 24 10.745 24 24v8h40c8.837 0 16 7.163 16 16ZM96 56h64v-8c0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8ZM40 72v41.62c27.004 14.691 57.258 22.386 88 22.38 30.743 .005 60.998-7.692 88-22.39v-41.61ZM216 200v-68.37C188.601 145.033 158.502 152.001 128 152c-30.501 .006-60.601-6.958-88-20.36v68.36h176Z"),
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
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
