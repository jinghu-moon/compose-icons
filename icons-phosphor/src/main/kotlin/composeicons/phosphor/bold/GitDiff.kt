package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorBoldIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M112 148c-6.627 0-12 5.373-12 12v19L69.17 148.2c-.75-.751-1.171-1.769-1.17-2.83v-47.43C84.531 92.096 94.446 75.192 91.482 57.911 88.517 40.63 73.533 27.999 56 27.999c-17.533 0-32.517 12.632-35.482 29.912C17.554 75.192 27.469 92.096 44 97.94v47.43c-.022 7.43 2.931 14.561 8.2 19.8L83 196h-19c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h48c6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM56 52c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C49.373 76 44 70.627 44 64 44 57.373 49.373 52 56 52ZM212 158.06v-47.43c.022-7.43-2.931-14.56-8.2-19.8L173 60h19c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-48c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-19l30.83 30.83c.75 .751 1.171 1.769 1.17 2.83v47.43c-16.531 5.844-26.446 22.748-23.482 40.029 2.965 17.281 17.948 29.912 35.482 29.912 17.533 0 32.517-12.632 35.482-29.912C238.446 180.838 228.531 163.934 212 158.09ZM200 204c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
