package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorBoldIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 132v76c0 11.046-8.954 20-20 20h-152C36.954 228 28 219.046 28 208v-152C28 44.954 36.954 36 48 36h76c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-72v144h144v-72c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM236 60c0 22.091-17.909 40-40 40C173.909 100 156 82.091 156 60c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40ZM212 60c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16Z"),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
