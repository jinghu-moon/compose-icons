package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorThinIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M195 65.59C184.166 38.056 157.589 19.953 128 19.953c-29.589 0-56.166 18.103-67 45.637C36.126 76.271 20.002 100.739 20 127.81c-.1 36 30.24 67.26 66.25 68.17 13.321 .319 26.444-3.268 37.75-10.32v46.34c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-46.33c10.798 6.741 23.27 10.32 36 10.33h1.72c36-.91 66.34-32.13 66.24-68.17C235.97 100.763 219.863 76.288 195 65.59ZM169.55 188c-13.509 .332-26.737-3.896-37.55-12v-45.5l45.79-22.89c1.977-.989 2.779-3.393 1.79-5.37-.989-1.977-3.393-2.779-5.37-1.79L132 121.53v-33.53c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v57.53L81.79 124.42c-1.977-.989-4.381-.187-5.37 1.79-.989 1.977-.187 4.381 1.79 5.37L124 154.47v21.53c-10.808 8.115-24.039 12.343-37.55 12C54.68 187.2 27.91 159.65 28 127.85 28.006 103.396 42.907 81.412 65.62 72.35c1.053-.427 1.875-1.281 2.26-2.35C77.098 44.746 101.116 27.945 128 27.945c26.884 0 50.902 16.801 60.12 42.055 .39 1.061 1.211 1.908 2.26 2.33 22.709 9.067 37.609 31.048 37.62 55.5 .09 31.8-26.68 59.35-58.45 60.17Z"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
