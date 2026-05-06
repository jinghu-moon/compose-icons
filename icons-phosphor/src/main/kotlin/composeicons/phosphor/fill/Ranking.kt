package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorFillIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 200h-8v-56c0-8.837-7.163-16-16-16h-40v-72c0-8.837-7.163-16-16-16h-64C87.163 40 80 47.163 80 56v32h-40c-8.837 0-16 7.163-16 16v96h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h224c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM80 200h-40v-96h40ZM140 136c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-28.9l-1.47 .49c-4.192 1.397-8.723-.868-10.12-5.06-1.397-4.192 .868-8.723 5.06-10.12l12-4c2.44-.813 5.122-.404 7.208 1.1 2.086 1.504 3.322 3.919 3.322 6.49ZM216 200h-40v-56h40Z"),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
