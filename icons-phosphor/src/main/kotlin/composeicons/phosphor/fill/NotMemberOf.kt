package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotMemberOf: ImageVector
    get() {
        if (_notMemberOf != null) return _notMemberOf!!
        _notMemberOf = phosphorFillIcon(
            name = "NotMemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM190 69.27 145.63 120h30.37c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-44.37l-28.76 32.87c7.55 4.668 16.253 7.137 25.13 7.13h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-12.76 .004-25.226-3.828-35.78-11L78 197.27c-2.978 3.008-7.784 3.176-10.965 .383C63.855 194.859 63.401 190.071 66 186.73L80.21 170.49C63.491 151.658 59.37 124.771 69.68 101.796 79.991 78.821 102.817 64.028 128 64h45.37L178 58.73c1.825-2.346 4.8-3.487 7.725-2.963 2.925 .524 5.319 2.627 6.216 5.46 .897 2.833 .149 5.931-1.941 8.043ZM128 80h31.37l-35 40h-43.69C84.61 96.923 104.591 80.033 128 80ZM80.68 136h29.69L90.84 158.32C85.569 151.891 82.067 144.197 80.68 136Z"),
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
        return _notMemberOf!!
    }

private var _notMemberOf: ImageVector? = null
