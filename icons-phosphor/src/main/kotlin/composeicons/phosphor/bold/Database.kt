package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorBoldIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 35.52C177.62 25.51 153.48 20 128 20 102.52 20 78.38 25.51 60 35.52 39.37 46.79 28 62.58 28 80v96c0 17.42 11.37 33.21 32 44.48 18.35 10 42.49 15.52 68 15.52 25.51 0 49.62-5.51 68-15.52C216.66 209.21 228 193.42 228 176v-96C228 62.58 216.63 46.79 196 35.52ZM204 128c0 17-31.21 36-76 36C83.21 164 52 145 52 128v-8.46c2.578 1.787 5.248 3.436 8 4.94C78.35 134.48 102.49 140 128 140c25.51 0 49.62-5.51 68-15.52 2.752-1.504 5.422-3.153 8-4.94ZM128 44c44.79 0 76 19 76 36 0 17-31.21 36-76 36C83.21 116 52 97 52 80 52 63 83.21 44 128 44ZM128 212C83.21 212 52 193 52 176v-8.46c2.578 1.787 5.248 3.436 8 4.94 18.35 10 42.49 15.52 68 15.52 25.51 0 49.62-5.51 68-15.52 2.752-1.504 5.422-3.153 8-4.94v8.46c0 17-31.21 36-76 36Z"),
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
