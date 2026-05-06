package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FacebookCircleLine: ImageVector
    get() {
        if (_facebookCircleLine != null) return _facebookCircleLine!!
        _facebookCircleLine = remixIcon(
            name = "FacebookCircleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.001 19.938c3.946-.492 7-3.859 7-7.938 0-4.418-3.582-8-8-8C7.583 4 4.001 7.582 4.001 12c0 4.08 3.054 7.446 7 7.938v-5.938h-2v-2h2v-1.654c0-1.337 .139-1.822 .401-2.311 .261-.489 .645-.873 1.134-1.134 .383-.205 .857-.328 1.687-.381 .329-.021 .755 .006 1.278 .08v1.9h-.5c-.917 0-1.296 .043-1.522 .164-.14 .075-.238 .173-.314 .314-.121 .226-.164 .451-.164 1.368v1.654h2.5l-.5 2h-2v5.938ZM12.001 22C6.478 22 2.001 17.523 2.001 12 2.001 6.477 6.478 2 12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10Z"),
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
        return _facebookCircleLine!!
    }

private var _facebookCircleLine: ImageVector? = null
