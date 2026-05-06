package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ExchangeCnyLine: ImageVector
    get() {
        if (_exchangeCnyLine != null) return _exchangeCnyLine!!
        _exchangeCnyLine = remixIcon(
            name = "ExchangeCnyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.379 15.106C20.926 11.442 19.537 7.114 16.004 5.075 13.451 3.6 10.423 3.694 8.035 5.056L7.042 3.319c2.986-1.702 6.771-1.819 9.962 .024 4.491 2.593 6.21 8.142 4.118 12.77l1.342 .775-4.165 2.214-.165-4.714 1.245 .719ZM4.63 8.9c-1.547 3.664-.158 7.991 3.375 10.031 2.553 1.474 5.581 1.381 7.969 .019l.992 1.737c-2.986 1.702-6.771 1.819-9.962-.024C2.514 18.07 .795 12.521 2.887 7.893L1.545 7.119 5.71 4.905l.165 4.714L4.63 8.9ZM13.004 13.538h3v2h-3v2h-2v-2h-3v-2h3v-1h-3v-2h2.586L8.469 8.417 9.883 7.003l2.121 2.121L14.125 7.003l1.414 1.414-2.121 2.121h2.586v2h-3v1Z"),
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
        return _exchangeCnyLine!!
    }

private var _exchangeCnyLine: ImageVector? = null
