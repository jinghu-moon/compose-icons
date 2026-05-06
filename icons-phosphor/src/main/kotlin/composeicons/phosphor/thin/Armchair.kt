package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Armchair: ImageVector
    get() {
        if (_armchair != null) return _armchair!!
        _armchair = phosphorThinIcon(
            name = "Armchair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 92.23v-20.23C212 52.118 195.882 36 176 36h-96C60.118 36 44 52.118 44 72v20.23C25.787 94.276 12.019 109.678 12.019 128.005c0 18.327 13.769 33.729 31.981 35.775v36.22c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-36.22c18.213-2.046 31.981-17.448 31.981-35.775C243.981 109.678 230.213 94.276 212 92.23ZM80 44h96c15.464 0 28 12.536 28 28v20.23C185.782 94.267 172.004 109.668 172 128v4h-88v-4C83.996 109.668 70.218 94.267 52 92.23v-20.23C52 56.536 64.536 44 80 44ZM208.3 156h-.3c-2.209 0-4 1.791-4 4v40c0 2.209-1.791 4-4 4h-144c-2.209 0-4-1.791-4-4v-40h0c0-2.209-1.791-4-4-4h-.3C32.276 155.835 19.891 143.226 20.001 127.802c.11-15.424 12.674-27.855 28.098-27.8C63.524 100.056 75.999 112.575 76 128v40c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28h88v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-40c.001-15.425 12.476-27.944 27.901-27.998 15.425-.055 27.988 12.376 28.098 27.8 .11 15.424-12.275 28.033-27.699 28.198Z"),
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
        return _armchair!!
    }

private var _armchair: ImageVector? = null
