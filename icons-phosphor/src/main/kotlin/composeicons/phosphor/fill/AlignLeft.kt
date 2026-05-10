package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) return _alignLeft!!
        _alignLeft = phosphorFillIcon(
            name = "AlignLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 152v40c0 8.837-7.163 16-16 16h-136c-8.837 0-16-7.163-16-16v-40c0-8.837 7.163-16 16-16h136c8.837 0 16 7.163 16 16ZM40 32c-4.418 0-8 3.582-8 8v176c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-176c0-4.418-3.582-8-8-8ZM80 120h96c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16h-96C71.163 48 64 55.163 64 64v40c0 8.837 7.163 16 16 16Z"),
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
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
