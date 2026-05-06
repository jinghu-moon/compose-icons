package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) return _numberCircleNine!!
        _numberCircleNine = phosphorBoldIcon(
            name = "NumberCircleNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM148 73.36c-14.028-8.099-31.556-6.938-44.393 2.94C90.77 86.179 85.157 102.824 89.392 118.459c4.235 15.635 17.48 27.172 33.548 29.221l-13.24 22.17c-2.326 3.685-2.47 8.342-.379 12.164 2.092 3.823 6.092 6.211 10.449 6.239 4.358 .028 8.388-2.308 10.529-6.104L162.64 128C173.685 108.869 167.131 84.406 148 73.36ZM141.86 116h0c-4.419 7.652-14.203 10.273-21.855 5.856-7.652-4.418-10.275-14.202-5.858-21.854C118.563 92.349 128.347 89.724 136 94.14c7.649 4.424 10.263 14.211 5.84 21.86Z"),
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
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
