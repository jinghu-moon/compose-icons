package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraLensLine: ImageVector
    get() {
        if (_cameraLensLine != null) return _cameraLensLine!!
        _cameraLensLine = remixIcon(
            name = "CameraLensLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.858 19.71 12 16h-6.93c1.037 1.792 2.749 3.145 4.788 3.71ZM4.252 14h4.284L5.071 7.999C4.39 9.176 4 10.542 4 12c0 .691 .088 1.361 .252 2ZM6.395 6.292 8.536 10 12 4C9.817 4 7.838 4.874 6.395 6.292ZM14.142 4.29 12 8h6.93C17.893 6.208 16.181 4.855 14.142 4.29ZM19.748 10h-4.284l3.465 6.001C19.61 14.824 20 13.458 20 12c0-.691-.087-1.361-.252-2ZM17.605 17.708 15.464 14 12 20c2.183 0 4.162-.874 5.605-2.292ZM12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM13.155 10h-2.309L9.691 12l1.155 2h2.309l1.155-2L13.155 10Z"),
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
        return _cameraLensLine!!
    }

private var _cameraLensLine: ImageVector? = null
