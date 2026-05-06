package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandWindows: ImageVector
    get() {
        if (_brandWindows != null) return _brandWindows!!
        _brandWindows = tablerFilledIcon(
            name = "BrandWindows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 13v5c0 1.57-1.248 2.832-2.715 2.923l-.113 .003-.042 .018c-.108 .038-.222 .057-.336 .056l-.118-.008L13 20.407v-7.407ZM11 13v7.157L5.7 19.495C4.186 19.344 3 18.112 3 16.6v-3.6ZM11 3.842v7.158h-8v-3.6C3 5.946 4.096 4.752 5.505 4.53ZM21 5.9v5.1h-8v-7.409l4.717-.589C19.476 2.857 21 4.191 21 5.9"),
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
        return _brandWindows!!
    }

private var _brandWindows: ImageVector? = null
