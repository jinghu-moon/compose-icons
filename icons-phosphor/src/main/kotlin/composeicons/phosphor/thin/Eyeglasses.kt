package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorThinIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 44c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 11.046 0 20 8.954 20 20v68c-9.447-12.603-25.41-18.489-40.776-15.035-15.367 3.453-27.277 15.603-30.424 31.035h-41.6C104.053 140.567 92.143 128.418 76.776 124.965 61.41 121.511 45.447 127.397 36 140v-68C36 60.954 44.954 52 56 52c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4C40.536 44 28 56.536 28 72v92c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40h40c0 22.091 17.909 40 40 40 22.091 0 40-17.909 40-40v-92C228 56.536 215.464 44 200 44ZM68 196C50.327 196 36 181.673 36 164c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM188 196c-17.673 0-32-14.327-32-32 0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32Z"),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
