package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorThinIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 152.000 C 100.000 154.209 98.209 156.000 96.000 156.000 L 56.000 156.000 C 53.791 156.000 52.000 154.209 52.000 152.000 C 52.000 149.791 53.791 148.000 56.000 148.000 L 96.000 148.000 C 98.209 148.000 100.000 149.791 100.000 152.000 ZM 236.000 116.000 L 236.000 176.000 C 236.000 182.627 230.627 188.000 224.000 188.000 L 132.000 188.000 L 132.000 224.000 C 132.000 226.209 130.209 228.000 128.000 228.000 C 125.791 228.000 124.000 226.209 124.000 224.000 L 124.000 188.000 L 32.000 188.000 C 25.373 188.000 20.000 182.627 20.000 176.000 L 20.000 116.000 C 20.033 85.086 45.086 60.033 76.000 60.000 L 156.000 60.000 L 156.000 24.000 C 156.000 21.791 157.791 20.000 160.000 20.000 L 192.000 20.000 C 194.209 20.000 196.000 21.791 196.000 24.000 C 196.000 26.209 194.209 28.000 192.000 28.000 L 164.000 28.000 L 164.000 60.000 L 180.000 60.000 C 210.914 60.033 235.967 85.086 236.000 116.000 ZM 124.000 180.000 L 124.000 116.000 C 124.000 89.490 102.510 68.000 76.000 68.000 C 49.490 68.000 28.000 89.490 28.000 116.000 L 28.000 176.000 C 28.000 178.209 29.791 180.000 32.000 180.000 ZM 228.000 116.000 C 227.972 89.502 206.498 68.028 180.000 68.000 L 164.000 68.000 L 164.000 144.000 C 164.000 146.209 162.209 148.000 160.000 148.000 C 157.791 148.000 156.000 146.209 156.000 144.000 L 156.000 68.000 L 104.820 68.000 C 121.678 78.119 131.995 96.338 132.000 116.000 L 132.000 180.000 L 224.000 180.000 C 226.209 180.000 228.000 178.209 228.000 176.000 Z"),
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
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
