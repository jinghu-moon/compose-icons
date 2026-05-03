package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Faders: ImageVector
    get() {
        if (_faders != null) return _faders!!
        _faders = phosphorThinIcon(
            name = "Faders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 132.000 120.000 L 132.000 216.000 C 132.000 218.209 130.209 220.000 128.000 220.000 C 125.791 220.000 124.000 218.209 124.000 216.000 L 124.000 120.000 C 124.000 117.791 125.791 116.000 128.000 116.000 C 130.209 116.000 132.000 117.791 132.000 120.000 ZM 200.000 196.000 C 197.791 196.000 196.000 197.791 196.000 200.000 L 196.000 216.000 C 196.000 218.209 197.791 220.000 200.000 220.000 C 202.209 220.000 204.000 218.209 204.000 216.000 L 204.000 200.000 C 204.000 197.791 202.209 196.000 200.000 196.000 ZM 224.000 164.000 L 204.000 164.000 L 204.000 40.000 C 204.000 37.791 202.209 36.000 200.000 36.000 C 197.791 36.000 196.000 37.791 196.000 40.000 L 196.000 164.000 L 176.000 164.000 C 173.791 164.000 172.000 165.791 172.000 168.000 C 172.000 170.209 173.791 172.000 176.000 172.000 L 224.000 172.000 C 226.209 172.000 228.000 170.209 228.000 168.000 C 228.000 165.791 226.209 164.000 224.000 164.000 ZM 56.000 164.000 C 53.791 164.000 52.000 165.791 52.000 168.000 L 52.000 216.000 C 52.000 218.209 53.791 220.000 56.000 220.000 C 58.209 220.000 60.000 218.209 60.000 216.000 L 60.000 168.000 C 60.000 165.791 58.209 164.000 56.000 164.000 ZM 80.000 132.000 L 60.000 132.000 L 60.000 40.000 C 60.000 37.791 58.209 36.000 56.000 36.000 C 53.791 36.000 52.000 37.791 52.000 40.000 L 52.000 132.000 L 32.000 132.000 C 29.791 132.000 28.000 133.791 28.000 136.000 C 28.000 138.209 29.791 140.000 32.000 140.000 L 80.000 140.000 C 82.209 140.000 84.000 138.209 84.000 136.000 C 84.000 133.791 82.209 132.000 80.000 132.000 ZM 152.000 84.000 L 132.000 84.000 L 132.000 40.000 C 132.000 37.791 130.209 36.000 128.000 36.000 C 125.791 36.000 124.000 37.791 124.000 40.000 L 124.000 84.000 L 104.000 84.000 C 101.791 84.000 100.000 85.791 100.000 88.000 C 100.000 90.209 101.791 92.000 104.000 92.000 L 152.000 92.000 C 154.209 92.000 156.000 90.209 156.000 88.000 C 156.000 85.791 154.209 84.000 152.000 84.000 Z"),
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
        return _faders!!
    }

private var _faders: ImageVector? = null
