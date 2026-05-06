package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitBranch: ImageVector
    get() {
        if (_gitBranch != null) return _gitBranch!!
        _gitBranch = phosphorBoldIcon(
            name = "GitBranch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 64C236.001 45.692 222.261 30.3 204.07 28.23c-18.19-2.07-35.037 9.842-39.15 27.682-4.113 17.84 5.819 35.925 23.08 42.028v14.06c0 2.209-1.791 4-4 4h-88c-1.339 0-2.675 .097-4 .29v-18.35c16.531-5.844 26.446-22.748 23.482-40.029C112.517 40.63 97.533 27.999 80 27.999c-17.533 0-32.517 12.632-35.482 29.912C41.554 75.192 51.469 92.096 68 97.94v60.12c-16.531 5.844-26.446 22.748-23.482 40.029 2.965 17.281 17.948 29.912 35.482 29.912 17.533 0 32.517-12.632 35.482-29.912C118.446 180.808 108.531 163.904 92 158.06v-14.06c0-2.209 1.791-4 4-4h88c15.464 0 28-12.536 28-28v-14.06C226.37 92.837 235.979 79.249 236 64ZM80 52c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C73.373 76 68 70.627 68 64 68 57.373 73.373 52 80 52ZM80 204c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM200 76c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _gitBranch!!
    }

private var _gitBranch: ImageVector? = null
