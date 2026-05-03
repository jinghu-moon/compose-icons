package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorBoldIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 20.000 L 168.000 20.000 C 161.373 20.000 156.000 25.373 156.000 32.000 C 156.000 38.627 161.373 44.000 168.000 44.000 L 179.000 44.000 L 163.360 59.670 C 141.413 41.432 110.413 38.837 85.739 53.173 C 61.065 67.508 47.967 95.724 52.941 123.823 C 57.915 151.922 79.904 173.926 108.000 178.920 L 108.000 192.000 L 88.000 192.000 C 81.373 192.000 76.000 197.373 76.000 204.000 C 76.000 210.627 81.373 216.000 88.000 216.000 L 108.000 216.000 L 108.000 232.000 C 108.000 238.627 113.373 244.000 120.000 244.000 C 126.627 244.000 132.000 238.627 132.000 232.000 L 132.000 216.000 L 152.000 216.000 C 158.627 216.000 164.000 210.627 164.000 204.000 C 164.000 197.373 158.627 192.000 152.000 192.000 L 132.000 192.000 L 132.000 178.920 C 153.795 175.032 172.329 160.767 181.665 140.693 C 191.002 120.618 189.970 97.253 178.900 78.080 L 196.000 61.000 L 196.000 72.000 C 196.000 78.627 201.373 84.000 208.000 84.000 C 214.627 84.000 220.000 78.627 220.000 72.000 L 220.000 32.000 C 220.000 25.373 214.627 20.000 208.000 20.000 ZM 120.000 156.000 C 95.699 156.000 76.000 136.301 76.000 112.000 C 76.000 87.699 95.699 68.000 120.000 68.000 C 144.301 68.000 164.000 87.699 164.000 112.000 C 163.972 136.289 144.289 155.972 120.000 156.000 Z"),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
