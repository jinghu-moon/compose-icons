package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CrownCross: ImageVector
    get() {
        if (_crownCross != null) return _crownCross!!
        _crownCross = phosphorFillIcon(
            name = "CrownCross",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 83.22c-2.256-3.661-4.941-7.038-8-10.06v-33.16h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h16v-16C120 3.582 123.582 0 128 0c4.418 0 8 3.582 8 8v16h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v33.16c-3.059 3.022-5.744 6.399-8 10.06ZM180 56c-17.74 0-33.21 6.48-44 17.16v102.84c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-102.84C109.21 62.48 93.74 56 76 56 42.879 56.039 16.039 82.879 16 116c0 29.86 14.54 48.85 26.73 59.52 6.406 5.583 13.566 10.235 21.27 13.82v18.66c0 8.837 7.163 16 16 16h96c8.837 0 16-7.163 16-16v-18.66c7.704-3.585 14.864-8.237 21.27-13.82C225.46 164.85 240 145.86 240 116 239.961 82.879 213.121 56.039 180 56Z"),
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
        return _crownCross!!
    }

private var _crownCross: ImageVector? = null
