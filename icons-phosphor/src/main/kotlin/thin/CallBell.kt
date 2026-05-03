package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorThinIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 24.000 180.000 L 232.000 180.000 C 234.209 180.000 236.000 178.209 236.000 176.000 C 236.000 173.791 234.209 172.000 232.000 172.000 L 220.000 172.000 L 220.000 152.000 C 219.942 102.769 181.182 62.287 132.000 60.090 L 132.000 36.000 L 152.000 36.000 C 154.209 36.000 156.000 34.209 156.000 32.000 C 156.000 29.791 154.209 28.000 152.000 28.000 L 104.000 28.000 C 101.791 28.000 100.000 29.791 100.000 32.000 C 100.000 34.209 101.791 36.000 104.000 36.000 L 124.000 36.000 L 124.000 60.090 C 74.818 62.287 36.058 102.769 36.000 152.000 L 36.000 172.000 L 24.000 172.000 C 21.791 172.000 20.000 173.791 20.000 176.000 C 20.000 178.209 21.791 180.000 24.000 180.000 ZM 44.000 152.000 C 44.000 105.608 81.608 68.000 128.000 68.000 C 174.392 68.000 212.000 105.608 212.000 152.000 L 212.000 172.000 L 44.000 172.000 ZM 236.000 208.000 C 236.000 210.209 234.209 212.000 232.000 212.000 L 24.000 212.000 C 21.791 212.000 20.000 210.209 20.000 208.000 C 20.000 205.791 21.791 204.000 24.000 204.000 L 232.000 204.000 C 234.209 204.000 236.000 205.791 236.000 208.000 Z"),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
