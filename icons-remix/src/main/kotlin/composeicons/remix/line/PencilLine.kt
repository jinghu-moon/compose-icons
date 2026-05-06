package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) return _pencilLine!!
        _pencilLine = remixIcon(
            name = "PencilLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.728 9.576 14.314 8.162 5 17.476v1.414h1.414L15.728 9.576ZM17.142 8.162 18.556 6.748 17.142 5.334 15.728 6.748l1.414 1.414ZM7.243 20.89h-4.243v-4.243L16.435 3.212c.391-.391 1.024-.391 1.414 0l2.829 2.828c.39 .391 .39 1.024 0 1.414L7.243 20.89Z"),
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
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
