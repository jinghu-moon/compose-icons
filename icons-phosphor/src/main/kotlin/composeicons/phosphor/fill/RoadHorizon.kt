package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorFillIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239 188.08 173.68 72h58c4.31 .095 7.952-3.175 8.32-7.47 .147-2.212-.631-4.386-2.147-6.003C236.336 56.91 234.217 55.995 232 56h-207.73C19.979 55.932 16.367 59.195 16 63.47c-.147 2.212 .631 4.386 2.147 6.003C19.664 71.09 21.783 72.005 24 72h58.32L17 188.08c-1.721 3.06-1.247 6.884 1.17 9.43 1.575 1.617 3.743 2.517 6 2.49h91.83c2.209 0 4-1.791 4-4v-19.73c-.058-4.283 3.202-7.883 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v20c0 2.209 1.791 4 4 4h91.77c2.257 .027 4.425-.873 6-2.49 2.446-2.536 2.946-6.373 1.23-9.45ZM136 140c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM136 88c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
