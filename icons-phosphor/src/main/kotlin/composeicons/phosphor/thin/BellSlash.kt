package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) return _bellSlash!!
        _bellSlash = phosphorThinIcon(
            name = "BellSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L63.8 63.32C56.067 75.477 51.972 89.592 52 104c0 36.13-8.58 64-14.36 73.95-2.166 3.711-2.183 8.297-.044 12.024 2.139 3.727 6.107 6.025 10.404 6.026h44.23c2.066 18.193 17.46 31.937 35.77 31.937 18.31 0 33.704-13.744 35.77-31.937h20.64L205 218.69c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM128 220c-13.918-.001-25.722-10.225-27.71-24h55.42c-1.988 13.775-13.792 23.999-27.71 24ZM48 188c-1.423 .011-2.739-.756-3.43-2-.715-1.238-.715-2.762 0-4C52 169.17 60 139.32 60 104 59.977 91.861 63.224 79.94 69.4 69.49L177.14 188ZM212.55 175.52c-.464 .185-.96 .28-1.46 .28-1.644-.002-3.12-1.009-3.72-2.54C200.24 155.17 196 129.28 196 104 196.006 79.798 183.148 57.416 162.237 45.23 141.326 33.045 115.514 32.892 94.46 44.83c-1.919 1.105-4.37 .444-5.475-1.475-1.105-1.919-.444-4.37 1.475-5.475 23.532-13.368 52.398-13.214 75.786 .406C189.634 51.906 204.014 76.936 204 104c0 36.05 8.26 59.89 10.79 66.34 .804 2.054-.207 4.372-2.26 5.18Z"),
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
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
