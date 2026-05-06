package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorFillIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 88h136c2.209 0 4-1.791 4-4v-44c0-8.837-7.163-16-16-16h-112C63.163 24 56 31.163 56 40v44c0 2.209 1.791 4 4 4ZM88 48h15.73c4.289-.063 7.898 3.197 8.27 7.47 .147 2.212-.631 4.386-2.147 6.003C108.336 63.09 106.217 64.005 104 64h-15.73C83.981 64.063 80.372 60.803 80 56.53c-.147-2.212 .631-4.386 2.147-6.003C83.664 48.91 85.783 47.995 88 48ZM224 112.06c.016-2.132-.82-4.182-2.322-5.696C220.176 104.851 218.132 104 216 104h-176c-2.132-0-4.176 .851-5.678 2.364-1.502 1.513-2.338 3.564-2.322 5.696 .051 35.768 19.963 68.547 51.68 85.08l-3.47 24.27c-.524 3.422 .047 6.922 1.63 10 2.756 5.273 8.21 8.582 14.16 8.59h63.66c3.475 .047 6.876-1.003 9.72-3 4.814-3.483 7.302-9.348 6.46-15.23l-3.52-24.6C204.047 180.632 223.96 147.838 224 112.06ZM96 224l2.93-20.5c18.916 6 39.224 6 58.14 0L160 224Z"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
