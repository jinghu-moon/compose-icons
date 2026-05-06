package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandVercel: ImageVector
    get() {
        if (_brandVercel != null) return _brandVercel!!
        _brandVercel = tablerFilledIcon(
            name = "BrandVercel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.143 3.486c.181-.301 .506-.485 .857-.485 .351 0 .676 .184 .857 .485l9 15c.185 .309 .19 .693 .012 1.007-.177 .313-.509 .507-.869 .507h-18c-.36-0-.692-.194-.869-.507-.177-.313-.173-.698 .012-1.007Z"),
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
        return _brandVercel!!
    }

private var _brandVercel: ImageVector? = null
