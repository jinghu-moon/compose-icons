package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) return _newspaperClipping!!
        _newspaperClipping = phosphorThinIcon(
            name = "NewspaperClipping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 44.000 L 40.000 44.000 C 33.373 44.000 28.000 49.373 28.000 56.000 L 28.000 216.000 C 27.999 217.387 28.717 218.676 29.896 219.405 C 31.076 220.135 32.550 220.201 33.790 219.580 L 64.000 204.470 L 94.210 219.580 C 95.337 220.144 96.663 220.144 97.790 219.580 L 128.000 204.470 L 158.210 219.580 C 159.337 220.144 160.663 220.144 161.790 219.580 L 192.000 204.470 L 222.210 219.580 C 222.767 219.855 223.379 219.999 224.000 220.000 C 226.209 220.000 228.000 218.209 228.000 216.000 L 228.000 56.000 C 228.000 49.373 222.627 44.000 216.000 44.000 ZM 220.000 209.530 L 193.790 196.420 C 192.663 195.856 191.337 195.856 190.210 196.420 L 160.000 211.530 L 129.790 196.420 C 128.663 195.856 127.337 195.856 126.210 196.420 L 96.000 211.530 L 65.790 196.420 C 64.663 195.856 63.337 195.856 62.210 196.420 L 36.000 209.530 L 36.000 56.000 C 36.000 53.791 37.791 52.000 40.000 52.000 L 216.000 52.000 C 218.209 52.000 220.000 53.791 220.000 56.000 ZM 196.000 112.000 C 196.000 114.209 194.209 116.000 192.000 116.000 L 144.000 116.000 C 141.791 116.000 140.000 114.209 140.000 112.000 C 140.000 109.791 141.791 108.000 144.000 108.000 L 192.000 108.000 C 194.209 108.000 196.000 109.791 196.000 112.000 ZM 196.000 144.000 C 196.000 146.209 194.209 148.000 192.000 148.000 L 144.000 148.000 C 141.791 148.000 140.000 146.209 140.000 144.000 C 140.000 141.791 141.791 140.000 144.000 140.000 L 192.000 140.000 C 194.209 140.000 196.000 141.791 196.000 144.000 ZM 112.000 92.000 L 64.000 92.000 C 61.791 92.000 60.000 93.791 60.000 96.000 L 60.000 160.000 C 60.000 162.209 61.791 164.000 64.000 164.000 L 112.000 164.000 C 114.209 164.000 116.000 162.209 116.000 160.000 L 116.000 96.000 C 116.000 93.791 114.209 92.000 112.000 92.000 ZM 108.000 156.000 L 68.000 156.000 L 68.000 100.000 L 108.000 100.000 Z"),
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
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null
