package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SimCard: ImageVector
    get() {
        if (_simCard != null) return _simCard!!
        _simCard = phosphorFillIcon(
            name = "SimCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-128c.002-2.122-.84-4.158-2.34-5.66ZM184 192c0 4.418-3.582 8-8 8h-16c-2.209 0-4-1.791-4-4v-35.73c.058-4.283-3.202-7.883-7.47-8.25-2.212-.147-4.386 .631-6.003 2.147-1.617 1.517-2.532 3.636-2.527 5.853v36c0 2.209-1.791 4-4 4h-16c-2.209 0-4-1.791-4-4v-35.75c.058-4.283-3.202-7.883-7.47-8.25-2.212-.147-4.386 .631-6.003 2.147-1.617 1.517-2.532 3.636-2.527 5.853v36c0 2.209-1.791 4-4 4h-16c-4.418 0-8-3.582-8-8v-56.02c0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8Z"),
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
        return _simCard!!
    }

private var _simCard: ImageVector? = null
