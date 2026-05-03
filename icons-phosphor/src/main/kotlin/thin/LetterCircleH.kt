package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LetterCircleH: ImageVector
    get() {
        if (_letterCircleH != null) return _letterCircleH!!
        _letterCircleH = phosphorThinIcon(
            name = "LetterCircleH",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 164.000 88.000 L 164.000 168.000 C 164.000 170.209 162.209 172.000 160.000 172.000 C 157.791 172.000 156.000 170.209 156.000 168.000 L 156.000 132.000 L 100.000 132.000 L 100.000 168.000 C 100.000 170.209 98.209 172.000 96.000 172.000 C 93.791 172.000 92.000 170.209 92.000 168.000 L 92.000 88.000 C 92.000 85.791 93.791 84.000 96.000 84.000 C 98.209 84.000 100.000 85.791 100.000 88.000 L 100.000 124.000 L 156.000 124.000 L 156.000 88.000 C 156.000 85.791 157.791 84.000 160.000 84.000 C 162.209 84.000 164.000 85.791 164.000 88.000 Z"),
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
        return _letterCircleH!!
    }

private var _letterCircleH: ImageVector? = null
