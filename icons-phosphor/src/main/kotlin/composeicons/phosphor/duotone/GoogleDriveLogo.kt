package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorDuotoneIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 152h64L55.12 206.8c-1.134-.689-2.076-1.652-2.74-2.8L25.05 156.15C24.33 154.888 23.967 153.453 24 152ZM168 152l32.88 54.8c1.137-.697 2.08-1.671 2.74-2.83l27.32-47.82c.724-1.261 1.09-2.696 1.06-4.15ZM100.43 32c-1.343 .008-2.663 .352-3.84 1L128 85.33 159.41 33c-1.18-.649-2.503-.993-3.85-1Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M237.6 143.78 169.13 31.52C166.218 26.828 161.082 23.982 155.56 24h-55.13c-5.519-.018-10.653 2.828-13.56 7.52l-.05 .07L18.44 143.7c-3.125 4.995-3.252 11.303-.33 16.42l27.32 47.82c2.849 4.984 8.149 8.06 13.89 8.06h137.35c5.741-0 11.041-3.076 13.89-8.06l27.32-47.82c2.925-5.082 2.817-11.361-.28-16.34ZM219 144h-46.48L137.33 85.33 160.08 47.41ZM102.13 144 128 100.88 153.87 144ZM163.47 160l24 40h-118.94l24-40ZM128 69.78 110.12 40l35.78-.05ZM95.91 47.41l22.76 37.92L83.47 144h-46.47ZM36.54 160h37.33L54.72 191.92ZM201.28 191.93 182.12 160h37.41Z"),
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
