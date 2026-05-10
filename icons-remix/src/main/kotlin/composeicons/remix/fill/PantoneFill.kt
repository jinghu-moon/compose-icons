package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PantoneFill: ImageVector
    get() {
        if (_pantoneFill != null) return _pantoneFill!!
        _pantoneFill = remixIcon(
            name = "PantoneFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 18.922 2.651 18.377c-.512-.207-.759-.79-.553-1.302L4 12.367v6.555ZM8.86 21h-1.86c-.552 0-1-.448-1-1v-6.078L8.86 21ZM6.022 5.968 15.294 2.222c.512-.207 1.095 .041 1.302 .553l5.619 13.908c.207 .512-.041 1.095-.552 1.302l-9.272 3.746c-.512 .207-1.095-.04-1.302-.552L5.469 7.269C5.263 6.757 5.51 6.175 6.022 5.968ZM9 9c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _pantoneFill!!
    }

private var _pantoneFill: ImageVector? = null
