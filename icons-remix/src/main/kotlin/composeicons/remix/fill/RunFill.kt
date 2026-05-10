package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RunFill: ImageVector
    get() {
        if (_runFill != null) return _runFill!!
        _runFill = remixIcon(
            name = "RunFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.83 8.79 8 9.456v3.544h-2v-4.95h.015L11.283 6.132c.244-.094 .509-.141 .781-.132 1.111 .027 2.087 .756 2.427 1.82 .186 .584 .356 .978 .51 1.182C15.914 10.215 17.365 11 19 11v2c-2.175 0-4.118-.992-5.402-2.547l-.581 3.297L15 15.67v7.33h-2v-5.986L10.951 15.027l-.948 4.298L3.109 18.11l.347-1.97 4.924 .868L9.83 8.79ZM13.5 5.5c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _runFill!!
    }

private var _runFill: ImageVector? = null
