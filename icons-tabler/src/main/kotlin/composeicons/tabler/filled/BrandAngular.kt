package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandAngular: ImageVector
    get() {
        if (_brandAngular != null) return _brandAngular!!
        _brandAngular = tablerFilledIcon(
            name = "BrandAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.665 2.174l7.4 2.612c.894 .316 1.444 1.216 1.316 2.156l-1.323 9.703c-.084 .617-.45 1.159-.99 1.468l-6.076 3.471c-.615 .351-1.369 .351-1.984 0L4.932 18.114c-.489-.279-.837-.751-.96-1.3l-.03-.167L2.62 6.943C2.492 6.003 3.042 5.103 3.936 4.787L11.336 2.174c.43-.152 .9-.152 1.33 0M12.937 6.649c-.324-.865-1.548-.865-1.872 0l-3 8c-.194 .517 .068 1.093 .585 1.287l.111 .035c.493 .122 .998-.145 1.176-.62L10.443 14h3.113l.508 1.352c.178 .475 .683 .742 1.176 .62l.111-.035c.517-.194 .779-.77 .585-1.287ZM12 9.848l.807 2.151h-1.614Z"),
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
        return _brandAngular!!
    }

private var _brandAngular: ImageVector? = null
