package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) return _speakerHigh!!
        _speakerHigh = phosphorBoldIcon(
            name = "SpeakerHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M157.27 21.22c-4.118-2.013-9.023-1.505-12.64 1.31L75.88 76h-43.88C20.954 76 12 84.954 12 96v64c0 11.046 8.954 20 20 20h43.88l68.75 53.47c3.617 2.815 8.523 3.324 12.641 1.31 4.118-2.013 6.729-6.197 6.729-10.78v-192c-0-4.584-2.612-8.767-6.73-10.78ZM36 100h32v56h-32ZM140 199.46 92 162.13v-68.26L140 56.54ZM212 128c.002 10.719-3.91 21.071-11 29.11-4.385 4.971-11.969 5.445-16.94 1.06-4.971-4.385-5.445-11.969-1.06-16.94 6.651-7.555 6.651-18.875 0-26.43-4.155-4.993-3.582-12.385 1.291-16.679 4.873-4.294 12.279-3.931 16.709 .819 7.084 8.024 10.995 18.357 11 29.06ZM252 128c.012 20.664-7.605 40.606-21.39 56-4.418 4.94-12.005 5.363-16.945 .945-4.94-4.418-5.363-12.005-.945-16.945 20.372-22.776 20.372-57.224 0-80-2.977-3.176-4-7.715-2.674-11.862 1.326-4.146 4.794-7.249 9.061-8.108 4.267-.859 8.666 .66 11.493 3.97 13.789 15.393 21.41 35.334 21.4 56Z"),
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
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
