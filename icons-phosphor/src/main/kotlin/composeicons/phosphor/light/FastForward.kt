package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorLightIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.59 116.35 159.41 60.18c-4.303-2.73-9.75-2.906-14.22-.46-4.43 2.424-7.186 7.07-7.19 12.12v41L55.41 60.18C51.107 57.45 45.66 57.274 41.19 59.72 36.76 62.144 34.004 66.79 34 71.84v112.32c.004 5.05 2.76 9.696 7.19 12.12 4.47 2.446 9.917 2.27 14.22-.46L138 143.21v40.95c.004 5.05 2.76 9.696 7.19 12.12 4.47 2.446 9.917 2.27 14.22-.46l88.18-56.17c3.992-2.528 6.412-6.925 6.412-11.65 0-4.725-2.419-9.122-6.412-11.65ZM137.15 129.53 49 185.69c-.601 .398-1.376 .421-2 .06-.617-.287-1.008-.909-1-1.59v-112.32c-.008-.681 .383-1.303 1-1.59 .305-.173 .65-.262 1-.26 .357 .009 .704 .12 1 .32l88.19 56.16c.53 .328 .852 .907 .852 1.53 0 .623-.322 1.202-.852 1.53ZM241.15 129.53 153 185.69c-.601 .398-1.376 .421-2 .06-.617-.287-1.008-.909-1-1.59v-112.32c-.008-.681 .383-1.303 1-1.59 .305-.173 .65-.262 1-.26 .357 .009 .704 .12 1 .32l88.19 56.16c.53 .328 .852 .907 .852 1.53 0 .623-.322 1.202-.852 1.53Z"),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
