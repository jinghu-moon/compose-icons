package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MemberOf: ImageVector
    get() {
        if (_memberOf != null) return _memberOf!!
        _memberOf = phosphorFillIcon(
            name = "MemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM176 120c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-95.32c3.93 23.077 23.911 39.967 47.32 40h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48C92.654 192 64 163.346 64 128 64 92.654 92.654 64 128 64h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-23.409 .033-43.39 16.923-47.32 40Z"),
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
        return _memberOf!!
    }

private var _memberOf: ImageVector? = null
