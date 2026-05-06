package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShuffleFill: ImageVector
    get() {
        if (_shuffleFill != null) return _shuffleFill!!
        _shuffleFill = remixIcon(
            name = "ShuffleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 17.883v-1.883l5 3-5 3v-2.09c-3.078-.44-5.749-2.451-6.997-5.364L11 14.539l-.003 .007C9.579 17.854 6.325 20 2.725 20h-.725v-2h.725c2.8 0 5.331-1.669 6.434-4.243L9.912 12 9.159 10.243C8.056 7.669 5.525 6 2.725 6h-.725v-2h.725c3.6 0 6.854 2.146 8.272 5.455L11 9.461l.003-.007C12.251 6.542 14.922 4.53 18 4.091v-2.091l5 3L18 8v-1.883c-2.273 .421-4.226 1.95-5.159 4.126L12.088 12l.753 1.757c.932 2.176 2.885 3.705 5.159 4.126Z"),
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
        return _shuffleFill!!
    }

private var _shuffleFill: ImageVector? = null
