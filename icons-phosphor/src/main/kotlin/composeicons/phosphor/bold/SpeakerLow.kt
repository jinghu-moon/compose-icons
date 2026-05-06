package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) return _speakerLow!!
        _speakerLow = phosphorBoldIcon(
            name = "SpeakerLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M157.27 21.22c-4.118-2.013-9.023-1.505-12.64 1.31L75.88 76h-43.88C20.954 76 12 84.954 12 96v64c0 11.046 8.954 20 20 20h43.88l68.75 53.47c3.617 2.815 8.523 3.324 12.641 1.31 4.118-2.013 6.729-6.197 6.729-10.78v-192c-0-4.584-2.612-8.767-6.73-10.78ZM36 100h32v56h-32ZM140 199.46 92 162.13v-68.26L140 56.54ZM212 128c.002 10.719-3.91 21.071-11 29.11-4.385 4.971-11.969 5.445-16.94 1.06-4.971-4.385-5.445-11.969-1.06-16.94 6.656-7.557 6.656-18.883 0-26.44-4.086-4.999-3.484-12.334 1.361-16.6 4.845-4.266 12.197-3.935 16.639 .75 7.084 8.024 10.995 18.357 11 29.06Z"),
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
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
