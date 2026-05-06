package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SwordLine: ImageVector
    get() {
        if (_swordLine != null) return _swordLine!!
        _swordLine = remixIcon(
            name = "SwordLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.456 3l3.543 .003 .002 3.523-5.467 5.466 2.828 2.829 1.415-1.414 1.414 1.414-2.475 2.475 2.828 2.828-1.414 1.414L17.302 18.71l-2.475 2.475L13.413 19.771l1.414-1.415L11.998 15.528 9.17 18.356l1.415 1.415L9.171 21.185 6.696 18.71 3.867 21.539 2.453 20.125 5.282 17.296 2.807 14.821 4.221 13.407l1.414 1.413L8.462 11.992 3.002 6.531 2.999 3l3.546 .003 5.453 5.454L17.456 3ZM9.876 13.406 7.048 16.234l.708 .707 2.827-2.828-.707-.707ZM19 5.001h-.717L13.412 9.87l.707 .707L19 5.698v-.697ZM5 5.001v.7L16.241 16.942l.707-.707L5.715 5.002 5 5.001Z"),
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
        return _swordLine!!
    }

private var _swordLine: ImageVector? = null
