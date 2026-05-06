package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MenLine: ImageVector
    get() {
        if (_menLine != null) return _menLine!!
        _menLine = remixIcon(
            name = "MenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.049 8.537 18.586 5h-4.586v-2h8v8h-2v-4.586L16.463 9.951c.964 1.262 1.537 2.839 1.537 4.549C18 18.642 14.642 22 10.5 22 6.358 22 3 18.642 3 14.5 3 10.358 6.358 7 10.5 7c1.71 0 3.287 .573 4.549 1.537ZM10.5 20C13.538 20 16 17.538 16 14.5 16 11.462 13.538 9 10.5 9 7.462 9 5 11.462 5 14.5 5 17.538 7.462 20 10.5 20Z"),
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
        return _menLine!!
    }

private var _menLine: ImageVector? = null
