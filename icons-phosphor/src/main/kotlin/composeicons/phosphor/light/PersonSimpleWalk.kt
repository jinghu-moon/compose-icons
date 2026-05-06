package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorLightIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 78c16.569 0 30-13.431 30-30C182 31.431 168.569 18 152 18c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30ZM152 30c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM214 144c0 3.314-2.686 6-6 6-34.48 0-51.06-16.75-65.7-31.52-3.47-3.51-6.75-6.82-10.15-9.78L117 143.61l38.52 27.51c1.564 1.133 2.487 2.949 2.48 4.88v56c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-52.91L112.08 154.86 77.5 234.39c-1.386 2.926-4.844 4.225-7.814 2.934-2.97-1.29-4.38-4.704-3.186-7.714L121.5 103c-10.18-2.75-23.07 0-38.51 8.29-11.115 6.125-21.49 13.507-30.92 22-2.423 2.2-6.162 2.053-8.404-.331-2.242-2.384-2.16-6.125 .184-8.409 10.125-9.193 21.291-17.171 33.27-23.77 25.93-14 47.64-14.39 62.77-1.26 3.77 3.27 7.4 6.93 10.9 10.47 13.62 13.75 27.69 28 57.17 28 1.6-.011 3.138 .618 4.272 1.747 1.134 1.129 1.771 2.663 1.768 4.263Z"),
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
