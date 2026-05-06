package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorDuotoneIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 128c0 26.51 21.49 48 48 48 10.27 .41 17.9-2.25 25.88-7.37 1.23-.769 2.779-.811 4.049-.112 1.27 .7 2.063 2.032 2.071 3.482v36c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8v36c-.005 1.458-.803 2.798-2.082 3.497-1.28 .699-2.838 .647-4.068-.137C187.018 78.068 168.316 77.539 152.982 85.977 137.648 94.415 128.087 110.498 128 128Z"),
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
                pathData = parseSvgPathData("M176 88c7.612-.068 15.085 2.049 21.53 6.1 3.693 2.364 8.381 2.526 12.227 .422C213.604 92.419 215.998 88.384 216 84v-36c0-8.837-7.163-16-16-16h-144C47.163 32 40 39.163 40 48v160c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-36c-.006-4.376-2.393-8.403-6.231-10.507-3.838-2.104-8.516-1.952-12.209 .397-7.25 4.65-13.41 6.41-21.24 6.11h-.32c-22.091 0-40-17.909-40-40 0-22.091 17.909-40 40-40ZM120 128c.038 30.85 24.991 55.873 55.84 56 8.36 .414 16.684-1.346 24.16-5.11v29.11h-144v-160h144v29.23c-17.387-8.069-37.684-6.738-53.868 3.533C129.948 91.033 120.102 108.832 120 128Z"),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
