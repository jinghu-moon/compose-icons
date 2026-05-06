package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorThinIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM84 108c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM180 108c0 2.209-1.791 4-4 4h-24c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4ZM171.46 154c-9.55 16.52-25.39 26-43.46 26-18.07 0-33.91-9.48-43.46-26-.994-1.899-.313-4.244 1.543-5.317 1.856-1.073 4.227-.492 5.377 1.317 8.21 14.19 21.19 22 36.54 22 15.35 0 28.33-7.81 36.54-22 .681-1.302 2.021-2.126 3.49-2.146 1.469-.02 2.831 .767 3.547 2.05 .716 1.283 .671 2.855-.117 4.095Z"),
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
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
