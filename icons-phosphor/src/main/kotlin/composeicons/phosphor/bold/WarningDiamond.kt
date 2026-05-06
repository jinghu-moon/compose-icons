package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WarningDiamond: ImageVector
    get() {
        if (_warningDiamond != null) return _warningDiamond!!
        _warningDiamond = phosphorBoldIcon(
            name = "WarningDiamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 68c6.627 0 12 5.373 12 12v52c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-52c0-6.627 5.373-12 12-12ZM128 156c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM244 128c.012 5.294-2.091 10.373-5.84 14.11l-96 96.06c-7.802 7.761-20.408 7.761-28.21 0h0L17.95 142.11c-7.768-7.803-7.768-20.417 0-28.22L114 17.83c7.802-7.761 20.408-7.761 28.21 0l96.06 96.06c3.709 3.755 5.771 8.832 5.73 14.11ZM218.32 128 128 37.67 37.68 128 128 218.33Z"),
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
        return _warningDiamond!!
    }

private var _warningDiamond: ImageVector? = null
