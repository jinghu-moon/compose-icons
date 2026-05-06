package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerX: ImageVector
    get() {
        if (_speakerX != null) return _speakerX!!
        _speakerX = phosphorBoldIcon(
            name = "SpeakerX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M157.27 21.22c-4.118-2.013-9.023-1.505-12.64 1.31L75.88 76h-43.88C20.954 76 12 84.954 12 96v64c0 11.046 8.954 20 20 20h43.88l68.75 53.47c3.617 2.815 8.523 3.324 12.641 1.31 4.118-2.013 6.729-6.197 6.729-10.78v-192c-0-4.584-2.612-8.767-6.73-10.78ZM36 100h32v56h-32ZM140 199.47 92 162.12v-68.24L140 56.54ZM248.49 143.52c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L216 145l-15.51 15.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L199 128 183.48 112.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L216 111 231.51 95.49c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L233 128Z"),
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
        return _speakerX!!
    }

private var _speakerX: ImageVector? = null
