package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = phosphorThinIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 93.11v-9.11C180 61.57 143.1 44 96 44 48.9 44 12 61.57 12 84v40c0 19.14 26.86 34.72 64 38.89v9.11c0 22.43 36.9 40 84 40 47.1 0 84-17.57 84-40v-40C244 113.12 217.87 97.37 180 93.11ZM236 132c0 15.45-30.54 32-76 32-9.383 .014-18.75-.769-28-2.34v-1.39c28.61-6.31 48-20 48-36.27v-22.83c32.22 3.83 56 16.76 56 30.83ZM108.19 155.59Q102.3 156 96 156c-5.47 0-10.72-.25-15.73-.69h-.27 0c-4.16-.38-8.16-.9-12-1.56v-31.95c9.259 1.483 18.623 2.219 28 2.2 9.377 .019 18.741-.717 28-2.2v31.92c-5.139 .877-10.319 1.495-15.52 1.85ZM172 101.32v22.68c0 10.88-15.16 22.3-40 28.11v-31.84c17.63-3.89 31.75-10.58 40-18.95ZM96 52c45.46 0 76 16.55 76 32 0 15.45-30.54 32-76 32C50.54 116 20 99.45 20 84 20 68.55 50.54 52 96 52ZM20 124v-22.68c8.25 8.37 22.37 15.06 40 19v31.84C35.16 146.3 20 134.88 20 124ZM84 172v-8.4c3.91 .26 7.92 .4 12 .4 4.08 0 8.06-.14 12-.39 5.223 1.9 10.569 3.447 16 4.63v31.87C99.16 194.3 84 182.88 84 172ZM132 201.72v-31.95c9.258 1.495 18.622 2.24 28 2.23 9.377 .019 18.741-.717 28-2.2v31.92c-18.543 3.04-37.457 3.04-56 0ZM236 172c0 10.88-15.16 22.3-40 28.11v-31.84c17.63-3.89 31.75-10.58 40-19Z"),
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
        return _coins!!
    }

private var _coins: ImageVector? = null
