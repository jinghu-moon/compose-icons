package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorBoldIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 64C108.001 45.692 94.261 30.3 76.07 28.23 57.88 26.16 41.033 38.072 36.92 55.912 32.807 73.752 42.739 91.837 60 97.94v60.12c-16.531 5.844-26.446 22.748-23.482 40.029 2.965 17.281 17.948 29.912 35.482 29.912 17.533 0 32.517-12.632 35.482-29.912C110.446 180.808 100.531 163.904 84 158.06v-60.12C98.37 92.837 107.979 79.249 108 64ZM72 52c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12C65.373 76 60 70.627 60 64 60 57.373 65.373 52 72 52ZM72 204c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM212 158.06v-47.43c.022-7.43-2.931-14.56-8.2-19.8L173 60h19c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-48c-6.627 0-12 5.373-12 12v48c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-19l30.83 30.83c.75 .751 1.171 1.769 1.17 2.83v47.43c-16.531 5.844-26.446 22.748-23.482 40.029 2.965 17.281 17.948 29.912 35.482 29.912 17.533 0 32.517-12.632 35.482-29.912C238.446 180.838 228.531 163.934 212 158.09ZM200 204c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12Z"),
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
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
