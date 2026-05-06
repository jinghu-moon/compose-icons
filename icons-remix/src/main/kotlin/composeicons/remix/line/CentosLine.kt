package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CentosLine: ImageVector
    get() {
        if (_centosLine != null) return _centosLine!!
        _centosLine = remixIcon(
            name = "CentosLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l4.292 4.292L17.353 5.232 16.121 4 20 4l-0 3.879L18.767 6.646 17.707 7.707 22 12l-4.292 4.293 1.059 1.059 1.233-1.231L20 20l-3.879-0 1.231-1.233L16.293 17.707 12 22 7.707 17.707 6.646 18.767l1.233 1.233L4 20 4 16.121l1.231 1.231L6.292 16.292 2 12 6.293 7.707 5.231 6.646 4 7.879 4 4 7.879 4 6.646 5.231 7.708 6.293 12 2ZM12 13.413 9.12 16.292 12 19.172l2.879-2.88L12 13.413ZM7.707 9.121 4.828 12l2.878 2.878 2.88-2.879L7.707 9.121ZM16.292 9.121l-2.877 2.878 2.878 2.879L19.172 12 16.292 9.121ZM12 4.828 9.122 7.707l2.879 2.878L14.878 7.706 12 4.828Z"),
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
        return _centosLine!!
    }

private var _centosLine: ImageVector? = null
