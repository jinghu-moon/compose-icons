package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorLightIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L57.93 59.8C42.443 77.597 33.94 100.408 34 124v84c0 7.732 6.268 14 14 14h84c20.367-.024 40.222-6.377 56.82-18.18L203.56 220c2.231 2.452 6.028 2.631 8.48 .4 2.452-2.231 2.631-6.028 .4-8.48ZM132 210h-84c-1.105 0-2-.895-2-2v-84C45.961 103.805 53.075 84.25 66.08 68.8L180.7 194.88C166.399 204.791 149.399 210.069 132 210ZM230 124c.013 17.836-4.849 35.337-14.06 50.61-1.088 1.804-3.043 2.905-5.15 2.9-2.161-.006-4.152-1.174-5.212-3.058-1.06-1.884-1.025-4.192 .092-6.042C225.362 135.851 221.316 94.221 195.724 66.062 170.132 37.904 129.077 29.91 94.79 46.41c-1.94 .998-4.27 .865-6.083-.349C86.894 44.847 85.883 42.745 86.066 40.57c.183-2.174 1.533-4.078 3.524-4.97C102.819 29.235 117.319 25.952 132 26c54.099 .061 97.939 43.901 98 98Z"),
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
