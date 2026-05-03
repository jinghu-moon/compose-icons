package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GridNine: ImageVector
    get() {
        if (_gridNine != null) return _gridNine!!
        _gridNine = phosphorFillIcon(
            name = "GridNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 84.000 52.000 L 84.000 92.000 L 28.000 92.000 C 25.791 92.000 24.000 90.209 24.000 88.000 L 24.000 64.000 C 24.000 55.163 31.163 48.000 40.000 48.000 L 80.000 48.000 C 82.209 48.000 84.000 49.791 84.000 52.000 ZM 100.000 204.000 C 100.000 206.209 101.791 208.000 104.000 208.000 L 152.000 208.000 C 154.209 208.000 156.000 206.209 156.000 204.000 L 156.000 164.000 L 100.000 164.000 ZM 24.000 168.000 L 24.000 192.000 C 24.000 200.837 31.163 208.000 40.000 208.000 L 80.000 208.000 C 82.209 208.000 84.000 206.209 84.000 204.000 L 84.000 164.000 L 28.000 164.000 C 25.791 164.000 24.000 165.791 24.000 168.000 ZM 24.000 112.000 L 24.000 144.000 C 24.000 146.209 25.791 148.000 28.000 148.000 L 84.000 148.000 L 84.000 108.000 L 28.000 108.000 C 25.791 108.000 24.000 109.791 24.000 112.000 ZM 152.000 48.000 L 104.000 48.000 C 101.791 48.000 100.000 49.791 100.000 52.000 L 100.000 92.000 L 156.000 92.000 L 156.000 52.000 C 156.000 49.791 154.209 48.000 152.000 48.000 ZM 228.000 108.000 L 172.000 108.000 L 172.000 148.000 L 228.000 148.000 C 230.209 148.000 232.000 146.209 232.000 144.000 L 232.000 112.000 C 232.000 109.791 230.209 108.000 228.000 108.000 ZM 100.000 148.000 L 156.000 148.000 L 156.000 108.000 L 100.000 108.000 ZM 216.000 48.000 L 176.000 48.000 C 173.791 48.000 172.000 49.791 172.000 52.000 L 172.000 92.000 L 228.000 92.000 C 230.209 92.000 232.000 90.209 232.000 88.000 L 232.000 64.000 C 232.000 55.163 224.837 48.000 216.000 48.000 ZM 228.000 164.000 L 172.000 164.000 L 172.000 204.000 C 172.000 206.209 173.791 208.000 176.000 208.000 L 216.000 208.000 C 224.837 208.000 232.000 200.837 232.000 192.000 L 232.000 168.000 C 232.000 165.791 230.209 164.000 228.000 164.000 Z"),
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
        return _gridNine!!
    }

private var _gridNine: ImageVector? = null
