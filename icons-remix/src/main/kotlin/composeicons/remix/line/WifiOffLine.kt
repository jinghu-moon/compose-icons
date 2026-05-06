package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WifiOffLine: ImageVector
    get() {
        if (_wifiOffLine != null) return _wifiOffLine!!
        _wifiOffLine = remixIcon(
            name = "WifiOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 18c.714 0 1.37 .25 1.885 .667L12 21 10.115 18.667c.515-.417 1.171-.667 1.886-.667ZM2.808 1.393 20.485 19.071l-1.414 1.414L13.891 15.304C13.297 15.107 12.661 15 12 15c-1.428 0-2.74 .499-3.77 1.332L6.974 14.776c1.276-1.032 2.876-1.679 4.623-1.766L9 10.414c-1.448 .409-2.774 1.108-3.912 2.029L3.831 10.887C4.899 10.023 6.108 9.324 7.416 8.831L5.132 6.545C3.989 7.089 2.921 7.765 1.947 8.552L.689 6.997C1.604 6.257 2.592 5.606 3.641 5.055L1.393 2.808 2.808 1.393ZM14.5 10.285 12.217 8.002 12 8c3.095 0 5.937 1.081 8.169 2.887l-1.257 1.556C17.644 11.417 16.143 10.667 14.5 10.285ZM12 3c4.285 0 8.22 1.497 11.311 3.997L22.053 8.552C19.306 6.331 15.809 5 12 5c-.878 0-1.74 .071-2.579 .207L7.725 3.511c1.37-.334 2.802-.511 4.276-.511Z"),
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
        return _wifiOffLine!!
    }

private var _wifiOffLine: ImageVector? = null
