package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorFillIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.6 143.78 169.13 31.52C166.218 26.828 161.082 23.982 155.56 24h-55.13c-5.519-.018-10.653 2.828-13.56 7.52l-.05 .07L18.44 143.7c-3.125 4.995-3.252 11.303-.33 16.42l27.32 47.82c2.849 4.984 8.149 8.06 13.89 8.06h137.35c5.741-0 11.041-3.076 13.89-8.06l27.32-47.82c2.925-5.082 2.817-11.361-.28-16.34ZM219 144h-46.48L137.33 85.33 160.08 47.41ZM92.53 160h70.94l24 40h-118.94ZM102.13 144 128 100.88 153.87 144ZM95.91 47.41l22.76 37.92L83.47 144h-46.47Z"),
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
