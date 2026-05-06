package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorBoldIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-120C76.954 28 68 36.954 68 48v12h-20C36.954 60 28 68.954 28 80v128c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-20h12c11.046 0 20-8.954 20-20v-120C228 36.954 219.046 28 208 28ZM92 52h112v59.72l-9.86-9.86c-7.81-7.808-20.47-7.808-28.28 0L103.72 164h-11.72ZM172 204h-120v-120h16v84c0 11.046 8.954 20 20 20h84ZM137.66 164 180 121.66l24 24v18.34ZM108 88c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20Z"),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
