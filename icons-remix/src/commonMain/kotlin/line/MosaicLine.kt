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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.103 3.005 C 20.607 3.056 21.000 3.482 21.000 4.000 L 21.000 20.000 L 20.995 20.103 C 20.947 20.573 20.573 20.947 20.103 20.995 L 20.000 21.000 L 4.000 21.000 C 3.482 21.000 3.056 20.607 3.005 20.103 L 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 20.000 3.000 L 20.103 3.005 ZM 5.000 19.000 L 19.000 19.000 L 19.000 5.000 L 5.000 5.000 L 5.000 19.000 ZM 9.000 17.000 L 7.000 17.000 L 7.000 15.000 L 9.000 15.000 L 9.000 17.000 ZM 13.000 17.000 L 11.000 17.000 L 11.000 15.000 L 13.000 15.000 L 13.000 17.000 ZM 17.000 17.000 L 15.000 17.000 L 15.000 15.000 L 17.000 15.000 L 17.000 17.000 ZM 11.000 15.000 L 9.000 15.000 L 9.000 13.000 L 11.000 13.000 L 11.000 15.000 ZM 15.000 15.000 L 13.000 15.000 L 13.000 13.000 L 15.000 13.000 L 15.000 15.000 ZM 9.000 13.000 L 7.000 13.000 L 7.000 11.000 L 9.000 11.000 L 9.000 13.000 ZM 13.000 13.000 L 11.000 13.000 L 11.000 11.000 L 13.000 11.000 L 13.000 13.000 ZM 17.000 13.000 L 15.000 13.000 L 15.000 11.000 L 17.000 11.000 L 17.000 13.000 ZM 11.000 11.000 L 9.000 11.000 L 9.000 9.000 L 11.000 9.000 L 11.000 11.000 ZM 15.000 11.000 L 13.000 11.000 L 13.000 9.000 L 15.000 9.000 L 15.000 11.000 ZM 9.000 9.000 L 7.000 9.000 L 7.000 7.000 L 9.000 7.000 L 9.000 9.000 ZM 13.000 9.000 L 11.000 9.000 L 11.000 7.000 L 13.000 7.000 L 13.000 9.000 ZM 17.000 9.000 L 15.000 9.000 L 15.000 7.000 L 17.000 7.000 L 17.000 9.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _mosaicLine!!
    }

private var _mosaicLine: ImageVector? = null
