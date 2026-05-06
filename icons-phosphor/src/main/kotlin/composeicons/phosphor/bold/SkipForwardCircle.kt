package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) return _skipForwardCircle!!
        _skipForwardCircle = phosphorBoldIcon(
            name = "SkipForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM160 76c-6.627 0-12 5.373-12 12v18.35L102.36 77.82C98.66 75.508 93.997 75.386 90.181 77.501 86.365 79.617 83.999 83.637 84 88v80c-.001 4.363 2.365 8.383 6.181 10.499 3.816 2.116 8.479 1.994 12.179-.319L148 149.65v18.35c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-80c0-6.627-5.373-12-12-12ZM108 146.35v-36.7L137.36 128Z"),
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
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
