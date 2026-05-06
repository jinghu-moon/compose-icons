package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareDownLeft: ImageVector
    get() {
        if (_arrowSquareDownLeft != null) return _arrowSquareDownLeft!!
        _arrowSquareDownLeft = phosphorBoldIcon(
            name = "ArrowSquareDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 204h-152v-152h152ZM84 160v-48c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v19L151.51 87.48c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L125 148h19c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-48c-6.627 0-12-5.373-12-12Z"),
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
        return _arrowSquareDownLeft!!
    }

private var _arrowSquareDownLeft: ImageVector? = null
