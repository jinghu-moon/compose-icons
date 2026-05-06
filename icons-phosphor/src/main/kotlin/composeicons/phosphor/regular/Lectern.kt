package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lectern: ImageVector
    get() {
        if (_lectern != null) return _lectern!!
        _lectern = phosphorRegularIcon(
            name = "Lectern",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.3 120.84l-40-80C203.605 35.412 198.061 31.984 192 32h-128c-6.061-.016-11.605 3.412-14.3 8.84L9.7 120.84c-2.481 4.958-2.218 10.848 .695 15.566 2.913 4.718 8.061 7.591 13.605 7.594h96v64h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24v-64h96c5.546 .001 10.697-2.871 13.613-7.59 2.915-4.718 3.179-10.61 .697-15.57ZM24 128 64 48h128l40 80ZM192 104c0 4.418-3.582 8-8 8h-112c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h112c4.418 0 8 3.582 8 8Z"),
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
        return _lectern!!
    }

private var _lectern: ImageVector? = null
