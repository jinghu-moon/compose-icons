package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) return _articleNyTimes!!
        _articleNyTimes = phosphorLightIcon(
            name = "ArticleNyTimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 98.000 L 232.000 98.000 C 235.314 98.000 238.000 100.686 238.000 104.000 C 238.000 107.314 235.314 110.000 232.000 110.000 L 128.000 110.000 C 124.686 110.000 122.000 107.314 122.000 104.000 C 122.000 100.686 124.686 98.000 128.000 98.000 ZM 232.000 130.000 L 128.000 130.000 C 124.686 130.000 122.000 132.686 122.000 136.000 C 122.000 139.314 124.686 142.000 128.000 142.000 L 232.000 142.000 C 235.314 142.000 238.000 139.314 238.000 136.000 C 238.000 132.686 235.314 130.000 232.000 130.000 ZM 232.000 162.000 L 80.000 162.000 C 76.686 162.000 74.000 164.686 74.000 168.000 C 74.000 171.314 76.686 174.000 80.000 174.000 L 232.000 174.000 C 235.314 174.000 238.000 171.314 238.000 168.000 C 238.000 164.686 235.314 162.000 232.000 162.000 ZM 232.000 194.000 L 80.000 194.000 C 76.686 194.000 74.000 196.686 74.000 200.000 C 74.000 203.314 76.686 206.000 80.000 206.000 L 232.000 206.000 C 235.314 206.000 238.000 203.314 238.000 200.000 C 238.000 196.686 235.314 194.000 232.000 194.000 ZM 96.000 142.000 C 99.314 142.000 102.000 139.314 102.000 136.000 C 102.000 132.686 99.314 130.000 96.000 130.000 L 86.000 130.000 L 86.000 62.000 L 122.000 62.000 L 122.000 72.000 C 122.000 75.314 124.686 78.000 128.000 78.000 C 131.314 78.000 134.000 75.314 134.000 72.000 L 134.000 56.000 C 134.000 52.686 131.314 50.000 128.000 50.000 L 32.000 50.000 C 28.686 50.000 26.000 52.686 26.000 56.000 L 26.000 72.000 C 26.000 75.314 28.686 78.000 32.000 78.000 C 35.314 78.000 38.000 75.314 38.000 72.000 L 38.000 62.000 L 74.000 62.000 L 74.000 130.000 L 64.000 130.000 C 60.686 130.000 58.000 132.686 58.000 136.000 C 58.000 139.314 60.686 142.000 64.000 142.000 Z"),
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
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
