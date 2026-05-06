package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BoxArrowUp: ImageVector
    get() {
        if (_boxArrowUp != null) return _boxArrowUp!!
        _boxArrowUp = phosphorDuotoneIcon(
            name = "BoxArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 72v136c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-136Z"),
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
                pathData = parseSvgPathData("M223.16 68.42l-16-32C205.803 33.709 203.031 31.998 200 32h-144c-3.031-.002-5.803 1.709-7.16 4.42l-16 32C32.289 69.533 32.001 70.758 32 72v136c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-136c-.001-1.242-.289-2.467-.84-3.58ZM60.94 48h134.12l8 16h-150.12ZM208 208h-160v-128h160v128ZM165.66 130.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L136 123.31v60.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-60.69l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l32-32c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346Z"),
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
        return _boxArrowUp!!
    }

private var _boxArrowUp: ImageVector? = null
