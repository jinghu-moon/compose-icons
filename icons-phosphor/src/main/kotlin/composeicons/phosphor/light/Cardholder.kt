package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorLightIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 50h-160C35.85 50 26 59.85 26 72v112c0 12.15 9.85 22 22 22h160c12.15 0 22-9.85 22-22v-112C230 59.85 220.15 50 208 50ZM38 94h180v20h-58c-3.314 0-6 2.686-6 6 0 14.359-11.641 26-26 26-14.359 0-26-11.641-26-26 0-3.314-2.686-6-6-6h-58ZM48 62h160c5.523 0 10 4.477 10 10v10h-180v-10C38 66.477 42.477 62 48 62ZM208 194h-160c-5.523 0-10-4.477-10-10v-58h52.47c2.93 18.456 18.843 32.042 37.53 32.042 18.687 0 34.6-13.586 37.53-32.042h52.47v58c0 5.523-4.477 10-10 10Z"),
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
