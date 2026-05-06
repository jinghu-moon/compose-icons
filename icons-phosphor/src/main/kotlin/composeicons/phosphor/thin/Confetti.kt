package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Confetti: ImageVector
    get() {
        if (_confetti != null) return _confetti!!
        _confetti = phosphorThinIcon(
            name = "Confetti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108.66 55.46c-2.849-2.855-6.961-4.056-10.899-3.182-3.938 .874-7.156 3.7-8.531 7.492L36.73 204.15c-1.312 3.605-.792 7.622 1.395 10.774 2.187 3.152 5.769 5.044 9.605 5.076 1.392-.002 2.773-.249 4.08-.73L196.19 166.77c3.792-1.375 6.619-4.593 7.492-8.531 .874-3.938-.327-8.05-3.182-10.899ZM102.13 192.46 63.52 153.87 79.71 109.36l66.92 66.93ZM49.13 211.74c-1.387 .496-2.935 .148-3.976-.894-1.041-1.041-1.389-2.59-.894-3.976L60.53 162.15l33.32 33.32ZM195.93 156.49c-.28 1.27-1.195 2.305-2.42 2.74l-38.56 14L82.72 101.07l14-38.56c.435-1.225 1.47-2.14 2.74-2.42 .28-.058 .564-.088 .85-.09 1.013-.016 1.988 .389 2.69 1.12L194.88 153c.924 .915 1.313 2.241 1.03 3.51ZM220 24c0 9.68-5.85 28-28 28-8.31 0-14.18 3.29-17.42 9.79C173.036 64.983 172.158 68.457 172 72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4 .158-4.786 1.323-9.485 3.42-13.79C170.66 51.73 177.56 44 192 44c19.29 0 20-18 20-20 0-2.209 1.791-4 4-4h0c2.209 0 4 1.791 4 4ZM140 40v-24c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM234.83 125.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0l-16-16c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0ZM241.26 75.8l-24 8c-.407 .134-.832 .201-1.26 .2-1.957-.004-3.624-1.425-3.939-3.356-.315-1.932 .814-3.808 2.669-4.434l24-8c2.096-.699 4.361 .434 5.06 2.53 .699 2.096-.434 4.361-2.53 5.06Z"),
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
        return _confetti!!
    }

private var _confetti: ImageVector? = null
