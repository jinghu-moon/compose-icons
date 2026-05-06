package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorBoldIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 156h-12v-108c.001-5.097-3.217-9.638-8.026-11.326-4.809-1.688-10.16-.154-13.344 3.826l-96 120c-2.884 3.602-3.447 8.538-1.449 12.697 1.998 4.159 6.204 6.804 10.819 6.803h84v28c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM148 156h-59L148 82.21Z"),
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
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
