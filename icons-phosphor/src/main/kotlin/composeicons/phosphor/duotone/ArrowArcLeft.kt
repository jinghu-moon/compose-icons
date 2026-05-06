package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorDuotoneIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 152h-64v-64Z"),
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
                pathData = parseSvgPathData("M201.54 110.46C161.569 70.495 96.997 69.771 56.14 108.83L29.66 82.34C27.372 80.049 23.929 79.364 20.938 80.603 17.947 81.842 15.997 84.762 16 88v64c0 4.418 3.582 8 8 8h64c3.238 .003 6.158-1.947 7.397-4.938 1.239-2.991 .554-6.434-1.737-8.722L67.47 120.16C92.988 95.978 130.451 89.305 162.75 103.187 195.049 117.07 215.986 148.844 216 184c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .075-27.597-10.893-54.078-30.46-73.54ZM32 144v-36.69L68.69 144Z"),
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
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
