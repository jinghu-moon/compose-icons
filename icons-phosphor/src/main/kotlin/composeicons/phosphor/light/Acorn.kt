package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Acorn: ImageVector
    get() {
        if (_acorn != null) return _acorn!!
        _acorn = phosphorLightIcon(
            name = "Acorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230 104C229.967 74.19 205.81 50.033 176 50h-42v-2c0-14.359 11.641-26 26-26 3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6-20.987 0-38 17.013-38 38v2h-42C50.19 50.033 26.033 74.19 26 104c.007 5.401 3.12 10.315 8 12.63v11.37c0 34.57 32.71 60.83 59 81.93 14.26 11.45 29 23.29 29 30.07 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 0-6.78 14.75-18.62 29-30.07C189.28 188.83 222 162.57 222 128v-11.37c4.88-2.315 7.993-7.229 8-12.63ZM80 62h96c23.196 0 42 18.804 42 42 0 1.105-.895 2-2 2h-176c-1.105 0-2-.895-2-2C38 80.804 56.804 62 80 62ZM155.5 200.58c-11.48 9.21-21.48 17.24-27.5 25-6-7.72-16-15.75-27.5-25C76.22 181.08 46 156.82 46 128v-10h164v10c0 28.82-30.22 53.08-54.5 72.58Z"),
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
        return _acorn!!
    }

private var _acorn: ImageVector? = null
