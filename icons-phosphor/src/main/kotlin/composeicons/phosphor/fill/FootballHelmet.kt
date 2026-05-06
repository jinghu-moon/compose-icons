package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorFillIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 160h-50.2l-7.09-24h57.29c4.418 0 8-3.582 8-8v-4C224.003 97.23 213.272 71.577 194.21 52.783 175.149 33.988 149.347 23.62 122.58 24 68.24 24.77 24 69.61 24 124c-.003 33.05 16.324 63.967 43.62 82.6 1.331 .912 2.907 1.4 4.52 1.4h47.86c4.853 0 9.444-2.202 12.481-5.988 3.037-3.785 4.192-8.745 3.139-13.482-.041-.182-.091-.363-.15-.54l-3.56-12h21.93l10.79 36.53c2.035 6.794 8.277 11.457 15.37 11.48h36c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16ZM84 176c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM127.16 160 120 136h22l7.09 24ZM216 208h-36l-9.46-32h45.46Z"),
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
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
