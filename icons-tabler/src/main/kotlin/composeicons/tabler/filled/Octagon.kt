package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Octagon: ImageVector
    get() {
        if (_octagon != null) return _octagon!!
        _octagon = tablerFilledIcon(
            name = "Octagon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.3 2h-6.6C8.138 2 7.684 2.201 7.293 2.593L2.593 7.293C2.207 7.658 1.991 8.169 2 8.7v6.6c0 .562 .201 1.016 .593 1.407l4.7 4.7c.391 .392 .845 .593 1.407 .593h6.6c.562 0 1.016-.201 1.407-.593l4.7-4.7c.392-.391 .593-.845 .593-1.407v-6.6c0-.562-.201-1.016-.593-1.407L16.707 2.593C16.342 2.207 15.831 1.991 15.3 2Z"),
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
        return _octagon!!
    }

private var _octagon: ImageVector? = null
