package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) return _closedCaptioning!!
        _closedCaptioning = phosphorBoldIcon(
            name = "ClosedCaptioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 44h-192C20.954 44 12 52.954 12 64v128c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-128C244 52.954 235.046 44 224 44ZM220 188h-184v-120h184ZM52 128C51.998 112.279 60.384 97.752 73.998 89.891 87.612 82.03 104.386 82.03 118 89.89c5.605 3.374 7.474 10.616 4.202 16.282-3.272 5.665-10.478 7.666-16.202 4.498-8.406-4.843-19.075-2.954-25.309 4.479-6.233 7.433-6.233 18.268 0 25.702 6.233 7.433 16.903 9.322 25.309 4.479 3.719-2.313 8.404-2.416 12.221-.268 3.817 2.148 6.161 6.205 6.115 10.585-.046 4.38-2.475 8.387-6.337 10.454-13.613 7.859-30.384 7.86-43.998 .001C60.389 158.243 52.002 143.719 52 128ZM132 128c-.002-15.721 8.384-30.248 21.998-38.109 13.614-7.861 30.388-7.861 44.002-.001 5.605 3.374 7.474 10.616 4.202 16.282-3.272 5.665-10.478 7.666-16.202 4.498-8.406-4.843-19.075-2.954-25.309 4.479-6.233 7.433-6.233 18.268 0 25.702 6.233 7.433 16.903 9.322 25.309 4.479 3.719-2.313 8.404-2.416 12.221-.268 3.817 2.148 6.161 6.205 6.115 10.585-.046 4.38-2.475 8.387-6.337 10.454-13.613 7.859-30.384 7.86-43.998 .001C140.389 158.243 132.002 143.719 132 128Z"),
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
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
