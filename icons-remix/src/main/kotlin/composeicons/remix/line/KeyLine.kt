package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.KeyLine: ImageVector
    get() {
        if (_keyLine != null) return _keyLine!!
        _keyLine = remixIcon(
            name = "KeyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.917 13C12.441 15.838 9.973 18 7 18 3.686 18 1 15.314 1 12 1 8.686 3.686 6 7 6c2.973 0 5.441 2.162 5.917 5h10.083v2h-2v4h-2v-4h-2v4h-2v-4h-2.083ZM7 16c2.209 0 4-1.791 4-4C11 9.791 9.209 8 7 8 4.791 8 3 9.791 3 12c0 2.209 1.791 4 4 4Z"),
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
        return _keyLine!!
    }

private var _keyLine: ImageVector? = null
