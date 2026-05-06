package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FacebookBoxLine: ImageVector
    get() {
        if (_facebookBoxLine != null) return _facebookBoxLine!!
        _facebookBoxLine = remixIcon(
            name = "FacebookBoxLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 19h5v-14h-14v14h7v-5h-2v-2h2v-1.654c0-1.337 .139-1.822 .401-2.311 .262-.489 .645-.873 1.134-1.134 .383-.205 .858-.328 1.687-.381 .329-.021 .755 .006 1.278 .08v1.9h-.5c-.917 0-1.296 .043-1.522 .164-.14 .075-.238 .173-.314 .314C14.043 9.204 14 9.429 14 10.346v1.654h2.5L16 14h-2v5ZM4 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 21 3 20.552 3 20v-16C3 3.448 3.448 3 4 3Z"),
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
        return _facebookBoxLine!!
    }

private var _facebookBoxLine: ImageVector? = null
