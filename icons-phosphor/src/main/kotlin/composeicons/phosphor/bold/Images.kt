package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Images: ImageVector
    get() {
        if (_images != null) return _images!!
        _images = phosphorBoldIcon(
            name = "Images",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 88c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM236 56v104c0 11.046-8.954 20-20 20h-12v20c0 11.046-8.954 20-20 20h-144C28.954 220 20 211.046 20 200v-112C20 76.954 28.954 68 40 68h20v-12C60 44.954 68.954 36 80 36h136c11.046 0 20 8.954 20 20ZM180 180h-100C68.954 180 60 171.046 60 160v-68h-16v104h136ZM158.34 156 124 121.66 89.66 156ZM212 60h-128v67.72l25.86-25.86c7.81-7.808 20.47-7.808 28.28 0L192.28 156h19.72Z"),
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
        return _images!!
    }

private var _images: ImageVector? = null
