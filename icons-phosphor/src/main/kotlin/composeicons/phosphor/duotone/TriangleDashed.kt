package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) return _triangleDashed!!
        _triangleDashed = phosphorDuotoneIcon(
            name = "TriangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215.46 216h-174.92C27.92 216 20 202.79 26.13 192.09L113.59 40.22c6.3-11 22.52-11 28.82 0l87.46 151.87C236 202.79 228.08 216 215.46 216Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M160 216c0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8ZM236.8 188.09 232.14 180c-2.209-3.827-7.103-5.139-10.93-2.93-3.827 2.209-5.139 7.103-2.93 10.93l4.65 8.09c1.406 2.381 1.406 5.339 0 7.72-1.552 2.648-4.411 4.253-7.48 4.2h-23.45c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h23.45c8.79 .086 16.943-4.573 21.33-12.19 4.291-7.326 4.299-16.397 .02-23.73ZM64 208h-23.45c-3.069 .053-5.928-1.552-7.48-4.2-1.406-2.381-1.406-5.339 0-7.72L37.72 188c2.209-3.827 .897-8.721-2.93-10.93-3.827-2.209-8.721-.897-10.93 2.93l-4.66 8.08c-4.281 7.327-4.281 16.393 0 23.72 4.388 7.627 12.551 12.291 21.35 12.2h23.45c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM202.18 152c2.858 .001 5.5-1.524 6.93-3.999 1.429-2.475 1.43-5.525 0-8.001l-23-40c-2.209-3.827-7.103-5.139-10.93-2.93-3.827 2.209-5.139 7.103-2.93 10.93l23 40c1.429 2.476 4.071 4.001 6.93 4ZM149.35 36.22C144.903 28.649 136.78 23.999 128 23.999c-8.78 0-16.903 4.65-21.35 12.221L93 60c-2.209 3.827-.897 8.721 2.93 10.93 3.827 2.209 8.721 .897 10.93-2.93L120.56 44.22c1.582-2.633 4.429-4.243 7.5-4.243 3.071 0 5.918 1.61 7.5 4.243L149.18 68c1.431 2.479 4.078 4.004 6.94 4 1.405 .005 2.785-.364 4-1.07C163.93 68.704 165.218 63.814 163 60ZM80.85 97.07C77.025 94.867 72.138 96.178 69.93 100l-23 40c-2.209 3.83-.895 8.726 2.935 10.935 3.83 2.209 8.726 .895 10.935-2.935L83.8 108c1.06-1.84 1.344-4.026 .791-6.077-.553-2.05-1.899-3.796-3.741-4.853Z"),
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
        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null
