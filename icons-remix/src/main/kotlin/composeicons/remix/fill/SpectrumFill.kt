package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpectrumFill: ImageVector
    get() {
        if (_spectrumFill != null) return _spectrumFill!!
        _spectrumFill = remixIcon(
            name = "SpectrumFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.2 2.006c8.042 .087 8.801 1.244 8.801 9.994l-.006 1.199c-.087 8.042-1.244 8.801-9.994 8.801l-1.199-.006C3.143 21.911 2.089 20.858 2.007 13.199L2.001 11.691l.006-.89C2.092 2.951 3.196 2.04 11.389 2.001l1.811 .004ZM8.251 7h-.583c-.335 0-.612 .247-.659 .568l-.007 .098v3.667c0 .335 .247 .612 .568 .66l.099 .007h.583c2.004 0 3.641 1.572 3.745 3.551l.005 .199v.583c0 .335 .247 .612 .568 .66l.099 .007h3.667c.335 0 .612-.247 .659-.568l.007-.099v-.583c0-4.746-3.779-8.61-8.492-8.746L8.251 7Z"),
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
        return _spectrumFill!!
    }

private var _spectrumFill: ImageVector? = null
