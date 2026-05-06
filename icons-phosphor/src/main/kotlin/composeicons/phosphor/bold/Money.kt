package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Money: ImageVector
    get() {
        if (_money != null) return _money!!
        _money = phosphorBoldIcon(
            name = "Money",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 52h-224C9.373 52 4 57.373 4 64v128c0 6.627 5.373 12 12 12h224c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM181.21 180h-106.42C69.937 156.459 51.541 138.063 28 133.21v-10.42C51.541 117.937 69.937 99.541 74.79 76h106.42c4.853 23.541 23.249 41.937 46.79 46.79v10.42c-23.541 4.853-41.937 23.249-46.79 46.79ZM228 97.94C217.767 94.287 209.713 86.233 206.06 76h21.94ZM49.94 76C46.287 86.233 38.233 94.287 28 97.94v-21.94ZM28 158.06c10.233 3.653 18.287 11.707 21.94 21.94h-21.94ZM206.06 180c3.653-10.233 11.707-18.287 21.94-21.94v21.94ZM128 88c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40C168 105.909 150.091 88 128 88ZM128 144c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _money!!
    }

private var _money: ImageVector? = null
