package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExchangeDollarLine: ImageVector
    get() {
        if (_exchangeDollarLine != null) return _exchangeDollarLine!!
        _exchangeDollarLine = remixIcon(
            name = "ExchangeDollarLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.379 15.106C20.926 11.442 19.537 7.114 16.004 5.075 13.451 3.6 10.423 3.694 8.035 5.056L7.042 3.319c2.986-1.702 6.771-1.819 9.962 .024 4.491 2.593 6.21 8.142 4.118 12.77l1.342 .775-4.165 2.214-.165-4.714 1.245 .719ZM4.63 8.9c-1.547 3.664-.158 7.991 3.375 10.031 2.553 1.474 5.581 1.381 7.969 .019l.992 1.737c-2.986 1.702-6.771 1.819-9.962-.024C2.514 18.07 .795 12.521 2.887 7.893L1.545 7.119 5.71 4.905l.165 4.714L4.63 8.9ZM8.504 14.003h5.5c.276 0 .5-.224 .5-.5 0-.276-.224-.5-.5-.5h-4c-1.381 0-2.5-1.119-2.5-2.5 0-1.381 1.119-2.5 2.5-2.5h1v-1h2v1h2.5v2h-5.5c-.276 0-.5 .224-.5 .5 0 .276 .224 .5 .5 .5h4c1.381 0 2.5 1.119 2.5 2.5 0 1.381-1.119 2.5-2.5 2.5h-1v1h-2v-1h-2.5v-2Z"),
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
        return _exchangeDollarLine!!
    }

private var _exchangeDollarLine: ImageVector? = null
