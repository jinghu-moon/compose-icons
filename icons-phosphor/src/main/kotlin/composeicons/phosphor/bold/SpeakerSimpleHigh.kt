package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) return _speakerSimpleHigh!!
        _speakerSimpleHigh = phosphorBoldIcon(
            name = "SpeakerSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M165.27 21.22c-4.118-2.013-9.023-1.505-12.64 1.31L83.88 76h-43.88C28.954 76 20 84.954 20 96v64c0 11.046 8.954 20 20 20h43.88l68.75 53.47c3.617 2.815 8.523 3.324 12.641 1.31 4.118-2.013 6.729-6.197 6.729-10.78v-192c-0-4.584-2.612-8.767-6.73-10.78ZM148 199.47 95.37 158.53C93.263 156.89 90.67 156 88 156h-44v-56h44c2.67-0 5.263-.89 7.37-2.53L148 56.54ZM212 104v48c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM248 88v80c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-80c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _speakerSimpleHigh!!
    }

private var _speakerSimpleHigh: ImageVector? = null
