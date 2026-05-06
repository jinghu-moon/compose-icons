package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PenNibLine: ImageVector
    get() {
        if (_penNibLine != null) return _penNibLine!!
        _penNibLine = remixIcon(
            name = "PenNibLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.596 1.037l6.347 6.347c.195 .195 .195 .512 0 .707-.075 .075-.172 .124-.276 .14l-1.474 .23L15.536 2.804l.212-1.485c.039-.273 .292-.463 .566-.424 .107 .015 .206 .065 .283 .141ZM4.595 20.148c3.722-3.332 7.995-4.328 12.643-5.521l.446-4.017L13.387 6.312 9.369 6.759C8.177 11.407 7.18 15.679 3.849 19.402L2.454 18.007C5.283 14.707 6.343 11.054 7.757 4.926l6.364-.707 5.657 5.657-.707 6.364C12.943 17.653 9.289 18.714 5.99 21.543L4.595 20.148ZM9.879 14.118c-.781-.781-.781-2.047 0-2.828 .781-.781 2.047-.781 2.828 0 .781 .781 .781 2.047 0 2.828-.781 .781-2.047 .781-2.828 0Z"),
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
        return _penNibLine!!
    }

private var _penNibLine: ImageVector? = null
