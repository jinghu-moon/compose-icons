package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorBoldIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 76c-3.826-.012-7.624 .665-11.21 2C172.539 69.245 164.535 62.901 155.042 60.76 145.548 58.62 135.596 60.916 128 67 118.393 59.308 105.226 57.807 94.135 63.14 83.043 68.472 75.992 79.693 76 92v16h-8c-17.673 0-32 14.327-32 32v12c0 50.81 41.19 92 92 92 50.81 0 92-41.19 92-92v-44C220 90.327 205.673 76 188 76ZM196 152c0 37.555-30.445 68-68 68C90.445 220 60 189.555 60 152v-12c0-4.418 3.582-8 8-8h8v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-60c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v28c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v28c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
