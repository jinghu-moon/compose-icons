package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pinned: ImageVector
    get() {
        if (_pinned != null) return _pinned!!
        _pinned = tablerFilledIcon(
            name = "Pinned",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 3c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L16 5v4.764l1.894 3.789c.052 .104 .086 .216 .1 .331L18 14v2c-0 .507-.38 .934-.883 .993L17 17h-4v4c-.001 .529-.413 .966-.941 .997-.528 .031-.989-.355-1.052-.88L11 21v-4h-4c-.507-0-.934-.38-.993-.883L6 16v-2c0-.116 .02-.231 .06-.34l.046-.107L8 9.762v-4.762C7.471 4.999 7.034 4.587 7.003 4.059c-.031-.528 .355-.989 .88-1.052L8 3h8Z"),
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
        return _pinned!!
    }

private var _pinned: ImageVector? = null
