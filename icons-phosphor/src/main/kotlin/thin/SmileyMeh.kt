package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyMeh: ImageVector
    get() {
        if (_smileyMeh != null) return _smileyMeh!!
        _smileyMeh = phosphorThinIcon(
            name = "SmileyMeh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 128.000 220.000 C 77.190 220.000 36.000 178.810 36.000 128.000 C 36.000 77.190 77.190 36.000 128.000 36.000 C 178.810 36.000 220.000 77.190 220.000 128.000 C 219.945 178.787 178.787 219.945 128.000 220.000 ZM 172.000 160.000 C 172.000 162.209 170.209 164.000 168.000 164.000 L 88.000 164.000 C 85.791 164.000 84.000 162.209 84.000 160.000 C 84.000 157.791 85.791 156.000 88.000 156.000 L 168.000 156.000 C 170.209 156.000 172.000 157.791 172.000 160.000 ZM 84.000 108.000 C 84.000 103.582 87.582 100.000 92.000 100.000 C 96.418 100.000 100.000 103.582 100.000 108.000 C 100.000 112.418 96.418 116.000 92.000 116.000 C 87.582 116.000 84.000 112.418 84.000 108.000 ZM 172.000 108.000 C 172.000 112.418 168.418 116.000 164.000 116.000 C 159.582 116.000 156.000 112.418 156.000 108.000 C 156.000 103.582 159.582 100.000 164.000 100.000 C 168.418 100.000 172.000 103.582 172.000 108.000 Z"),
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
        return _smileyMeh!!
    }

private var _smileyMeh: ImageVector? = null
