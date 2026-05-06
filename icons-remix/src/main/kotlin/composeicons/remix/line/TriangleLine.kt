package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TriangleLine: ImageVector
    get() {
        if (_triangleLine != null) return _triangleLine!!
        _triangleLine = remixIcon(
            name = "TriangleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.866 3l9.526 16.5c.276 .478 .112 1.09-.366 1.366-.152 .088-.324 .134-.5 .134h-19.053c-.552 0-1-.448-1-1 0-.176 .046-.348 .134-.5L11.134 3c.276-.478 .888-.642 1.366-.366 .152 .088 .278 .214 .366 .366ZM4.206 19h15.588L12 5.5 4.206 19Z"),
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
        return _triangleLine!!
    }

private var _triangleLine: ImageVector? = null
