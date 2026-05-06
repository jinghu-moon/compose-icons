package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HandbagLine: ImageVector
    get() {
        if (_handbagLine != null) return _handbagLine!!
        _handbagLine = remixIcon(
            name = "HandbagLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c3.866 0 7 3.134 7 7h1.074c.523 0 .957 .402 .997 .923l.846 11c.042 .551-.37 1.031-.92 1.074L20.92 22h-17.84c-.552 0-1-.448-1-1l.003-.077 .846-11C2.969 9.402 3.404 9 3.926 9h1.074c0-3.866 3.134-7 7-7ZM19.147 11h-14.295l-.693 9h15.681l-.693-9ZM14 13v2h-4v-2h4ZM12 4C9.311 4 7.118 6.122 7.005 8.783L7 9h10c0-2.689-2.122-4.882-4.783-4.995L12 4Z"),
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
        return _handbagLine!!
    }

private var _handbagLine: ImageVector? = null
