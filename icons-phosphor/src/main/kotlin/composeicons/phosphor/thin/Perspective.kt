package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorThinIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 124h-20v-76c.001-3.56-1.578-6.936-4.311-9.217-2.733-2.281-6.337-3.231-9.839-2.593L45.85 65.29C40.148 66.328 36.003 71.294 36 77.09v46.91h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v46.91c.003 5.796 4.148 10.762 9.85 11.8l160 29.09c.712 .136 1.435 .203 2.16 .2 6.627 0 12-5.373 12-12v-76h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM44 77.09c.002-1.93 1.382-3.583 3.28-3.93l160-29.09c1.167-.213 2.368 .102 3.279 .861 .911 .759 1.439 1.883 1.441 3.069v76h-168ZM212 208c-.001 1.186-.529 2.31-1.441 3.069-.911 .759-2.113 1.074-3.279 .861l-160-29.09c-1.898-.347-3.278-2-3.28-3.93v-46.91h168Z"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
