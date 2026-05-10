package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Asclepius: ImageVector
    get() {
        if (_asclepius != null) return _asclepius!!
        _asclepius = phosphorFillIcon(
            name = "Asclepius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 128v72h11.62c6.522 .082 11.965-4.96 12.38-11.47 .19-4.442-2.092-8.625-5.93-10.87-1.257-.716-2.04-2.044-2.06-3.49v-8.79c-.003-1.285 .611-2.493 1.651-3.248 1.04-.755 2.379-.964 3.599-.562 11.116 3.913 18.602 14.356 18.74 26.14C176.16 203.27 163 216 147.41 216h-11.41v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-24c-2.217 .005-4.336-.91-5.853-2.527C88.631 211.856 87.853 209.682 88 207.47c.367-4.275 3.979-7.538 8.27-7.47h23.73v-72h-15.54c-8.6 0-16 6.6-16.44 15.19-.405 7.936 5.076 14.966 12.87 16.51 1.829 .394 3.128 2.019 3.11 3.89v8.41c0 2.209-1.791 4-4 4-9.7 .003-18.992-3.909-25.768-10.85C67.455 158.209 63.766 148.828 64 139.13 64.47 119.48 81 104 100.68 104h19.32v-80c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v80h32c4.388 .006 8.585-1.791 11.61-4.969 3.025-3.178 4.612-7.459 4.39-11.841C183.56 78.6 176.14 72 167.54 72h-11.54c-2.209 0-4-1.791-4-4v-24c0-2.209 1.791-4 4-4h15.22c24.62 0 45.2 20.15 44.77 44.76C215.575 108.759 196.003 127.998 172 128ZM92.66 72h7.34c2.209 0 4-1.791 4-4v-24c0-2.209-1.791-4-4-4h-36C41.909 40 24 57.909 24 80v8c0 4.418 3.582 8 8 8h24C71.905 96 86.298 86.577 92.66 72Z"),
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
        return _asclepius!!
    }

private var _asclepius: ImageVector? = null
