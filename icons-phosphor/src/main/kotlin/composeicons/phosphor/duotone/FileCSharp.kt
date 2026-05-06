package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileCSharp: ImageVector
    get() {
        if (_fileCSharp != null) return _fileCSharp!!
        _fileCSharp = phosphorDuotoneIcon(
            name = "FileCSharp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88h-56v-56Z"),
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
                pathData = parseSvgPathData("M48 180c0 11 7.18 20 16 20 3.903-.08 7.6-1.766 10.22-4.66 3.067-3.124 8.076-3.202 11.239-.176 3.163 3.027 3.306 8.034 .321 11.236C80.15 212.46 72.272 215.933 64 216 46.35 216 32 199.85 32 180c0-19.85 14.35-36 32-36 8.272 .067 16.15 3.54 21.78 9.6 2.985 3.202 2.842 8.209-.321 11.236-3.163 3.027-8.172 2.948-11.239-.176C71.6 161.766 67.903 160.08 64 160c-8.82 0-16 9-16 20ZM216 88v136c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-128h-48c-4.418 0-8-3.582-8-8v-48h-88v72c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-72C40 31.163 47.163 24 56 24h96c2.122-.002 4.158 .84 5.66 2.34l56 56c1.5 1.502 2.342 3.538 2.34 5.66ZM160 80h28.69L160 51.31ZM168 168v16h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-16v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-16h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h16v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM152 168h-16v16h16Z"),
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
        return _fileCSharp!!
    }

private var _fileCSharp: ImageVector? = null
