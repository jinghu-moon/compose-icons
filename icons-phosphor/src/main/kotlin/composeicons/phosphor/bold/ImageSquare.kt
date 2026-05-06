package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) return _imageSquare!!
        _imageSquare = phosphorBoldIcon(
            name = "ImageSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 52v63.72L186.14 97.86c-7.81-7.808-20.47-7.808-28.28 0L52 203.72v-151.72ZM85.66 204 172 117.66l32 32v54.34ZM76 96C76 84.954 84.954 76 96 76c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20C84.954 116 76 107.046 76 96Z"),
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
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
