package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TentLine: ImageVector
    get() {
        if (_tentLine != null) return _tentLine!!
        _tentLine = remixIcon(
            name = "TentLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.103 19 12.866 3c-.088-.152-.214-.278-.366-.366-.478-.276-1.09-.112-1.366 .366L1.896 19h-.896v2c7.333 0 14.667 0 22 0v-2h-.897ZM7.6 19h-3.394L12 5.5l7.794 13.5h-3.394L12 11 7.6 19ZM12 15.15 14.118 19h-4.235L12 15.15Z"),
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
        return _tentLine!!
    }

private var _tentLine: ImageVector? = null
