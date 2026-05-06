package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) return _flagCheckered!!
        _flagCheckered = phosphorBoldIcon(
            name = "FlagCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229 45c-4.274-1.956-9.297-1.237-12.85 1.84C191.44 68.25 171.62 60.15 141.33 45.16 113.19 31.27 78.17 13.94 40.14 46.88 37.497 49.171 35.985 52.502 36 56v168c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-42.29c22.84-17.13 42.1-9.11 70.68 5 16.23 8 34.74 17.2 54.8 17.2 14.72 0 30.28-4.94 46.38-18.88 2.62-2.271 4.129-5.563 4.14-9.03v-120c.036-4.725-2.704-9.031-7-11ZM185.48 83.91c9.159 .007 18.209-1.982 26.52-5.83v32.15c-11 8.26-21.2 10.67-32 9.37v-35.94c1.81 .15 3.64 .25 5.48 .25ZM156 78.08v34.09c-4.64-2-9.5-4.4-14.68-7C133.092 100.934 124.639 97.148 116 93.83v-34.08c4.64 2 9.5 4.4 14.68 7 8.226 4.237 16.679 8.019 25.32 11.33ZM92 52.32v35.92c-10.973-.944-22.003 .989-32 5.61v-32.17C71 53.42 81.2 51 92 52.32ZM86.52 148c-9.161 .002-18.211 2.002-26.52 5.86v-32.16c11-8.25 21.2-10.66 32-9.36v35.94C90.19 148.13 88.36 148 86.52 148ZM116 153.86v-34.09c4.64 2 9.5 4.4 14.68 7 8.226 4.237 16.679 8.019 25.32 11.33v34.09c-4.64-2.05-9.5-4.4-14.68-7C133.096 160.949 124.643 157.166 116 153.86ZM180 179.62v-35.94c1.81 .14 3.64 .24 5.48 .24 9.161 .006 18.212-1.991 26.52-5.85v32.19c-11 8.26-21.2 10.66-32 9.36Z"),
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
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
