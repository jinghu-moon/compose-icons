package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LetterCircleP: ImageVector
    get() {
        if (_letterCircleP != null) return _letterCircleP!!
        _letterCircleP = phosphorThinIcon(
            name = "LetterCircleP",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 136.000 84.000 L 104.000 84.000 C 101.791 84.000 100.000 85.791 100.000 88.000 L 100.000 168.000 C 100.000 170.209 101.791 172.000 104.000 172.000 C 106.209 172.000 108.000 170.209 108.000 168.000 L 108.000 148.000 L 136.000 148.000 C 153.673 148.000 168.000 133.673 168.000 116.000 C 168.000 98.327 153.673 84.000 136.000 84.000 ZM 136.000 140.000 L 108.000 140.000 L 108.000 92.000 L 136.000 92.000 C 149.255 92.000 160.000 102.745 160.000 116.000 C 160.000 129.255 149.255 140.000 136.000 140.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _letterCircleP!!
    }

private var _letterCircleP: ImageVector? = null
