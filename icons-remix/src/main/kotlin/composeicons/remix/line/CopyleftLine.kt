package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CopyleftLine: ImageVector
    get() {
        if (_copyleftLine != null) return _copyleftLine!!
        _copyleftLine = remixIcon(
            name = "CopyleftLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.48 22 2 17.52 2 12 2 6.48 6.48 2 12 2c5.52 0 10 4.48 10 10 0 5.52-4.48 10-10 10ZM12 20c4.42 0 8-3.58 8-8C20 7.58 16.42 4 12 4 7.58 4 4 7.58 4 12c0 4.42 3.58 8 8 8ZM12 17C10.181 17 8.587 16.027 7.712 14.572L9.426 13.543C9.951 14.416 10.907 15 12 15c1.658 0 3-1.342 3-3C15 10.342 13.658 9 12 9 10.907 9 9.952 9.583 9.427 10.456L7.712 9.428C8.587 7.973 10.181 7 12 7c2.76 0 5 2.24 5 5 0 2.76-2.24 5-5 5Z"),
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
        return _copyleftLine!!
    }

private var _copyleftLine: ImageVector? = null
