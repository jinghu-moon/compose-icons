package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorRegularIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 96v112c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-112C207.967 65.086 182.914 40.033 152 40h-48C73.086 40.033 48.033 65.086 48 96v112c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-112C32.044 56.254 64.254 24.044 104 24h48c39.746 .044 71.956 32.254 72 72ZM184 96v72c-.002 11.438-8.075 21.285-19.29 23.53l2.45 4.89c1.977 3.954 .374 8.763-3.58 10.74-3.954 1.977-8.763 .374-10.74-3.58L147.06 192h-38.12l-5.78 11.58c-1.977 3.954-6.786 5.557-10.74 3.58-3.954-1.977-5.557-6.786-3.58-10.74l2.45-4.89C80.075 189.285 72.002 179.438 72 168v-72C72 82.745 82.745 72 96 72h64c13.255 0 24 10.745 24 24ZM88 96v48h80v-48c0-4.418-3.582-8-8-8h-64c-4.418 0-8 3.582-8 8ZM120 160v16h16v-16ZM96 176h8v-16h-16v8c0 4.418 3.582 8 8 8ZM168 168v-8h-16v16h8c4.418 0 8-3.582 8-8Z"),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
