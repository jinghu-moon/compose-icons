package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorFillIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 208c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8ZM232 56v112c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-112C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16ZM164 112c-.001-2.609-1.273-5.053-3.41-6.55l-40-28c-2.443-1.712-5.636-1.922-8.282-.545C109.661 78.282 108.001 81.017 108 84v56c.001 2.983 1.661 5.718 4.308 7.095 2.646 1.377 5.839 1.167 8.282-.545l40-28c2.137-1.497 3.409-3.941 3.41-6.55Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
