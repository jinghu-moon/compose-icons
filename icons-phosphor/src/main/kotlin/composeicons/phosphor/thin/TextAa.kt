package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextAa: ImageVector
    get() {
        if (_textAa != null) return _textAa!!
        _textAa = phosphorThinIcon(
            name = "TextAa",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M83.62 54.3C82.961 52.897 81.55 52.002 80 52.002c-1.55 0-2.961 .896-3.62 2.298L12.38 190.3c-.89 1.99-.022 4.326 1.952 5.253 1.973 .927 4.325 .103 5.288-1.853L37.36 156h85.28l17.74 37.7c.59 1.321 1.848 2.22 3.289 2.351 1.441 .131 2.84-.526 3.66-1.719 .819-1.193 .931-2.735 .291-4.033ZM41.13 148 80 65.39 118.87 148ZM200 100c-11.67 0-20.69 3.08-26.82 9.16-1.568 1.557-1.577 4.092-.02 5.66 1.557 1.568 4.092 1.577 5.66 .02C183.39 110.3 190.52 108 200 108c15.44 0 28 10.77 28 24v11.92C220.75 136.197 210.592 131.872 200 132c-19.85 0-36 14.35-36 32 0 17.65 16.15 32 36 32 10.592 .128 20.75-4.197 28-11.92v7.92c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-60c0-17.64-16.15-32-36-32ZM200 188c-15.44 0-28-10.77-28-24 0-13.23 12.56-24 28-24 15.44 0 28 10.77 28 24 0 13.23-12.56 24-28 24Z"),
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
        return _textAa!!
    }

private var _textAa: ImageVector? = null
