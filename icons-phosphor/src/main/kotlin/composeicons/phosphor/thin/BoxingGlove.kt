package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorThinIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 20h-48C91.295 20.033 68.033 43.295 68 72v4h-12C40.536 76 28 88.536 28 104v29.19c-.001 2.726 .927 5.371 2.63 7.5 .1 .12 .2 .24 .31 .35L68 177.67v38.33c0 6.627 5.373 12 12 12h112c6.627 0 12-5.373 12-12v-39.44l15.54-54.38c.302-1.074 .457-2.184 .46-3.3v-46.88C219.967 43.295 196.705 20.033 168 20ZM212 118.88c-0 .372-.05 .742-.15 1.1l-15.7 54.92c-.1 .358-.15 .728-.15 1.1v40c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4v-40c-.002-1.068-.43-2.09-1.19-2.84L36.76 135.54c-.495-.684-.761-1.506-.76-2.35v-29.19C36 92.954 44.954 84 56 84h12v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-32C76.028 47.711 95.711 28.028 120 28h48c24.289 .028 43.972 19.711 44 44ZM169.79 163.58 145 176l24.84 12.42c1.977 .989 2.779 3.393 1.79 5.37-.989 1.977-3.393 2.779-5.37 1.79L136 180.47l-30.21 15.11c-1.977 .989-4.381 .187-5.37-1.79-.989-1.977-.187-4.381 1.79-5.37L127.05 176 102.21 163.58c-1.977-.989-2.779-3.393-1.79-5.37 .989-1.977 3.393-2.779 5.37-1.79L136 171.53l30.21-15.11c1.977-.989 4.381-.187 5.37 1.79 .989 1.977 .187 4.381-1.79 5.37Z"),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
