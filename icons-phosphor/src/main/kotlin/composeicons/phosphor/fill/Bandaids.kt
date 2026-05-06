package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorFillIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 116c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM212.28 155.72c10.398 10.043 14.569 24.915 10.908 38.9-3.661 13.985-14.582 24.907-28.568 28.568-13.985 3.661-28.857-.51-38.9-10.908L128 184.57l-27.72 27.71C90.237 222.678 75.365 226.849 61.38 223.188 47.395 219.527 36.473 208.605 32.812 194.62c-3.661-13.985 .51-28.857 10.908-38.9L71.43 128 43.72 100.28C33.322 90.237 29.151 75.365 32.812 61.38 36.473 47.395 47.395 36.473 61.38 32.812c13.985-3.661 28.857 .51 38.9 10.908L128 71.43 155.72 43.72C165.763 33.322 180.635 29.151 194.62 32.812c13.985 3.661 24.907 14.582 28.568 28.568 3.661 13.985-.51 28.857-10.908 38.9L184.57 128ZM116.69 173.25 82.75 139.31 55 167c-9.389 9.389-9.389 24.611 0 34 9.389 9.389 24.611 9.389 34 0ZM161.94 128 128 94.06 94.06 128 128 161.94ZM200.94 89c9.389-9.372 9.402-24.581 .03-33.97C191.598 45.641 176.389 45.628 167 55L139.31 82.75l33.94 33.94Z"),
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
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
