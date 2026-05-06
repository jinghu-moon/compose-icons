package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MenFill: ImageVector
    get() {
        if (_menFill != null) return _menFill!!
        _menFill = remixIcon(
            name = "MenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.586 5h-4.586v-2h8v8h-2v-4.586L16.463 9.951c.964 1.262 1.537 2.839 1.537 4.549C18 18.642 14.642 22 10.5 22 6.358 22 3 18.642 3 14.5 3 10.358 6.358 7 10.5 7c1.71 0 3.287 .573 4.549 1.537L18.586 5Z"),
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
        return _menFill!!
    }

private var _menFill: ImageVector? = null
