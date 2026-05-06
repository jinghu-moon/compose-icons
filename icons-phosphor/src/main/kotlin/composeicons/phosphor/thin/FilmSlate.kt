package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorThinIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 108h-144.74L209 71.64c1.032-.272 1.912-.944 2.445-1.868 .533-.924 .675-2.023 .395-3.052l-8.16-30c-1.757-6.282-8.236-9.985-14.54-8.31L36.83 68.61c-3.065 .793-5.681 2.786-7.26 5.53C28.015 76.82 27.597 80.01 28.41 83l7.67 28.19c-.055 .266-.082 .538-.08 .81v88c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-88c0-2.209-1.791-4-4-4ZM126 53.33l38 21.92L116.08 87.9 78.12 66ZM191.16 36.13c.327-.085 .663-.129 1-.13 1.772-.05 3.352 1.106 3.84 2.81l7.1 26.12L175 72.35 137 50.43ZM36.46 78.13c.518-.893 1.371-1.541 2.37-1.8L67.1 68.87l38 21.91L43.25 107.12 36.13 80.94c-.256-.945-.123-1.954 .37-2.8ZM212 200c0 2.209-1.791 4-4 4h-160c-2.209 0-4-1.791-4-4v-84h168Z"),
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
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
