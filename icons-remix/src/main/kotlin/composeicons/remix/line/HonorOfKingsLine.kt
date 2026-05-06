package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HonorOfKingsLine: ImageVector
    get() {
        if (_honorOfKingsLine != null) return _honorOfKingsLine!!
        _honorOfKingsLine = remixIcon(
            name = "HonorOfKingsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.329 4.256 16.906 5.679C13.768 3.237 9.229 3.459 6.344 6.343 3.97 8.717 3.4 12.211 4.634 15.123L7.051 12.706C6.838 11.203 7.309 9.621 8.465 8.464c1.71-1.71 4.351-1.923 6.292-.637L13.294 9.292C12.179 8.76 10.803 8.955 9.88 9.879c-.923 .923-1.119 2.299-.587 3.414L2.843 19.742C2.809 16.243 2.252 14.931 2.055 13.041 1.754 10.147 2.712 7.147 4.93 4.929 8.596 1.263 14.401 1.038 18.329 4.256ZM21.159 4.258c.034 3.5 .591 4.811 .788 6.702 .301 2.894-.657 5.894-2.875 8.112-3.666 3.666-9.471 3.891-13.399 .673L7.096 18.321c3.138 2.442 7.678 2.22 10.562-.664 2.374-2.374 2.944-5.868 1.71-8.78l-2.417 2.417c.213 1.503-.258 3.085-1.415 4.242-1.71 1.71-4.351 1.923-6.292 .637l1.464-1.464c1.115 .532 2.491 .337 3.414-.587 .923-.923 1.119-2.299 .587-3.414L21.159 4.258Z"),
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
        return _honorOfKingsLine!!
    }

private var _honorOfKingsLine: ImageVector? = null
