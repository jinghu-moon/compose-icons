package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LockKey: ImageVector
    get() {
        if (_lockKey != null) return _lockKey!!
        _lockKey = phosphorThinIcon(
            name = "LockKey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 84.000 L 172.000 84.000 L 172.000 56.000 C 172.000 31.699 152.301 12.000 128.000 12.000 C 103.699 12.000 84.000 31.699 84.000 56.000 L 84.000 84.000 L 48.000 84.000 C 41.373 84.000 36.000 89.373 36.000 96.000 L 36.000 208.000 C 36.000 214.627 41.373 220.000 48.000 220.000 L 208.000 220.000 C 214.627 220.000 220.000 214.627 220.000 208.000 L 220.000 96.000 C 220.000 89.373 214.627 84.000 208.000 84.000 ZM 92.000 56.000 C 92.000 36.118 108.118 20.000 128.000 20.000 C 147.882 20.000 164.000 36.118 164.000 56.000 L 164.000 84.000 L 92.000 84.000 ZM 212.000 208.000 C 212.000 210.209 210.209 212.000 208.000 212.000 L 48.000 212.000 C 45.791 212.000 44.000 210.209 44.000 208.000 L 44.000 96.000 C 44.000 93.791 45.791 92.000 48.000 92.000 L 208.000 92.000 C 210.209 92.000 212.000 93.791 212.000 96.000 ZM 128.000 116.000 C 115.533 116.013 105.152 125.570 104.109 137.993 C 103.067 150.416 111.710 161.569 124.000 163.660 L 124.000 184.000 C 124.000 186.209 125.791 188.000 128.000 188.000 C 130.209 188.000 132.000 186.209 132.000 184.000 L 132.000 163.660 C 144.290 161.569 152.933 150.416 151.891 137.993 C 150.848 125.570 140.467 116.013 128.000 116.000 ZM 128.000 156.000 C 119.163 156.000 112.000 148.837 112.000 140.000 C 112.000 131.163 119.163 124.000 128.000 124.000 C 136.837 124.000 144.000 131.163 144.000 140.000 C 144.000 148.837 136.837 156.000 128.000 156.000 Z"),
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
        return _lockKey!!
    }

private var _lockKey: ImageVector? = null
