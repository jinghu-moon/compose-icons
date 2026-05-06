package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ShieldHalf: ImageVector
    get() {
        if (_shieldHalf != null) return _shieldHalf!!
        _shieldHalf = tablerFilledIcon(
            name = "ShieldHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.998 2l.032 .002 .086 .005c.119 .014 .235 .049 .342 .104l.105 .062 .097 .076 .016 .015 .247 .21c2.017 1.676 4.567 2.575 7.189 2.537l.342-.01c.46-.021 .875 .275 1.005 .717 .993 3.377 .574 7.013-1.162 10.075-1.735 3.063-4.639 5.291-8.046 6.175-.165 .043-.337 .043-.502 0C8.341 21.084 5.438 18.856 3.702 15.794 1.967 12.731 1.547 9.095 2.54 5.718c.13-.442 .545-.738 1.005-.717 2.856 .131 5.65-.856 7.791-2.75l.046-.036 .053-.041c.067-.046 .14-.084 .217-.112l.075-.023 .036-.01c.04-.01 .08-.017 .12-.022l.086-.005ZM12 4.296l-.176 .135C9.712 6.007 7.17 6.904 4.536 7.003l-.264 .006-.064 .31c-.467 2.443-.092 4.972 1.064 7.175l.17 .314c1.412 2.492 3.741 4.334 6.49 5.136l.068 .019Z"),
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
        return _shieldHalf!!
    }

private var _shieldHalf: ImageVector? = null
