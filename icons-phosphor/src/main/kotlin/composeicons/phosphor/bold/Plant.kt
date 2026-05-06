package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = phosphorBoldIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M255.62 51.65c-.359-6.069-5.201-10.911-11.27-11.27C191.08 37.25 148.15 53.74 129.51 84.52c-12.14 20-12.56 44.17-1.46 67.3-5.402 6.892-9.558 14.676-12.28 23L103.11 162.16c7.19-16.77 6.43-34.11-2.4-48.69C86.73 90.36 54.89 78 15.55 80.27 9.477 80.63 4.634 85.477 4.28 91.55 2 130.89 14.36 162.73 37.45 176.71c7.831 4.773 16.829 7.289 26 7.27 7.819-.064 15.543-1.721 22.7-4.87L112 205v23c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-29.49c-.025-10.727 3.292-21.195 9.49-29.95 10.04 4.755 20.992 7.277 32.1 7.39 11.952 .027 23.68-3.247 33.89-9.46 30.77-18.64 47.28-61.57 44.14-114.84ZM49.88 156.18c-13.19-8-21.18-27.46-21.83-52.13 24.67 .65 44.14 8.64 52.13 21.83 3.125 5.082 4.406 11.085 3.63 17L72.48 131.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17l11.34 11.34c-5.899 .728-11.871-.565-16.94-3.67ZM199.05 146c-10.66 6.45-23 7.67-35.81 3.76l37.25-37.24c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0l-37.25 37.24C142.37 120 143.59 107.61 150 97 162.7 76 192.65 64 231.32 64h.68c.14 39-11.86 69.18-32.95 82Z"),
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
        return _plant!!
    }

private var _plant: ImageVector? = null
