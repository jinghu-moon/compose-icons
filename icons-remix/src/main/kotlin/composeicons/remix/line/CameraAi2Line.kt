package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraAi2Line: ImageVector
    get() {
        if (_cameraAi2Line != null) return _cameraAi2Line!!
        _cameraAi2Line = remixIcon(
            name = "CameraAi2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.434 3c.702 0 1.353 .369 1.715 .971l.773 1.286c.09 .151 .253 .243 .429 .243h1.65c1.657 0 3 1.343 3 3v9.5c0 1.657-1.343 3-3 3h-14C3.343 21 2 19.657 2 18v-9.5c0-1.657 1.343-3 3-3h1.65c.176 0 .338-.093 .429-.243L7.852 3.971C8.213 3.369 8.864 3 9.566 3h4.867ZM8.795 6.286C8.343 7.039 7.529 7.5 6.65 7.5h-1.65c-.552 0-1 .448-1 1v9.5c0 .552 .448 1 1 1h14c.552 0 1-.448 1-1v-9.5c0-.552-.448-1-1-1h-1.65c-.878 0-1.693-.461-2.144-1.214L14.434 5h-4.867L8.795 6.286ZM11.529 9.317c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.875 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.243-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C10.848 15.117 10.055 14.314 9.067 13.875l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319c1.013-.451 1.819-1.283 2.251-2.326l.253-.611Z"),
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
        return _cameraAi2Line!!
    }

private var _cameraAi2Line: ImageVector? = null
