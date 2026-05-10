package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GlobalOffFill: ImageVector
    get() {
        if (_globalOffFill != null) return _globalOffFill!!
        _globalOffFill = remixIcon(
            name = "GlobalOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.035 16.379l-2.121 2.121 2.121 2.121-1.414 1.415L18.5 19.914l-2.121 2.122L14.965 20.621l2.121-2.121L14.965 16.379l1.414-1.414 2.121 2.121 2.121-2.121 1.414 1.414ZM7.527 13c.179 3.269 1.23 6.305 2.925 8.881C5.988 21.187 2.5 17.54 2.049 13h5.479ZM14.469 13c-.024 .393-.064 .781-.116 1.166-1.141 1.092-1.852 2.63-1.852 4.334 0 .365 .034 .722 .097 1.069-.187 .348-.385 .69-.597 1.023C10.585 18.374 9.702 15.783 9.53 13h4.939ZM10.452 2.119C8.758 4.695 7.706 7.731 7.527 11h-5.479C2.5 6.46 5.988 2.813 10.452 2.119ZM12 3.408c1.415 2.218 2.297 4.809 2.469 7.592h-4.939C9.702 8.217 10.585 5.627 12 3.408ZM13.548 2.119c4.464 .694 7.951 4.341 8.402 8.881h-5.477C16.294 7.731 15.242 4.695 13.548 2.119Z"),
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
        return _globalOffFill!!
    }

private var _globalOffFill: ImageVector? = null
