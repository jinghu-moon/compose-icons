package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorThinIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 36c33.679 .023 64.658 18.431 80.78 48h-80.78c-22.781 .028-41.782 17.42-43.82 40.11L54.51 72.72C71.868 49.603 99.091 36 128 36ZM128 164C108.118 164 92 147.882 92 128c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM36 128C35.983 111.075 40.66 94.477 49.51 80.05L89.9 150c0 .09 .11 .17 .17 .26 11.453 19.569 35.918 27.207 56.47 17.63l-29.7 51.43C70.718 213.625 36.058 174.472 36 128ZM128 220c-.77 0-1.53 0-2.29 0l40.39-70c.036-.064 .066-.131 .09-.2C177.487 130.088 171.873 105.014 153.25 92h59.41c12.083 28.416 9.105 60.998-7.93 86.753C187.696 204.507 158.878 219.999 128 220Z"),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
