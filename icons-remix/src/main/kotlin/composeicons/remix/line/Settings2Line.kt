package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Settings2Line: ImageVector
    get() {
        if (_settings2Line != null) return _settings2Line!!
        _settings2Line = remixIcon(
            name = "Settings2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.686 4 11.293 1.393c.391-.391 1.024-.391 1.414 0l2.607 2.607h3.686c.552 0 1 .448 1 1v3.686l2.607 2.607c.39 .391 .39 1.024 0 1.414l-2.607 2.607v3.686c0 .552-.448 1-1 1h-3.686l-2.607 2.607c-.391 .39-1.024 .39-1.414 0L8.686 20h-3.686c-.552 0-1-.448-1-1v-3.686L1.393 12.707c-.391-.391-.391-1.024 0-1.414L4 8.686v-3.686c0-.552 .448-1 1-1h3.686ZM6 6v3.515L3.515 12l2.485 2.485v3.515h3.515l2.485 2.485 2.485-2.485h3.515v-3.515l2.485-2.485L18 9.515v-3.515h-3.515L12 3.515 9.515 6h-3.515ZM12 16c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM12 14c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _settings2Line!!
    }

private var _settings2Line: ImageVector? = null
