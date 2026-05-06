package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Rainbow: ImageVector
    get() {
        if (_rainbow != null) return _rainbow!!
        _rainbow = phosphorThinIcon(
            name = "Rainbow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 168v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-24.301-19.699-44-44-44-24.301 0-44 19.699-44 44v16c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-16c0-28.719 23.281-52 52-52 28.719 0 52 23.281 52 52ZM128 84c-46.371 .05-83.95 37.629-84 84v16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-16C52 126.026 86.026 92 128 92c41.974 0 76 34.026 76 76v16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-16C211.95 121.629 174.371 84.05 128 84ZM128 52C63.965 52.072 12.072 103.965 12 168v16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-16C20 108.353 68.353 60 128 60c59.647 0 108 48.353 108 108v16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-16C243.928 103.965 192.035 52.072 128 52Z"),
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
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
