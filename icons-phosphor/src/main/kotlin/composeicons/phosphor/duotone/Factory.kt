package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Factory: ImageVector
    get() {
        if (_factory != null) return _factory!!
        _factory = phosphorDuotoneIcon(
            name = "Factory",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 136v80h-176v-128l64 48v-48l64 48Z"),
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
                pathData = parseSvgPathData("M116 176c0 4.418-3.582 8-8 8h-28c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h28c4.418 0 8 3.582 8 8ZM176 168h-28c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h28c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM240 216c0 4.418-3.582 8-8 8h-208c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-120c0-3.03 1.712-5.8 4.422-7.155 2.71-1.355 5.954-1.063 8.378 .755L96 120v-32c0-3.03 1.712-5.8 4.422-7.155 2.71-1.355 5.954-1.063 8.378 .755l38.74 29.05L159.1 29.74C160.257 21.874 166.989 16.034 174.94 16h18.12c7.951 .034 14.683 5.874 15.84 13.74l15 105.13c0 0 .08 .78 .08 1.13v72h8c2.125-.005 4.165 .835 5.67 2.336 1.505 1.501 2.35 3.539 2.35 5.664ZM162.14 121.6l8.53 6.4h36.11L193.06 32h-18.12ZM48 208h160v-64h-40c-1.731 0-3.415-.561-4.8-1.6L148.8 131.6h0L112 104v32c0 3.03-1.712 5.8-4.422 7.155-2.71 1.355-5.954 1.063-8.378-.755L48 104Z"),
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
        return _factory!!
    }

private var _factory: ImageVector? = null
