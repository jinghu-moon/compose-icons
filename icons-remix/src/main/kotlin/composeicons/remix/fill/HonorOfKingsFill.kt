package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HonorOfKingsFill: ImageVector
    get() {
        if (_honorOfKingsFill != null) return _honorOfKingsFill!!
        _honorOfKingsFill = remixIcon(
            name = "HonorOfKingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.159 4.258c.034 3.5 .591 4.811 .788 6.702 .301 2.894-.657 5.894-2.875 8.112-3.666 3.666-9.471 3.891-13.399 .673L8.524 16.891c2.343 1.67 5.617 1.454 7.719-.649 2.102-2.102 2.318-5.377 .648-7.72L21.159 4.258ZM18.329 4.256 15.478 7.109C13.134 5.439 9.86 5.655 7.758 7.757 5.656 9.859 5.44 13.133 7.11 15.477L2.843 19.742C2.809 16.243 2.252 14.931 2.055 13.041 1.754 10.147 2.712 7.147 4.93 4.929 8.596 1.263 14.401 1.038 18.329 4.256ZM12.001 8c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C9.792 16 8.001 14.209 8.001 12c0-2.209 1.791-4 4-4ZM12.001 10.5c-.829 0-1.5 .672-1.5 1.5 0 .828 .671 1.5 1.5 1.5 .828 0 1.5-.672 1.5-1.5 0-.828-.672-1.5-1.5-1.5Z"),
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
        return _honorOfKingsFill!!
    }

private var _honorOfKingsFill: ImageVector? = null
