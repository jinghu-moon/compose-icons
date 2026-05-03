package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Newspaper: ImageVector
    get() {
        if (_newspaper != null) return _newspaper!!
        _newspaper = phosphorThinIcon(
            name = "Newspaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.000 112.000 C 180.000 114.209 178.209 116.000 176.000 116.000 L 96.000 116.000 C 93.791 116.000 92.000 114.209 92.000 112.000 C 92.000 109.791 93.791 108.000 96.000 108.000 L 176.000 108.000 C 178.209 108.000 180.000 109.791 180.000 112.000 ZM 176.000 140.000 L 96.000 140.000 C 93.791 140.000 92.000 141.791 92.000 144.000 C 92.000 146.209 93.791 148.000 96.000 148.000 L 176.000 148.000 C 178.209 148.000 180.000 146.209 180.000 144.000 C 180.000 141.791 178.209 140.000 176.000 140.000 ZM 228.000 64.000 L 228.000 184.000 C 228.000 195.046 219.046 204.000 208.000 204.000 L 32.000 204.000 C 20.985 204.000 12.044 195.094 12.000 184.080 L 12.000 88.000 C 12.000 85.791 13.791 84.000 16.000 84.000 C 18.209 84.000 20.000 85.791 20.000 88.000 L 20.000 184.000 C 20.000 190.627 25.373 196.000 32.000 196.000 C 38.627 196.000 44.000 190.627 44.000 184.000 L 44.000 64.000 C 44.000 57.373 49.373 52.000 56.000 52.000 L 216.000 52.000 C 222.627 52.000 228.000 57.373 228.000 64.000 ZM 220.000 64.000 C 220.000 61.791 218.209 60.000 216.000 60.000 L 56.000 60.000 C 53.791 60.000 52.000 61.791 52.000 64.000 L 52.000 184.000 C 52.010 188.329 50.606 192.543 48.000 196.000 L 208.000 196.000 C 214.627 196.000 220.000 190.627 220.000 184.000 Z"),
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
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
