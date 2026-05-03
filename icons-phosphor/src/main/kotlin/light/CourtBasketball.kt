package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorLightIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 50.000 L 32.000 50.000 C 24.268 50.000 18.000 56.268 18.000 64.000 L 18.000 192.000 C 18.000 199.732 24.268 206.000 32.000 206.000 L 224.000 206.000 C 231.732 206.000 238.000 199.732 238.000 192.000 L 238.000 64.000 C 238.000 56.268 231.732 50.000 224.000 50.000 ZM 226.000 162.000 L 216.000 162.000 C 197.222 162.000 182.000 146.778 182.000 128.000 C 182.000 109.222 197.222 94.000 216.000 94.000 L 226.000 94.000 ZM 30.000 94.000 L 40.000 94.000 C 58.778 94.000 74.000 109.222 74.000 128.000 C 74.000 146.778 58.778 162.000 40.000 162.000 L 30.000 162.000 ZM 30.000 192.000 L 30.000 174.000 L 40.000 174.000 C 65.405 174.000 86.000 153.405 86.000 128.000 C 86.000 102.595 65.405 82.000 40.000 82.000 L 30.000 82.000 L 30.000 64.000 C 30.000 62.895 30.895 62.000 32.000 62.000 L 122.000 62.000 L 122.000 194.000 L 32.000 194.000 C 30.895 194.000 30.000 193.105 30.000 192.000 ZM 224.000 194.000 L 134.000 194.000 L 134.000 62.000 L 224.000 62.000 C 225.105 62.000 226.000 62.895 226.000 64.000 L 226.000 82.000 L 216.000 82.000 C 190.595 82.000 170.000 102.595 170.000 128.000 C 170.000 153.405 190.595 174.000 216.000 174.000 L 226.000 174.000 L 226.000 192.000 C 226.000 193.105 225.105 194.000 224.000 194.000 Z"),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
