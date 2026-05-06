package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Truck: ImageVector
    get() {
        if (_truck != null) return _truck!!
        _truck = phosphorRegularIcon(
            name = "Truck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.42 117l-14-35C238.99 75.941 233.108 71.978 226.58 72h-34.58v-8c0-4.418-3.582-8-8-8h-152C23.163 56 16 63.163 16 72v112c0 8.837 7.163 16 16 16h17c3.625 14.159 16.384 24.063 31 24.063 14.616 0 27.375-9.903 31-24.063h50c3.625 14.159 16.384 24.063 31 24.063 14.616 0 27.375-9.903 31-24.063h17c8.837 0 16-7.163 16-16v-64c.003-1.028-.194-2.047-.58-3ZM192 88h34.58l9.6 24h-44.18ZM32 72h144v64h-144ZM80 208c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM161 184h-50C107.375 169.841 94.616 159.937 80 159.937c-14.616 0-27.375 9.903-31 24.063h-17v-32h144v12.31c-7.43 4.295-12.832 11.386-15 19.69ZM192 208c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM240 184h-17c-3.668-14.122-16.409-23.986-31-24v-32h48Z"),
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
        return _truck!!
    }

private var _truck: ImageVector? = null
