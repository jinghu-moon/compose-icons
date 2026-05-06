package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pepper: ImageVector
    get() {
        if (_pepper != null) return _pepper!!
        _pepper = phosphorBoldIcon(
            name = "Pepper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170.56 36.82C165.455 17.496 147.987 4.026 128 4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.994 .01 13.474 3.673 17.09 9.66C114.078 44.671 92.044 72.206 92 104c0 21.74-5.83 40.14-17.32 54.69C62.46 174.16 43.5 185.77 18.34 193.18 9.402 195.786 3.444 204.214 3.969 213.51c.526 9.295 7.396 16.999 16.571 18.58 15.225 2.629 30.649 3.937 46.1 3.91 41.61 0 88-9.38 120.21-36.38C214.16 176.72 228 144.55 228 104h0C227.956 70.537 203.61 42.062 170.56 36.82ZM160 60c17.495 .004 33.326 10.374 40.32 26.41L192 90.58 165.37 77.26c-3.38-1.691-7.36-1.691-10.74 0L128 90.58l-8.32-4.17C126.674 70.374 142.505 60.004 160 60ZM171.43 181.23c-17.4 14.59-42.33 24.47-72.1 28.58-19.303 2.551-38.838 2.85-58.21 .89 46.68-18.51 72.28-52.54 74.68-99.39l6.83 3.42c3.383 1.68 7.357 1.68 10.74 0L160 101.41l26.63 13.32c3.383 1.68 7.357 1.68 10.74 0l6.43-3.22c-1.56 29.56-12.42 52.99-32.37 69.72Z"),
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
        return _pepper!!
    }

private var _pepper: ImageVector? = null
