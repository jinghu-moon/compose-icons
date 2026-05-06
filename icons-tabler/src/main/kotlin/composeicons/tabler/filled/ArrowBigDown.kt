package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowBigDown: ImageVector
    get() {
        if (_arrowBigDown != null) return _arrowBigDown!!
        _arrowBigDown = tablerFilledIcon(
            name = "ArrowBigDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 2l-.15 .005C8.806 2.083 8 2.953 8 4v6.999L5.414 11c-.809 0-1.538 .487-1.847 1.235-.309 .747-.138 1.607 .433 2.179L10.586 21c.781 .781 2.047 .781 2.828 0L20 14.414c.572-.572 .744-1.432 .434-2.18l-.068-.145C20.024 11.421 19.337 11 18.586 11L16 10.999v-6.999C16 2.895 15.105 2 14 2h-4Z"),
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
        return _arrowBigDown!!
    }

private var _arrowBigDown: ImageVector? = null
