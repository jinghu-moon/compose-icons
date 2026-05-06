package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Train: ImageVector
    get() {
        if (_train != null) return _train!!
        _train = phosphorRegularIcon(
            name = "Train",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 24h-112C54.327 24 40 38.327 40 56v128c0 17.673 14.327 32 32 32h8L65.6 235.2c-2.651 3.535-1.935 8.549 1.6 11.2 3.535 2.651 8.549 1.935 11.2-1.6L100 216h56l21.6 28.8c2.651 3.535 7.665 4.251 11.2 1.6 3.535-2.651 4.251-7.665 1.6-11.2L176 216h8c17.673 0 32-14.327 32-32v-128C216 38.327 201.673 24 184 24ZM56 120v-40h64v40ZM136 80h64v40h-64ZM72 40h112c8.837 0 16 7.163 16 16v8h-144v-8C56 47.163 63.163 40 72 40ZM184 200h-112c-8.837 0-16-7.163-16-16v-48h144v48c0 8.837-7.163 16-16 16ZM96 172c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM184 172c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _train!!
    }

private var _train: ImageVector? = null
