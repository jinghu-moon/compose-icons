package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorRegularIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 80c17.673 0 32-14.327 32-32C184 30.327 169.673 16 152 16c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM152 32c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM216 144c0 4.418-3.582 8-8 8-35.31 0-52.95-17.81-67.12-32.12-2.74-2.77-5.36-5.4-8-7.84l-13.43 30.88 37.2 26.57c2.102 1.502 3.35 3.926 3.35 6.51v56c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-51.88L112.93 157.92 79.34 235.19C78.069 238.112 75.186 240.001 72 240c-1.099 .003-2.185-.226-3.19-.67-4.05-1.76-5.907-6.469-4.15-10.52L118.74 104.44c-9.31-1.65-20.92 1.2-34.7 8.58-10.99 6.062-21.247 13.367-30.57 21.77-3.236 2.899-8.195 2.685-11.169-.482-2.974-3.167-2.877-8.129 .219-11.178 2.5-2.35 61.69-57.23 98.72-25.08 3.83 3.32 7.48 7 11 10.57C166.19 122.7 179.36 136 208 136c4.418 0 8 3.582 8 8Z"),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
