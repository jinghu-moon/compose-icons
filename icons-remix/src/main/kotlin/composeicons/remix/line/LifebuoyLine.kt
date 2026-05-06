package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LifebuoyLine: ImageVector
    get() {
        if (_lifebuoyLine != null) return _lifebuoyLine!!
        _lifebuoyLine = remixIcon(
            name = "LifebuoyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 17c-.645 0-1.261-.122-1.828-.344L7.936 18.892C9.127 19.596 10.516 20 12 20c1.484 0 2.873-.404 4.064-1.108L13.828 16.656C13.261 16.878 12.645 17 12 17ZM4 12c0 1.484 .404 2.873 1.108 4.064L7.345 13.828C7.122 13.261 7 12.645 7 12c0-.645 .122-1.261 .345-1.828L5.108 7.936C4.404 9.127 4 10.516 4 12ZM18.892 7.936l-2.237 2.236c.222 .566 .344 1.182 .344 1.828 0 .645-.122 1.261-.344 1.828l2.237 2.236C19.596 14.873 20 13.484 20 12 20 10.516 19.596 9.127 18.892 7.936ZM12 9C10.343 9 9 10.343 9 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 10.343 13.657 9 12 9ZM12 4C10.516 4 9.127 4.404 7.936 5.108l2.236 2.237C10.739 7.122 11.355 7 12 7c.645 0 1.261 .122 1.828 .345L16.064 5.108C14.873 4.404 13.484 4 12 4Z"),
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
        return _lifebuoyLine!!
    }

private var _lifebuoyLine: ImageVector? = null
