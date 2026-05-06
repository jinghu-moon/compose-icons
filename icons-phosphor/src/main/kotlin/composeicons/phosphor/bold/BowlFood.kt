package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) return _bowlFood!!
        _bowlFood = phosphorBoldIcon(
            name = "BowlFood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 100h-4.78C213.218 54.202 174.189 19.955 128 19.955 81.811 19.955 42.782 54.202 36.78 100h-4.78c-6.627 0-12 5.373-12 12 .073 39.392 21.514 75.642 56 94.68v1.32c0 11.046 8.954 20 20 20h64c11.046 0 20-8.954 20-20v-1.32C214.486 187.642 235.927 151.392 236 112c0-6.627-5.373-12-12-12ZM170.29 60.06C151.944 68.304 136.804 82.333 127.19 100h-21.19C117.061 75.685 141.288 60.056 168 60c.76 0 1.52 0 2.29 .06ZM187.51 79.14c3.598 6.499 6.102 13.547 7.41 20.86h-38.79c8.283-9.774 19.162-17.006 31.38-20.86ZM128 44c.83 0 1.65 0 2.48 .06C106.603 54.761 88.389 75.094 80.37 100h-19.29C66.927 67.617 95.093 44.047 128 44ZM163 188.39c-4.266 1.955-7.001 6.217-7 10.91v4.7h-56v-4.7c.001-4.693-2.734-8.955-7-10.91C67.099 176.448 48.991 152.222 44.87 124h166.26c-4.121 28.222-22.229 52.448-48.13 64.39Z"),
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
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
