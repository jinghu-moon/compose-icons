package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EarthLine: ImageVector
    get() {
        if (_earthLine != null) return _earthLine!!
        _earthLine = remixIcon(
            name = "EarthLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.235 6.453C4.851 7.891 4 9.846 4 12c0 4.418 3.582 8 8 8 1.081 0 2.112-.214 3.052-.603 .115-.75-.137-1.471-.241-1.723-.23-.56-.988-1.516-2.253-2.844-.338-.355-.316-.627-.195-1.436l.014-.091c.082-.554 .22-.882 2.085-1.178 .948-.15 1.197 .229 1.542 .753 .038 .058 .076 .115 .116 .172 .328 .48 .571 .589 .938 .757 .164 .075 .37 .169 .645 .325 .652 .373 .652 .793 .652 1.716v.105c0 .392-.038 .735-.099 1.034C19.348 15.618 20 13.885 20 12 20 8.701 18.003 5.868 15.152 4.645c-.553 .373-1.312 .902-1.577 1.265-.135 .185-.327 1.132-.949 1.21-.163 .02-.382 .006-.614-.009-.622-.04-1.472-.095-1.744 .644-.173 .468-.203 1.739 .356 2.399 .089 .105 .107 .3 .046 .519-.08 .287-.241 .462-.292 .498-.096-.055-.289-.279-.419-.43C9.646 10.377 9.254 9.922 8.748 9.782 8.564 9.731 8.362 9.689 8.165 9.647 7.616 9.532 6.994 9.401 6.85 9.093 6.744 8.867 6.745 8.556 6.745 8.228c0-.416 0-.887-.204-1.345C6.462 6.705 6.357 6.564 6.235 6.453ZM12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _earthLine!!
    }

private var _earthLine: ImageVector? = null
