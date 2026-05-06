package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = tablerFilledIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.707 6.293c.39 .39 .39 1.023 0 1.414L10.707 17.707c-.391 .39-1.023 .39-1.414 0l-5-5c-.379-.392-.374-1.016 .012-1.402 .386-.386 1.009-.391 1.402-.012L10 15.586 19.293 6.293c.391-.39 1.024-.39 1.414 0"),
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
        return _check!!
    }

private var _check: ImageVector? = null
