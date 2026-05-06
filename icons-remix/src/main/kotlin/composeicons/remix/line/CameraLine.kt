package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraLine: ImageVector
    get() {
        if (_cameraLine != null) return _cameraLine!!
        _cameraLine = remixIcon(
            name = "CameraLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.828 5l-2 2h-3.828v12h16v-12h-3.828l-2-2h-4.343ZM9 3h6l2 2h4c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-14C2 5.448 2.448 5 3 5h4L9 3ZM12 18C8.962 18 6.5 15.538 6.5 12.5 6.5 9.462 8.962 7 12 7c3.038 0 5.5 2.462 5.5 5.5C17.5 15.538 15.038 18 12 18ZM12 16c1.933 0 3.5-1.567 3.5-3.5C15.5 10.567 13.933 9 12 9 10.067 9 8.5 10.567 8.5 12.5 8.5 14.433 10.067 16 12 16Z"),
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
        return _cameraLine!!
    }

private var _cameraLine: ImageVector? = null
