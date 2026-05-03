package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BarrierBlock: ImageVector
    get() {
        if (_barrierBlock != null) return _barrierBlock!!
        _barrierBlock = tablerFilledIcon(
            name = "BarrierBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 21.000 C 14.448 21.000 14.000 20.552 14.000 20.000 C 14.000 19.448 14.448 19.000 15.000 19.000 L 16.000 19.000 L 16.000 17.000 L 8.000 17.000 L 8.000 19.000 L 9.000 19.000 C 9.552 19.000 10.000 19.448 10.000 20.000 C 10.000 20.552 9.552 21.000 9.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 C 4.000 19.448 4.448 19.000 5.000 19.000 L 6.000 19.000 L 6.000 17.000 L 5.000 17.000 C 3.895 17.000 3.000 16.105 3.000 15.000 L 3.000 8.000 C 3.000 6.895 3.895 6.000 5.000 6.000 L 6.000 6.000 L 6.000 5.000 C 6.000 4.448 6.448 4.000 7.000 4.000 C 7.552 4.000 8.000 4.448 8.000 5.000 L 8.000 6.000 L 16.000 6.000 L 16.000 5.000 C 16.000 4.448 16.448 4.000 17.000 4.000 C 17.552 4.000 18.000 4.448 18.000 5.000 L 18.000 6.000 L 19.000 6.000 C 20.105 6.000 21.000 6.895 21.000 8.000 L 21.000 15.000 C 21.000 16.105 20.105 17.000 19.000 17.000 L 18.000 17.000 L 18.000 19.000 L 19.000 19.000 C 19.552 19.000 20.000 19.448 20.000 20.000 C 20.000 20.552 19.552 21.000 19.000 21.000 ZM 12.914 8.000 L 5.914 15.000 L 10.084 15.000 L 17.000 8.000 ZM 19.000 10.914 L 14.914 15.000 L 19.000 15.000 ZM 8.084 8.000 L 5.000 8.000 L 5.000 11.084 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _barrierBlock!!
    }

private var _barrierBlock: ImageVector? = null
