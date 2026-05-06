package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BellFill: ImageVector
    get() {
        if (_bellFill != null) return _bellFill!!
        _bellFill = remixIcon(
            name = "BellFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.414 10.586l.479 .486 .465 .485 .459 .493c3.458 3.764 5.472 7.218 4.607 8.083-.4 .4-1.356 .184-2.639-.507C13.584 21.638 9.39 21.441 6.382 19.033L9.362 16.054c.667 .178 1.408 .005 1.931-.518 .781-.781 .781-2.047 0-2.828-.781-.781-2.047-.781-2.828 0-.483 .483-.667 1.152-.553 1.777l.035 .155L4.968 17.618C2.559 14.611 2.362 10.416 4.376 7.214 3.684 5.931 3.468 4.976 3.868 4.575c.976-.976 5.25 1.715 9.546 6.01ZM19.778 4.222c.781 .781 .781 2.047 0 2.828-.053 .053-.108 .102-.165 .148 1.617 2.556 1.82 5.752 .608 8.47C19.032 13.714 17.151 11.495 14.828 9.172l-.538-.532C12.163 6.562 10.135 4.876 8.333 3.779c2.718-1.212 5.913-1.01 8.471 .608 .044-.057 .093-.112 .146-.165 .781-.781 2.047-.781 2.829 0Z"),
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
        return _bellFill!!
    }

private var _bellFill: ImageVector? = null
