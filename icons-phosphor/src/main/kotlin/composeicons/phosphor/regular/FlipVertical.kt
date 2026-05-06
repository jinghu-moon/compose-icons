package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorRegularIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 120h160c7.614 .003 14.175-5.36 15.688-12.822 1.512-7.462-2.443-14.956-9.458-17.918l-.14-.06L62.16 25.2C57.216 23.138 51.568 23.686 47.114 26.661 42.659 29.636 39.989 34.643 40 40v64c0 8.837 7.163 16 16 16ZM56 40l.15 .06L216 104h-160v-64ZM216 136h-160c-8.837 0-16 7.163-16 16v64c-.003 5.351 2.669 10.348 7.119 13.318 4.451 2.97 10.091 3.518 15.031 1.462l159.93-64 .14-.06c6.986-2.976 10.918-10.453 9.411-17.895C230.124 141.382 223.594 136.024 216 136ZM56.15 215.93 56 216v-64h160Z"),
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
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
