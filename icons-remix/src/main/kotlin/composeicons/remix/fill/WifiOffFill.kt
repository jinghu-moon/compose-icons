package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WifiOffFill: ImageVector
    get() {
        if (_wifiOffFill != null) return _wifiOffFill!!
        _wifiOffFill = remixIcon(
            name = "WifiOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 18c.714 0 1.37 .25 1.885 .667l-1.885 2.333L10.115 18.666c.515-.417 1.171-.667 1.886-.667ZM2.808 1.393 20.485 19.071l-1.414 1.414L15.389 16.804l-.247 .306c-.859-.695-1.952-1.111-3.142-1.111-1.19 0-2.283 .416-3.141 1.11L6.974 14.776c1.276-1.032 2.876-1.679 4.623-1.766L9.823 11.238c-1.53 .34-2.929 1.03-4.107 1.983L3.831 10.887C4.899 10.023 6.108 9.324 7.416 8.831L5.885 7.299C4.691 7.833 3.579 8.518 2.575 9.33L.689 6.997C1.604 6.257 2.592 5.606 3.641 5.055L1.393 2.808 2.808 1.393ZM16.084 11.869 12.217 8.002l-.216-.002c3.095 0 5.937 1.081 8.169 2.887l-1.885 2.334c-.668-.54-1.406-.996-2.2-1.351ZM12 3c4.285 0 8.22 1.497 11.311 3.997L21.425 9.33C18.85 7.247 15.571 6 12 6c-.572 0-1.136 .032-1.691 .094L7.725 3.511c1.37-.334 2.802-.511 4.276-.511Z"),
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
        return _wifiOffFill!!
    }

private var _wifiOffFill: ImageVector? = null
