package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorFillIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C74.17 24 32 48.6 32 80v96c0 31.4 42.17 56 96 56 53.83 0 96-24.6 96-56v-96C224 48.6 181.83 24 128 24ZM208 128c0 9.62-7.88 19.43-21.61 26.92C170.93 163.35 150.19 168 128 168c-22.19 0-42.93-4.65-58.39-13.08C55.88 147.43 48 137.62 48 128v-16.64c17.06 15 46.23 24.64 80 24.64 33.77 0 62.94-9.68 80-24.64ZM186.39 202.92C170.93 211.35 150.19 216 128 216c-22.19 0-42.93-4.65-58.39-13.08C55.88 195.43 48 185.62 48 176v-16.64c17.06 15 46.23 24.64 80 24.64 33.77 0 62.94-9.68 80-24.64v16.64c0 9.62-7.88 19.43-21.61 26.92Z"),
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
        return _database!!
    }

private var _database: ImageVector? = null
