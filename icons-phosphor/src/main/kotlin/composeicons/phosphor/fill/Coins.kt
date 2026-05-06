package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = phosphorFillIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 89.57v-5.57C184 58.92 146.17 40 96 40 45.83 40 8 58.92 8 84v40c0 20.89 26.25 37.49 64 42.46v5.54c0 25.08 37.83 44 88 44 50.17 0 88-18.92 88-44v-40C248 111.3 222.58 94.68 184 89.57ZM56 146.87C36.41 141.4 24 132.39 24 124v-14.07c8.16 5.78 19.09 10.44 32 13.57ZM136 123.5c12.91-3.13 23.84-7.79 32-13.57v14.07c0 8.39-12.41 17.4-32 22.87ZM120 194.87C100.41 189.4 88 180.39 88 172v-4.17c2.63 .1 5.29 .17 8 .17 3.88 0 7.67-.13 11.39-.35 4.133 1.479 8.342 2.735 12.61 3.76ZM120 150.25c-7.946 1.174-15.968 1.759-24 1.75-8.032 .009-16.054-.576-24-1.75v-23.79c7.958 1.037 15.975 1.551 24 1.54 8.025 .011 16.042-.503 24-1.54ZM184 198.25c-15.915 2.333-32.085 2.333-48 0v-23.85c7.955 1.069 15.973 1.604 24 1.6 8.025 .011 16.042-.503 24-1.54ZM232 172c0 8.39-12.41 17.4-32 22.87v-23.37c12.91-3.13 23.84-7.79 32-13.57Z"),
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
