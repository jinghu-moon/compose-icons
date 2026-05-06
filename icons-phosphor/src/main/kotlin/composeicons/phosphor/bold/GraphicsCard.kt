package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) return _graphicsCard!!
        _graphicsCard = phosphorBoldIcon(
            name = "GraphicsCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 44h-216C9.373 44 4 49.373 4 56v152c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h16v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h16v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h16v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h84c11.046 0 20-8.954 20-20v-112C252 52.954 243.046 44 232 44ZM228 172h-200v-104h200ZM176 160c22.091 0 40-17.909 40-40C216 97.909 198.091 80 176 80c-22.091 0-40 17.909-40 40 0 22.091 17.909 40 40 40ZM176 104c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM80 160c22.091 0 40-17.909 40-40C120 97.909 102.091 80 80 80 57.909 80 40 97.909 40 120c0 22.091 17.909 40 40 40ZM80 104c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16Z"),
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
