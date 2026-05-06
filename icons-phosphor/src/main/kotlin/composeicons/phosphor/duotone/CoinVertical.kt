package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorDuotoneIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 128c0 53-25.07 96-56 96C73.07 224 48 181 48 128 48 75 73.07 32 104 32c30.93 0 56 43 56 96Z"),
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
                pathData = parseSvgPathData("M198.51 56.09C186.44 35.4 169.92 24 152 24h-48C86.08 24 69.56 35.4 57.49 56.09 46.21 75.42 40 101 40 128c0 27 6.21 52.58 17.49 71.91C69.56 220.6 86.08 232 104 232h48c17.92 0 34.44-11.4 46.51-32.09C209.79 180.58 216 155 216 128c0-27-6.21-52.58-17.49-71.91ZM199.79 120h-32c-.625-16.416-3.894-32.625-9.68-48h30.59c6.12 13.38 10.16 30 11.09 48ZM179.19 56h-28.73c-3.342-5.797-7.371-11.169-12-16h13.54c10 0 19.4 6 27.19 16ZM56 128C56 80.3 78 40 104 40c26 0 48 40.3 48 88 0 47.7-22 88-48 88C78 216 56 175.7 56 128ZM152 216h-13.51c4.629-4.831 8.658-10.203 12-16h28.73C171.4 210 162 216 152 216ZM188.7 184h-30.58c5.786-15.376 9.055-31.584 9.68-48h32c-.94 18-4.98 34.62-11.1 48Z"),
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
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
