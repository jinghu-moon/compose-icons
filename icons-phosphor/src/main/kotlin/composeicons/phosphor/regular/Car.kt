package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = phosphorRegularIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 104h-10.8L201.42 41.5C198.852 35.723 193.122 32 186.8 32h-117.6c-6.322 0-12.052 3.723-14.62 9.5L26.8 104h-10.8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h8v80c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-16h96v16c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-80h8c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM69.2 48h117.6l24.89 56h-167.38ZM64 200h-24v-16h24ZM192 200v-16h24v16ZM216 168h-176v-48h176ZM56 144c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8ZM168 144c0-4.418 3.582-8 8-8h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16c-4.418 0-8-3.582-8-8Z"),
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
        return _car!!
    }

private var _car: ImageVector? = null
