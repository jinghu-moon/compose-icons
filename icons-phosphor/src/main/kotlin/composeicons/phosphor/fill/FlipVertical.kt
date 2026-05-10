package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorFillIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 120h160c7.614 .003 14.175-5.36 15.688-12.822 1.512-7.462-2.443-14.956-9.458-17.918l-.14-.06L62.16 25.2C57.216 23.138 51.568 23.686 47.114 26.661 42.659 29.636 39.989 34.643 40 40v64c0 8.837 7.163 16 16 16ZM56 40l.15 .06L216 104h-160v-64ZM231.67 148.82c1.577 7.47-2.395 15.002-9.45 17.92l-.14 .06-159.93 64c-4.943 2.058-10.587 1.507-15.039-1.467C42.659 226.358 39.99 221.354 40 216v-64c0-8.837 7.163-16 16-16h160c7.628-.054 14.212 5.333 15.67 12.82Z"),
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
