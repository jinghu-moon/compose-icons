package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Notepad: ImageVector
    get() {
        if (_notepad != null) return _notepad!!
        _notepad = phosphorThinIcon(
            name = "Notepad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 128.000 C 164.000 130.209 162.209 132.000 160.000 132.000 L 96.000 132.000 C 93.791 132.000 92.000 130.209 92.000 128.000 C 92.000 125.791 93.791 124.000 96.000 124.000 L 160.000 124.000 C 162.209 124.000 164.000 125.791 164.000 128.000 ZM 160.000 156.000 L 96.000 156.000 C 93.791 156.000 92.000 157.791 92.000 160.000 C 92.000 162.209 93.791 164.000 96.000 164.000 L 160.000 164.000 C 162.209 164.000 164.000 162.209 164.000 160.000 C 164.000 157.791 162.209 156.000 160.000 156.000 ZM 212.000 40.000 L 212.000 200.000 C 212.000 215.464 199.464 228.000 184.000 228.000 L 72.000 228.000 C 56.536 228.000 44.000 215.464 44.000 200.000 L 44.000 40.000 C 44.000 37.791 45.791 36.000 48.000 36.000 L 76.000 36.000 L 76.000 24.000 C 76.000 21.791 77.791 20.000 80.000 20.000 C 82.209 20.000 84.000 21.791 84.000 24.000 L 84.000 36.000 L 124.000 36.000 L 124.000 24.000 C 124.000 21.791 125.791 20.000 128.000 20.000 C 130.209 20.000 132.000 21.791 132.000 24.000 L 132.000 36.000 L 172.000 36.000 L 172.000 24.000 C 172.000 21.791 173.791 20.000 176.000 20.000 C 178.209 20.000 180.000 21.791 180.000 24.000 L 180.000 36.000 L 208.000 36.000 C 210.209 36.000 212.000 37.791 212.000 40.000 ZM 204.000 44.000 L 180.000 44.000 L 180.000 56.000 C 180.000 58.209 178.209 60.000 176.000 60.000 C 173.791 60.000 172.000 58.209 172.000 56.000 L 172.000 44.000 L 132.000 44.000 L 132.000 56.000 C 132.000 58.209 130.209 60.000 128.000 60.000 C 125.791 60.000 124.000 58.209 124.000 56.000 L 124.000 44.000 L 84.000 44.000 L 84.000 56.000 C 84.000 58.209 82.209 60.000 80.000 60.000 C 77.791 60.000 76.000 58.209 76.000 56.000 L 76.000 44.000 L 52.000 44.000 L 52.000 200.000 C 52.000 211.046 60.954 220.000 72.000 220.000 L 184.000 220.000 C 195.046 220.000 204.000 211.046 204.000 200.000 Z"),
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
        return _notepad!!
    }

private var _notepad: ImageVector? = null
