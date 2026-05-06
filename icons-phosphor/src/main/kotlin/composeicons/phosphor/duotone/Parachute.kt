package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorDuotoneIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24c0 0-40 24-40 96h-56C32 66.981 74.981 24 128 24ZM128 24c0 0 40 24 40 96h56C224 66.981 181.019 24 128 24Z"),
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
                pathData = parseSvgPathData("M232 120C231.934 62.59 185.41 16.066 128 16h0C70.59 16.066 24.066 62.59 24 120c.003 2.479 1.155 4.818 3.12 6.33l.08 .07L120 196v20h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8v-20l92.8-69.6h0C230.814 124.889 232 122.518 232 120ZM215.64 112h-39.81C174.29 74.05 161.92 49.57 150.72 35c35.608 9.574 61.502 40.287 64.92 77ZM128 34c5.358 4.735 10.03 10.194 13.88 16.22C149.49 62 158.45 81.87 159.82 112h-63.64C97.55 81.87 106.51 62 114.12 50.26 117.967 44.22 122.639 38.747 128 34ZM154.4 128 128 175.53 101.6 128ZM83.29 128l19.5 35.09L56 128ZM172.71 128h27.29l-46.79 35.09ZM105.28 35C94.08 49.57 81.71 74.05 80.17 112h-39.81C43.778 75.287 69.672 44.574 105.28 35Z"),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
