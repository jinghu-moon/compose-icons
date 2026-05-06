package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GlobalFill: ImageVector
    get() {
        if (_globalFill != null) return _globalFill!!
        _globalFill = remixIcon(
            name = "GlobalFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.049 13h5.478c.179 3.269 1.23 6.305 2.925 8.881C5.988 21.187 2.5 17.54 2.049 13ZM2.049 11C2.5 6.46 5.988 2.813 10.452 2.119 8.757 4.695 7.706 7.731 7.527 11h-5.478ZM21.951 11h-5.478C16.294 7.731 15.243 4.695 13.548 2.119c4.464 .694 7.952 4.341 8.403 8.881ZM21.951 13c-.451 4.54-3.938 8.187-8.403 8.881 1.695-2.576 2.746-5.612 2.925-8.881h5.478ZM9.531 13h4.939c-.172 2.783-1.055 5.373-2.469 7.592C10.585 18.373 9.702 15.783 9.531 13ZM9.531 11C9.702 8.217 10.585 5.627 12 3.408c1.415 2.218 2.298 4.809 2.469 7.591h-4.939Z"),
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
        return _globalFill!!
    }

private var _globalFill: ImageVector? = null
