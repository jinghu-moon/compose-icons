package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AppleLogo: ImageVector
    get() {
        if (_appleLogo != null) return _appleLogo!!
        _appleLogo = phosphorLightIcon(
            name = "AppleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.4 167.84C201.71 155.69 198 135.12 198 120c0-18.42 13.86-34.29 22.12-42.12 1.196-1.133 1.873-2.708 1.873-4.355 0-1.647-.677-3.222-1.873-4.355C208 57.7 187.07 50 168 50c-14.3 .013-28.255 4.392-40 12.55C100.23 43.151 62.527 46.562 38.69 70.63 24.944 84.68 17.479 103.701 18 123.35c.795 33.554 15.039 65.381 39.53 88.33 7.048 6.651 16.379 10.344 26.07 10.32h87.7c10.488 .035 20.52-4.286 27.7-11.93 6.812-7.321 12.702-15.448 17.54-24.2 6.55-12 5.77-13.75 5-15.48-.462-1.033-1.203-1.916-2.14-2.55ZM190.17 201.84c-4.889 5.215-11.722 8.169-18.87 8.16h-87.7c-6.617 .033-12.995-2.472-17.82-7C43.597 182.218 30.703 153.389 30 123 29.542 106.608 35.752 90.731 47.21 79 57.956 68.062 72.666 61.931 88 62h.81c12.907 .128 25.394 4.606 35.44 12.71 2.192 1.755 5.308 1.755 7.5 0C142.015 66.435 154.815 61.947 168 62c13.89 0 28.81 4.68 39.11 12-9.44 10.14-21.1 26.59-21.1 46 0 23.78 7.81 42.6 22.66 54.77-4.739 9.935-10.979 19.082-18.5 27.12ZM130.17 30.45C134.525 13.679 149.673 1.977 167 2h1c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-1c-11.858-.003-22.215 8.018-25.18 19.5-.828 3.209-4.101 5.138-7.31 4.31-3.209-.828-5.138-4.101-4.31-7.31Z"),
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
        return _appleLogo!!
    }

private var _appleLogo: ImageVector? = null
