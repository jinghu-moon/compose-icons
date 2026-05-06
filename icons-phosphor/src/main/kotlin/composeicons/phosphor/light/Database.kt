package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorLightIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C75.29 26 34 49.72 34 80v96c0 30.28 41.29 54 94 54 52.71 0 94-23.72 94-54v-96C222 49.72 180.71 26 128 26ZM128 38c44.45 0 82 19.23 82 42 0 22.77-37.55 42-82 42C83.55 122 46 102.77 46 80 46 57.23 83.55 38 128 38ZM210 176c0 22.77-37.55 42-82 42C83.55 218 46 198.77 46 176v-21.21C62 171.16 92.37 182 128 182c35.63 0 66-10.84 82-27.21ZM210 128c0 22.77-37.55 42-82 42C83.55 170 46 150.77 46 128v-21.21C62 123.16 92.37 134 128 134c35.63 0 66-10.84 82-27.21Z"),
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
