package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Synagogue: ImageVector
    get() {
        if (_synagogue != null) return _synagogue!!
        _synagogue = phosphorThinIcon(
            name = "Synagogue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 60.4v-28.4c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v28.4C186.687 62.301 179.998 70.495 180 80v49.11L132 101.68v-29.68c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v29.68L76 129.11v-49.11C76.002 70.495 69.313 62.301 60 60.4v-28.4c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v28.4C42.687 62.301 35.998 70.495 36 80v136c0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4v-40c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v40c0 2.209 1.791 4 4 4h72c2.209 0 4-1.791 4-4v-136c.002-9.505-6.687-17.699-16-19.6ZM200 68c6.627 0 12 5.373 12 12v28h-24v-28c0-6.627 5.373-12 12-12ZM56 68c6.627 0 12 5.373 12 12v28h-24v-28C44 73.373 49.373 68 56 68ZM44 116h24v96h-24ZM128 156c-11.046 0-20 8.954-20 20v36h-32v-73.68l52-29.71 52 29.71v73.68h-32v-36c0-11.046-8.954-20-20-20ZM188 212v-96h24v96Z"),
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
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
