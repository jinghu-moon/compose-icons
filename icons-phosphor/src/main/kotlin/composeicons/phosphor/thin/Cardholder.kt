package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorThinIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 52h-160C36.954 52 28 60.954 28 72v112c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-112C228 60.954 219.046 52 208 52ZM36 92h184v24h-60c-2.209 0-4 1.791-4 4 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28 0-2.209-1.791-4-4-4h-60ZM48 60h160c6.627 0 12 5.373 12 12v12h-184v-12C36 65.373 41.373 60 48 60ZM208 196h-160c-6.627 0-12-5.373-12-12v-60h56.22c2.025 18.232 17.436 32.026 35.78 32.026 18.344 0 33.755-13.794 35.78-32.026h56.22v60c0 6.627-5.373 12-12 12Z"),
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
