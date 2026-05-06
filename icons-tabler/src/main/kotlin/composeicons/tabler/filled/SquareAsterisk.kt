package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareAsterisk: ImageVector
    get() {
        if (_squareAsterisk != null) return _squareAsterisk!!
        _squareAsterisk = tablerFilledIcon(
            name = "SquareAsterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM12 7.5c-.552 0-1 .448-1 1v1.631L9.555 9.168 9.454 9.108C8.981 8.862 8.398 9.03 8.129 9.49c-.269 .46-.13 1.051 .316 1.342L10.195 12 8.445 13.169l-.093 .07c-.406 .343-.473 .943-.153 1.366 .32 .424 .915 .524 1.356 .228L11 13.868v1.632l.007 .117c.062 .525 .523 .911 1.052 .88 .528-.031 .941-.468 .941-.997v-1.631l1.445 .963 .101 .06c.473 .246 1.056 .078 1.325-.382 .269-.46 .13-1.051-.316-1.342L13.803 11.999l1.752-1.167 .093-.07c.406-.343 .473-.943 .153-1.366-.32-.424-.915-.524-1.356-.228L13 10.13v-1.63l-.007-.117C12.934 7.88 12.507 7.5 12 7.5Z"),
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
        return _squareAsterisk!!
    }

private var _squareAsterisk: ImageVector? = null
