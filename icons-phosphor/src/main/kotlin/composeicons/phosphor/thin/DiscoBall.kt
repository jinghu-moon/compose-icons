package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiscoBall: ImageVector
    get() {
        if (_discoBall != null) return _discoBall!!
        _discoBall = phosphorThinIcon(
            name = "DiscoBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 68.1v-52.1c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v52.1C62.439 70.272 26.938 108.406 28.024 154.005c1.086 45.6 38.364 81.999 83.976 81.999 45.612 0 82.89-36.4 83.976-81.999C197.062 108.406 161.561 70.272 116 68.1ZM187.89 148h-40c-1-37.34-15.73-60.22-25.35-71.25 36.006 5.092 63.382 34.939 65.35 71.25ZM112 226.68C105 220 85.26 197.61 84.06 156h55.88C138.74 197.61 119 220 112 226.68ZM84.06 148c1.2-41.61 21-64 27.94-70.68 7 6.64 26.74 29.07 27.94 70.68ZM101.42 76.75C91.8 87.75 77.07 110.66 76.07 148h-40C38.038 111.689 65.414 81.842 101.42 76.75ZM36.11 156h40c1 37.34 15.73 60.22 25.35 71.25C65.454 222.158 38.078 192.311 36.11 156ZM122.58 227.25c9.62-11 24.35-33.91 25.35-71.25h40c-1.968 36.311-29.344 66.158-65.35 71.25ZM252 88c0 2.209-1.791 4-4 4h-12v12c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-12h-12c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h12v-12c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v12h12c2.209 0 4 1.791 4 4ZM212 40c0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4Z"),
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
        return _discoBall!!
    }

private var _discoBall: ImageVector? = null
