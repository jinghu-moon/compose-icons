package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorThinIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 212h-12v-84c0-6.627-5.373-12-12-12h-60v-68c0-6.627-5.373-12-12-12h-96C49.373 36 44 41.373 44 48v164h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h216c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM224 124c2.209 0 4 1.791 4 4v84h-64v-88ZM52 48c0-2.209 1.791-4 4-4h96c2.209 0 4 1.791 4 4v164h-24v-52c0-2.209-1.791-4-4-4h-48c-2.209 0-4 1.791-4 4v52h-24ZM124 212h-40v-48h40ZM76 96c0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4Z"),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null
