package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = phosphorDuotoneIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 132c0 19.88-35.82 36-80 36-19.6 0-37.56-3.17-51.47-8.44h0C146.76 156.85 176 142 176 124v-27.28h0c36.52 3.34 64 17.86 64 35.28ZM176 84C176 64.12 140.18 48 96 48 51.82 48 16 64.12 16 84c0 19.88 35.82 36 80 36 44.18 0 80-16.12 80-36Z"),
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
                pathData = parseSvgPathData("M184 89.57v-5.57C184 58.92 146.17 40 96 40 45.83 40 8 58.92 8 84v40c0 20.89 26.25 37.49 64 42.46v5.54c0 25.08 37.83 44 88 44 50.17 0 88-18.92 88-44v-40C248 111.3 222.58 94.68 184 89.57ZM232 132c0 13.22-30.79 28-72 28-3.73 0-7.43-.13-11.08-.37C170.49 151.77 184 139 184 124v-18.26c29.87 4.45 48 16.53 48 26.26ZM72 150.25v-23.79c7.958 1.037 15.975 1.551 24 1.54 8.025 .011 16.042-.503 24-1.54v23.79c-7.946 1.174-15.968 1.759-24 1.75-8.032 .009-16.054-.576-24-1.75ZM168 109.93v14.07c0 8.39-12.41 17.4-32 22.87v-23.37c12.91-3.13 23.84-7.79 32-13.57ZM96 56c41.21 0 72 14.78 72 28 0 13.22-30.79 28-72 28C54.79 112 24 97.22 24 84 24 70.78 54.79 56 96 56ZM24 124v-14.07c8.16 5.78 19.09 10.44 32 13.57v23.37C36.41 141.4 24 132.39 24 124ZM88 172v-4.17c2.63 .1 5.29 .17 8 .17 3.88 0 7.67-.13 11.39-.35 4.133 1.479 8.342 2.735 12.61 3.76v23.46C100.41 189.4 88 180.39 88 172ZM136 198.25v-23.85c7.955 1.069 15.973 1.604 24 1.6 8.025 .011 16.042-.503 24-1.54v23.79c-15.915 2.333-32.085 2.333-48 0ZM200 194.87v-23.37c12.91-3.13 23.84-7.79 32-13.57v14.07c0 8.39-12.41 17.4-32 22.87Z"),
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
