package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MosaicLine: ImageVector
    get() {
        if (_mosaicLine != null) return _mosaicLine!!
        _mosaicLine = remixIcon(
            name = "MosaicLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.103 3.005C20.607 3.056 21 3.482 21 4v16l-.005 .103c-.048 .47-.422 .845-.893 .893L20 21h-16c-.518 0-.944-.393-.995-.897L3 20v-16C3 3.448 3.448 3 4 3h16l.103 .005ZM5 19h14v-14h-14v14ZM9 17h-2v-2h2v2ZM13 17h-2v-2h2v2ZM17 17h-2v-2h2v2ZM11 15h-2v-2h2v2ZM15 15h-2v-2h2v2ZM9 13h-2v-2h2v2ZM13 13h-2v-2h2v2ZM17 13h-2v-2h2v2ZM11 11h-2v-2h2v2ZM15 11h-2v-2h2v2ZM9 9h-2v-2h2v2ZM13 9h-2v-2h2v2ZM17 9h-2v-2h2v2Z"),
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
        return _mosaicLine!!
    }

private var _mosaicLine: ImageVector? = null
