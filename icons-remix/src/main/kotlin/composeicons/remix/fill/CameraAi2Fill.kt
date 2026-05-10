package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraAi2Fill: ImageVector
    get() {
        if (_cameraAi2Fill != null) return _cameraAi2Fill!!
        _cameraAi2Fill = remixIcon(
            name = "CameraAi2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.434 3c.702 0 1.353 .369 1.715 .971l.773 1.286c.09 .151 .253 .243 .429 .243h1.65c1.657 0 3 1.343 3 3v9.5c0 1.657-1.343 3-3 3h-14C3.343 21 2 19.657 2 18v-9.5c0-1.657 1.343-3 3-3h1.65c.176 0 .338-.093 .429-.243L7.852 3.971C8.213 3.369 8.864 3 9.566 3h4.867ZM12.471 9.317c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.875-2.251 2.326l-.718 .319c-.41 .183-.41 .78 0 .963l.76 .338c.988 .439 1.78 1.242 2.22 2.251l.246 .565c.181 .414 .753 .414 .934 0l.247-.565c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.41-.183 .41-.78 0-.963l-.718-.319C13.962 11.804 13.156 10.972 12.724 9.929l-.253-.611Z"),
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
        return _cameraAi2Fill!!
    }

private var _cameraAi2Fill: ImageVector? = null
