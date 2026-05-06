package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ShirtFolded: ImageVector
    get() {
        if (_shirtFolded != null) return _shirtFolded!!
        _shirtFolded = phosphorRegularIcon(
            name = "ShirtFolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 40h-20.69L165.66 26.34h0C164.158 24.84 162.122 23.998 160 24h-64c-2.122-.002-4.158 .84-5.66 2.34h0L76.69 40h-20.69C47.163 40 40 47.163 40 56v152c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-152c0-8.837-7.163-16-16-16ZM128 65.58 111 40h34.1ZM161.24 44.58 168 51.31v52.69L138.57 78.56ZM88 51.31l6.76-6.75 22.67 34L88 104ZM56 56h16v48c-.038 6.219 3.563 11.885 9.21 14.49 2.126 .992 4.444 1.507 6.79 1.51 3.733-.007 7.344-1.327 10.2-3.73 .041-.028 .078-.062 .11-.1L120 97.48v110.52h-64ZM200 208h-64v-110.52l21.65 18.7c.032 .038 .069 .072 .11 .1 2.868 2.408 6.495 3.725 10.24 3.72 2.362-.006 4.694-.532 6.83-1.54 5.621-2.612 9.204-8.262 9.17-14.46v-48h16Z"),
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
        return _shirtFolded!!
    }

private var _shirtFolded: ImageVector? = null
