package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraSwitchLine: ImageVector
    get() {
        if (_cameraSwitchLine != null) return _cameraSwitchLine!!
        _cameraSwitchLine = remixIcon(
            name = "CameraSwitchLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.828 5l-2 2h-3.828v12h16v-12h-3.828l-2-2h-4.343ZM9 3h6l2 2h4c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-14C2 5.448 2.448 5 3 5h4L9 3ZM9.64 7.53C10.356 7.19 11.156 7 12 7c3.038 0 5.5 2.462 5.5 5.5 0 1.55-.641 2.95-1.673 3.95L13.75 12.6h1.749c.001-.033 .001-.067 .001-.1C15.5 10.567 13.933 9 12 9c-.509 0-.992 .109-1.428 .304L9.64 7.53ZM14.318 17.489C13.613 17.817 12.828 18 12 18 8.962 18 6.5 15.538 6.5 12.5c0-1.532 .627-2.918 1.637-3.915l2.113 3.915h-1.75C8.5 14.433 10.067 16 12 16c.492 0 .961-.102 1.386-.285l.932 1.774Z"),
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
        return _cameraSwitchLine!!
    }

private var _cameraSwitchLine: ImageVector? = null
