package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorFillIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 48h-160C34.745 48 24 58.745 24 72v112c0 13.255 10.745 24 24 24h160c13.255 0 24-10.745 24-24v-112C232 58.745 221.255 48 208 48ZM152 120c0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24 0-4.418-3.582-8-8-8h-56v-16h176v16h-56c-4.418 0-8 3.582-8 8ZM48 64h160c4.418 0 8 3.582 8 8v8h-176v-8c0-4.418 3.582-8 8-8Z"),
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
