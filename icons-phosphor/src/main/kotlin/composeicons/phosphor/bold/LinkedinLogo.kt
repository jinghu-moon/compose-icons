package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorBoldIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 20h-176C28.954 20 20 28.954 20 40v176c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-176C236 28.954 227.046 20 216 20ZM212 212h-168v-168h168ZM112 176v-56c.005-5.112 3.247-9.659 8.078-11.33 4.831-1.67 10.19-.097 13.352 3.92 12.396-6.498 27.288-6.043 39.265 1.198 11.977 7.241 19.299 20.216 19.305 34.212v28c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-28c0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16v28c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM96 120v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-56c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM68 80C68 71.163 75.163 64 84 64c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16C75.163 96 68 88.837 68 80Z"),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
