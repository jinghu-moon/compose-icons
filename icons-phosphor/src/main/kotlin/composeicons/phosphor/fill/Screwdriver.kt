package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) return _screwdriver!!
        _screwdriver = phosphorFillIcon(
            name = "Screwdriver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.23 22.75C213.53 3.078 181.62 3.078 161.92 22.75L108.68 76c-3.002 2.993-4.687 7.06-4.68 11.3v16.7h-16.83c-3.485 .009-6.874 1.145-9.66 3.24-.289 .221-.563 .462-.82 .72l-8 8c-3.001 3.001-4.688 7.071-4.688 11.315 0 4.244 1.686 8.314 4.688 11.315l18.7 18.71L10.39 234.35c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0l77-77.06 18.71 18.71c6.248 6.243 16.372 6.243 22.62 0l8-8c.259-.26 .499-.537 .72-.83 2.107-2.78 3.249-6.172 3.25-9.66v-16.83h16.69c4.244 .008 8.314-1.685 11.3-4.7L233.23 94.07c9.458-9.458 14.771-22.285 14.771-35.66 0-13.375-5.313-26.202-14.771-35.66ZM205.66 61.64l-56 56c-3.123 3.126-8.189 3.128-11.315 .005-3.126-3.123-3.128-8.189-.005-11.315l56-56c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32Z"),
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
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
