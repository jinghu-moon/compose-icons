package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AppleFill: ImageVector
    get() {
        if (_appleFill != null) return _appleFill!!
        _appleFill = remixIcon(
            name = "AppleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.673 7.222c-.876 0-2.232-.996-3.66-.96C6.129 6.286 4.401 7.354 3.429 9.046c-1.956 3.396-.504 8.412 1.404 11.172 .936 1.344 2.04 2.856 3.504 2.808 1.404-.06 1.932-.912 3.636-.912 1.692 0 2.172 .912 3.66 .876 1.512-.024 2.472-1.368 3.396-2.724 1.068-1.56 1.512-3.072 1.536-3.156-.036-.012-2.94-1.128-2.976-4.488C17.565 9.814 19.881 8.47 19.989 8.41 18.669 6.478 16.641 6.262 15.933 6.214 14.085 6.07 12.537 7.222 11.673 7.222ZM14.793 4.39c.78-.936 1.296-2.244 1.152-3.54-1.116 .048-2.46 .744-3.264 1.68-.72 .828-1.344 2.16-1.176 3.432 1.236 .096 2.508-.636 3.288-1.572Z"),
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
        return _appleFill!!
    }

private var _appleFill: ImageVector? = null
