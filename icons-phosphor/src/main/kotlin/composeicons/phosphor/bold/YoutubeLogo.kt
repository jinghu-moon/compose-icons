package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) return _youtubeLogo!!
        _youtubeLogo = phosphorBoldIcon(
            name = "YoutubeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170.49 117.91l-56-36c-3.692-2.374-8.385-2.543-12.238-.44C98.399 83.572 96.001 87.611 96 92v72c.001 4.389 2.399 8.428 6.252 10.53 3.853 2.103 8.546 1.934 12.238-.44l56-36c3.431-2.209 5.504-6.01 5.504-10.09 0-4.08-2.074-7.881-5.504-10.09ZM120 142v-28l21.81 14ZM238.21 68.5C235.969 59.771 229.67 52.65 221.28 49.36 186.4 35.91 131.29 36 128 36c-3.29 0-58.4-.09-93.28 13.38C26.33 52.67 20.031 59.791 17.79 68.52 15.15 78.72 12 97.32 12 128c0 30.68 3.15 49.28 5.79 59.48 2.241 8.729 8.54 15.85 16.93 19.14C68.21 219.55 120.36 220 127.37 220h1.26c7 0 59.16-.45 92.65-13.38 8.39-3.29 14.689-10.411 16.93-19.14C240.85 177.28 244 158.68 244 128c0-30.68-3.15-49.28-5.79-59.48ZM215 181.46c-.293 1.244-1.162 2.274-2.34 2.77C182.78 195.76 132.27 196 128.32 196h-.39c-.53 0-53.64 .17-84.56-11.77-1.189-.489-2.071-1.519-2.37-2.77C39.12 174.22 36 157.64 36 128 36 98.36 39.15 81.78 41 74.54c.293-1.244 1.162-2.274 2.34-2.77C74.29 59.83 127.39 60 127.92 60h.15c.54 0 53.64-.17 84.56 11.77 1.189 .489 2.071 1.519 2.37 2.77 1.88 7.24 5 23.82 5 53.46 0 29.64-3.15 46.22-5 53.46Z"),
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
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
