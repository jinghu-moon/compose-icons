package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorThinIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 112c0 21.53-7.5 41.18-21.12 55.34C186.26 180.47 169.17 188 152 188c-21.35 0-33.52-8.76-39.76-15.57L99.89 224.92c-.426 1.804-2.036 3.079-3.89 3.08-.31-.003-.618-.04-.92-.11-1.037-.238-1.936-.879-2.499-1.782-.563-.903-.743-1.992-.501-3.028l32-136c.572-2.075 2.683-3.325 4.777-2.83 2.094 .495 3.421 2.559 3.003 4.67l-17.28 73.45C117 166.42 127 180 152 180c29.49 0 60-25.44 60-68C211.991 80.055 192.007 51.526 161.988 40.602 131.969 29.679 98.323 38.693 77.786 63.162 57.25 87.631 54.206 122.33 70.17 150c1.105 1.914 .449 4.36-1.465 5.465-1.914 1.105-4.36 .449-5.465-1.465C45.597 123.417 48.961 85.066 71.659 58.022 94.357 30.978 131.544 21.014 164.723 33.088 197.902 45.161 219.99 76.693 220 112Z"),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
