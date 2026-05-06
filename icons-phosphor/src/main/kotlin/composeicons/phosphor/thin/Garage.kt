package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorThinIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 196h-12v-97.33c.006-4.017-1.998-7.771-5.34-10L134.66 30c-4.032-2.69-9.288-2.69-13.32 0L33.34 88.67c-3.342 2.229-5.346 5.983-5.34 10v97.33h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h224c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM36 98.67c-.001-1.338 .667-2.588 1.78-3.33l88-58.66c1.344-.897 3.096-.897 4.44 0l88 58.66c1.113 .742 1.781 1.992 1.78 3.33v97.33h-32v-60c0-2.209-1.791-4-4-4h-112c-2.209 0-4 1.791-4 4v60h-32ZM180 140v24h-48v-24ZM124 164h-48v-24h48ZM76 172h48v24h-48ZM132 172h48v24h-48Z"),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
