package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareArrowLeft: ImageVector
    get() {
        if (_squareArrowLeft != null) return _squareArrowLeft!!
        _squareArrowLeft = tablerFilledIcon(
            name = "SquareArrowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM12.707 7.293c-.391-.39-1.023-.39-1.414 0l-4 4-.083 .094-.064 .092-.052 .098-.044 .11-.03 .112-.017 .126L7 12l.004 .09 .007 .058 .025 .118 .035 .105 .054 .113 .071 .111c.03 .04 .061 .077 .097 .112l4 4 .094 .083c.398 .309 .964 .273 1.32-.083l.083-.094c.309-.398 .273-.964-.083-1.32L10.415 13h5.585l.117-.007c.525-.062 .911-.523 .88-1.052C16.966 11.413 16.529 11.001 16 11h-5.585L12.707 8.707l.083-.094c.309-.398 .273-.964-.083-1.32Z"),
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
        return _squareArrowLeft!!
    }

private var _squareArrowLeft: ImageVector? = null
