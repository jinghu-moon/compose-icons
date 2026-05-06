package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorThinIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M148 56v120c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-56h-96v56c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-120c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v56h96v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM240 204h-40l38.36-51.15c6.627-8.812 7.467-20.692 2.144-30.348-5.323-9.656-15.817-15.289-26.806-14.389-10.989 .9-20.427 8.164-24.108 18.557-.532 1.361-.28 2.904 .658 4.024 .938 1.121 2.412 1.641 3.845 1.357 1.433-.284 2.598-1.327 3.037-2.721 .686-1.91 1.653-3.706 2.87-5.33 6.627-8.837 19.163-10.627 28-4 8.837 6.627 10.627 19.163 4 28l-43.2 57.6c-.909 1.212-1.055 2.834-.378 4.189 .678 1.355 2.063 2.211 3.578 2.211h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
