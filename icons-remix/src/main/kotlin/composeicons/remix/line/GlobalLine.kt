package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GlobalLine: ImageVector
    get() {
        if (_globalLine != null) return _globalLine!!
        _globalLine = remixIcon(
            name = "GlobalLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM9.71 19.667C8.747 17.626 8.157 15.374 8.027 13h-3.965c.396 3.177 2.655 5.775 5.648 6.667ZM10.031 13c.15 2.439 .847 4.73 1.969 6.752C13.122 17.73 13.819 15.439 13.969 13h-3.939ZM19.938 13h-3.965c-.13 2.374-.72 4.626-1.683 6.667 2.994-.893 5.252-3.491 5.648-6.667ZM4.062 11h3.965C8.157 8.626 8.747 6.374 9.71 4.333 6.716 5.225 4.458 7.824 4.062 11ZM10.031 11h3.939C13.819 8.561 13.122 6.27 12 4.248 10.878 6.27 10.181 8.561 10.031 11ZM14.29 4.333c.963 2.042 1.553 4.293 1.683 6.667h3.965C19.542 7.824 17.284 5.225 14.29 4.333Z"),
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
        return _globalLine!!
    }

private var _globalLine: ImageVector? = null
