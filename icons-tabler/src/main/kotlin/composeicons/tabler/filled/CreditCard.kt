package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = tablerFilledIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 10v6c0 2.209-1.791 4-4 4h-12C3.791 20 2 18.209 2 16v-6h20ZM7.01 14h-.01c-.552 .003-.998 .453-.995 1.005 .003 .552 .453 .998 1.005 .995 .552 0 1-.448 1-1 0-.552-.448-1-1-1M13 14h-2c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h2c.552 0 1-.448 1-1 0-.552-.448-1-1-1ZM18 4c2.209 0 4 1.791 4 4h-20C2 5.791 3.791 4 6 4h12Z"),
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
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
