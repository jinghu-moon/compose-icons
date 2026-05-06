package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorDuotoneIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM136 215.63v-31.63c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v31.63C77.748 211.718 44.282 178.252 40.37 136h31.63c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-31.63C44.282 77.748 77.748 44.282 120 40.37v31.63c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-31.63c42.252 3.912 75.718 37.378 79.63 79.63h-31.63c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h31.63c-3.912 42.252-37.378 75.718-79.63 79.63Z"),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
