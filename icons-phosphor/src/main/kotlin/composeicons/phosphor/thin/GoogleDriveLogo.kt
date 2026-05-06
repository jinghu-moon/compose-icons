package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorThinIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.19 145.86 165.74 33.64C163.555 30.122 159.702 27.987 155.56 28h-55.13c-4.139-.011-7.988 2.123-10.17 5.64h0L21.83 145.82c-2.346 3.747-2.443 8.481-.25 12.32L48.91 206c2.147 3.718 6.116 6.006 10.41 6h137.35c4.297 .01 8.271-2.279 10.42-6l27.32-47.81c2.206-3.836 2.121-8.575-.22-12.33ZM226.13 148h-55.87L132.66 85.33 160.05 39.68ZM95.06 148 128 93.11 160.93 148ZM165.73 156l28.8 48h-133.06L90.26 156ZM128 77.56 103.06 36h49.87ZM95.94 39.68l27.39 45.65L85.74 148h-55.87ZM29.58 156h51.36L54.63 199.85ZM201.37 199.85 175.06 156h51.36Z"),
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
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
