package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorRegularIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 192c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8v-124.69L45.66 101.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L82.34 42.34C83.841 40.838 85.877 39.994 88 39.994c2.123 0 4.159 .844 5.66 2.346l48 48c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L96 67.31v116.69h136c4.418 0 8 3.582 8 8Z"),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
