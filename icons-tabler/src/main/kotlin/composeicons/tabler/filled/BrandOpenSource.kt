package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandOpenSource: ImageVector
    get() {
        if (_brandOpenSource != null) return _brandOpenSource!!
        _brandOpenSource = tablerFilledIcon(
            name = "BrandOpenSource",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.283 2.004c4.678 .13 8.641 3.488 9.537 8.082 .896 4.594-1.514 9.194-5.801 11.073-.249 .109-.532 .112-.783 .008-.251-.104-.449-.306-.549-.559L12.494 15.006c-.185-.471 .011-1.005 .456-1.245 .806-.435 1.213-1.362 .989-2.25C13.715 10.623 12.916 10.001 12 10.001c-.916 0-1.715 .622-1.939 1.51-.224 .888 .183 1.815 .989 2.25 .445 .24 .641 .773 .457 1.244L9.314 20.608c-.099 .253-.297 .455-.548 .56-.251 .104-.534 .101-.784-.008C3.646 19.261 1.235 14.581 2.207 9.948 3.178 5.314 7.266 1.997 12 2Z"),
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
        return _brandOpenSource!!
    }

private var _brandOpenSource: ImageVector? = null
