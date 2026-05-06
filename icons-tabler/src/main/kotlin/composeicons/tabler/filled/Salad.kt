package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Salad: ImageVector
    get() {
        if (_salad != null) return _salad!!
        _salad = tablerFilledIcon(
            name = "Salad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.53 3.152l3.742 2.339Q14.764 5 16.744 5h2.256c.552 0 1 .448 1 1l-.001 1.336-.05 .895-.042 .585c-.037 .457-.08 .84-.134 1.185L20 10c1.105 0 2 .895 2 2v.5c0 1.694-2.247 5.49-3.983 6.983L18 19.496v.504c0 1.047-.806 1.917-1.85 1.995L16 22h-8C6.895 22 6 21.105 6 20v-.496l-.065-.053C4.175 17.955 2.141 14.486 2.007 12.681L2 12.5v-.5c0-1.105 .895-2 2-2h.078C4.04 9.668 4.014 9.334 4 9v-1C4 7.448 4.448 7 5 7h1.755c.138 0 .287 .034 .44 .092L8.03 3.757c.078-.31 .299-.565 .596-.684 .297-.12 .633-.09 .904 .079M7.337 8.999 6.002 9l.027 .42q.025 .292 .064 .58h.942q.078-.533 .302-1.001M18 7h-1.256c-1.712 0-3.003 .31-3.922 .88 .62 .549 1.025 1.3 1.143 2.12h3.774c.127-.615 .194-1.4 .261-2.714ZM10.5 9c-.636 0-1.202 .401-1.414 1h2.828c-.142-.403-.45-.726-.845-.888l-.166-.056C10.772 9.019 10.636 9 10.5 9M9.636 5.576 9.221 7.241c.477-.187 .99-.267 1.502-.234 .157-.156 .323-.304 .497-.442Z"),
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
        return _salad!!
    }

private var _salad: ImageVector? = null
