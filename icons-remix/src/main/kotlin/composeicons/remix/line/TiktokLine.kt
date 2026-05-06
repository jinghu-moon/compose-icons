package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TiktokLine: ImageVector
    get() {
        if (_tiktokLine != null) return _tiktokLine!!
        _tiktokLine = remixIcon(
            name = "TiktokLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 2v6.414c-.406-.075-.824-.114-1.25-.114-3.783 0-6.85 3.067-6.85 6.85C2.9 18.933 5.967 22 9.75 22c3.783 0 6.85-3.067 6.85-6.85v-3.736c1.036 .44 2.166 .686 3.4 .686h1v-5.6h-1C18.097 6.5 16.6 4.963 16.6 3v-1h-5.6ZM13 4h1.688c.394 2.22 2.079 3.996 4.312 4.409v1.619C17.962 9.876 17.025 9.486 16.157 8.905L14.6 7.863v7.287C14.6 17.829 12.429 20 9.75 20 7.072 20 4.9 17.829 4.9 15.15c0-2.679 2.171-4.85 4.85-4.85 .084 0 .167 .002 .25 .006v1.603c-.083-.006-.166-.01-.25-.01-1.795 0-3.25 1.455-3.25 3.25 0 1.795 1.455 3.25 3.25 3.25 1.795 0 3.25-1.455 3.25-3.25 0-3.717-.001-7.433 0-11.15ZM8.5 15.15c0-.69 .56-1.25 1.25-1.25 .69 0 1.25 .56 1.25 1.25 0 .69-.56 1.25-1.25 1.25-.69 0-1.25-.56-1.25-1.25Z"),
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
        return _tiktokLine!!
    }

private var _tiktokLine: ImageVector? = null
