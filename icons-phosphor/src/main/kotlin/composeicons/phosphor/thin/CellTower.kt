package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CellTower: ImageVector
    get() {
        if (_cellTower != null) return _cellTower!!
        _cellTower = phosphorThinIcon(
            name = "CellTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M131.58 86.21c-.677-1.358-2.063-2.216-3.58-2.216-1.517 0-2.903 .858-3.58 2.216l-72 144c-.989 1.977-.187 4.381 1.79 5.37 1.977 .989 4.381 .187 5.37-1.79L74.47 204h107.06l14.89 29.79c.678 1.355 2.064 2.211 3.58 2.21 .621-.003 1.233-.147 1.79-.42 .95-.474 1.672-1.307 2.008-2.314 .336-1.007 .257-2.107-.218-3.056ZM128 96.94 161.53 164h-67.06ZM78.47 196l12-24h75.06l12 24ZM163.42 94.45c.389-2.128 .583-4.287 .58-6.45C164 68.118 147.882 52 128 52 108.118 52 92 68.118 92 88c-.003 2.163 .191 4.322 .58 6.45 .395 2.176-1.049 4.26-3.225 4.655-2.176 .395-4.26-1.049-4.655-3.225C84.237 93.279 84.002 90.642 84 88 84 63.699 103.699 44 128 44c24.301 0 44 19.699 44 44-.002 2.642-.237 5.279-.7 7.88-.344 1.906-2.003 3.292-3.94 3.29-.238-.004-.476-.027-.71-.07-1.045-.187-1.973-.783-2.579-1.655-.606-.872-.84-1.95-.651-2.995ZM67.34 133.79C43.693 102.461 47.794 58.277 76.804 31.835c29.01-26.442 73.383-26.442 102.393 0 29.01 26.442 33.111 70.625 9.464 101.955-.842 1.191-2.267 1.829-3.717 1.665-1.45-.164-2.695-1.105-3.249-2.455-.554-1.35-.33-2.894 .586-4.03 21.153-28.033 17.481-67.562-8.475-91.218-25.955-23.656-65.655-23.656-91.61 0C56.239 61.408 52.567 100.937 73.72 128.97c.916 1.136 1.14 2.68 .586 4.03-.554 1.35-1.8 2.29-3.249 2.455-1.45 .164-2.874-.474-3.717-1.665Z"),
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
        return _cellTower!!
    }

private var _cellTower: ImageVector? = null
