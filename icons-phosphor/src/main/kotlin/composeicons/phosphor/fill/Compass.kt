package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorFillIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM179.58 81.79l-32 64c-.392 .771-1.019 1.398-1.79 1.79l-64 32c-1.541 .774-3.405 .474-4.624-.746-1.219-1.219-1.52-3.083-.746-4.624l32-64c.392-.771 1.019-1.398 1.79-1.79l64-32c1.541-.774 3.405-.474 4.624 .746 1.219 1.219 1.52 3.083 .746 4.624Z"),
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
        return _compass!!
    }

private var _compass: ImageVector? = null
