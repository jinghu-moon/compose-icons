package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.VectorTwo: ImageVector
    get() {
        if (_vectorTwo != null) return _vectorTwo!!
        _vectorTwo = phosphorDuotoneIcon(
            name = "VectorTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 56v136h-144v-152h128c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M229.66 197.66l-32 32c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L204.69 200h-124.69c-4.418 0-8-3.582-8-8v-132.69L53.66 77.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L74.34 34.34C75.841 32.838 77.877 31.994 80 31.994c2.123 0 4.159 .844 5.66 2.346l32 32c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L88 59.31v124.69h116.69L186.34 165.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0l32 32c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66Z"),
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
        return _vectorTwo!!
    }

private var _vectorTwo: ImageVector? = null
