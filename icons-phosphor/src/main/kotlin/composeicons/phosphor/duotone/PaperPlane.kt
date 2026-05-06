package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorDuotoneIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.28 215.51 128 184 34.72 215.51c-3.14 1.12-6.645 .176-8.798-2.371-2.152-2.546-2.5-6.16-.872-9.069L120.9 36.07c1.409-2.547 4.09-4.127 7-4.127 2.91 0 5.591 1.58 7 4.127l96.09 168c1.641 2.917 1.293 6.548-.873 9.1-2.166 2.552-5.692 3.486-8.837 2.34Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M237.9 200.1 141.85 32.18c-2.834-5.038-8.165-8.155-13.945-8.155-5.78 0-11.111 3.118-13.945 8.155L18.07 200.18c-3.255 5.806-2.576 13.022 1.707 18.118 4.282 5.096 11.273 7.009 17.553 4.802L128 192.45l90.67 30.63c1.713 .603 3.514 .914 5.33 .92 5.686-.019 10.935-3.054 13.787-7.973 2.853-4.919 2.88-10.982 .073-15.927ZM223.85 207.94 136 178.26v-58.26c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v58.26L32.16 207.94 32 208 127.86 40 224 208Z"),
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
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
