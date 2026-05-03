package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Network: ImageVector
    get() {
        if (_network != null) return _network!!
        _network = phosphorThinIcon(
            name = "Network",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 116.000 L 132.000 116.000 L 132.000 84.000 L 144.000 84.000 C 150.627 84.000 156.000 78.627 156.000 72.000 L 156.000 40.000 C 156.000 33.373 150.627 28.000 144.000 28.000 L 112.000 28.000 C 105.373 28.000 100.000 33.373 100.000 40.000 L 100.000 72.000 C 100.000 78.627 105.373 84.000 112.000 84.000 L 124.000 84.000 L 124.000 116.000 L 24.000 116.000 C 21.791 116.000 20.000 117.791 20.000 120.000 C 20.000 122.209 21.791 124.000 24.000 124.000 L 60.000 124.000 L 60.000 164.000 L 48.000 164.000 C 41.373 164.000 36.000 169.373 36.000 176.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 80.000 220.000 C 86.627 220.000 92.000 214.627 92.000 208.000 L 92.000 176.000 C 92.000 169.373 86.627 164.000 80.000 164.000 L 68.000 164.000 L 68.000 124.000 L 188.000 124.000 L 188.000 164.000 L 176.000 164.000 C 169.373 164.000 164.000 169.373 164.000 176.000 L 164.000 208.000 C 164.000 214.627 169.373 220.000 176.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 176.000 C 220.000 169.373 214.627 164.000 208.000 164.000 L 196.000 164.000 L 196.000 124.000 L 232.000 124.000 C 234.209 124.000 236.000 122.209 236.000 120.000 C 236.000 117.791 234.209 116.000 232.000 116.000 ZM 108.000 72.000 L 108.000 40.000 C 108.000 37.791 109.791 36.000 112.000 36.000 L 144.000 36.000 C 146.209 36.000 148.000 37.791 148.000 40.000 L 148.000 72.000 C 148.000 74.209 146.209 76.000 144.000 76.000 L 112.000 76.000 C 109.791 76.000 108.000 74.209 108.000 72.000 ZM 84.000 176.000 L 84.000 208.000 C 84.000 210.209 82.209 212.000 80.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 176.000 C 44.000 173.791 45.791 172.000 48.000 172.000 L 80.000 172.000 C 82.209 172.000 84.000 173.791 84.000 176.000 ZM 212.000 176.000 L 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 176.000 212.000 C 173.791 212.000 172.000 210.209 172.000 208.000 L 172.000 176.000 C 172.000 173.791 173.791 172.000 176.000 172.000 L 208.000 172.000 C 210.209 172.000 212.000 173.791 212.000 176.000 Z"),
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
        return _network!!
    }

private var _network: ImageVector? = null
