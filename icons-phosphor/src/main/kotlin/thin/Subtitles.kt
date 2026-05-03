package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Subtitles: ImageVector
    get() {
        if (_subtitles != null) return _subtitles!!
        _subtitles = phosphorThinIcon(
            name = "Subtitles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 ZM 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 L 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 ZM 52.000 136.000 C 52.000 133.791 53.791 132.000 56.000 132.000 L 72.000 132.000 C 74.209 132.000 76.000 133.791 76.000 136.000 C 76.000 138.209 74.209 140.000 72.000 140.000 L 56.000 140.000 C 53.791 140.000 52.000 138.209 52.000 136.000 ZM 204.000 136.000 C 204.000 138.209 202.209 140.000 200.000 140.000 L 104.000 140.000 C 101.791 140.000 100.000 138.209 100.000 136.000 C 100.000 133.791 101.791 132.000 104.000 132.000 L 200.000 132.000 C 202.209 132.000 204.000 133.791 204.000 136.000 ZM 156.000 168.000 C 156.000 170.209 154.209 172.000 152.000 172.000 L 56.000 172.000 C 53.791 172.000 52.000 170.209 52.000 168.000 C 52.000 165.791 53.791 164.000 56.000 164.000 L 152.000 164.000 C 154.209 164.000 156.000 165.791 156.000 168.000 ZM 204.000 168.000 C 204.000 170.209 202.209 172.000 200.000 172.000 L 184.000 172.000 C 181.791 172.000 180.000 170.209 180.000 168.000 C 180.000 165.791 181.791 164.000 184.000 164.000 L 200.000 164.000 C 202.209 164.000 204.000 165.791 204.000 168.000 Z"),
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
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
