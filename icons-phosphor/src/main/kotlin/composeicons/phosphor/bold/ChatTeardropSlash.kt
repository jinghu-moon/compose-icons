package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorBoldIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L50 60C35.693 78.26 27.944 100.802 28 124v84c0 11.046 8.954 20 20 20h84c19.794-.026 39.171-5.683 55.87-16.31l11.25 12.38c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM132 204h-80v-80C51.971 107.587 57.022 91.568 66.46 78.14L171.46 193.63C159.44 200.479 145.834 204.054 132 204ZM236 124c.044 15.689-3.499 31.181-10.36 45.29-2.888 5.976-10.074 8.478-16.05 5.59-5.976-2.888-8.478-10.074-5.59-16.05 5.284-10.849 8.02-22.762 8-34.83C211.967 97.821 199.139 73.312 177.647 58.365 156.155 43.418 128.714 39.921 104.16 49 97.961 51.252 91.107 48.079 88.812 41.896c-2.295-6.183 .831-13.059 6.998-15.396 31.92-11.813 67.599-7.271 95.541 12.162C219.293 58.096 235.967 89.964 236 124Z"),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null
