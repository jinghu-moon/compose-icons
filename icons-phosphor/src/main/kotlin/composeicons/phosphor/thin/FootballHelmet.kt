package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorThinIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 164c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM228 176v32c0 6.627-5.373 12-12 12h-36c-5.31-.025-9.98-3.515-11.51-8.6L156.83 172h-30.28l5.09 17.13c.029 .088 .053 .179 .07 .27 .788 3.552-.077 7.27-2.354 10.108-2.276 2.838-5.718 4.49-9.356 4.492h-47.86c-.807-0-1.594-.244-2.26-.7C43.673 185.412 27.997 155.73 28 124 28 71.81 70.47 28.77 122.63 28c25.697-.367 50.469 9.585 68.77 27.629C209.701 73.672 220.003 98.3 220 124v4c0 2.209-1.791 4-4 4h-62.65l9.46 32h53.19c6.627 0 12 5.373 12 12ZM123.93 191.25 108.36 138.88c-.028-.092-.051-.186-.07-.28-.788-3.552 .077-7.27 2.354-10.108 2.276-2.838 5.718-4.49 9.356-4.492h92c.002-23.557-9.44-46.132-26.215-62.672C169.01 44.789 146.305 35.665 122.75 36 74.93 36.67 36 76.13 36 124c-.003 28.656 13.947 55.519 37.39 72h46.61c1.192 0 2.323-.531 3.083-1.45 .76-.919 1.071-2.129 .847-3.3ZM154.46 164 145 132h-25c-1.192-0-2.323 .531-3.083 1.45-.76 .919-1.071 2.129-.847 3.3L124.17 164ZM220 176c0-2.209-1.791-4-4-4h-50.83l11 37.13c.5 1.699 2.059 2.867 3.83 2.87h36c2.209 0 4-1.791 4-4Z"),
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
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
