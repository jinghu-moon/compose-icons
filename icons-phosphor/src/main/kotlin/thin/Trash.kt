package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Trash: ImageVector
    get() {
        if (_trash != null) return _trash!!
        _trash = phosphorThinIcon(
            name = "Trash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 52.000 L 172.000 52.000 L 172.000 40.000 C 172.000 28.954 163.046 20.000 152.000 20.000 L 104.000 20.000 C 92.954 20.000 84.000 28.954 84.000 40.000 L 84.000 52.000 L 40.000 52.000 C 37.791 52.000 36.000 53.791 36.000 56.000 C 36.000 58.209 37.791 60.000 40.000 60.000 L 52.000 60.000 L 52.000 208.000 C 52.000 214.627 57.373 220.000 64.000 220.000 L 192.000 220.000 C 198.627 220.000 204.000 214.627 204.000 208.000 L 204.000 60.000 L 216.000 60.000 C 218.209 60.000 220.000 58.209 220.000 56.000 C 220.000 53.791 218.209 52.000 216.000 52.000 ZM 92.000 40.000 C 92.000 33.373 97.373 28.000 104.000 28.000 L 152.000 28.000 C 158.627 28.000 164.000 33.373 164.000 40.000 L 164.000 52.000 L 92.000 52.000 ZM 196.000 208.000 C 196.000 210.209 194.209 212.000 192.000 212.000 L 64.000 212.000 C 61.791 212.000 60.000 210.209 60.000 208.000 L 60.000 60.000 L 196.000 60.000 ZM 108.000 104.000 L 108.000 168.000 C 108.000 170.209 106.209 172.000 104.000 172.000 C 101.791 172.000 100.000 170.209 100.000 168.000 L 100.000 104.000 C 100.000 101.791 101.791 100.000 104.000 100.000 C 106.209 100.000 108.000 101.791 108.000 104.000 ZM 156.000 104.000 L 156.000 168.000 C 156.000 170.209 154.209 172.000 152.000 172.000 C 149.791 172.000 148.000 170.209 148.000 168.000 L 148.000 104.000 C 148.000 101.791 149.791 100.000 152.000 100.000 C 154.209 100.000 156.000 101.791 156.000 104.000 Z"),
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
        return _trash!!
    }

private var _trash: ImageVector? = null
