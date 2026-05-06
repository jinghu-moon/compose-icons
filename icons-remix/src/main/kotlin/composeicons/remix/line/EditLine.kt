package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EditLine: ImageVector
    get() {
        if (_editLine != null) return _editLine!!
        _editLine = remixIcon(
            name = "EditLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.414 15.89 16.556 5.748 15.142 4.334 5 14.476v1.414h1.414ZM7.243 17.89h-4.243v-4.243L14.435 2.212c.391-.391 1.024-.391 1.414 0l2.828 2.828c.39 .391 .39 1.024 0 1.414L7.243 17.89ZM3 19.89h18v2h-18v-2Z"),
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
        return _editLine!!
    }

private var _editLine: ImageVector? = null
