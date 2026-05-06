package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorThinIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 52h-216c-2.209 0-4 1.791-4 4v152c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h24v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h116c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12ZM236 176c0 2.209-1.791 4-4 4h-212v-120h212c2.209 0 4 1.791 4 4ZM176 84c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C212 100.118 195.882 84 176 84ZM148 120c-.005-6.044 1.953-11.925 5.58-16.76l39.18 39.18c-8.487 6.342-19.827 7.35-29.3 2.605C153.987 140.28 148.004 130.595 148 120ZM198.42 136.76 159.24 97.58c11.147-8.299 26.693-7.166 36.52 2.66 9.826 9.826 10.959 25.373 2.66 36.52ZM80 84C60.118 84 44 100.118 44 120c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C116 100.118 99.882 84 80 84ZM52 120c-.005-6.044 1.953-11.925 5.58-16.76l39.18 39.18c-8.487 6.342-19.827 7.35-29.3 2.605C57.987 140.28 52.004 130.595 52 120ZM102.42 136.76 63.24 97.58c11.147-8.299 26.693-7.166 36.52 2.66 9.826 9.826 10.959 25.373 2.66 36.52Z"),
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
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
