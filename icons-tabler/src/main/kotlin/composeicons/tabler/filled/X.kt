package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.X: ImageVector
    get() {
        if (_x != null) return _x!!
        _x = tablerFilledIcon(
            name = "X",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.707 5.293 12 10.585 17.293 5.293c.392-.379 1.016-.374 1.402 .012 .386 .386 .391 1.009 .012 1.402L13.415 12l5.292 5.293c.379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012L12 13.415 6.707 18.707c-.251 .26-.623 .364-.973 .273-.35-.092-.623-.365-.714-.714-.092-.35 .013-.721 .273-.973L10.585 12 5.293 6.707C4.914 6.315 4.919 5.691 5.305 5.305c.386-.386 1.009-.391 1.402-.012"),
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
        return _x!!
    }

private var _x: ImageVector? = null
