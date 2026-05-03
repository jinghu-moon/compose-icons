package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Blueprint: ImageVector
    get() {
        if (_blueprint != null) return _blueprint!!
        _blueprint = phosphorThinIcon(
            name = "Blueprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 60.000 L 68.000 60.000 L 68.000 40.000 C 68.000 37.791 66.209 36.000 64.000 36.000 L 48.000 36.000 C 32.536 36.000 20.000 48.536 20.000 64.000 L 20.000 176.000 C 20.000 191.464 32.536 204.000 48.000 204.000 L 232.000 204.000 C 234.209 204.000 236.000 202.209 236.000 200.000 L 236.000 64.000 C 236.000 61.791 234.209 60.000 232.000 60.000 ZM 28.000 64.000 C 28.000 52.954 36.954 44.000 48.000 44.000 L 60.000 44.000 L 60.000 148.000 L 48.000 148.000 C 40.471 147.997 33.260 151.033 28.000 156.420 ZM 228.000 196.000 L 48.000 196.000 C 36.954 196.000 28.000 187.046 28.000 176.000 C 28.000 164.954 36.954 156.000 48.000 156.000 L 64.000 156.000 C 66.209 156.000 68.000 154.209 68.000 152.000 L 68.000 68.000 L 228.000 68.000 ZM 104.000 140.000 C 101.791 140.000 100.000 141.791 100.000 144.000 C 100.000 146.209 101.791 148.000 104.000 148.000 L 124.000 148.000 L 124.000 160.000 C 124.000 162.209 125.791 164.000 128.000 164.000 C 130.209 164.000 132.000 162.209 132.000 160.000 L 132.000 148.000 L 164.000 148.000 L 164.000 160.000 C 164.000 162.209 165.791 164.000 168.000 164.000 C 170.209 164.000 172.000 162.209 172.000 160.000 L 172.000 148.000 L 192.000 148.000 C 194.209 148.000 196.000 146.209 196.000 144.000 C 196.000 141.791 194.209 140.000 192.000 140.000 L 172.000 140.000 L 172.000 116.000 L 192.000 116.000 C 194.209 116.000 196.000 114.209 196.000 112.000 C 196.000 109.791 194.209 108.000 192.000 108.000 L 172.000 108.000 L 172.000 96.000 C 172.000 93.791 170.209 92.000 168.000 92.000 C 165.791 92.000 164.000 93.791 164.000 96.000 L 164.000 108.000 L 132.000 108.000 L 132.000 96.000 C 132.000 93.791 130.209 92.000 128.000 92.000 C 125.791 92.000 124.000 93.791 124.000 96.000 L 124.000 108.000 L 104.000 108.000 C 101.791 108.000 100.000 109.791 100.000 112.000 C 100.000 114.209 101.791 116.000 104.000 116.000 L 124.000 116.000 L 124.000 140.000 ZM 132.000 116.000 L 164.000 116.000 L 164.000 140.000 L 132.000 140.000 Z"),
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
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
