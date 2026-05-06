package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.JewelryLine: ImageVector
    get() {
        if (_jewelryLine != null) return _jewelryLine!!
        _jewelryLine = remixIcon(
            name = "JewelryLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 2.9c0-.463 .319-.865 .769-.973 1.396-.331 3.065-.327 4.462-0 .446 .106 .77 .515 .77 .973v2.138c0 .291 .168 .556 .432 .679l5.694 2.668c.745 .349 1.07 1.233 .728 1.982l-4.473 9.785c-.236 .517-.753 .849-1.321 .849h-8.119c-.568 0-1.085-.332-1.321-.849L2.147 10.367C1.805 9.618 2.129 8.734 2.875 8.385L8.569 5.717c.263-.123 .432-.388 .432-.679v-2.138ZM11 3.78v1.258c0 1.067-.617 2.038-1.583 2.49l-.981 .46C9.142 9.889 10.57 11 12 11c1.43 0 2.858-1.111 3.564-3.013l-.981-.46C13.617 7.075 13 6.105 13 5.038v-1.258c-.264-.019-.596-.033-1-.033-.404 0-.736 .014-1 .034ZM11.319 12.954C9.167 12.658 7.475 10.979 6.623 8.837L4.172 9.985l4.121 9.015h7.415L19.829 9.985 17.378 8.837c-.852 2.142-2.544 3.821-4.696 4.117l1.507 2.11c.186 .261 .186 .611 0 .872l-1.985 2.779c-.1 .14-.307 .14-.407 0L9.812 15.936c-.186-.261-.186-.611 0-.872l1.507-2.11Z"),
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
        return _jewelryLine!!
    }

private var _jewelryLine: ImageVector? = null
