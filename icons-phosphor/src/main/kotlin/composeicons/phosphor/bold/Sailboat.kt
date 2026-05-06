package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorBoldIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M250.82 170.8C248.821 166.642 244.614 163.998 240 164h-92v-16h68c4.749-0 9.051-2.802 10.973-7.145 1.922-4.343 1.101-9.411-2.093-12.925L148 43.36v-31.36C147.997 6.957 144.842 2.454 140.103 .73 135.364-.995 130.053 .428 126.81 4.29L22.81 128.29c-2.995 3.572-3.65 8.556-1.68 12.781 1.97 4.225 6.209 6.927 10.87 6.929h92v16h-108c-4.614-.001-8.82 2.644-10.819 6.803-1.998 4.159-1.435 9.095 1.449 12.697l29.6 37c3.786 4.752 9.535 7.514 15.61 7.5h152.32c6.077 .011 11.826-2.754 15.61-7.51l29.6-37c2.881-3.6 3.445-8.533 1.45-12.69ZM188.87 124h-40.87v-45ZM57.73 124 124 45v79ZM202.23 204h-148.46L41 188h174Z"),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
