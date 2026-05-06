package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GameController: ImageVector
    get() {
        if (_gameController != null) return _gameController!!
        _gameController = phosphorThinIcon(
            name = "GameController",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 108h-24c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h24c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM104 100h-12v-12c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v12h-12c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h12v12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM238.21 198.36c-5.426 7.748-14.002 12.698-23.424 13.522-9.423 .824-18.727-2.563-25.416-9.252l-.17-.18L148.29 156h-40.57L66.81 202.44l-.18 .19C60.623 208.623 52.486 211.993 44 212c-9.457-.004-18.428-4.191-24.505-11.437-6.077-7.246-8.638-16.809-6.995-26.123L28.87 90.21C33.56 63.492 56.764 44.004 83.89 44h88.11c27.092 .037 50.283 19.44 55.1 46.1 .006 .033 .006 .067 0 .1l16.37 84.16c1.526 8.382-.368 17.025-5.26 24ZM172 148c26.51 0 48-21.49 48-48C220 73.49 198.51 52 172 52h-88.1C60.631 52.013 40.738 68.747 36.74 91.67L20.36 175.9c-2.256 13.032 6.455 25.433 19.48 27.73 7.652 1.334 15.477-1.117 21-6.58l42-47.69c.758-.863 1.851-1.359 3-1.36ZM235.63 175.83l-11-56.66C216.55 141.271 195.532 155.979 172 156h-13l36.16 41.06c7.429 7.355 18.764 9.056 28.024 4.204 9.26-4.852 14.314-15.139 12.496-25.434Z"),
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
        return _gameController!!
    }

private var _gameController: ImageVector? = null
