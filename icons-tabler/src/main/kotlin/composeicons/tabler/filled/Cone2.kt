package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cone2: ImageVector
    get() {
        if (_cone2 != null) return _cone2!!
        _cone2 = tablerFilledIcon(
            name = "Cone2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1c5.52 0 10 1.494 10 4.002v.5c0 .167-.042 .331-.121 .477L13.74 20.985c-.357 .629-1.026 1.017-1.749 1.014-.724-.003-1.389-.397-1.74-1.03L2.121 5.979C2.042 5.833 2 5.67 2 5.504v-.5C2 2.495 6.48 1 12 1"),
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
        return _cone2!!
    }

private var _cone2: ImageVector? = null
