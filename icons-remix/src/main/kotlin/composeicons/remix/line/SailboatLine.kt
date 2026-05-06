package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SailboatLine: ImageVector
    get() {
        if (_sailboatLine != null) return _sailboatLine!!
        _sailboatLine = remixIcon(
            name = "SailboatLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 18h18c.276 0 .5 .224 .5 .5 0 .108-.035 .213-.1 .3l-2.1 2.8c-.189 .252-.485 .4-.8 .4h-13c-.315 0-.611-.148-.8-.4L2.6 18.8c-.166-.221-.121-.534 .1-.7C2.787 18.035 2.892 18 3 18ZM7.161 14h5.839v-7.298L7.161 14ZM15 2.425v12.575c0 .552-.448 1-1 1h-9.96c-.276 0-.5-.224-.5-.5 0-.113 .039-.224 .11-.312L14.11 2.113c.172-.216 .487-.251 .703-.078 .119 .095 .188 .239 .188 .39Z"),
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
        return _sailboatLine!!
    }

private var _sailboatLine: ImageVector? = null
