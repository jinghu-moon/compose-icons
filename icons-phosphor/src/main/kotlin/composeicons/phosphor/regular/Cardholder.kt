package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorRegularIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 48h-160C34.745 48 24 58.745 24 72v112c0 13.255 10.745 24 24 24h160c13.255 0 24-10.745 24-24v-112C232 58.745 221.255 48 208 48ZM40 96h176v16h-56c-4.418 0-8 3.582-8 8 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-4.418-3.582-8-8-8h-56ZM48 64h160c4.418 0 8 3.582 8 8v8h-176v-8c0-4.418 3.582-8 8-8ZM208 192h-160c-4.418 0-8-3.582-8-8v-56h48.8c3.786 18.643 20.177 32.04 39.2 32.04 19.023 0 35.414-13.398 39.2-32.04h48.8v56c0 4.418-3.582 8-8 8Z"),
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
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
