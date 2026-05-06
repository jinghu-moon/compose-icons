package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = phosphorBoldIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 124c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36 0-19.882-16.118-36-36-36ZM96 172c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM224.49 119.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-48 48c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l48-48c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529ZM188.49 99.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-20 20c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l20-20c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529ZM232.49 72.51l-16 16c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l16-16c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM119.49 87.51 191.49 15.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-72 72c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17ZM149.72 196.77c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5-29.688 29.674-77.811 29.663-107.485-.025C12.561 184.057 12.572 135.934 42.26 106.26L125 23.51c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L59.23 123.23c-20.308 20.308-20.308 53.232 0 73.54 20.308 20.308 53.232 20.308 73.54 0 4.686-4.686 12.284-4.686 16.97 0Z"),
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
        return _meteor!!
    }

private var _meteor: ImageVector? = null
