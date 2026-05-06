package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = phosphorBoldIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 64C228.001 45.692 214.261 30.3 196.07 28.23c-18.19-2.07-35.037 9.842-39.15 27.682-4.113 17.84 5.819 35.925 23.08 42.028v14.06c0 2.209-1.791 4-4 4h-96c-2.209 0-4-1.791-4-4v-14.06C92.531 92.096 102.446 75.192 99.482 57.911 96.517 40.63 81.533 27.999 64 27.999c-17.533 0-32.517 12.632-35.482 29.912C25.554 75.192 35.469 92.096 52 97.94v14.06c0 15.464 12.536 28 28 28h36v18.06c-16.531 5.844-26.446 22.748-23.482 40.029 2.965 17.281 17.948 29.912 35.482 29.912 17.533 0 32.517-12.632 35.482-29.912C166.446 180.808 156.531 163.904 140 158.06v-18.06h36c15.464 0 28-12.536 28-28v-14.06C218.37 92.837 227.979 79.249 228 64ZM64 52c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C57.373 76 52 70.627 52 64 52 57.373 57.373 52 64 52ZM128 204c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM192 76c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
