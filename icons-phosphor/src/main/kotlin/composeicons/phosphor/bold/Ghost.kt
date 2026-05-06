package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ghost: ImageVector
    get() {
        if (_ghost != null) return _ghost!!
        _ghost = phosphorBoldIcon(
            name = "Ghost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 116c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM156 100c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM228 120v96c.001 4.638-2.67 8.861-6.86 10.847-4.191 1.986-9.151 1.38-12.74-1.557L186.67 207.5l-21.74 17.79c-4.421 3.618-10.779 3.618-15.2 0L128 207.5l-21.73 17.79c-4.421 3.618-10.779 3.618-15.2 0L69.33 207.5 47.6 225.29c-3.589 2.937-8.549 3.543-12.74 1.557C30.67 224.861 27.999 220.638 28 216v-96C28 64.772 72.772 20 128 20c55.228 0 100 44.772 100 100ZM204 120C204 78.026 169.974 44 128 44 86.026 44 52 78.026 52 120v70.68l9.73-8c4.421-3.618 10.779-3.618 15.2 0l21.74 17.82 21.73-17.79c4.421-3.618 10.779-3.618 15.2 0l21.73 17.79 21.74-17.79c4.421-3.618 10.779-3.618 15.2 0l9.73 8Z"),
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
        return _ghost!!
    }

private var _ghost: ImageVector? = null
