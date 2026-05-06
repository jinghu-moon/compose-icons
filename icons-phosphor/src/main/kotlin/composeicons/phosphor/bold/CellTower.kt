package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorBoldIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M138.67 86.51C136.613 82.513 132.495 80.001 128 80.001c-4.495 0-8.613 2.512-10.67 6.509l-72 140c-3.038 5.893-.723 13.132 5.17 16.17 5.893 3.038 13.132 .723 16.17-5.17l11-21.49h100.61l11.05 21.49c3.038 5.893 10.277 8.208 16.17 5.17 5.893-3.038 8.208-10.277 5.17-16.17ZM128 118.24 145.36 152h-34.72ZM90.07 192l8.22-16h59.42l8.22 16ZM174.51 68.73c2.045 3.846 1.845 8.499-.522 12.155-2.368 3.657-6.531 5.743-10.877 5.451-4.346-.292-8.193-2.916-10.051-6.857C148.276 69.885 138.433 63.863 127.712 63.974 116.991 64.085 107.274 70.308 102.69 80c-2.844 5.99-10.005 8.539-15.995 5.695C80.705 82.851 78.156 75.69 81 69.7 89.668 51.6 107.931 40.059 128 40c19.71-.064 37.745 11.076 46.51 28.73ZM49.93 144.73C25.893 106.176 33.599 55.848 68.071 26.253c34.472-29.595 85.386-29.595 119.858 0 34.472 29.595 42.178 79.923 18.141 118.477-3.515 5.622-10.923 7.33-16.545 3.815-5.622-3.515-7.33-10.923-3.815-16.545C203.47 103.503 197.77 66.309 172.292 44.438c-25.478-21.871-63.106-21.871-88.585 0C58.23 66.309 52.53 103.503 70.29 132c3.365 5.613 1.611 12.888-3.941 16.351-5.553 3.464-12.857 1.839-16.419-3.651Z"),
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
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
