package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorFillIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 100v-28C16 63.163 23.163 56 32 56h84c2.209 0 4 1.791 4 4v76h-56C64 118.327 49.673 104 32 104h-12c-2.209 0-4-1.791-4-4ZM224 104h12c2.209 0 4-1.791 4-4v-28c0-8.837-7.163-16-16-16h-84c-2.209 0-4 1.791-4 4v76h56c0-17.673 14.327-32 32-32ZM232 120h-8c-8.837 0-16 7.163-16 16v8c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8v-8c0-8.837-7.163-16-16-16h-8c-8.837 0-16 7.163-16 16v32c0 8.837 7.163 16 16 16h8v15.73c-.063 4.289 3.197 7.898 7.47 8.27 2.212 .147 4.386-.631 6.003-2.147C47.09 204.336 48.005 202.217 48 200v-16h160v15.73c-.058 4.283 3.202 7.883 7.47 8.25 2.212 .147 4.386-.631 6.003-2.147 1.617-1.517 2.532-3.636 2.527-5.853v-15.98h8c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16Z"),
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
        return _couch!!
    }

private var _couch: ImageVector? = null
