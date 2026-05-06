package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PenNibFill: ImageVector
    get() {
        if (_penNibFill != null) return _penNibFill!!
        _penNibFill = remixIcon(
            name = "PenNibFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.929 21.482l5.846-5.846c.667 .178 1.409 .006 1.932-.518 .781-.781 .781-2.047 0-2.828-.781-.781-2.047-.781-2.828 0-.523 .523-.696 1.265-.518 1.932L3.515 20.068 2.454 19.007C5.283 15.707 6.343 12.054 7.757 5.926l6.364-.707 5.657 5.657-.707 6.364C12.943 18.653 9.289 19.714 5.99 22.543L4.929 21.482ZM16.596 2.037l6.347 6.347c.195 .195 .195 .512 0 .707-.075 .075-.172 .124-.276 .14l-1.474 .23L15.536 3.804l.212-1.485c.039-.273 .292-.463 .566-.424 .107 .015 .206 .065 .283 .141Z"),
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
        return _penNibFill!!
    }

private var _penNibFill: ImageVector? = null
