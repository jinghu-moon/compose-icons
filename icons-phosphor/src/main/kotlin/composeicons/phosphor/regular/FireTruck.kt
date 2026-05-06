package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FireTruck: ImageVector
    get() {
        if (_fireTruck != null) return _fireTruck!!
        _fireTruck = phosphorRegularIcon(
            name = "FireTruck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.43 117l-14-35C238.998 75.937 233.112 71.973 226.58 72h-34.58v-8c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v100.31c-7.43 4.295-12.832 11.386-15 19.69h-50C107.375 169.841 94.616 159.937 80 159.937c-14.616 0-27.375 9.903-31 24.063h-17v-48c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v48c0 8.837 7.163 16 16 16h17c3.625 14.159 16.384 24.063 31 24.063 14.616 0 27.375-9.903 31-24.063h50c3.625 14.159 16.384 24.063 31 24.063 14.616 0 27.375-9.903 31-24.063h17c8.837 0 16-7.163 16-16v-64c.006-1.028-.187-2.046-.57-3ZM226.58 88l9.6 24h-44.18v-24ZM80 208c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM192 208c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM223 184c-3.668-14.122-16.409-23.986-31-24v-32h48v56ZM24 96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h128c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-24h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-128c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v24ZM120 96h-24v-24h24ZM56 72h24v24h-24Z"),
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
        return _fireTruck!!
    }

private var _fireTruck: ImageVector? = null
