package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = phosphorThinIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192.14 42.55C174.94 33.17 152.16 28 128 28 103.84 28 81.06 33.17 63.86 42.55 45.89 52.35 36 65.65 36 80v96c0 14.35 9.89 27.65 27.86 37.45C81.06 222.83 103.86 228 128 228c24.14 0 46.94-5.17 64.14-14.55C210.14 203.65 220 190.35 220 176v-96C220 65.65 210.11 52.35 192.14 42.55ZM212 176c0 11.29-8.41 22.1-23.69 30.43C172.27 215.18 150.85 220 128 220c-22.85 0-44.27-4.82-60.31-13.57C52.41 198.1 44 187.29 44 176v-26.52c4.69 5.93 11.37 11.34 19.86 16 17.2 9.38 40 14.55 64.14 14.55 24.14 0 46.94-5.17 64.14-14.55 8.49-4.63 15.17-10 19.86-16ZM212 128c0 11.29-8.41 22.1-23.69 30.43C172.27 167.18 150.85 172 128 172c-22.85 0-44.27-4.82-60.31-13.57C52.41 150.1 44 139.29 44 128v-26.52c4.69 5.93 11.37 11.34 19.86 16 17.2 9.38 40 14.55 64.14 14.55 24.14 0 46.94-5.17 64.14-14.55 8.49-4.63 15.17-10 19.86-16ZM188.31 110.43C172.27 119.18 150.85 124 128 124c-22.85 0-44.27-4.82-60.31-13.57C52.41 102.1 44 91.29 44 80 44 68.71 52.41 57.9 67.69 49.57 83.73 40.82 105.15 36 128 36c22.85 0 44.27 4.82 60.31 13.57C203.59 57.9 212 68.71 212 80c0 11.29-8.41 22.1-23.69 30.43Z"),
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
